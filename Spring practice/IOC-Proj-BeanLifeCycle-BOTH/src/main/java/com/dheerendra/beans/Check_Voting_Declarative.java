package com.dheerendra.beans;

public class Check_Voting_Declarative {
	private String name;
	private String addrs;
	private int age;

	public Check_Voting_Declarative() {

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

	public void check() {
		System.out.println("custom init() method");
		if (name == null || age <= 0)
			throw new IllegalArgumentException();

	}

	public String checkVotingCreteria() {
		if (age >= 18)
			return name + " u r  eligible to vote";
		else
			return name + "u r not eligiblble";
	}

	public void myDestroy() {
		System.out.println("custom Destroy ");
		name = null;
		age = 0;
		addrs = null;

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

}
