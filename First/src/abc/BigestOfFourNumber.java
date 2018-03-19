package abc;

public class BigestOfFourNumber {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 5;
		int d =6;
		
		if(a>b && a>c && a>d ){
			System.out.println("a alue is big"+a);
		}
		else 
			if(b>c && b>a && b>d){
		System.out.println("b alue is big"+b);
			}
		else if(c>a && a>b && d>b){
			System.out.println("c alue is big"+c);
			
		}
		else if(d>a && d>b && d>c){
			System.out.println("d alue is big"+d);

		}
			
	}

}
