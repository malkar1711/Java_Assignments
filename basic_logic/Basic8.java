package basic_logic;

public class Basic8 {
public static void main( String []args ){
		
		for(int i=1; i<=5; i++){
			for(int k=5; k<1+i; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*"+ " ");
			}
		System.out.println(" ");
		}
	}

}
