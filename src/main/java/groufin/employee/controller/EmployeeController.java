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
 * Description	: 그루핀 인트라넷 ( 직원정보 수정 및 직원 등록 )
 * Environment	: java 8, servlet 3.1, Tomcat 9, Mysql
 * Notes	    : Developed by groufin.com
 * 
 * @(#) EmployeeController.java
 * @since 2020-12-05
 * History	    : [DATE][Programmer][Description]
 * 		        : [2020-12-05][ggmario21@groufin.com][CREATE: STATEMENT]
 */

package groufin.employee.controller;

import java.util.List;

import javax.annotation.Resource;
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
import groufin.employee.service.EmployeeServices;
import groufin.employee.service.model.EmployeeVO;
 
@Controller
public class EmployeeController extends SessionController {

	@Resource(name="employeeServices")
	private EmployeeServices employeeServices;
	
	private static final Logger log = Logger.getLogger(EmployeeController.class.getName());

	/**
	 * 직원 등록 처리 화면 호출 하기
	 * @param request
	 * @param response
	 * @param comVo
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/employeeJoin.do")
	public String login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("searchVO") ComDefaultVO comVo, ModelMap model, HttpSession session) throws Exception {
		log.debug("== 직원 등록 화면  ==");
		System.out.println("ddddddddddddddddd");
//		if(session.getAttribute(sSession) == null){
//			model.addAttribute("strScript",super.getReturnProc("", "/login.do"));
//			return super.returnPage;
//		}
		try{
			EmployeeVO vo = new EmployeeVO();
			Integer iCount = employeeServices.selectTest(comVo);
//			List<EmployeeVO> voTest = employeeServices.selectTest2(vo);
			System.out.println("--------------");
			System.out.println("iCount:::::"+iCount);
		}catch(Exception e ) {
			System.out.println(e.getMessage());
			e.printStackTrace();
//			System.out.println();
		}
		return null;
	}
}
