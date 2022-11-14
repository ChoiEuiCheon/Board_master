package com.example.controller.board;

import com.example.controller.SubController;
import com.example.dto.BoardDTO;
import com.example.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class BoardReplycntController implements SubController{

	BoardService service = BoardService.getInstance();
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		 
		HttpSession session = req.getSession();
		
		BoardDTO dto = (BoardDTO)session.getAttribute("dto");
		
		int totalcnt = service.getTotalReplyCnt(dto.getNo());
		
		try {
			PrintWriter out = resp.getWriter();
			
			out.println(totalcnt);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
