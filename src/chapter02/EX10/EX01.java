package chapter02.EX10;

public class EX01 {

	public static void main(String[] args) {

	   //각 변수의 평균값을 계산 하세요.
		
		
	   int aa = 80;
	   int bb = 90;
	   int cc = 100;
	   double dd = 75.5;
	   double ee = 60.3;
	   
	   
	   double data3 = aa + bb + cc + dd + ee; 
	  
	   
	   System.out.println("각 과목의 평균값은: " + data3/5 );
	   
	   System.out.printf("각 과목의 평균값은: %4.2f", data3/5);
	   
	  
	   
	   //선생님이 하신 것!
	   
	   double avg = (aa + bb + cc + dd + ee) / 5.0 ;
	   
       System.out.println("각 과목의 평균값은: " + avg) ;
	   System.out.printf("각 과목의 평균값은: %4.2f", avg);
	   
	   
	}

}
