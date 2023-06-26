package exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
public class test7 {

	public static void main(String[] args) {
		// 暴力求解，方法超时
//		Scanner scan=new Scanner(System.in);
//		int N=scan.nextInt();
//		scan.close();
//		int index=1;
//		int result=-1;
//		do{
//			int n,m;//n行满，多m个
//			n=(int)Math.ceil((Math.sqrt(1+8*index)-1)/2);
//			m=index-((n-1)*n)/2;
//			n=n-1;
//			m=m-1;
//			BigInteger x=new BigInteger("1");
//			BigInteger s=new BigInteger("1");
//			int temp=0;
//			for(int i=n;temp<m;temp++) {
//				s=s.multiply(BigInteger.valueOf(i));
//				i--;
//			}
//			for(int i=m;i>1;i--) x=x.multiply(BigInteger.valueOf(i));;
//			result=s.divide(x).intValue();
//			if (N==result) break;
//			index++;
//		}while(true);
//		System.out.println(index);
// 		方法二
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long[] arr =new long[44725];
        arr[0]=1;
        long k=1L;
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 1;i<44725; i++) {
            for (int j = i; j>=i-16&&j>=1; j--) {
                arr[j] += arr[j - 1];
                if (arr[j] == n) {
                    System.out.println(k + i-j + 1);
                    return;
                }
            }
            k+=(i+1);
        }
        System.out.println(((1 + n) * n / 2) + 2);
	}

}
