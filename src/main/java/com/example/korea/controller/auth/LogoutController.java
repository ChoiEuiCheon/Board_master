package com.example.korea.controller.auth;

import com.example.korea.controller.SubController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements SubController{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		 
		HttpSession session = req.getSession();
		session.invalidate();
		
		
		try {
			//필터로그아웃시 flag를 false 설정->
			//재접속시 한번은 session로부터 grade 꺼내지않는다
			
			 
			
			req.setAttribute("MSG","로그아웃 완료"); 
			req.getRequestDispatcher("/").forward(req,resp);
			//resp.sendRedirect("/");
		
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		
		
		
	}

}
