package com.frstQue;

public class Demo implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			String tName=Thread.currentThread().getName();
			System.out.println(tName+" "+i +" times");
		}
		
	}
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Demo tdemo = new Demo();
		
		
		Thread frst=new Thread(tdemo);
		Thread sec=new Thread(tdemo);
		
		frst.setName("Dhoni");
		sec.setName("kohli");
		
		frst.setPriority(8);
		sec.setPriority(10);
		
		frst.start();
		sec.start();
		
		
		
		


		
		
		
		
		

	}

	

}
