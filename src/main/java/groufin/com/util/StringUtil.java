package groufin.com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.text.DecimalFormat;
import com.ibm.icu.text.SimpleDateFormat;

import egovframework.rte.fdl.cmmn.exception.BaseException;

/**
 * 2020.08.18 최초 작성 
 * @author ggmario
 * @version 1.0
 *
 */
public class StringUtil {
	private static final Logger log = LoggerFactory.getLogger(StringUtil.class);
	  /**
	   * @param str - 체크 대상 스트링오브젝트이며 null을 허용함
	   * @return true - 입력받은 String 이 빈 문자열 또는 null인 경우
	   */
	  public static boolean isEmpty(String str) {
	    return str == null || str.length() == 0;
	  }

	  public static int checkNullInt(String str) {

	    if (str == null || str.length() == 0) {
	      return 0;
	    } else {
	      return Integer.parseInt(str);
	    }
	  }

	  /**
	   * 모든 태그 제거
	   *
	   * @param content
	   * @return
	   * @throws SQLException
	   */
	  public static String removeTag(String contentStr) {

	    String content = contentStr;
	    Pattern SCRIPTS =
	        Pattern.compile("<(no)?script[^>]*>.*?</(no)?script>", Pattern.DOTALL
	            | Pattern.CASE_INSENSITIVE);

	    Pattern STYLE =
	        Pattern.compile("<style[^>]*>.*</style>", Pattern.DOTALL | Pattern.CASE_INSENSITIVE);


	    content = content.replaceAll("&lt;", "<");
	    content = content.replaceAll("&gt;", ">");

	    Pattern TAGS = Pattern.compile("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>");
	    // Pattern nTAGS = Pattern.compile("<\\w+\\s+[^<]*\\s*>");
	    Pattern ENTITY_REFS = Pattern.compile("&[^;]+;");
	    Pattern WHITESPACE = Pattern.compile("\\s\\s+");
	    Pattern ETC = Pattern.compile("nbsp;");

	    Matcher m;

	    m = SCRIPTS.matcher(content);
	    content = m.replaceAll("");

	    m = STYLE.matcher(content);
	    content = m.replaceAll("");


	    m = TAGS.matcher(content);
	    content = m.replaceAll("");
	    m = ENTITY_REFS.matcher(content);
	    content = m.replaceAll("");
	    m = WHITESPACE.matcher(content);
	    content = m.replaceAll(" ");

	    m = ETC.matcher(content);
	    content = m.replaceAll(" ");

	    return content;
	  }

	  /**
	   * 랜덤으로 패스위드 생성 P:특수기호, A:대문자, S:소문자, I:숫자 , C: 소문자/숫자 혼합
	   * 
	   * @param type
	   * @param cnt
	   * @return
	   */
	  public static String randomValue(String type, int cnt) {

	    StringBuffer strPwd = new StringBuffer();
	    char str[] = new char[1];
	    // 특수기호 포함
	    if (type.equals("P")) {
	      for (int i = 0; i < cnt; i++) {
	        str[0] = (char) ((Math.random() * 94) + 33);
	        strPwd.append(str);
	      }
	      // 대문자로만
	    } else if (type.equals("A")) {
	      for (int i = 0; i < cnt; i++) {
	        str[0] = (char) ((Math.random() * 26) + 65);
	        strPwd.append(str);
	      }
	      // 소문자로만
	    } else if (type.equals("S")) {
	      for (int i = 0; i < cnt; i++) {
	        str[0] = (char) ((Math.random() * 26) + 97);
	        strPwd.append(str);
	      }
	      // 숫자형으로
	    } else if (type.equals("I")) {
	      int strs[] = new int[1];
	      for (int i = 0; i < cnt; i++) {
	        strs[0] = (int) (Math.random() * 9);
	        strPwd.append(strs[0]);
	      }
	      // 소문자, 숫자형
	    } else if (type.equals("C")) {
	      Random rnd = new Random();
	      for (int i = 0; i < cnt; i++) {
	        if (rnd.nextBoolean()) {
	          strPwd.append((char) ((rnd.nextInt(26)) + 97));
	        } else {
	          strPwd.append((rnd.nextInt(10)));
	        }
	      }
	    }
	    return strPwd.toString();
	  }

	  /**
	   * 문자열 날짜 비교
	   * 
	   * @param Object
	   * @return String
	   */
	  public static boolean diffOfDate(String begin, String end) throws Exception {
	    try {

	      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
	      Date thisdate = formatter.parse(formatter.format(new Date()));

	      Date beginDate = formatter.parse(begin);
	      Date endDate = formatter.parse(end);

	      if ((thisdate.equals(beginDate) || thisdate.after(beginDate))
	          && (thisdate.equals(endDate) || thisdate.before(endDate))) {
	        return true;
	      } else {
	        return false;
	      }
	    } catch (Exception e) {
	      // e.printStackTrace();
	      if (isEmpty(e.getMessage())) {
	        log.error(e.getMessage().replaceAll("\r\n", ""));
	      }
	    }
	    return false;
	  }

	  /**
	   * Get string(if object is null, return empty string).
	   * 
	   * @param Object
	   * @return String
	   */
	  public static String getString(Object object) {
	    if (object == null)
	      return "";
	    else
	      return (String) object;
	  }

	  public static int getInt(Object object) {
	    if (getString(object).equals(""))
	      return 1;
	    else
	      return (Integer) object;
	  }

	  /**
	   * Gt Lt tag변경
	   * 
	   * @param i
	   * @return
	   */
	  public static String replaceEditorTag(String content) {
	    String str = content;
	    if (str != null && !str.equals("")) {
	      str = str.replaceAll("&amp;", "&");
	      str = str.replaceAll("&lt;", "<");
	      str = str.replaceAll("&gt;", ">");
	    } else {
	      str = "";
	    }
	    return str;
	  }

	  public static String getDateToString(String format) {
	    Date date = new Date();
	    SimpleDateFormat simpleDate = new SimpleDateFormat(format, Locale.KOREAN);
	    return simpleDate.format(date);
	  }

	  public static String getTimeStamp() {
	    String rtnStr = null;

	    // 문자열로 변환하기 위한 패턴 설정(년도-월-일 시:분:초:초(자정이후 초))
	    String pattern = "yyyyMMddhhmmssSSS";
	    SimpleDateFormat sdfCurrent = new SimpleDateFormat(pattern, Locale.KOREA);
	    Timestamp ts = new Timestamp(System.currentTimeMillis());

	    rtnStr = sdfCurrent.format(ts.getTime());
	    return rtnStr;
	  }

	  public static String getWeekName(String wk) {
	    int tmp = Integer.parseInt(wk);
	    if (getString(wk).equals("")) {
	      tmp = 0;
	    }
	    String[] str = {"*", "일", "월", "화", "수", "목", "금", "토"};
	    return str[tmp];
	  }

	  public static String replace(String source, String fromStr, String toStr) {
	    if (source == null)
	      return null;
	    int start = 0;
	    int end = 0;
	    StringBuffer result = new StringBuffer();
	    while ((end = source.indexOf(fromStr, start)) >= 0) {
	      result.append(source.substring(start, end));
	      result.append(toStr);
	      start = end + fromStr.length();
	    }
	    result.append(source.substring(start));
	    return result.toString();
	  }

	  /**
	   * 휴대폰번호 리스트
	   * 
	   * @return
	   * @throws Exception
	   */
	  public static ArrayList<String> pcsList() throws Exception {
	    ArrayList<String> list = new ArrayList<String>();

	    list.add("010");
	    list.add("011");
	    list.add("016");
	    list.add("017");
	    list.add("018");
	    list.add("019");

	    return list;
	  }

	  /**
	   * 전화번호 지역번호/휴대폰번호 리스트
	   * 
	   * @return
	   * @throws Exception
	   */
	  public static ArrayList<String> phoneHpList() throws Exception {
	    ArrayList<String> list = new ArrayList<String>();

	    list.add("010");
	    list.add("011");
	    list.add("016");
	    list.add("017");
	    list.add("018");
	    list.add("019");
	    list.add("02");
	    list.add("031");
	    list.add("032");
	    list.add("033");
	    list.add("041");
	    list.add("042");
	    list.add("043");
	    list.add("051");
	    list.add("052");
	    list.add("053");
	    list.add("054");
	    list.add("055");
	    list.add("061");
	    list.add("062");
	    list.add("063");
	    list.add("064");
	    list.add("0502");
	    list.add("0505");
	    list.add("070");

	    return list;
	  }


	  /**
	   * 문자수 단위로 문자열을 자른다.
	   *
	   * @param s 자를 문자열
	   * @param i 자를 수
	   * @param plusStr 플러스될 문자열
	   */
	  public static String cutStringPlus(String s, int i, String plusStr) {
	    String str = "";
	    if (s.length() <= i)
	      return s;
	    str = s.substring(0, i);
	    return str + plusStr;
	  }

	  /**
	   * 바이트 단위로 문자열을 자른다.
	   *
	   * @param s 자를 문자열
	   * @param i 자를 수
	   * @param plusStr 플러스될 문자열
	   */
	  public static String cutStringBytesPlus(String s, int i, String plusStr) {
	    if (getString(s).equals(""))
	      return "";

	    byte abyte0[] = s.getBytes();
	    int j = abyte0.length;
	    int k = 0;
	    if (i >= j)
	      return s;
	    for (int l = i - 1; l >= 0; l--)
	      if ((abyte0[l] & 0x80) != 0)
	        k++;
	    String str = new String(abyte0, 0, i - k % 3);
	    return str + plusStr;
	  }
	public static String requestReplace (String paramValue, String gubun) {
        String result = "";
        
        if (paramValue != null) {
        	
        	paramValue = paramValue.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

        	paramValue = paramValue.replaceAll("\\*", "");
        	paramValue = paramValue.replaceAll("\\?", "");
        	paramValue = paramValue.replaceAll("\\[", "");
        	paramValue = paramValue.replaceAll("\\{", "");
        	paramValue = paramValue.replaceAll("\\(", "");
        	paramValue = paramValue.replaceAll("\\)", "");
        	paramValue = paramValue.replaceAll("\\^", "");
        	paramValue = paramValue.replaceAll("\\$", "");
        	paramValue = paramValue.replaceAll("'", "");
        	paramValue = paramValue.replaceAll("@", "");
        	paramValue = paramValue.replaceAll("%", "");
        	paramValue = paramValue.replaceAll(";", "");
        	paramValue = paramValue.replaceAll(":", "");
        	paramValue = paramValue.replaceAll("-", "");
        	paramValue = paramValue.replaceAll("#", "");
        	paramValue = paramValue.replaceAll("--", "");
        	paramValue = paramValue.replaceAll("-", "");
        	paramValue = paramValue.replaceAll(",", "");
        	
        	if(gubun != "encodeData"){
        		paramValue = paramValue.replaceAll("\\+", "");
        		paramValue = paramValue.replaceAll("/", "");
            paramValue = paramValue.replaceAll("=", "");
        	}
        	
        	result = paramValue;
            
        }
        return result;
	}
	  /**
	   * 특수문자 제거
	   * 
	   * @param i
	   * @return
	   */
	  public static String replaceSpecialChar(String text, String sc) {
	    String str = text;
	    if (str != null && !str.equals("")) {
	      for (int i = 0; i < sc.length(); i++) {
	        str = str.replaceAll(sc.substring(i, i + 1), "");
	      }
	    } else {
	      str = "";
	    }
	    return str;
	  }


	  /**
	   * 현재 접속중인 도메인 정보를 알수 있음
	   * 
	   * @param request
	   * @return
	   */
	  public static String connDomain(HttpServletRequest request) {

//	    String path = request.getContextPath();
	    String getProtocol = request.getScheme();
	    String getDomain = request.getServerName();
	    String getPort = Integer.toString(request.getServerPort());

	    StringBuffer sb = new StringBuffer(getProtocol);
	    sb.append("://").append(getDomain);

	    if (!getProtocol.equals("80"))
	      sb.append(":").append(getPort);

	    return sb.toString();
	  }

	  /**
	   * 접속구분(PC false,Mobile true)
	   * 
	   * @param request
	   * @return
	   */
	  public static boolean isMobile(HttpServletRequest request) {
	    String userAgent = request.getHeader("user-agent");
	    boolean mobile1 =
	        userAgent
	            .matches(".*(iPhone|iPod|Android|Windows CE|BlackBerry|Symbian|Windows Phone|webOS|Opera Mini|Opera Mobi|POLARIS|IEMobile|lgtelecom|nokia|SonyEricsson).*");
	    boolean mobile2 = userAgent.matches(".*(LG|SAMSUNG|Samsung).*");
	    if (mobile1 || mobile2) {
	      return true;
	    } else {
	      return false;
	    }
	  }


	  /**
	   * 개인정보 마스킹 tp 1=이름, 2=전화, 3은 이메일
	   * 
	   * @return
	   */
	  public static String personInfoMasking(String tp, String val) {
	    String strTmp = getString(val).replaceAll("-", "");
	    String retVal = "";
	    if (tp.equals("1")) {// 이름
	      if (strTmp.length() > 5 || strTmp.length() < 2) {
	        retVal = strTmp;
	      } else if (strTmp.length() == 5) {
	        retVal = strTmp.substring(0, 2) + "**" + strTmp.substring(4, 5);
	      } else if (strTmp.length() == 4) {
	        retVal = strTmp.substring(0, 2) + "*" + strTmp.substring(3, 4);
	      } else if (strTmp.length() == 3) {
	        retVal = strTmp.substring(0, 1) + "*" + strTmp.substring(2, 3);
	      } else if (strTmp.length() == 2) {
	        retVal = strTmp.substring(0, 1) + "*";
	      }
	    } else if (tp.equals("2")) {// 전화
	      if (strTmp.length() < 9) {
	        retVal = strTmp;
	      } else {
	        if (strTmp.substring(0, 2).equals("02")) {
	          if (strTmp.length() == 9) {
	            retVal = strTmp.substring(0, 2) + "-***-" + strTmp.substring(5, 9);
	          } else if (strTmp.length() == 10) {
	            retVal = strTmp.substring(0, 2) + "-****-" + strTmp.substring(6, 10);
	          } else if (strTmp.length() > 10) {// 원본에서 처리
	            retVal = val.substring(0, val.length() - 4) + "****";
	          }
	        } else {
	          if (strTmp.length() == 11) {
	            retVal = strTmp.substring(0, 3) + "-****-" + strTmp.substring(7, 11);
	          } else if (strTmp.length() == 10) {
	            retVal = strTmp.substring(0, 3) + "-***-" + strTmp.substring(6, 10);
	          } else if (strTmp.length() > 10) {// 원본에서 처리
	            retVal = val.substring(0, val.length() - 4) + "****";
	          }
	        }
	      }
	    } else if (tp.equals("3")) {// 이메일
	      if (strTmp.indexOf("@") > 0) {
	        String[] arr = strTmp.split("@", 2);
	        retVal = arr[0].substring(0, arr[0].length() - 4) + "****@" + arr[1];
	      }
	    } else if (tp.equals("4")) {// ID
	      retVal = val.replaceAll("(?<=.{3}).", "*");
	    } else if (tp.equals("5")) {// IP
	      String[] arr = strTmp.split("\\.", 0);
	      retVal = arr[0] + "." + arr[1] + ".***." + arr[3];

	    } else {
	      retVal = strTmp;
	    }

	    if (retVal.equals(""))
	      retVal = strTmp;

	    return retVal;
	  }

	  public static String nl2br(String comment) {

	    StringBuffer buffer = new StringBuffer();

	    if (!getString(comment).equals("")) {
	      int length = comment.length();

	      for (int i = 0; i < length; ++i) {
	        String comp = comment.substring(i, i + 1);
	        if ("\r".compareTo(comp) == 0) {
	          comp = comment.substring(++i, i + 1);
	          if ("\n".compareTo(comp) == 0)
	            buffer.append("<BR>\r");
	          else
	            buffer.append("\r");
	        }

	        buffer.append(comp);
	      }
	    }
	    return buffer.toString();
	  }


	  public static String nl2br2(String commentStr) {
	    String result = "";
	    String comment = commentStr;
	    try {
	      if (!getString(comment).equals("")) {
	        comment = comment.replaceAll("(\r\n|\n)", "<br />");
	      }
	      result = comment;
	    } catch (Exception e) {
	      // TODO: handle exception
	      result = comment;
	    }
	    return result;
	  }

	  public static enum Common {
	    SUCCESS(1, "완료"), FAIL(2, "실패");

	    private int code;
	    private String message;

	    private Common(int code, String message) {
	      this.code = code;
	      this.message = message;
	    }

	    public String getMessage() {
	      return this.message;
	    }

	    public int getCode() {
	      return this.code;
	    }

	    public static Common getEnum(int code) throws BaseException {
	      for (Common common : Common.values()) {
	        if (common.code == code) {
	          return common;
	        }
	      }
	      throw new BaseException();
	    }

	  }

	  public static String fileExt(String fileName) {

	    String extension = "";
	    if (StringUtil.getString(fileName).equals(""))
	      return "";
	    int index = fileName.lastIndexOf(".");
	    extension = fileName.substring(index + 1);

	    return extension;
	  }



	  public static String[] exptionDot() {

	    String str[] = new String[23];
	    str[0] = ".php";
	    str[1] = ".php3";
	    str[2] = ".php5";
	    str[3] = ".phtml";
	    str[4] = ".asp";
	    str[5] = ".aspx";
	    str[6] = ".ascx";
	    str[7] = ".jsp";
	    str[8] = ".cfm";
	    str[9] = ".cfc";
	    str[10] = ".pl";
	    str[11] = ".bat";
	    str[12] = ".exe";
	    str[13] = ".dll";
	    str[14] = ".reg";
	    str[15] = ".cgi";
	    str[16] = ".html";
	    str[17] = ".htm";
	    str[18] = ".js";
	    str[19] = ".sh";
	    str[20] = ".com";
	    str[21] = ".java";
	    str[22] = ".class";

	    return str;
	  }
	  
		/**
		 * 파일의 내용을 읽어온후 내용 변환
		 * @param path : 이메일 위치
		 * @param key : 전달내용(문자와 변경문자의 배열)
		 * @return
		 * @throws IOException
		 * @throws FileNotFoundException
		 */
		public static String getStrFromFile(String path, String[][] key) 
					throws IOException,FileNotFoundException{
			File myFile = new File(path);
			StringBuffer strBuf = new StringBuffer();

			BufferedReader in = new BufferedReader(
		            new InputStreamReader(new FileInputStream( myFile), "UTF8"));
			String line=null;
			while((line=in.readLine()) !=null){
				strBuf.append(line + "\r\n");
			}
			
			if(in != null)
				in.close();
			
			String source = strBuf.toString();

			for(int i = 0; i < key.length; i++)	{
				source = source.replaceAll(key[i][0], key[i][1]);
			} 

			return source;
		}
		
		
		
		public static String[] checkStartDay(String sdate,int interval) throws Exception{
			
			DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
			Date today = df.parse(sdate);
	        
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(today);
	    	cal.add(Calendar.DATE, interval);
	    	Date startDate =  df.parse(df.format(cal.getTime()));
	    	String[] tempdate = new String[20];
	    	for(int i=0;i < 20; i++){
	        	cal.clear();
	        	cal.setTime(startDate);
	        	cal.add(Calendar.DATE, i);
	        	tempdate[i] = df.format(cal.getTime());
	        }
			
			return tempdate;
		}
		
		public static List<String> getDeleveryDate(String startDay) throws Exception{
			
			DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
			Date today = df.parse(startDay);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(today);
			
			Date startDate =  df.parse(df.format(cal.getTime()));
			List<String> list = new ArrayList<String>();
			for(int i=0;i < 20; i++){
	        	cal.clear();
	        	cal.setTime(startDate);
	        	cal.add(Calendar.DATE, i);
	        	list.add(df.format(cal.getTime()));
	        }
			return list;
		}
		
		public static List<String> getDeleveryDate(String startDay,int day) throws Exception{
			
			DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
			Date today = df.parse(startDay);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(today);
			
			Date startDate =  df.parse(df.format(cal.getTime()));
			List<String> list = new ArrayList<String>();
			for(int i=0;i < day; i++){
	        	cal.clear();
	        	cal.setTime(startDate);
	        	cal.add(Calendar.DATE, i);
	        	list.add(df.format(cal.getTime()));
	        }
			return list;
		}
		
		public static String phoneNumberHyphenAdd(String num, String mask) {

		    String formatNum = "";
//		    if (StringUtils.NVL(num).equals("")) return formatNum;
		    num = num.replaceAll("-","");

		    if (num.length() == 11) {
		        if (mask.equals("Y")) {
		            formatNum = num.replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-****-$3");
		        }else{
		            formatNum = num.replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
		        }
		    }else if(num.length()==8){
		        formatNum = num.replaceAll("(\\d{4})(\\d{4})", "$1-$2");
		    }else{
		        if(num.indexOf("02")==0){
		            if(mask.equals("Y")){
		                formatNum = num.replaceAll("(\\d{2})(\\d{3,4})(\\d{4})", "$1-****-$3");
		            }else{
		                formatNum = num.replaceAll("(\\d{2})(\\d{3,4})(\\d{4})", "$1-$2-$3");
		            }
		        }else{
		            if(mask.equals("Y")){
		                formatNum = num.replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-****-$3");
		            }else{
		                formatNum = num.replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
		            }
		        }
		    }
		    return formatNum;
		}
		
		public static String[] split(String source, String separator) throws NullPointerException {
	        String[] returnVal = null;
	        int cnt = 1;

	        int index = source.indexOf(separator);
	        int index0 = 0;
	        while (index >= 0) {
	            cnt++;
	            index = source.indexOf(separator, index + 1);
	        }
	        returnVal = new String[cnt];
	        cnt = 0;
	        index = source.indexOf(separator);
	        while (index >= 0) {
	            returnVal[cnt] = source.substring(index0, index);
	            index0 = index + 1;
	            index = source.indexOf(separator, index + 1);
	            cnt++;
	        }
	        returnVal[cnt] = source.substring(index0);

	        return returnVal;
	    }	
	    
	    public static void objAlertRedirect(HttpServletResponse res, String strMsg, String retUrl) {
	    	try {
		    	res.setContentType("text/html; charset=UTF-8");
				PrintWriter out = res.getWriter();
				out.println("<script>");
				out.println("alert('"+strMsg+"');");
				out.println("location.href='" + retUrl + "'");
				out.println("</script>");
				out.flush();
	    	} catch (Exception e) {
	    		e.getStackTrace();
	    	}
	    }
		
	    /** 3자리마다 콤마 
	     * @param num
	     * @return
	     */
	    public static String toNumFormat(int num) {
	    	DecimalFormat df = new DecimalFormat("#,###");
	    	return df.format(num);
	    }
	    
	    // Env property 값을 읽어 온다.
	    public static String readEnvProperty(String arg){
	    	
	    	String msg = "";
	    	try{
	    		String rootpath = StringUtil.class.getResource("").getPath().substring(0, StringUtil.class.getResource("").getPath().lastIndexOf("eluo"));
	    		String propFile = rootpath + "/egovframework/egovProps/env.properties";
	            // 프로퍼티 객체 생성
	            Properties props = new Properties();
	             
	            // 프로퍼티 파일 스트림에 담기
	            FileInputStream fis = new FileInputStream(propFile);
	             
	            // 프로퍼티 파일 로딩
	            props.load(new java.io.BufferedInputStream(fis));
	             
	            // 항목 읽기
	            msg = props.getProperty(arg) ;
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	
	    	return msg;
	    }
}