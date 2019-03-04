package com.gem.news.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements  HandlerInterceptor{

	//�ڽ��������֮ǰ
	//����false ������
	//true  ����
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		//login ����
		String url=arg0.getRequestURI();
		System.out.println(url);
		if(url.equals("/SSM_war_exploded/login")){
			return true;
		}else{
			Object obj=arg0.getSession().getAttribute("curruser");
			if(obj!=null){
				//��¼��
				return true;
			}
			//������  ��ֹ
			arg1.sendRedirect("/SSM_war_exploded/login.jsp");
			return false;
		}
		
		
	}
	//��¼Ȩ�ޣ�
	//û�е�¼ʱ  ���ʲ���ĳЩҳ��
	//main  login 
	
	//������ִ�����   ��ִ��jsp֮ǰ
	//�������д���
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
		System.out.println("postHandle");
		
	}
	//jsp ִ�����
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		System.out.println("afterCompletion");
		//System.out.println("�쳣��"+arg3.getMessage());
		
	}

}
