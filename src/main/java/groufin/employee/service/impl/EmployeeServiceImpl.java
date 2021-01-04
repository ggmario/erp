package groufin.employee.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import groufin.com.web.model.ComDefaultVO;
import groufin.employee.service.EmployeeServices;
import groufin.employee.service.mapper.EmployeeMapper;
import groufin.employee.service.model.EmployeeVO;

@Service("employeeServices")
public class EmployeeServiceImpl implements EmployeeServices{

	@Resource(name="employeeMapper")
	private EmployeeMapper employeeMapper;

	@Override
	public Integer selectTest(ComDefaultVO comVo) throws Exception {
//		return null;
		return employeeMapper.selectTest(comVo);
	}

//	@Override
//	public List<EmployeeVO> selectTest2(EmployeeVO vo) throws Exception {
//		return null;
//		return employeeMapper.selectTest2(vo);
//	}
}
