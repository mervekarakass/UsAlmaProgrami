package usAlmaProgrami;

import java.util.Scanner;

public class UsAlmaProgrami {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Taban degerini giriniz: ");
		int taban = scanner.nextInt();
		
		System.out.print("Us degerini giriniz: ");
		int us = scanner.nextInt();
		
		if (us < 0) {
			System.out.println("Negatif us degeri giremezsiniz.");
			
		} else {
			int sonuc = usAl(taban, us);
			System.out.println("Sonuc: " + sonuc);
		}
		}
	
	public static int usAl(int taban, int us) {
		if (us == 0) {
			return 1;
			
			
		} else {
			return taban * usAl(taban, us - 1);
		}
	}

}
