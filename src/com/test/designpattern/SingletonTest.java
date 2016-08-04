package com.test.designpattern;

public class SingletonTest {
    /**
     * 
     * 〈一句话功能简述〉<br> 
     *  静态内部类实现单例模式
     *
     * @author tukun
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     */
	private static class Hoder{
	  private static SingletonTest singleton=new SingletonTest();
	}
	//私有构造方法 
	private SingletonTest(){
	}
	public static SingletonTest getInstance(){
		return Hoder.singleton;
	}
	
}
