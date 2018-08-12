package com.dheerendra.beans;

public class Programatic_approach {
	private String name;
	private String addrs;
	private int age;

	public Programatic_approach() {

		System.out.println("0-param constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public String getAddrs() {
		return addrs;
	}

	public int getAge() {
		return age;
	}

	
	public void afterPropertiesSet() {
		if(age<=0 || name==null)
			throw new IllegalArgumentException("name must se set");
		
		
		public void destroy() {
			age0;
			name=null;
			address=null;
		}
	}
}
