package com.lmj.study.pattern.factory.factorymethod;


import com.lmj.study.pattern.factory.ICourse;
import com.lmj.study.pattern.factory.PythonCourse;


/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

  public ICourse create() {
    return new PythonCourse();
  }
}
