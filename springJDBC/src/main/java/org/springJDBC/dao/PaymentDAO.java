package org.springJDBC.dao;

import org.springJDBC.Payment;

public interface PaymentDAO {

	public void insert(Payment payment);
	public Payment findByCustomerId(int custId);
}
