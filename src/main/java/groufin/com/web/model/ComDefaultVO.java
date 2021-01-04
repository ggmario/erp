package groufin.com.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ComDefaultVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6064626589966527341L;

	private int rownum = 1;

	/** 현재페이지 */
	private int pageIndex = 1;
	/** 현재페이지 */
	private int pageIndex2 = 1;

	/** 페이지갯수 */
	private int pageUnit = 20;

	/** 페이지사이즈 */
	private int pageSize = 10;

	/** firstIndex */
	private int firstIndex = 0;

	/** lastIndex */
	private int lastIndex = 1;

	/** recordCountPerPage */
	private int recordCountPerPage = 10;
	
	/** 등록 일짜*/
	private String reg_date = "";
	
	/** 수정 일짜*/
	private String upt_date = "";

	/** 사용여부 Y:사용, N 중지*/
	private String state_yn = "";
	
	// LIST 페이징
	@JsonIgnore
	private boolean bPaging = true;

	/** 검색조건 */
	@JsonIgnore
	private String searchCondition = "";

	/** 검색Keyword */
	@JsonIgnore
	private String searchKeyword = "";

	/** 검색사용여부 */
	@JsonIgnore
	private String searchUseYn = "";

	/** 검색KeywordFrom */
	@JsonIgnore
	private String searchKeywordFrom = "";

	/** 검색KeywordTo */
	@JsonIgnore
	private String searchKeywordTo = "";

	/** 검색여부 */
	@JsonIgnore
	private String search_yn = "";

	/** 순서컬럼 */
	@JsonIgnore
	private String searchSortType = "";

	/** 정렬순서 */
	@JsonIgnore
	private String searchSort = "";

	/* 정렬쿼리문 */
	@JsonIgnore
	private String orderby = "";

	@JsonIgnore
	private String mode = "";
	@JsonIgnore
	private String pageMode = "";

	@JsonIgnore
	private String addQuery = "";

	/** ROW_NUMBER **/
	private String rnum = "";
	@JsonIgnore
	private String searchStartDt = "";
	@JsonIgnore
	private String searchEndDt = "";
	@JsonIgnore
	private String searchGubun = "";
	@JsonIgnore
	private String searchType = "";

	@JsonIgnore
	private String searchVal1 = "";
	@JsonIgnore
	private String searchVal2 = "";
	@JsonIgnore
	private String searchVal3 = "";
	@JsonIgnore
	private String searchVal4 = "";
	@JsonIgnore
	private String searchVal5 = "";
	@JsonIgnore
	private String searchVal6 = "";
	@JsonIgnore
	private String searchVal7 = "";
	@JsonIgnore
	private String searchVal8 = "";
	@JsonIgnore
	private String searchVal9 = "";
	@JsonIgnore
	private String searchVal10 = "";
	@JsonIgnore
	private String keywordSearchVal = "";
	

	@JsonIgnore
	private String[] searchDataKey;
	@JsonIgnore
	private String[] searchDataVal;
	@JsonIgnore
	private String[] searchDataVa2;
	@JsonIgnore
	private String[] searchDataVa3;
	@JsonIgnore
	private String[] searchDataVa4;
	@JsonIgnore
	private String[] searchDataVa5;
	@JsonIgnore
	private String[] searchDataVa6;
	@JsonIgnore
	private String[] searchDataVa7;
	@JsonIgnore
	private String[] searchDataVa8;
	@JsonIgnore
	private String[] searchDataVa9;

	/* 기타 intger 형 */
	@JsonIgnore
	private int etcNum1;
	@JsonIgnore
	private int etcNum2;
	@JsonIgnore
	private int etcNum3;
	@JsonIgnore
	private int etcNum4;
	@JsonIgnore
	private int etcNum5;
	
	/* STRING ARRAYlIST */
	@JsonIgnore
	private List<String> searchArrayList01 = new ArrayList<String>();
	
	@JsonIgnore
	private List<String> searchArrayList02 = new ArrayList<String>();
	
	@JsonIgnore
	private List<String> searchArrayList03 = new ArrayList<String>();
	
	@JsonIgnore
	private List<String> searchArrayList04 = new ArrayList<String>();
	
	@JsonIgnore
	private List<String> searchArrayList05 = new ArrayList<String>();
	
	/*리턴 URL정보*/
	private String returnUrl = "";
	
	/** Keyword 검색용 카테고리 상위 depth 코드 */
	@JsonIgnore
	private String[] searchCategory;
	
	private String schGbn = "";

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageUnit() {
		return pageUnit;
	}

	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public int getLastIndex() {
		return lastIndex;
	}

	public void setLastIndex(int lastIndex) {
		this.lastIndex = lastIndex;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getSearchUseYn() {
		return searchUseYn;
	}

	public void setSearchUseYn(String searchUseYn) {
		this.searchUseYn = searchUseYn;
	}

	public String getSearchKeywordFrom() {
		return searchKeywordFrom;
	}

	public void setSearchKeywordFrom(String searchKeywordFrom) {
		this.searchKeywordFrom = searchKeywordFrom;
	}

	public String getSearchKeywordTo() {
		return searchKeywordTo;
	}

	public void setSearchKeywordTo(String searchKeywordTo) {
		this.searchKeywordTo = searchKeywordTo;
	}

	public String getSearch_yn() {
		return search_yn;
	}

	public void setSearch_yn(String search_yn) {
		this.search_yn = search_yn;
	}

	public String getSearchSortType() {
		return searchSortType;
	}

	public void setSearchSortType(String searchSortType) {
		this.searchSortType = searchSortType;
	}

	public String getSearchSort() {
		return searchSort;
	}

	public void setSearchSort(String searchSort) {
		this.searchSort = searchSort;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPageMode() {
		return pageMode;
	}

	public void setPageMode(String pageMode) {
		this.pageMode = pageMode;
	}

	public String getRnum() {
		return rnum;
	}

	public void setRnum(String rnum) {
		this.rnum = rnum;
	}

	public String getSearchStartDt() {
		return searchStartDt;
	}

	public void setSearchStartDt(String searchStartDt) {
		this.searchStartDt = searchStartDt;
	}

	public String getSearchEndDt() {
		return searchEndDt;
	}

	public void setSearchEndDt(String searchEndDt) {
		this.searchEndDt = searchEndDt;
	}

	public String getSearchGubun() {
		return searchGubun;
	}

	public void setSearchGubun(String searchGubun) {
		this.searchGubun = searchGubun;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchVal1() {
		return searchVal1;
	}

	public void setSearchVal1(String searchVal1) {
		this.searchVal1 = searchVal1;
	}

	public String getSearchVal2() {
		return searchVal2;
	}

	public void setSearchVal2(String searchVal2) {
		this.searchVal2 = searchVal2;
	}

	public String getSearchVal3() {
		return searchVal3;
	}

	public void setSearchVal3(String searchVal3) {
		this.searchVal3 = searchVal3;
	}

	public String getSearchVal4() {
		return searchVal4;
	}

	public void setSearchVal4(String searchVal4) {
		this.searchVal4 = searchVal4;
	}

	public String getSearchVal5() {
		return searchVal5;
	}

	public void setSearchVal5(String searchVal5) {
		this.searchVal5 = searchVal5;
	}

	public String getSearchVal6() {
		return searchVal6;
	}

	public void setSearchVal6(String searchVal6) {
		this.searchVal6 = searchVal6;
	}

	public String getSearchVal7() {
		return searchVal7;
	}

	public void setSearchVal7(String searchVal7) {
		this.searchVal7 = searchVal7;
	}

	public String getSearchVal8() {
		return searchVal8;
	}

	public void setSearchVal8(String searchVal8) {
		this.searchVal8 = searchVal8;
	}

	public String getSearchVal9() {
		return searchVal9;
	}

	public void setSearchVal9(String searchVal9) {
		this.searchVal9 = searchVal9;
	}

	public String getSearchVal10() {
		return searchVal10;
	}

	public void setSearchVal10(String searchVal10) {
		this.searchVal10 = searchVal10;
	}
	
	public String getKeywordSearchVal() {
		return keywordSearchVal;
	}

	public void setKeywordSearchVal(String keywordSearchVal) {
		this.keywordSearchVal = keywordSearchVal;
	}

	public String[] getSearchDataKey() {
		return searchDataKey;
	}

	public void setSearchDataKey(String[] searchDataKey) {
		this.searchDataKey = searchDataKey;
	}

	public String[] getSearchDataVal() {
		return searchDataVal;
	}

	public void setSearchDataVal(String[] searchDataVal) {
		this.searchDataVal = searchDataVal;
	}

	public String[] getSearchDataVa2() {
		return searchDataVa2;
	}

	public void setSearchDataVa2(String[] searchDataVa2) {
		this.searchDataVa2 = searchDataVa2;
	}

	public String[] getSearchDataVa3() {
		return searchDataVa3;
	}

	public void setSearchDataVa3(String[] searchDataVa3) {
		this.searchDataVa3 = searchDataVa3;
	}

	public String[] getSearchDataVa4() {
		return searchDataVa4;
	}

	public void setSearchDataVa4(String[] searchDataVa4) {
		this.searchDataVa4 = searchDataVa4;
	}

	public String[] getSearchDataVa5() {
		return searchDataVa5;
	}

	public void setSearchDataVa5(String[] searchDataVa5) {
		this.searchDataVa5 = searchDataVa5;
	}

	public int getEtcNum1() {
		return etcNum1;
	}

	public void setEtcNum1(int etcNum1) {
		this.etcNum1 = etcNum1;
	}

	public int getEtcNum2() {
		return etcNum2;
	}

	public void setEtcNum2(int etcNum2) {
		this.etcNum2 = etcNum2;
	}

	public int getEtcNum3() {
		return etcNum3;
	}

	public void setEtcNum3(int etcNum3) {
		this.etcNum3 = etcNum3;
	}

	public int getEtcNum4() {
		return etcNum4;
	}

	public void setEtcNum4(int etcNum4) {
		this.etcNum4 = etcNum4;
	}

	public int getEtcNum5() {
		return etcNum5;
	}

	public void setEtcNum5(int etcNum5) {
		this.etcNum5 = etcNum5;
	}

	/**
	 * @return the searchDataVa6
	 */
	public String[] getSearchDataVa6() {
		return searchDataVa6;
	}

	/**
	 * @param searchDataVa6
	 *            the searchDataVa6 to set
	 */
	public void setSearchDataVa6(String[] searchDataVa6) {
		this.searchDataVa6 = searchDataVa6;
	}

	/**
	 * @return the searchDataVa7
	 */
	public String[] getSearchDataVa7() {
		return searchDataVa7;
	}

	/**
	 * @param searchDataVa7
	 *            the searchDataVa7 to set
	 */
	public void setSearchDataVa7(String[] searchDataVa7) {
		this.searchDataVa7 = searchDataVa7;
	}

	/**
	 * @return the searchDataVa8
	 */
	public String[] getSearchDataVa8() {
		return searchDataVa8;
	}

	/**
	 * @param searchDataVa8
	 *            the searchDataVa8 to set
	 */
	public void setSearchDataVa8(String[] searchDataVa8) {
		this.searchDataVa8 = searchDataVa8;
	}

	/**
	 * @return the bPaging
	 */
	public boolean isbPaging() {
		return bPaging;
	}

	public String getAddQuery() {
		return addQuery;
	}

	public void setAddQuery(String addQuery) {
		this.addQuery = addQuery;
	}

	/**
	 * @param bPaging
	 *            the bPaging to set
	 */
	public void setbPaging(boolean bPaging) {
		this.bPaging = bPaging;
	}

	/**
	 * @return the searchDataVa9
	 */
	public String[] getSearchDataVa9() {
		return searchDataVa9;
	}

	/**
	 * @param searchDataVa9
	 *            the searchDataVa9 to set
	 */
	public void setSearchDataVa9(String[] searchDataVa9) {
		this.searchDataVa9 = searchDataVa9;
	}

	/**
	 * @return the returnUrl
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * @param returnUrl the returnUrl to set
	 */
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public int getPageIndex2() {
		return pageIndex2;
	}

	public void setPageIndex2(int pageIndex2) {
		this.pageIndex2 = pageIndex2;
	}

	public List<String> getSearchArrayList01() {
		return searchArrayList01;
	}

	public void setSearchArrayList01(List<String> searchArrayList01) {
		this.searchArrayList01 = searchArrayList01;
	}

	public List<String> getSearchArrayList02() {
		return searchArrayList02;
	}

	public void setSearchArrayList02(List<String> searchArrayList02) {
		this.searchArrayList02 = searchArrayList02;
	}

	public List<String> getSearchArrayList03() {
		return searchArrayList03;
	}

	public void setSearchArrayList03(List<String> searchArrayList03) {
		this.searchArrayList03 = searchArrayList03;
	}

	public List<String> getSearchArrayList04() {
		return searchArrayList04;
	}

	public void setSearchArrayList04(List<String> searchArrayList04) {
		this.searchArrayList04 = searchArrayList04;
	}

	public List<String> getSearchArrayList05() {
		return searchArrayList05;
	}

	public void setSearchArrayList05(List<String> searchArrayList05) {
		this.searchArrayList05 = searchArrayList05;
	}

	public String[] getSearchCategory() {
		return searchCategory;
	}

	public void setSearchCategory(String[] searchCategory) {
		this.searchCategory = searchCategory;
	}

	public String getSchGbn() {
		return schGbn;
	}

	public void setSchGbn(String schGbn) {
		this.schGbn = schGbn;
	}
	/**
	 * 등록일 일자
	 * @return the reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}
	/**
	 * 등록일 일자
	 * @param reg_date the reg_date to set
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	/**
	 * 업데이트 일짜
	 * @return the upt_date
	 */
	public String getUpt_date() {
		return upt_date;
	}
	/**
	 * 업데이트 일자
	 * @param upt_date the upt_date to set
	 */
	public void setUpt_date(String upt_date) {
		this.upt_date = upt_date;
	}

	/**
	 * 사용여부(삭제,화면 표기 여부 등 사용)
	 * @return the state_yn
	 */
	public String getState_yn() {
		return state_yn;
	}

	/**
	 * 사용여부(삭제,화면 표기 여부 등 사용)
	 * @param state_yn the state_yn to set
	 */
	public void setState_yn(String state_yn) {
		this.state_yn = state_yn;
	}
	

	
}