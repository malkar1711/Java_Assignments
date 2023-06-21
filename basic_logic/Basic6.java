package basic_logic;

public class Basic6 {
	public static void main(String []args){
		int p=1, q=1, fact = p+q;
		
		for(int i=0; i<10; i++){
			System.out.println(fact + " ");
			p = q;
			q = fact;
			fact = p+q;
		}
	}

}
