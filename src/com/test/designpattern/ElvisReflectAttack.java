package com.test.designpattern;

import java.lang.reflect.InvocationTargetException;

public class ElvisReflectAttack {
public static void main(String []ags) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//    Class<?> classType = SingletonTest.class;  
//    
//    Constructor<?> c = classType.getDeclaredConstructor(null);  
//    c.setAccessible(true);  
//    SingletonTest e1 = (SingletonTest)c.newInstance();  
//    SingletonTest e2 = SingletonTest.getInstance();  
//    SingletonTest e3 = SingletonTest.getInstance();  
//    SingletonTest e4= (SingletonTest)c.newInstance(); 
//    System.out.println(e1==e2);  
//    System.out.println(e2==e3);  
//    System.out.println(e1==e4); 
	System.out.println(SingletonClass.INSTANCE);
//	   Class<SingletonClass> classType = SingletonClass.class;  
//       Constructor<SingletonClass> c = (Constructor<SingletonClass>) classType.getDeclaredConstructor();  
//       c.setAccessible(true);  
//       c.newInstance();  
}  
}

