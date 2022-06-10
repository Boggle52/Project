
public class ExceptionSample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
//		try {
//			data1 = args[0];
//			data2 = args[1];
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
//			System.out.println("[실행 방법]");
//			System.out.println("java ExceptionSample num1 num2");
//			return;
//		}
//		try {
//			int value1 = Integer.parseInt(data1);
//			int value2 = Integer.parseInt(data2);
//			int result = value1 + value2;
//			System.out.println(data1+"+"+data2+"="+result);
//		} catch(NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없습니다.");
//		} finally {
//			System.out.println("다시 실행하세요.");
//		}
		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 / value2;
			System.out.println(data1+"/"+data2+"="+result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java ExceptionSample num1 num2");
			return;
			
//		} catch(NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없습니다.");
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
		} catch(NumberFormatException | ArithmeticException e) {
			System.out.println("0 이상의 숫자로만 입력하십시오.");
			
		} catch(Exception e) { // 모든 종류의 예외
			System.out.println("알 수 없는 예외 상황 처리");
			e.printStackTrace();
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
