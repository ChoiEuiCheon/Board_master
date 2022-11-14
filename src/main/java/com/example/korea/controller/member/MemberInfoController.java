package com.example.korea.controller.member;

import com.example.korea.controller.SubController;
import com.example.korea.dto.MemberDTO;
import com.example.korea.service.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberInfoController implements SubController{

	MemberService service = MemberService.getInstance();
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		
		//view로이동
		try {
			
			//session 객체에서 email 꺼내옴
			HttpSession session = req.getSession();
			String email = (String)session.getAttribute("email");
			//service를 이용해서 접속중인 사용자의 정보를 가져옴 
			MemberDTO dto =  service.MemberSearch(email);
			
			//request에 dto 저장
			req.setAttribute("dto", dto);
			
			req.getRequestDispatcher("/WEB-INF/member/myinfo.jsp")
			.forward(req, resp);
		}catch(Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
	}

}
