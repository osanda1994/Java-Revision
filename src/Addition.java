import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1 : ");
        x = sc.nextInt();
        System.out.println("Number 2 : ");
        y = sc.nextInt();
        sum = x + y;
        System.out.println("Sum is: " + sum);
    }
}
