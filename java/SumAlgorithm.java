import java.util.Scanner;

public class SumAlgorithm{
	public static void main(String[] args) {
		int result = 0;
		int number = 10;
		int input = 0;
		Scanner scn = new Scanner(System.in);

		System.out.print("숫자를 입력하세요.");
		input = scn.nextInt();
		System.out.println("입력된 숫자는 : " +input+ " 입니다.");
		System.out.println("");

		switch(input) {
			case 1:
			System.out.println("입력 값이 1일 경우");
			for(int i=1; i<=number; i++){
			result = result + i;
			//result += i;
			}
			System.out.println("1부터 " + number + "까지" + input + " 의 배수의 합은" + result + " 입니다.");
			break; 
			case 2:
			System.out.println("입력 값이 2일 경우");
			break;
			case 3:
			System.out.println("입력 값이 3일 경우");
			break;
			default:
			System.out.println("입력 값이 잘못됐을 경우");
			break;
		}
		
	}
}