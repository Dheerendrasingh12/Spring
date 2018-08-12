package com.dheerendra.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
private int cno;
private String cname;
private float cprin;
private float crate;
private float ctime;
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public float getCprin() {
	return cprin;
}
public void setCprin(float cprin) {
	this.cprin = cprin;
}
public float getCrate() {
	return crate;
}
public void setCrate(float crate) {
	this.crate = crate;
}
public float getCtime() {
	return ctime;
}
public void setCtime(float ctime) {
	this.ctime = ctime;
}

}
