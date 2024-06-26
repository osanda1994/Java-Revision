import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("Choose the Shape to Calculate the Area : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the circle's Radius : ");
                double radius = sc.nextDouble();
                double areaCircle = Math.PI*(radius*radius);
                System.out.println("Area of the Circle is : " + areaCircle);
                break;
            case 2:
                System.out.println("Enter the Length : ");
                int length = sc.nextInt();
                System.out.println("Enter the Width : ");
                int width = sc.nextInt();
                int areaRectangle = length*width;
                System.out.println("Area of the Rectangle is : " + areaRectangle);
                break;
            case 3:
                System.out.println("Enter the Triangle's Base : ");
                int base = sc.nextInt();
                System.out.println("Enter the Triangle's Height : ");
                int height = sc.nextInt();
                int areaTriangle = (base * height) / 2;
                System.out.println("Area of the Triangle is : " + areaTriangle);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
