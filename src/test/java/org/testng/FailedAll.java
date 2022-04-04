package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {

		IRetryAnalyzer ra = a.getRetryAnalyzer();

		if (ra == null) {

			a.setRetryAnalyzer(Failed.class);

		}

	}

}
