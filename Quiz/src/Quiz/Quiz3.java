package Quiz;

public class Quiz3 {

	public static void main(String[] args) {
    Long x = 600851475143L;
    int cnt = 2;{
    while(x != 1){
         
        if( x % cnt == 0){
            x = x / cnt;
            continue;
        }
        cnt++;
    }
    System.out.println("MAX : " + cnt);

  }
 }
}