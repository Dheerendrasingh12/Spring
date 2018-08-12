package com.dheerendra.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.dheerendra.beans.WishGenerator;

public class ClientTest {

	public static void main(String[] args) {
		System.out.println("Client Test App");
		XmlBeanFactory factory = new XmlBeanFactory(
				new FileSystemResource("src/com/dheerendra/cfgs/applicationContext.xml"));

		WishGenerator bean = factory.getBean("wsg", WishGenerator.class);

		String result = bean.wishGeneratorMsg();
		System.out.println(result);
	}

}
