package groufin.employee.service.model;

import groufin.com.web.model.ComDefaultVO;

public class EmployeeVO  extends ComDefaultVO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -564067106482903583L;
	private String staff_number = "";
	private String staff_name = "";
	private String id = "";
	private String pw = "";
	private String position_name = "";
	private String duty_code = "";
	private String authority_code = "";
	private String birthday = "";
	private String sex = "";
	private String phone_number = "";
	private String mail_address = "";
	private String address = "";
	private String join_date = "";
	private String leave_date = "";
	private String amender_staff_number = "";
	private String pw_initialization_yn = "";
	private String dept_code = "";
	private String vacation_count = "";
	private String use_count = "";
	private String detailed_address = "";
	
	/**
	 * 입사날짜+램덤 숫자3자리
	 * @return the staff_number
	 */
	public String getStaff_number() {
		return staff_number;
	}
	/**
	 * 입사날짜+램덤 숫자3자리
	 * @param staff_number the staff_number to set
	 */
	public void setStaff_number(String staff_number) {
		this.staff_number = staff_number;
	}
	/**
	 * 직원 이름
	 * @return the staff_name
	 */
	public String getStaff_name() {
		return staff_name;
	}
	/**
	 * 직원 이름
	 * @param staff_name the staff_name to set
	 */
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	/**
	 * 아이디
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 아이디
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 비밀번호
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}
	/**
	 * 비밀 번호
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}
	/**
	 * 직위 (사원,주임,대리,과장,차장,부장,상무,이사)
	 * @return the position_name
	 */
	public String getPosition_name() {
		return position_name;
	}
	/**
	 * 직위 (사원,주임,대리,과장,차장,부장,상무,이사)
	 * @param position_name the position_name to set
	 */
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
	/**
	 * 직책 코드
	 * @return the duty_code
	 */
	public String getDuty_code() {
		return duty_code;
	}
	/**
	 * 직책 코드
	 * @param duty_code the duty_code to set
	 */
	public void setDuty_code(String duty_code) {
		this.duty_code = duty_code;
	}
	/**
	 * 권한 코드
	 * @return the authority_code
	 */
	public String getAuthority_code() {
		return authority_code;
	}
	/**
	 * 권한 코드
	 * @param authority_code the authority_code to set
	 */
	public void setAuthority_code(String authority_code) {
		this.authority_code = authority_code;
	}
	/**
	 * 생년월일
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 생년월일
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 성별
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 성별
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 휴대전화 번호
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * 휴대전화 번호
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * 개인 메일 주소
	 * @return the mail_address
	 */
	public String getMail_address() {
		return mail_address;
	}
	/**
	 * 개인 메일 주소
	 * @param mail_address the mail_address to set
	 */
	public void setMail_address(String mail_address) {
		this.mail_address = mail_address;
	}
	/**
	 * 주소 (**지역/***구/**동)
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 주소 (**지역/***구/**동)
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 입사일
	 * @return the join_date
	 */
	public String getJoin_date() {
		return join_date;
	}
	/**
	 * 입사일
	 * @param join_date the join_date to set
	 */
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	/**
	 * 퇴사일
	 * @return the leave_date
	 */
	public String getLeave_date() {
		return leave_date;
	}
	/**
	 * 퇴사일
	 * @param leave_date the leave_date to set
	 */
	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}
	/**
	 * 수정자 번호(수정한 직원 번호)
	 * @return the amender_staff_number
	 */
	public String getAmender_staff_number() {
		return amender_staff_number;
	}
	/**
	 * 수정자 번호(수정한 직원 번호)
	 * @param amender_staff_number the amender_staff_number to set
	 */
	public void setAmender_staff_number(String amender_staff_number) {
		this.amender_staff_number = amender_staff_number;
	}
	
	/**
	 * 비번 초기화 여부(기본N)
	 * @return the pw_initialization_yn
	 */
	public String getPw_initialization_yn() {
		return pw_initialization_yn;
	}
	/**
	 * 비번 초기화 여부(기본N)
	 * @param pw_initialization_yn the pw_initialization_yn to set
	 */
	public void setPw_initialization_yn(String pw_initialization_yn) {
		this.pw_initialization_yn = pw_initialization_yn;
	}
	/**
	 * 부서 코드(공통 코드)
	 * @return the dept_code
	 */
	public String getDept_code() {
		return dept_code;
	}
	/**
	 * 부서 코드(공통 코드)
	 * @param dept_code the dept_code to set
	 */
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	/**
	 * 사용 가능 휴가 수
	 * @return the vacation_count
	 */
	public String getVacation_count() {
		return vacation_count;
	}
	/**
	 * 사용 가능 휴가 수
	 * @param vacation_count the vacation_count to set
	 */
	public void setVacation_count(String vacation_count) {
		this.vacation_count = vacation_count;
	}
	/**
	 * 휴가 사용한 일수
	 * @return the use_count
	 */
	public String getUse_count() {
		return use_count;
	}
	/**
	 * 휴가 사용한 일수
	 * @param use_count the use_count to set
	 */
	public void setUse_count(String use_count) {
		this.use_count = use_count;
	}
	/**
	 * 상세 주소(동,호수 등)
	 * @return the detailed_address
	 */
	public String getDetailed_address() {
		return detailed_address;
	}
	/**
	 * 상세 주소(동,호수 등)
	 * @param detailed_address the detailed_address to set
	 */
	public void setDetailed_address(String detailed_address) {
		this.detailed_address = detailed_address;
	}
	
}
