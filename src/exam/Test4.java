package exam;

import java.util.Arrays;
import java.util.Scanner;
//单词统计
public class Test4 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String str=scan.next(); 
	     int num[]=new int[26];
	     Arrays.fill(num, 0);
	     char chs[]=str.toCharArray();
	     
		 for (char c:chs) {
			 int ind=c;
			 num[ind-'a']+=1;
		 }
		 int maxInd=0;
		 int max=0;
		 for (int i=25;i>=0;i--) {
			 if (num[i]>=max) {
				 maxInd=i;
				 max=num[i];
			 }
		 }
		 char resultChar=(char)(maxInd+(char)'a');
		 
		 System.out.println(resultChar);
		 System.out.println(max);
	     scan.close();
	}

}
