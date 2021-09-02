package ExemploLaço;

public class facaEquanto {
	public static void main(String[] args) {
		int n = 233;
		System.out.println(n);
		do{
			if(n>=300 && n<=400){
				n+=3;
				System.out.println(n);	
			}
			else {
				n+=5;
				System.out.println(n);
			}		
		}while(n<=456);
	}
	
}
