package com.dheerendra.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("db")
public class DBOpertaiton {

	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String usn;
	
	@Value("${jdbc.password}")
	private String pwd;

	@Override
	public String toString() {
		return "DBOpertaiton [driver=" + driver + ", url=" + url + ", usn=" + usn + ", pwd=" + pwd + "]";
	}
	
}
