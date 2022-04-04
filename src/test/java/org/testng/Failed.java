package org.testng;

public class Failed implements IRetryAnalyzer {

	int min = 0, max = 3;

	public boolean retry(ITestResult arg0) {

		if (min < max) {
			min++;
			return true;
		}
		return false;
	}

}
