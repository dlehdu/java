import java.util.Scanner;

public class Ex04_if_else문2 {

	public static void main(String[] args) {

		// 일의자리에서 반올림한 값 출력하기
		// 반올림 : 0~4까지는 버림, 5~9 올림

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");

		int num = sc.nextInt();

		System.out.print("반올림한 수: ");

		if (num % 10 >= 5) {
			// System.out.print(num / 10 * 10 + 10);
			System.out.print(num - num % 10 + 10);

		} else {
			// System.out.println(num / 10 * 10);
			System.out.println(num - num % 10);
		}

	}
}