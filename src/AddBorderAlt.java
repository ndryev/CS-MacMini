import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddBorderAlt {
    public static void main(String[] args) {
        String[] picture = {"abc" + "," + "\n" + "ded"};
        System.out.println(Arrays.toString(addBord(picture)));
    }
    public static String[] addBord(String[] picture) {

        String aster = "";

        List<String> list = new ArrayList<>();
        List<String> edge = new ArrayList<>();

        int lengthPic = picture[0].length();

        for (int i = 0; i < lengthPic + 2; i++) {
            aster = aster + "*";
        }

        for (int i = 0; i < picture.length; i++) {
            picture[i] = "*" + picture[i] + "*";
        }

        edge.add(aster);

        for (int i = 0; i < picture.length; i++) {
            edge.add(picture[i]);
        }
            edge.add(aster);

            String[] result = edge.toArray(new String[edge.size()]);

            return result;
        }
}