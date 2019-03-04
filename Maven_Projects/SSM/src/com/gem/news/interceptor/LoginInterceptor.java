package com.gem.news.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements  HandlerInterceptor{

	//在进入控制器之前
	//返回false 不放行
	//true  放行
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		//login 放行
		String url=arg0.getRequestURI();
		System.out.println(url);
		if(url.equals("/SSM_war_exploded/login")){
			return true;
		}else{
			Object obj=arg0.getSession().getAttribute("curruser");
			if(obj!=null){
				//登录过
				return true;
			}
			//不放行  阻止
			arg1.sendRedirect("/SSM_war_exploded/login.jsp");
			return false;
		}
		
		
	}
	//登录权限：
	//没有登录时  访问不到某些页面
	//main  login 
	
	//控制器执行完成   在执行jsp之前
	//拦截敏感词语
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
		System.out.println("postHandle");
		
	}
	//jsp 执行完毕
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		System.out.println("afterCompletion");
		//System.out.println("异常："+arg3.getMessage());
		
	}

}
