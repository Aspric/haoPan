package exam;

import java.util.Arrays;
import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		int[] arr=new int[a];
		for (int i=0;i<a;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);
		for (int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}