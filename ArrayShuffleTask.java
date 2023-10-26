package com.CloudVandanaTask;

public class ArrayShuffleTask {
	public static void shufflearray(int arr[])
	{
		int arSize = arr.length;
		
		for(int i=arSize-1;i>0;i--)
		{
			int j = (int) (Math.random() * i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		shufflearray(arr);
		
		for(int num:arr) {
			System.out.print(num+ " ");
		}
	}

}
