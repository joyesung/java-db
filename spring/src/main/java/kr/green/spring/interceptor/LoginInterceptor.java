package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.green.spring.vo.Membervo;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public void postHandle(
	    HttpServletRequest request, 
	    HttpServletResponse response, 
	    Object handler, 
	    ModelAndView modelAndView)
	    throws Exception {
		/*컨트롤러에서 Model에 담아준 user정보를 가져옴*/
	    ModelMap modelMap = modelAndView.getModelMap();
	    Membervo user = (Membervo)modelMap.get("user");

	    if(user != null) {
	        HttpSession session = request.getSession();
	        session.setAttribute("user", user);
	    }
	}
}
