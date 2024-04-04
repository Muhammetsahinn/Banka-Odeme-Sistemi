package inter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Tutar giriniz : ");
		double price = input.nextDouble();
		System.out.print(" Kart no Giriniz :");
		String cardNumber = input.next();
		System.out.print(" Son kullanma tarihini giriniz : ");
		String date = input.next();
		System.out.print(" cvc kodunu giriniz : ");
		String cvc = input.next();

		System.out.println(" A bankasi icin 1 ");
		System.out.println(" B bankasi icin 2 ");
		System.out.println(" C bankasi icin 3 ");

		int selectBank = input.nextInt();

		switch (selectBank){
			case 1:
				Abankasi aPos = new Abankasi("A bankasi","215112165","564321649");
				aPos.connect("127.1.1.1");
				aPos.payment(price,cardNumber,date,cvc);
				break;
			case 2:
				BBankasi bPos = new BBankasi("B bankasi", "213212","213121321");
				bPos.connect("127.1.1.1");
				bPos.payment(price,cardNumber,date,cvc);
				break;
			case 3:
				CBankasi cPos = new CBankasi("C bankasi","262513513","51513135");
				cPos.connect("127.1.1.1");
				cPos.payment(price,cardNumber,date,cvc);
				break;
				default:
				System.out.println("Gecerli banka giriniz!!");
		}
	}
}
