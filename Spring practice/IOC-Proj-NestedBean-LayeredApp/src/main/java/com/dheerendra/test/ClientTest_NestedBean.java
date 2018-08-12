package com.dheerendra.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dheerendra.controller.EmpSearch_Controller;
import com.dheerendra.vo.EmployeeVo;

public class ClientTest_NestedBean {
	public static void main(String[] args) {
		DefaultListableBeanFactory parFactory=null,chiFactory=null;
		XmlBeanDefinitionReader parReader=null,chiReader=null;
		EmpSearch_Controller controller=null;
		
		List<EmployeeVo> listVO=null;
		
		parFactory=new DefaultListableBeanFactory();
		parReader=new XmlBeanDefinitionReader(parFactory);
		parReader.loadBeanDefinitions("com/dheerendra/cfgs/bussiness-bean.xml");
		
		chiFactory=new DefaultListableBeanFactory(parFactory);
		chiReader=new XmlBeanDefinitionReader(chiFactory);
		chiReader.loadBeanDefinitions("com/dheerendra/cfgs/presentation-bean.xml");
		
		controller=chiFactory.getBean("empCon",EmpSearch_Controller.class);
		
		try {
			listVO=controller.getEmpByDegs(new String[] {"CLERK","MANAGER"});
			listVO.forEach(vo->{
				System.out.println(vo.getEno()+"  "+vo.getEname()+"  "+vo.getJob()+"  "+vo.getDeptno()+"  "+vo.getSalary());
			});
		}catch (Exception e) {
			System.out.println("Internal Problem Try Again");
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
