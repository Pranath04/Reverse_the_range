package reverse_the_range;

import java.util.Scanner;

public class Reverserange{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrsize = scanner.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[arrsize];
		for(int i=0;i<arrsize;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter range1");
		int range1 = scanner.nextInt();
		System.out.println("Enter range2");
		int range2 = scanner.nextInt();
		scanner.close();
		int ans[]=reverseing(range1,range2,arr);
		for(int i=0;i<ans.length;i++){
	        System.out.println(ans[i]);
	    }
	}
	static int[] reverseing(int range1,int range2,int arr[]) {
		while(range2>range1) {
			int temp=arr[range1];
            arr[range1]=arr[range2];
            arr[range2]=temp;
			range1++;
			range2--;
 		}
		return arr;
	}
}