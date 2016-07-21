package com.bf.lucence;

import org.junit.Test;


/**
 * 测试用例
 * @author DF
 *
 */
public class TestLucence {

	/**
	 * 创建索引
	 */
	@Test
	public void t1(){
		User u = new User("1", "黄登峰", "1", 18, "我是介绍", 19.98, "湖北省随州市");
		u.setId("1");
		u.setName("黄登峰");
		u.setAge(18);
		LucenceUtil.addIndex();
	}
}
