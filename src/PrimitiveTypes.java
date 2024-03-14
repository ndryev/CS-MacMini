import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
// A primitive type is predefined by the language and is named by a reserved keyword.
public class PrimitiveTypes {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        System.out.println("Boolean condition 1: " + a);
        System.out.println("Boolean condition 2: " + b);
        System.out.println();
        byte c = Byte.MAX_VALUE;
        byte d = Byte.MIN_VALUE;
        System.out.println("Byte MAX: " + c);
        System.out.println("Byte MIN: " + d);
        System.out.println();
        char e = Character.MAX_VALUE;
        char f = Character.MIN_VALUE;
        System.out.println("Char MAX: " + e);
        System.out.println("Char MIN: " + f);
        System.out.println();
        short g = Short.MAX_VALUE;
        short h = Short.MIN_VALUE;
        System.out.println("Short MAX: " + g);
        System.out.println("Short MIN: " + h);
        System.out.println();
        int i = MAX_VALUE;
        int j = MIN_VALUE;
        System.out.println("Integer MAX: " + i);
        System.out.println("Integer MIN: " + j);
        System.out.println();
        long k = MAX_VALUE;
        long l = MIN_VALUE;
        System.out.println("Long MAX: " + k);
        System.out.println("Long MIN: " + l);
        System.out.println();
        float m = MAX_VALUE;
        float n = MIN_VALUE;
        System.out.println("Float MAX: " + m);
        System.out.println("Float MIN: " + n);
        System.out.println();
        double o = MAX_VALUE;
        double p = MIN_VALUE;
        System.out.println("Double MAX: " + o);
        System.out.println("Double MIN: " + p);
    }
}