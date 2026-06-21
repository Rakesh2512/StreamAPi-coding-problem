import java.util.stream.IntStream;

public class CheckPrimeNumber {

    public static boolean check(int n){

        if(n <= 1){
            return false;
        }
        return IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=10;i++){
            if(check(i)){
                System.out.println("Given number "+i+" is prime number");
            }
            else{
                System.out.println("Given number "+i+" is not prime number");
            }
        }
        
    }
}
