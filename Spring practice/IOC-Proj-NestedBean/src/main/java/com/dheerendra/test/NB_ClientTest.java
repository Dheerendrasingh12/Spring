package com.dheerendra.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.beans.BankLoanApproval;

public class NB_ClientTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory pfactory=null,cfactory=null;
		XmlBeanDefinitionReader preader=null,creader=null;
		BankLoanApproval bk=null;
		
		pfactory=new DefaultListableBeanFactory();
		preader=new XmlBeanDefinitionReader(pfactory);
		
		preader.loadBeanDefinitions("com/dheerendra/cfgs/loan-bean.xml");
		
		cfactory=new DefaultListableBeanFactory(pfactory);
		creader=new XmlBeanDefinitionReader(cfactory);
		creader.loadBeanDefinitions("com/dheerendra/cfgs/bank-bean.xml");
		
		bk=cfactory.getBean("bla",BankLoanApproval.class);
		System.out.println(bk.appovedLoan());
		
		
	}
}
