package com.sushank.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAOImpl implements EmployeeDAO {

	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Employee employee) {
		String query = "insert into employee (id, name, role) values (?,?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Object[] args = new Object[] { employee.getId(), employee.getName(), employee.getRole() };

		int out = jdbcTemplate.update(query, args);

		if (out != 0) {
			System.out.println("Employee saved with id=" + employee.getId());
		} else
			System.out.println("Employee save failed with id=" + employee.getId());

		/*
		 * Connection con = null; PreparedStatement ps = null; try { con =
		 * dataSource.getConnection(); ps = con.prepareStatement(query);
		 * ps.setInt(1, employee.getId()); ps.setString(2, employee.getName());
		 * ps.setString(3, employee.getRole()); int out = ps.executeUpdate(); if
		 * (out != 0) { System.out.println("Employee saved with id=" +
		 * employee.getId()); } else System.out.println(
		 * "Employee save failed with id=" + employee.getId()); } catch
		 * (SQLException e) { e.printStackTrace(); } finally { try { ps.close();
		 * con.close(); } catch (SQLException e) { e.printStackTrace(); } }
		 */
	}

	public Employee getById(int id) {
		String query = "select id,name, role from employee where id = ?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Employee emp = jdbcTemplate.queryForObject(query, new Object[] { id }, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setRole(rs.getString("role"));
				return emp;
			}
		});

		return emp;
		/*
		 * Employee emp = null; Connection con = null; PreparedStatement ps =
		 * null; ResultSet rs = null; try { con = dataSource.getConnection(); ps
		 * = con.prepareStatement(query); ps.setInt(1, id); rs =
		 * ps.executeQuery(); if (rs.next()) { emp = new Employee();
		 * emp.setId(id); emp.setName(rs.getString("name"));
		 * emp.setRole(rs.getString("role")); System.out.println(
		 * "Employee Found::" + emp); } else { System.out.println(
		 * "No Employee found with id=" + id); } } catch (SQLException e) {
		 * e.printStackTrace(); } finally { try { rs.close(); ps.close();
		 * con.close(); } catch (SQLException e) { e.printStackTrace(); } }
		 * return emp;
		 */
	}

	public void update(Employee employee) {
		String query = "update employee set name=?, role=? where id=?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { employee.getName(), employee.getRole(), employee.getId() };

		int out = jdbcTemplate.update(query, args);
		if (out != 0) {
			System.out.println("Employee updated with id=" + employee.getId());
		} else
			System.out.println("No Employee found with id=" + employee.getId());
		/*
		 * Connection con = null; PreparedStatement ps = null; try { con =
		 * dataSource.getConnection(); ps = con.prepareStatement(query);
		 * ps.setString(1, employee.getName()); ps.setString(2,
		 * employee.getRole()); ps.setInt(3, employee.getId()); int out =
		 * ps.executeUpdate(); if (out != 0) { System.out.println(
		 * "Employee updated with id=" + employee.getId()); } else
		 * System.out.println("No Employee found with id=" + employee.getId());
		 * } catch (SQLException e) { e.printStackTrace(); } finally { try {
		 * ps.close(); con.close(); } catch (SQLException e) {
		 * e.printStackTrace(); } }
		 */

	}

	public void delete(int id) {
		String query = "delete from employee where id=?";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		int out = jdbcTemplate.update(query, id);
		if (out != 0) {
			System.out.println("Employee deleted with id=" + id);
		} else
			System.out.println("No Employee found with id=" + id);
		/*
		 * Connection con = null; PreparedStatement ps = null; try { con =
		 * dataSource.getConnection(); ps = con.prepareStatement(query);
		 * ps.setInt(1, id); int out = ps.executeUpdate(); if (out != 0) {
		 * System.out.println("Employee deleted with id=" + id); } else
		 * System.out.println("No Employee found with id=" + id); } catch
		 * (SQLException e) { e.printStackTrace(); } finally { try { ps.close();
		 * con.close(); } catch (SQLException e) { e.printStackTrace(); } }
		 */

	}

	public List<Employee> getAll() {
		String query = "select id, name, role from employee";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Employee> empList = new ArrayList<Employee>();

		List<Map<String, Object>> empRows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> empRow : empRows) {
			Employee emp = new Employee();
			emp.setId(Integer.parseInt(String.valueOf(empRow.get("id"))));
			emp.setName(String.valueOf(empRow.get("name")));
			emp.setRole(String.valueOf(empRow.get("role")));
			empList.add(emp);
		}
		return empList;

		/*
		 * List<Employee> empList = new ArrayList<Employee>(); Connection con =
		 * null; PreparedStatement ps = null; ResultSet rs = null; try { con =
		 * dataSource.getConnection(); ps = con.prepareStatement(query); rs =
		 * ps.executeQuery(); while (rs.next()) { Employee emp = new Employee();
		 * emp.setId(rs.getInt("id")); emp.setName(rs.getString("name"));
		 * emp.setRole(rs.getString("role")); empList.add(emp); } } catch
		 * (SQLException e) { e.printStackTrace(); } finally { try { rs.close();
		 * ps.close(); con.close(); } catch (SQLException e) {
		 * e.printStackTrace(); } } return empList;
		 */
	}
}
