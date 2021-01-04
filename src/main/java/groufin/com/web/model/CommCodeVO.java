package groufin.com.web.model;

public class CommCodeVO extends ComDefaultVO {
	  /**
	 * 
	 */
	private static final long serialVersionUID = -2791341516040047427L;

	// 콩통 코드
	private String code = "";
	private String code_name = "";
	private String code_explanation = "";

	private String sub_code = "";
	private String sub_code_name = "";
	private String sub_code_explanation = "";
	
	/**
	 * 공통 코드
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 공통 코드
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * 코드 설명
	 * @return the code_explanation
	 */
	public String getCode_explanation() {
		return code_explanation;
	}
	/**
	 * 코드 설명
	 * @param code_explanation the code_explanation to set
	 */
	public void setCode_explanation(String code_explanation) {
		this.code_explanation = code_explanation;
	}
	/**
	 * 코드 이름
	 * @return the code_name
	 */
	public String getCode_name() {
		return code_name;
	}
	/**
	 * 코드 이름
	 * @param code_name the code_name to set
	 */
	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}
	/**
	 * 상세코드
	 * @return the sub_code
	 */
	public String getSub_code() {
		return sub_code;
	}
	/**
	 * 상세 코드
	 * @param sub_code the sub_code to set
	 */
	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}
	/**
	 * 상세 코드 이름
	 * @return the sub_code_name
	 */
	public String getSub_code_name() {
		return sub_code_name;
	}
	/**
	 * 상세 코드 이름
	 * @param sub_code_name the sub_code_name to set
	 */
	public void setSub_code_name(String sub_code_name) {
		this.sub_code_name = sub_code_name;
	}
	/**
	 * 상세 코드 설명
	 * @return the sub_code_explanation
	 */
	public String getSub_code_explanation() {
		return sub_code_explanation;
	}
	/**
	 * 상세 코드 설명
	 * @param sub_code_explanation the sub_code_explanation to set
	 */
	public void setSub_code_explanation(String sub_code_explanation) {
		this.sub_code_explanation = sub_code_explanation;
	}

	
}
