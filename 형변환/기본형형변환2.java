package 형변환;

public class 기본형형변환2 {
	
	public static void main(String[] args) {
		int sum = 333;
		int count = 5;
		//평균을 내는 경우, 하나라도 double이면 결과가 double
		//결과가 double임
		double x = (double)sum/count; 
		double y = (double)(sum/count); //정수끼리의 계산은 무조건 int
		//정수끼리의 계산을 먼저해서 double로 형변환을 해!
		//6.0 <---(double)6
		System.out.println("x:" + x + ", y: " + y);
	}

}
