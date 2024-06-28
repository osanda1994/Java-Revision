import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int[] z = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < z.length; i++){
            System.out.print("Enter a Number : ");
            z[i] = sc.nextInt();
        }
        int max = z[0];
        for(int a = 0; a < z.length; a++){
            if(max < z[a]){
                max = z[a];
            }
        }
        System.out.println("Max is : " + max);

        int min = z[0];
        for(int a = 0; a < z.length; a++){
            if(min > z[a]){
                min = z[a];
            }
        }
        System.out.println("Min is : " + min);

    }
}
