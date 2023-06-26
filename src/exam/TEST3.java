package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TEST3 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src\\exam\\student.txt");
		Scanner sc;
		int sum = 0;
		try{
			int score = 0;
			sc = new Scanner(file);
//			sc.useDelimiter("[^0123456789]+");
			sc.useDelimiter("(\\D)+");
			System.out.println(sc.hasNext());
			while(sc.hasNext()){
				score = sc.nextInt();
				sum = sum+score;
			}
			System.out.println("总成绩为："+sum);
		}
		catch(Exception exp){
			System.out.println(exp); 
	    }
	}
	

}
