package com.dheerendra.beans;

public class MyContainer {
	private RequestHandler reqHandler;

	public MyContainer() {
		System.out.println("handler  0-paramContainer");
	}

	public void setReqHandler(RequestHandler reqHandler) {
		this.reqHandler = reqHandler;
	}

	public void processRequestHandler(String data) {
		System.out.println("coming data is " + data);
		reqHandler.delgate(data);
	}
}
