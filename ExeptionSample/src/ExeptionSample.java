import java.util.Scanner;

public class ExeptionSample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=20;
		int x=1;
//		try {
//			x=Integer.parseInt(s.nextLine());
//		} catch(NumberFormatException e) {
//			System.out.println("�Էµ� ���ڰ� ���������� �ʽ��ϴ�.");
//		}
//		try {
//			System.out.println(n/x);
//		} catch(Exception e) {
//			System.out.println("���α׷��� ������ ���� �մϴ�.");
//		}
//		
//		String str = s.nextLine();
//		if(str==null || str.equals("")) {
//			System.out.println("�Էµ� ���� ���ڰ� �ƴմϴ�.");
//			return;
//		}
//		x = Integer.parseInt(str);
//		if(x==0) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			return;
//		}
//		System.out.println(n/x);
		
		String str = s.nextLine();
		try {
			x=Integer.parseInt(str);
			System.out.println(n/x);
		} catch(Exception e) {
			System.out.println("���� ó�� �� ����");
			e.printStackTrace(); //��� ������ ������ �˷���
		}
	}
}
