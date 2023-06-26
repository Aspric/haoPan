package exam;

public class Test2 {
//门牌统计2
	public static void main(String[] args) {
		// TODO Auto-generated method stub   1234
		int sum=0;
		for (int i=1;i<=2022;i++) {
			int a,b,c,d;
			a=i/1000;
			b=i/100%10;
			c=i/10%10;
			d=i%10;
			if (a==2) sum++;
			if (b==2) sum++;
			if (c==2) sum++;
			if (d==2) sum++;
		}
		System.out.println(sum);
	}

}
