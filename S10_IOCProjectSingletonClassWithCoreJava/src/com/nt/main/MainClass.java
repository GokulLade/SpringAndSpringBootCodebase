package com.nt.main;

import java.lang.reflect.InvocationTargetException;

import com.nt.ston.SingletonClass;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonClass singletonClass1= SingletonClass.getInstance();
		SingletonClass singletonClass2= SingletonClass.getInstance();
		
		System.out.println(singletonClass1.hashCode()+" "+singletonClass2.hashCode());
		System.out.println("SingletonClass1== SingletoneClass2 : "+(singletonClass1==singletonClass2));
		
	}

}
