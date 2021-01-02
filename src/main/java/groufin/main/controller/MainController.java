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
 * Description	: 그루핀 인트라넷
 * Environment	: java 8, servlet 3.1, Tomcat 8, Mysql
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
//		if(session.getAttribute(sSession) != null){
//			response.sendRedirect("/orderProgress.do");
			System.out.println("aaaaaaaa");
			log.debug("== 메인 호출 ==");
//		}
		return"groufin/main/main";
	}
}
