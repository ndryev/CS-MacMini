/*
Find the leftmost digit that occurs in a given string.
 */
public class FirstDigit {
    public static void main(String[] args) {
        String inputString = "var_1__Int";
        System.out.println(inputString.replaceAll("[^0-9]", "").charAt(0));
    }
}
/*
basically just replace every character with blank space except the digit and get the digit

isDigit solution:

char solution(String inputString) {
for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                return c;
            }
        }
        return 0;
}
StringToChar solution:

char solution(String inputString) {
    char[] charString = inputString.toCharArray();
    for (int i=0; i<charString.length;i++){
        if (Character.isDigit(charString[i]))
            return charString[i];
    }
    return '0';
}
also:

char solution(String inputString) {
    for(int i = 0; i < inputString.length(); i++) {
        if(Character.isDigit(inputString.charAt(i))) {
            return inputString.charAt(i);
        }
    }
    return 'c';
}

 */