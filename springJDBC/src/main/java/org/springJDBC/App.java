package org.springJDBC;

import org.springJDBC.dao.PaymentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
        		new ClassPathXmlApplicationContext("Spring-Module.xml");
        	 
            PaymentDAO paymentDAO = (PaymentDAO) context.getBean("paymentDAO");
            Payment payment = new Payment(3,"Nalini-1",36);
           
            paymentDAO.insert(payment);
        	
            Payment payment1 = paymentDAO.findByCustomerId(3);
            System.out.println(payment1);
	}

}
