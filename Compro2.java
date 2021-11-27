import java.util.Scanner;

class Main {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
	System.out.print("Enter an integer: ");
		num = scan.nextInt();
		
		showNumberPlus10(num);
		showNumberPlus100(num);
		showNumberPlus1000(num);
	}
		
	static void showNumberPlus10(int num) {
		System.out.println(num + " plus 10 is " + (num + 10) + ".");
	}
	static void showNumberPlus100(int num) {
		System.out.println(num + " plus 100 is " + (num + 100) + ".");
	}
	static void showNumberPlus1000(int num) {
		System.out.println(num + " plus 1000 is " + (num + 1000) + ".");
	}
  }
