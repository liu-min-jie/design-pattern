package com.lmj.study.pattern.factory.factorymethod;


import com.lmj.study.pattern.factory.ICourse;
import com.lmj.study.pattern.factory.JavaCourse;


/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
  public ICourse create() {
    return new JavaCourse();
  }
}
