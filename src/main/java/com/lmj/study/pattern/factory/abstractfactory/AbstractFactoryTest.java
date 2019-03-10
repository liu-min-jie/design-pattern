package com.lmj.study.pattern.factory.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		JavaCourseFactory factory = new JavaCourseFactory();

		factory.createNote().edit();
		factory.createVideo().record();

	}

}
