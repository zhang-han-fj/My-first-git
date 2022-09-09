package ou.zh.day02.demo01;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soce = sc.nextInt();
		Teachar t = new Teachar();
		
		try {
			t.checkSoce(soce);
		} catch (SoceException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
