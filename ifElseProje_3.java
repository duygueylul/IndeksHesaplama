package Temel_Kavramlar;


import java.util.Scanner;
public class ifElseProje_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double kilo, boy, indeks;
		System.out.println("Boyunuzu giriniz: ");
		boy = scan.nextDouble();
		System.out.println("Kilonuzu giriniz: ");
		kilo = scan.nextDouble();
		indeks = (kilo / (boy * boy));
		
		if(indeks < 18.5 && indeks <= 24.9 ) {
			System.out.println("İndeksiniz: " + indeks + "\n" + "Zayıf");
			
		}
		else if(indeks >= 25 && indeks <= 29.9) {
			System.out.println("İndeksiniz: " + indeks + "\n" + "Kilolu");
		}
		else if(indeks >= 30 && indeks <= 34.9) {
			System.out.println("İndeksiniz: " + indeks + "\n" + "Obez");
		}
		else {
			System.out.println("İndeksiniz: " + indeks + "\n" + "Aşırı Obez");
		}
	}

}
