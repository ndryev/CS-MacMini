import java.util.Arrays;

public class AddBorder {
    public static void main(String[] args) {
        String[] picture = {"abc" + "," + "\n" + "ded"};
        System.out.println(Arrays.toString(picture));
    }

    public String[] solution(String[] picture) {
        String ast = setAst(picture[0].length());
        String[] ans = new String[picture.length + 2];
        int ind = 0;
        ans[0] = ast;

        for (String word : picture) {
            ind++;
            ans[ind] = "*" + word + "*";
        }

        ans[ind + 1] = ast;
        return ans;
    }
    public String setAst(int len) {
        String ast = "**";
        for(int count=0; count<len; count++){
            ast += "*";
        }
        return ast;
    }
}
