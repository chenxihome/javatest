package com.test.designpattern;

public enum SingletonClass {
	 INSTANCE;  
	  
    public void test()  
    {  
        System.out.println("The Test!");  
    }  
    public static void main(String[] args) {
        // Singleton sole=Singleton.getInstance();
    	SingletonClass sole = SingletonClass.INSTANCE;
        sole.test();
    }
}
