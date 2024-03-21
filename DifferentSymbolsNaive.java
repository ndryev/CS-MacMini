import java.util.HashSet;
import java.util.Set;
/*
Given a string, find the number of different characters in it.
 */
public class DifferentSymbolsNaive {
    public static void main(String[] args) {
        String s = "cabca";
        Set<Character> symbols = new HashSet<>();
            for(char ch : s.toCharArray()){
                symbols.add(ch);
            }
        System.out.println(symbols.size());
        }
}
/*
solved via HashSet since it stores ONLY unique symbols.

alts:
    ***
    return (int) s.chars().distinct().count();
    ***
    HashSet h = new HashSet();
    for (char c : s.toCharArray()) {h.add(c);}
    return h.size();
    }
    ***
    boolean[] arr = new boolean[26];
    int sum = 0;
    for(char c: s.toCharArray()){
        if(!arr[c - 'a']){
            sum++;
            arr[c - 'a'] = true;
        }
    }
    return sum;
    ***
    int differentSymbols = 0;
    while(s.length()>0){
        s = s.replaceAll(s.charAt(0)+"","");
        differentSymbols++;
    }
    return differentSymbols;
 */