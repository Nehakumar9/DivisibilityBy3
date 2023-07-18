package divisibilityby3;

import java.util.Scanner;

public class DivisibilityBy3 {
	
	public static int divisibilityby3(int array[],int size) {
		int sum = 0;
		for(int i=0;i<size;i++) {
			sum+=array[i];
		}
		if(sum%3==0) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int results = divisibilityby3(array,n);
		System.out.println(results);
	}

}
