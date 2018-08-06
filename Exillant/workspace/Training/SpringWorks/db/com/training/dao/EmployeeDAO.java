package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.entity.IEmployeeDAO;
import com.training.mapper.EmployeeMapper;

public class EmployeeDAO implements IEmployeeDAO {
	private DataSource datasource;
	
	
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub

		String sql = "select empid,empname,empsal from employee where empid=" + empId;
		// Employee employee = jdbcTemplateObject.queryForObject(sql, new Object[] {
		// empId },
		// new BeanPropertyRowMapper<Employee>(Employee.class));

		Employee employee = jdbcTemplateObject.queryForObject(sql, new Object[] { empId }, new EmployeeMapper());

		return employee;
	}

	public Employee getAllEmployees(int[] empId) {
		// TODO Auto-generated method stub

		String sql = "select empid,empname,empsal from employee";
		List<Employee> list = new ArrayList<>();
		List<Map<String, Object>> rows = jdbcTemplateObject.queryForList(sql);

		Employee employee = new Employee();

		for (Map row : rows) {

			employee.setEmpId(Integer.parseInt(row.get("empid").toString()));
			employee.setEmpName(row.get("empname").toString());
			employee.setEmpSal(Double.parseDouble((row.get("empsal").toString())));
		}

		return employee;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into Employee (empId,empName,empSal) " + "values (?,?,?)";
		
		System.out.println("sql..."+sql+"....."+employee+"........"+jdbcTemplateObject);

		jdbcTemplateObject.update(sql, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal());
		System.out.println("record cerated:.." + employee);
		return;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		String sql = "delete from Employee where empid=" + empId;
		jdbcTemplateObject.update(sql);
	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub
		String sql = "update  Employee set empsal="+empNewSalary+" where empid=" + empId;
		jdbcTemplateObject.update(sql);
	}

	@Override
	public void setDataSource(javax.sql.DataSource dataSource) {
		// TODO Auto-generated method stub
		this.datasource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

}
