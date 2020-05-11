package org.springJDBC.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springJDBC.Payment;
import org.springJDBC.dao.PaymentDAO;



public class JdbcPaymentDAO implements PaymentDAO{
	
private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Payment payment){
		
		String sql = "INSERT INTO payment " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, payment.getCustId());
			ps.setString(2, payment.getName());
			ps.setInt(3, payment.getAge());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public Payment findByCustomerId(int custId){
		
		String sql = "SELECT * FROM payment WHERE CUST_ID = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Payment customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Payment(
					rs.getInt("CUST_ID"),
					rs.getString("NAME"), 
					rs.getInt("Age")
				);
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
