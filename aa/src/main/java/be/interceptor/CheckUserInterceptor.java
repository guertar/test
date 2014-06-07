package be.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckUserInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {


		 if (!isLogged(request)){
			 request.setAttribute("user", "ee");
			 response.sendRedirect(request.getContextPath()+"/login");
			 return false;
		 }
		 else return true;

	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	private boolean isLogged(HttpServletRequest request) {
		String user = (String) request.getAttribute("user");
		if (user == null || user.equals("")) {
			return false;
		} else {
			return true;
		}
	}
}
