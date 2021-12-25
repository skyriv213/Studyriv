package ch20_Thread;

class MyThread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i ;
		for(i=1;i<=200;i++) {
			System.out.print(i +"\t");
		}
	}
	
	
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i ;
		for(i=1;i<=200;i++) {
			System.out.print(i +"\t");
		}
	}

	
	}

	
	
	



public class TreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread() + "start");
		// 현재 실행이 되고있는 스레드가 어떤 스레드인지 알아보는 메소드
//		MyThread2 t1 =  new MyThread2();
//		MyThread2 t2 =  new MyThread2();
		
		MyThread2 runnable = new MyThread2();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");	
		
		Runnable run = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
			}
			
		};
		run.run();
	}

}
