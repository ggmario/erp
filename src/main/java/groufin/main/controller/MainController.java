/*
 * 하기 프로그램에 대한 저작권을 포함한 지적재산권은 GROUFIN에 있으며,
 * GROUFIN가 명시적으로 허용하지 않는 사용, 복사, 변경 및 제 3자에 의한 공개, 배포는 엄격히 금지되며
 * GROUFIN의 지적재산권 침해에 해당된다.
 * Copyright (C) 2020 GROUFIN All Rights Reserved.
 * 
 * YOU ARE STRICTLY PROHIBITED TO COPY, DISCLOSE, DISTRIBUTE, MODIFY OR USE THIS PROGRAM
 * IN PART OR AS A WHOLE WITHOUT THE PRIOR WRITTEN CONSENT OF GROUFIN.
 * GROUFIN OWNS THE INTELLECTUAL PROPERTY RIGHTS IN AND TO THIS PROGRAM.
 * COPYRIGHT (C) 2020 GROUFIN ALL RIGHTS RESERVED.
 * 
 * Project	    : taeTime
 * Program    	: ErpGroufin
 * Description	: 그루핀 인트라넷 메인/로그인/로그아웃
 * Environment	: java 8, servlet 3.1, Tomcat 9, Mysql
 * Notes	    : Developed by groufin.com
 * 
 * @(#) MainController.java
 * @since 2020-12-05
 * History	    : [DATE][Programmer][Description]
 * 		        : [2020-12-05][ggmario21@groufin.com][CREATE: STATEMENT]
 */

package groufin.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import groufin.com.web.controller.SessionController;
import groufin.com.web.model.ComDefaultVO;


@Controller
public class MainController extends SessionController {

	private static final Logger log = Logger.getLogger(MainController.class.getName());

	/**
	 * 메인 화면
	 * @param request
	 * @param response
	 * @param comVo
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = {"/main.do","/index.do"} )//둘중 하나에 해당 하면 수행 됨
	public String orderJoin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("searchVO") ComDefaultVO comVo, ModelMap model, HttpSession session) throws Exception {
		if(session.getAttribute(sSession) == null){
			model.addAttribute("strScript",super.getReturnProc("로그인 해주세요", "/login.do"));
			System.out.println("aaaaaaaa");
			log.debug("== 메인 호출 ==");
			return super.returnPage;
		}
		try {
			//정상 메인 화면 내용 DB조회 화면에 리턴 내용
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return"groufin/main/main";
	}
	
	/**
	 * 로그인 페이지
	 * @param request
	 * @param response
	 * @param comVo
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("searchVO") ComDefaultVO comVo, ModelMap model, HttpSession session) throws Exception {
		if(session.getAttribute(sSession) != null){
			model.addAttribute("strScript",super.getReturnProc("이미 로그인 상태 입니다", "/main.do"));
//			response.sendRedirect("/orderProgress.do");
			System.out.println("login Page");
			log.debug("== 로그인 페이지 입니다.  ==");
		}
		return"groufin/login/login";
	}
	
	/**
	 * 로그 아웃
	 * @param request
	 * @param response
	 * @param comVo
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout.do")
	public String logout(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("searchVO") ComDefaultVO comVo, ModelMap model, HttpSession session) throws Exception {
		session.removeAttribute(sSession);
		log.debug("로그 아웃");
		model.addAttribute("strScript",super.getReturnPage("로그아웃 되었습니다", "M"));
		return super.returnPage;
	}
}
