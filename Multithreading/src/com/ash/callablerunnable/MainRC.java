package com.ash.callablerunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainRC {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// A runnable executes a task and can't return a value
		// cannot throw a checked exception
		Runnable runnable = ()-> {
			System.out.println("Running");
		};
		
		runnable.run();
		
		// A callable can return a value
		// can throw a checked exceptions
		// Executed using ExecutorService and we can get the result using Future.get()
		Callable<Integer> callable=() ->
		{
			return 10;
		};
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> future = executorService.submit(callable);
		
		System.out.println(future.get());
		
		executorService.shutdown();
		
	}
}
