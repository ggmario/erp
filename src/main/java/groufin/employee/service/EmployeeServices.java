package groufin.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import groufin.com.web.model.ComDefaultVO;
import groufin.employee.service.model.EmployeeVO;

@Service("employeeMapper")
public interface EmployeeServices {

	/**
	 * 예제1<p>
	 * 널 처리 목적으로 Int대신 Integer 사용 
	 * @param comVo
	 * @return
	 * @throws Exception
	 */
	Integer selectTest(ComDefaultVO comVo)throws Exception;

	/**
	 * 예제2<br>
	 * 리스트 형
	 * @param vo
	 * @return
	 * @throws Exception
	 */
//	List<EmployeeVO> selectTest2(EmployeeVO vo)throws Exception;



}
