package cn.nju.threadTest;

public class Boot {
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getId());
		new Thread(new Runnable(){
			@Override
			public void run() {
				Person p = new Person();
				p.sayHello();
			}
		}).start();
//		new Thread(new Runnable(){
//			@Override
//			public void run() {
//				Person p = new Person();
//				p.sayHello();
//			}
//		}).start();
	}
}
