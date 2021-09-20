package com.okc.miaosha.util;

import java.util.UUID;

/**
 * 生成uuid
 * @author okc
 */
public class UUIDUtil {
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
