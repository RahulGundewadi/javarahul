package whileloop;

public class demo32 {
	public static void main(String[] args) {
		int a = 1;
		while(a<=10) {
			if(a == 5){
				a++;
				break;
			}
			System.out.println(a);
			a++;
		}
	}

}
