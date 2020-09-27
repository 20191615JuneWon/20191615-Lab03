import java.util.*;
public class BasicIo {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		System.out.println("your name is " + name);
		System.out.println("day: " + years*365);
		System.out.print("how tall are you: ");
		int height = stdin.nextInt();
		System.out.print("what month,day,and year is now?(mm dd yyyy): ");
		int month = stdin.nextInt();
		int day = stdin.nextInt();
		int year = stdin.nextInt();
		System.out.printf("%d년%d월 %d일 현재 %s(%d)의 키는 %dcm 입니다",year,month,day,name,years,height );
		

	}

}
