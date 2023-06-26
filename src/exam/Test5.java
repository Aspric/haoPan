package exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test5 {
//回文日期
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		sb=new StringBuffer(scan.nextLine());
		scan.close();
		String date1="0",date2="0";
		int year=Integer.parseInt(sb.substring(0,sb.length()-4).toString());
		int month=Integer.parseInt(sb.substring(sb.length()-4,sb.length()-2).toString());
		int dayt=Integer.parseInt(sb.substring(sb.length()-2).toString());
		LocalDate day=LocalDate.of(year ,month ,dayt );
		StringBuffer str=new StringBuffer(day.toString().replace("-", ""));
		while(!day.toString().equals("9999-12-31")) {
			String temp = str.toString();
			String temp2=str.reverse().toString();
			str.reverse();
			if (temp.equals(temp2)) {
				if (date1.equals("0")) date1=str.toString();
				
				Set<Character> dirlist = new HashSet<Character>();
				for (int i=0;i<8;i++) dirlist.add(str.charAt(i));
				
				int n=dirlist.size();
				if (n<=2) {
					date2=str.toString();
					break;
				}
				
			}

			day=day.plusDays(1);
			str=new StringBuffer(day.toString().replace("-", ""));
	}
		

		System.out.println(date1);
		System.out.println(date2);
		}
}


