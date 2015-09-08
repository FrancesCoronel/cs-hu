/*
 * Timing program for priority queues.
 */

import java.util.HashMap;
import java.util.Map;

public class PriorityQueueTiming {

    public static final int NUM_TIMINGS = 5;

    public static void main(String[] args) 
    {
    	// choose specified values of N for # of array elements
		int[] nList = {1000, 10000, 100000, 1000000, 10000000};
		
		double[] testData0 = new double[nList[0]];
		double[] testData1 = new double[nList[1]];
		double[] testData2 = new double[nList[2]];
		double[] testData3 = new double[nList[3]];
		double[] testData4 = new double[nList[4]];
		
		for (int i = 0; i < testData0.length; i++)
			testData0[i] = 100* Math.random();
		for (int i = 0; i < testData1.length; i++)
			testData1[i] = 100* Math.random();
		for (int i = 0; i < testData2.length; i++)
			testData2[i] = 100* Math.random();
		for (int i = 0; i < testData3.length; i++)
			testData3[i] = 100* Math.random();
		for (int i = 0; i < testData4.length; i++)
			testData4[i] = 100* Math.random();
		
		PriorityQueue binaryHeapPQ = new BinaryHeap();
		PriorityQueue threeHeapPQ = new ThreeHeap();
		PriorityQueue MyPQPQ = new MyPQ();
		
		PriorityQueue[] queueArray = {binaryHeapPQ, threeHeapPQ, MyPQPQ};
		String[] queueNames = {"BinaryHeap", "ThreeHeap", "MyPQ"};
		Map<String, PriorityQueue> queueMap = new HashMap<>();
		double[][] testData = {testData0, testData1, testData2, testData3, testData4};
		
		for (int i = 0; i < queueNames.length; i++)
			queueMap.put(queueNames[i], queueArray[i]);
		
    	for (String name : queueNames) 
    	{
    		for (int i = 0; i < testData.length; i++)
    		{
    			System.out.println("Starting time run for priority queue " + name + " for n = " + testData[i].length);
    			timeRun(queueMap.get(name), testData[i]);
    		}
    	}
    	System.out.println("test runs finished!");
   }
    
   public static void timeRun(PriorityQueue pQueue, double[] testData) 
   {
    	for(int timing = 0; timing < NUM_TIMINGS; ++timing) {
    		System.out.println("	Starting timing for insert:");
            long startTime = System.nanoTime();
    		for (int i = 0; i < testData.length; i++) 
    			pQueue.insert(testData[i]);
         long endTime = System.nanoTime();
         long elapsedTime = endTime - startTime;
         System.out.println("	    " + elapsedTime + " nanoseconds or " + elapsedTime/(1000000000.0) + " seconds elapsed");
    		System.out.println("	Starting timing for deleteMin:");
            startTime = System.nanoTime();
    		while (!pQueue.isEmpty()) 
    			pQueue.deleteMin();
         endTime = System.nanoTime();
         elapsedTime = endTime - startTime;
         System.out.println("	    " + elapsedTime + " nanoseconds or " + elapsedTime/(1000000000.0) + " seconds elapsed");
    	}
   }
}