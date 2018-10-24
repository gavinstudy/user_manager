package com.gavin.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 当前时间产生器
 * @author Administrator
 *
 */
public class CurrentTime {
	public static String getCurrentTime() {
		String createtime = null;
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:DD:hh:mm:ss");
		createtime = sdf.format(new Date());
		return createtime;
	}
}
