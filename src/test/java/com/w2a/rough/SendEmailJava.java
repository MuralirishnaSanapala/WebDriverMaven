package com.w2a.rough;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		System.out.println("================Test started==================");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("smuralikrishna006@gmail.com", "murali@321"));
		email.setSSLOnConnect(true);
		email.setFrom("smuralikrishna006@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :- from selenium)");
		email.addTo("smuralikrishna006@gmail.com");
		email.send();
		System.out.println("================Email sent==================");

	}

}
