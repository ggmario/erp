package groufin.employee.service.mapper;

import java.sql.SQLException;
import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import groufin.com.web.model.ComDefaultVO;
import groufin.employee.service.model.EmployeeVO;

@Mapper("employeeMapper")
public interface EmployeeMapper {
	Integer selectTest(ComDefaultVO comVo)throws Exception, SQLException;


//	List<EmployeeVO> selectTest2(EmployeeVO vo)throws Exception, SQLException;


}
