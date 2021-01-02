package groufin.com.web.model;

public class CommCodeVO extends ComDefaultVO {
	  /**
	 * 
	 */
	private static final long serialVersionUID = -2791341516040047427L;
	// 코드
	  private String cd;
	  private String state;

	/**
	 * @return the cd
	 */
	public String getCd() {
		return cd;
	}

	/**
	 * @param cd the cd to set
	 */
	public void setCd(String cd) {
		this.cd = cd;
	}

	/**
	 * 상태
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * 상태
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}
