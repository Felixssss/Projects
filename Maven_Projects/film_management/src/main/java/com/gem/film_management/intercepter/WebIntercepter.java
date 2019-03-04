package com.gem.film_management.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.film_management.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class WebIntercepter implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse respose,
			Object arg2) throws Exception {
		System.out.println("******************************************************");
		String url=req.getServletPath();
		System.out.println(url);
		//登录会在状态时放行
		boolean flag = false;
		User user=(User)req.getSession().getAttribute("curruser");
		if(null==user){
			flag = false;
			respose.sendRedirect("/film/login");
		}else{
			flag =true;
		}
		//System.out.println(flag);
		return flag;
	}

}
