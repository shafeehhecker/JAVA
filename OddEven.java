import java.util.Scanner;

public class Main {
    public static void EvenOdd(int n){

        if (n%2==0)
            System.out.println("The given number is even");
        else
            System.out.println("The given number is odd");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the mumber :");
        int n =sc.nextInt();
        EvenOdd(n);
        }
    }
