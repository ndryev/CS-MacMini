import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
        int[] array1 = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] array2 = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if(Arrays.equals(array1, array2)) {
            System.out.println(true);
        }else System.out.println(false);
//        System.out.println(Arrays.toString(array2));
    }
}
