package www.dior.practice;


public class Practice1 {

	public static void main(String[] args) {
		countBackwards(2);
		
	}
	public static void countBackwards(int number) {
		if(number == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
			number--;
			countBackwards(number);
		}
		
	}

}

