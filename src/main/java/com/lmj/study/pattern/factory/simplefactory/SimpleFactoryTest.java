package com.lmj.study.pattern.factory.simplefactory;

import com.lmj.study.pattern.factory.ICourse;
import com.lmj.study.pattern.factory.JavaCourse;

/**
 * 小作坊式的工厂模型
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {

		// ICourse course = new JavaCourse();
		// course.record();

		// ICourseFactory factory = new ICourseFactory();
		// ICourse course =
		// factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
		// course.record();

		CourseFactory factory = new CourseFactory();
		ICourse course = factory.create(JavaCourse.class);
		course.record();

	}
}
