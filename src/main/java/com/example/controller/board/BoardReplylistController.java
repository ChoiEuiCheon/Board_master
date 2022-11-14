package com.example.controller.board;

import com.example.controller.SubController;
import com.example.dto.BoardDTO;
import com.example.dto.ReplyDTO;
import com.example.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BoardReplylistController implements SubController{

	BoardService service = BoardService.getInstance();
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		//읽고 있는 게시물의 모든 댓글 출력
		HttpSession session = req.getSession();
		BoardDTO dto = (BoardDTO)session.getAttribute("dto");
		
		ArrayList<ReplyDTO> list = service.getReplylist(dto.getNo());		
		
		
		try {
			PrintWriter out = resp.getWriter();
			
			for(int i=0;i<list.size();i++) {
				
				out.println("<div class=\"form-control\">");
				out.println("<span style=font-size:0.5rem>"+list.get(i).getWriter()+"</span>&nbsp;&nbsp;");
				out.println("<span style=font-size:0.5rem>"+list.get(i).getRegdate()+"</span><br>");
				out.println("<span>"+list.get(i).getContent()+"</span>");
				out.println("</div>");
				
				
			}
			

		
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
