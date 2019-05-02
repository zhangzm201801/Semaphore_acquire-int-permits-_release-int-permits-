package test;

import service.Service;

import java.util.concurrent.Semaphore;

import extthread.ThreadA;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		
		Semaphore semaphore = new Semaphore(5);
		semaphore.acquire();
		semaphore.acquire();
		semaphore.acquire();
		semaphore.acquire();
		semaphore.acquire();
		System.out.println(semaphore.availablePermits());
		
		semaphore.release();
		semaphore.release();
		semaphore.release();
		semaphore.release();
		semaphore.release();
		semaphore.release();
		System.out.println(semaphore.availablePermits());
		
		semaphore.release(4);
		System.out.println(semaphore.availablePermits());
//		Service service = new Service();
//
//		ThreadA[] a = new ThreadA[10];
//		for (int i = 0; i < 10; i++) {
//			a[i] = new ThreadA(service);
//			a[i].start();
//		}
//
	}

}
