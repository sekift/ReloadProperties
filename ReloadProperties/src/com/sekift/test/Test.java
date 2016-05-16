package com.sekift.test;

import java.util.LinkedList;

import com.sekift.util.ConfigUtil;

/**
 * Test
 * @author:sekift
 * @time:2014-8-15 下午03:59:26
 * @version:
 */
public class Test {

	/**
	 * Change your xml file when running and watch it at out.print.
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println((LinkedList<String>) ConfigUtil.getConfigValue("test"));
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
