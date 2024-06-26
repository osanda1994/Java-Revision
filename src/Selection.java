import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int mark = sc.nextInt();
        if(mark <= 100 && mark >= 75){
            System.out.println("A");
        } else if(mark < 75 && mark >=65){
            System.out.println("B");
        } else if(mark < 65 && mark >= 55){
            System.out.println("C");
        } else if(mark < 55 && mark >= 0){
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
