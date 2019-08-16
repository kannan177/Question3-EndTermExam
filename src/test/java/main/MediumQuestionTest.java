package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MediumQuestionTest {
	
	Customer previlaged=new PrivilegeCustomer("venkat", "coimbatore",21, "9600511879");
	Customer senior=new SeniorCitizenCustomer("venkat", "coimbatore",21, "9600511879");
	@SuppressWarnings("static-access")
	@Test
	public void privilegeCustomer() {
		assertEquals(700.0,previlaged.getBillAmount(1000.0),0.0);
	}
	@SuppressWarnings("static-access")
	@Test
	public void seniorCitizen() {
		assertEquals(440.0,senior.getBillAmount(500.0),0.0);
	}

}
