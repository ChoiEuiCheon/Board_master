package com.example.korea.controller.notice;

import com.example.korea.controller.SubController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoticeListController  implements SubController{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.getRequestDispatcher("/WEB-INF/notice/list.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
