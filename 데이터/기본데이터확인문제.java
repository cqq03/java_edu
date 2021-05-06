package 데이터;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physi = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		int sum = physi + math + eng + kor;
		//자바는 하나라도 double이면 무조건 항상 더블
		//double sum2 = sum;
		//자바는 int와 int계산은 결과가 항상 int
		//double avg = sum2 / 4;
		double avg = (double)sum / 4;
		               // 데이터 타입을 내가 원하는 타입으로 변경해주는 것을 캐스팅!
		        //ram에는 원래 타입이 그대로 있고, cpu가 가져다가 강제로 바꿈: 강제캐스팅!
		           //강제캐스팅 (변경하고자하는 타입명)변수 ex) (double)sum
		System.out.println("총점은: " + sum + "점, " +  "평균은: " + avg + "점" );
	} 

}
