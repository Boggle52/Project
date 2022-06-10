import java.util.Scanner;

public class ExeptionSample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=20;
		int x=1;
//		try {
//			x=Integer.parseInt(s.nextLine());
//		} catch(NumberFormatException e) {
//			System.out.println("입력된 숫자가 정상적이지 않습니다.");
//		}
//		try {
//			System.out.println(n/x);
//		} catch(Exception e) {
//			System.out.println("프로그램이 비정상 종료 합니다.");
//		}
//		
//		String str = s.nextLine();
//		if(str==null || str.equals("")) {
//			System.out.println("입력된 값이 숫자가 아닙니다.");
//			return;
//		}
//		x = Integer.parseInt(str);
//		if(x==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			return;
//		}
//		System.out.println(n/x);
		
		String str = s.nextLine();
		try {
			x=Integer.parseInt(str);
			System.out.println(n/x);
		} catch(Exception e) {
			System.out.println("예외 처리 후 종료");
			e.printStackTrace(); //어디서 에러가 났는지 알려줌
		}
	}
}
