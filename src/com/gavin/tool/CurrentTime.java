package com.gavin.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ǰʱ�������
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
