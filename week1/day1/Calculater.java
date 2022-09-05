package week1.day1;

public class Calculater {
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void sub(float num1,int num2, int num3) {
	System.out.println(num1 - num2 - num3);
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculater cal=new Calculater();
cal.add(2 , 5);
cal.sub(0.8f,10,17);
	}

}
