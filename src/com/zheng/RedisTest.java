package com.zheng;
import com.zheng.RedisUtil;

public class RedisTest {

	public static void main(String[] args) {
		RedisUtil.getJedis().set("name", "Zheng");
		System.out.println(RedisUtil.getJedis().get("name"));
	}
}
