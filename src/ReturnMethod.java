import java.util.Scanner;

public class ReturnMethod {
    public static void main(String[] args) {
        int percent = attend();
        System.out.println("Percentage : " + percent + "%");
        if(percent >= 75){
            System.out.println("Eligible");
        } else{
            System.out.println("Not Eligible");
        }
    }

    public static int attend(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total days : ");
        int full = sc.nextInt();
        System.out.println("Enter the days that student has come : ");
        int come = sc.nextInt();
        sc.close();
        int percent = (int)((come * 100.0f) / full);
        return percent;
    }
}
