package groufin.com.web.controller;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

public class SessionController {


	@Value("${Product.Session.Info}")
	protected String sSession;
	
	@Value("${SEED.KEY.VAL}") 
	protected String seedKey;
	
	protected String member_seq = "";
	protected String member_id = "";
	protected String member_nm = "";
	protected String member_type = "";
	protected String member_code = "";
	
	protected String returnValue = "";	
//	protected String returnPage = "com/returnPage";
	
	protected String  WRONG_APPROACH = "잘못된 접근입니다.";
	protected String  NO_DATA = "데이터가 존재하지 않습니다.";
	

	public String reqURL(HttpServletRequest req) throws Exception {
		String q = req.getQueryString();
		if (StringUtils.isBlank(q)) {
			q = "";
		} else {
			q = "?" + q;
		}
		return URLEncoder.encode(req.getRequestURI() + q, "UTF-8");
	}
	
	protected String returnPage = "";

	public SessionController() {
		returnPage = "/error/returnPage";
	}


	
	//리턴관련
	protected String getReturnProc(String msg, String url) throws Exception {
		String strScript = "";
		strScript = "";
		strScript += "<script type='text/javaScript' language='javascript'>";
		if(!msg.equals(""))
			strScript += "alert('"+msg+"');";
		if(!url.equals(""))
			strScript += "location.href='"+url+"';";
		strScript += "</script>";
		return strScript;
	}
	//리턴관련
	protected String getReturnPage(String msg, String tp) throws Exception {
		String strScript = "";
		strScript = "";
		strScript += "<script type='text/javascript'>\n";
		if(!msg.equals(""))
			strScript += "alert('"+msg+"');\n";
		if(tp.equals("B")){
			strScript += "history.back();\n";	
		}else if(tp.equals("C")){
			strScript += "self.close();\n";	
		}else if (tp.equals("M")) {/** 메인 화면 이동 */
			strScript += "location.href='/main.do';\n";
		}else if(tp.equals("CO")){
			//strScript += "opener.location.reload();\n";
			strScript += "window.opener.document.location.href = window.opener.document.URL;\n";
			strScript += "self.close();\n";
		}else if(tp.equals("L")){
			strScript += "location.href='/login.do';\n";
		}else{
			strScript += "location.href='"+tp+"';\n";
		}
		
		strScript += "</script>";
		return strScript;
	}


	


	public String getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(String member_seq) {
		this.member_seq = member_seq;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_nm() {
		return member_nm;
	}

	public void setMember_nm(String member_nm) {
		this.member_nm = member_nm;
	}

	public String getMember_type() {
		return member_type;
	}

	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}

	
	public String getMember_code() {
		return member_code;
	}

	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}

	public String getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}
}
