import java.util.Stack;

public class AreSimilar {
    public static void main(String[] args) {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
    }
    boolean solution(int[] a, int[] b) {
        if(a.length != b.length) return false;
        Stack<Integer> indStack = new Stack<>();
        int diff = 0;
        for (int ind = 0; ind < a.length; ind++) {
            if (a[ind] != b[ind]){
                if(indStack.isEmpty()){
                    indStack.add(ind);
                    diff++;
                } else if (a[ind] == b[indStack.peek()] && b[ind] == a[indStack.peek()]) {
                    indStack.pop();

                }
            }
            if(diff >= 2) return false;
        }
        return indStack.empty();
    }
}
