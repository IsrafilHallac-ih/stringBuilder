package stringBuilder;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//String userInput=scanner.nextLine();
		//System.out.println(userInput.toLowerCase());
		
		StringBuffer buffer=new StringBuffer();
		System.out.print("Ad�n�z :");
		buffer.append("Ad: ");
		buffer.append(scanner.nextLine());
		System.out.print("Soyad�n�z :");
		buffer.append(" ,Soyad :");
		buffer.append(scanner.nextLine());
		
		
		System.out.println(buffer.toString());
		

	}

}
