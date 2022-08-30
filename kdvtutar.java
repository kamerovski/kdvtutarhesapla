package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class kdvtutar {

	public static void main(String[] args) {
		
		double ucret, kdvOran=0.18, kdvOran1=0.8, kdvTutar,kdvliTutar;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ucretinizi girin: ");
		ucret = scan.nextDouble();
		
		if (ucret<1000) {
			kdvTutar = ucret * kdvOran;
			System.out.println("kdv tutari: " + kdvTutar);
			kdvliTutar = ucret + kdvTutar; 
			
			System.out.println("kdv'li tutar: " + kdvliTutar);
		}else if (ucret>1000) {
			kdvTutar = ucret * kdvOran1;
			System.out.println("kdv tutari: " + kdvTutar);
			
			kdvliTutar = ucret + kdvTutar;
			System.out.println("kdv'li tutar: " + kdvliTutar);
		}
	
		

	}

}
