package be.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SessionFilter implements Filter{
	  
    public void destroy() {
    }
 
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
 
    	HttpServletRequest request = (HttpServletRequest) req;
    	HttpServletResponse response = (HttpServletResponse) res;
    	
    	//Laisse passer la requette, si l'utilisateur est authentifié ou bien si c'est une demande pour se logger
    	
    	if (isLogged(request)||isRequestToLogUser(request)){
    		 chain.doFilter(req, res);
    	}else{
    		response.sendRedirect(request.getContextPath()+"/login");
    	}
    }
    /**
     * 
     * @param request
     * @return
     */
    private boolean  isRequestToLogUser(HttpServletRequest request){
    	String path = request.getServletPath();
    	if (path.endsWith("/login")) return true;
    	return false;
    }
    /**
     * 
     * @param request
     * @return
     */
	private boolean isLogged(HttpServletRequest request) {
		String user = (String) request.getSession().getAttribute("user");
		if (user == null || user.equals("")) {
			return false;
		} else {
			return true;
		}
	}
    public void init(FilterConfig config) throws ServletException {
    }
}
