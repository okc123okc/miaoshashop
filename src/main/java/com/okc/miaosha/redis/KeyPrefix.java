package com.okc.miaosha.redis;

/**
 * @author okc
 */
public interface KeyPrefix {
	//过期时间
	int expireSeconds();
	//获取前缀
	String getPrefix();
	
}
