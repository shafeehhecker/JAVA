import java.util.Scanner;

public class Main {
    public static int CalcSum(int a,int b){
        int sum = a + b;
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int sum = CalcSum(a,b);
        System.out.println(sum);

        }
    }
