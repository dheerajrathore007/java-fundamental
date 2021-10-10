import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}