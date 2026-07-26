package com.ash.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainthread {
	public static void main(String[] args) {
//		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
//		
//		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
//
//		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
//
//		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
//
//		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(()-> System.out.println(Thread.currentThread().getName()));
		
		executor.submit(()-> System.out.println(Thread.currentThread().getName()));

		executor.submit(()-> System.out.println(Thread.currentThread().getName()));

		executor.submit(()-> System.out.println(Thread.currentThread().getName()));

		executor.submit(()-> System.out.println(Thread.currentThread().getName()));
		
		executor.shutdown();

	}
}
