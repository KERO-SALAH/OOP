import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class ja {
  

	public static void main(String[] args) {
		int sum=0;
		int [] arr= {1,2,3,6,-1};

		/*	for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}*/
		int min;
		for (int i = 0; i < arr.length; i++) {
			min =i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]>arr[min])
					min=j;
				
			}
			
			
			
			int t=arr[min];
			arr[min]=arr[i];
			arr[i]=t;


		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}





}
