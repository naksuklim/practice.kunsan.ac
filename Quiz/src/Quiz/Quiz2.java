package Quiz;

public class Quiz2 {

	public static void main(String[] args) {
		int input = 3999999;
		int A = 0;
		int B = 1;
		int result = 0;
		int cnt = 0;
		
		while(result < input) {
			result = A + B;
			A = B;
			B = result;
			
			if (result % 2 ==0) {
				cnt += result;
			}
		}
		System.out.println(cnt);
				
	}

}
