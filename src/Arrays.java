public class Arrays {
    public static void main(String[] args) {
        int[] y = {2, 4, 6, 8, 10};
        int total = 0;
        for(int i = 0; i < y.length; i++){

            total = total + y[i];
        }
        System.out.println("Total is : " + total);
    }
}
