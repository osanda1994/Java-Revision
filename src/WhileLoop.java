import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(i <= 5){
            System.out.println("Add marks : ");
            int marks = sc.nextInt();
            i++;
        }

    }
}
