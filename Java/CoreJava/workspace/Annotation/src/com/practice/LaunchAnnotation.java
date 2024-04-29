package com.practice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String country() default "India";
	int age() default 32;
}
@CricketPlayer
//@CricketPlayer(country="Pakistan",age=25)
class Player1
{
	
}
public class LaunchAnnotation {

	public static void main(String[] args) 
	{
		Player1 p=new Player1();
		Class cls=p.getClass();
		//System.out.println(cls);
		Annotation an=cls.getAnnotation(CricketPlayer.class);
		//System.out.println(an);
		CricketPlayer cp= (CricketPlayer)an;
		System.out.println(cp.age());
		System.out.println(cp.country());

	}

}
