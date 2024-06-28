public class ArraySorting {
    public static void main(String[] args) {
        int[] s = {8, 5, 3, 0, 2, 4, 1, 7, 9};

        for(int i = 0; i < s.length; i++){
            for(int j = i + 1; j < s.length; j++){
                int tmp = 0;
                if(s[i] > s[j]){
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
            System.out.print(s[i] + " ");
        }

    }
}
