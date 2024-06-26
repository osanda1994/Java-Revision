import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter the Marks : ");
            int marks = sc.nextInt();
            total = total + marks;

        }
        System.out.println("Total : " + total);

        if(total >= 250){
            System.out.println("Good");
        } else{
            System.out.println("Bad");
        }
    }
}
