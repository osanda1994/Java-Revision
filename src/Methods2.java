import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total days : ");
        int full = sc.nextInt();
        System.out.println("Enter the days that student have come : ");
        int come = sc.nextInt();
        attend(full, come);
    }

    public static void attend(int x, int y){
        int percent = (int)((y * 100.0f) / x);
        System.out.println("Percentage : " + percent + "%");
        if(percent >= 75){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }

    }
}
