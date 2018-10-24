package com.gavin.tool;

import java.util.UUID;

/**
 * Ëæ»úid²úÉúÆ÷
 * @author Administrator
 *
 */
public class UUIDString {
	public static String getUUID() {
		String[] str = UUID.randomUUID().toString().split("-");
		StringBuffer sb = new StringBuffer();
		for (String string : str) {
			sb.append(string);
		}
		return sb.toString();
	}
}
