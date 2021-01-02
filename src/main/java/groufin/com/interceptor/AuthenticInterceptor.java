package groufin.com.interceptor;

//import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;


public class AuthenticInterceptor extends WebContentInterceptor {
	private static final Logger log = Logger.getLogger(AuthenticInterceptor.class.getName());
	  
	@Value("${Product.Session.Info}")
	private String sSession;
  
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException {
		String sContextPath =  request.getRequestURI();
		HttpSession session = request.getSession(false);
		
		if(!sContextPath.equals("/orderJoin.do") && !sContextPath.equals("/orderLogin.do") && !sContextPath.equals("/proc/userIdSearchAjax.do") && !sContextPath.equals("/proc/orderJoinAjax.do") && !sContextPath.equals("/proc/orderLoginAjax.do")){
//			try {
				if(session.getAttribute(sSession) == null){
//					System.out.println("로그인 체크");
//					response.sendRedirect("/orderLogin.do");
				}
//			} catch (IOException e) {
//				System.out.println("2222222222222222222222222222");
//				log.error("ERROR: "+e);
//			}
		}else{
//			System.out.println("3333333333333333333333");
			log.debug("url: "+sContextPath);
			return true;
		}
//		System.out.println("44444444444444444444444"); 
		log.debug("확인");
		return true;
	} 
 
	@Override
	public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//		System.out.println("55555555555555555555555555555555");
		log.debug("ggg");
//		  return null;
	}
}
