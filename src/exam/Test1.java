package exam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
//对数
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str="****     180.90       88折\r\n"
				+ "****      10.25       65折\r\n"
				+ "****      56.14        9折\r\n"
				+ "****     104.65        9折\r\n"
				+ "****     100.30       88折\r\n"
				+ "****     297.15        半价\r\n"
				+ "****      26.75       65折\r\n"
				+ "****     130.62        半价\r\n"
				+ "****     240.28       58折\r\n"
				+ "****     270.62        8折\r\n"
				+ "****     115.87       88折\r\n"
				+ "****     247.34       95折\r\n"
				+ "****      73.21        9折\r\n"
				+ "****     101.00        半价\r\n"
				+ "****      79.54        半价\r\n"
				+ "****     278.44        7折\r\n"
				+ "****     199.26        半价\r\n"
				+ "****      12.97        9折\r\n"
				+ "****     166.30       78折\r\n"
				+ "****     125.50       58折\r\n"
				+ "****      84.98        9折\r\n"
				+ "****     113.35       68折\r\n"
				+ "****     166.57        半价\r\n"
				+ "****      42.56        9折\r\n"
				+ "****      81.90       95折\r\n"
				+ "****     131.78        8折\r\n"
				+ "****     255.89       78折\r\n"
				+ "****     109.17        9折\r\n"
				+ "****     146.69       68折\r\n"
				+ "****     139.33       65折\r\n"
				+ "****     141.16       78折\r\n"
				+ "****     154.74        8折\r\n"
				+ "****      59.42        8折\r\n"
				+ "****      85.44       68折\r\n"
				+ "****     293.70       88折\r\n"
				+ "****     261.79       65折\r\n"
				+ "****      11.30       88折\r\n"
				+ "****     268.27       58折\r\n"
				+ "****     128.29       88折\r\n"
				+ "****     251.03        8折\r\n"
				+ "****     208.39       75折\r\n"
				+ "****     128.88       75折\r\n"
				+ "****      62.06        9折\r\n"
				+ "****     225.87       75折\r\n"
				+ "****      12.89       75折\r\n"
				+ "****      34.28       75折\r\n"
				+ "****      62.16       58折\r\n"
				+ "****     129.12        半价\r\n"
				+ "****     218.37        半价\r\n"
				+ "****     289.69        8折";
		 Scanner scan = new Scanner(str);
		 String cur;
		 float price = 0,off=0,total=0;
		 while(scan.hasNext()) {
			 cur=scan.nextLine();
			 Pattern pattern=Pattern.compile("\\d+\\.\\d+");
			 Matcher matcher=pattern.matcher(cur);
			 if (matcher.find())
				 price=Float.parseFloat(matcher.group());
			 pattern=Pattern.compile("[\\d|半]*(?=折|价)");
			 matcher=pattern.matcher(cur);
			 if (matcher.find())
				 off=matcher.group().equals("半")?5f: Float.parseFloat(matcher.group());
			 	if (off<10) {
			 		off/=10;}
			 	else {
			 		off/=100;}
			 float cacl=price*off;
			 total+=cacl;
			 System.out.println(price+"*"+off+"="+cacl);
			 
		 }
		 int piece=(int) Math.ceil(total/100)*100;
		 System.out.println(piece);
	
		 
		 
		 scan.close();
	}
}
