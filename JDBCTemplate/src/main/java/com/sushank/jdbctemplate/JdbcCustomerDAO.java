package com.sushank.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Customer customer) {
		String query = "insert into customer values('" + customer.getCustId() + "','" + customer.getName() + "','"
				+ customer.getAge() + "')";
		return jdbcTemplate.update(query);
	}

}
