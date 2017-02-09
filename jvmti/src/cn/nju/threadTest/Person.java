package cn.nju.threadTest;

public class Person {
	public void sayHello(){
		System.out.println(Thread.currentThread().getId()+" helloWorld");
	}
}
