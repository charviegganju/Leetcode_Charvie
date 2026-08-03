import java.util.*;

class Lc_2785 {
    public String sortVowels(String s) {
        ArrayList<Character> v = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                v.add(ch);
            }
        }
        Collections.sort(v);
        char[] result = s.toCharArray();
        int index = 0;

        for(int i=0; i<result.length; i++){
            if(isVowel(result[i])){
                result[i] = v.get(index);
                index++;
            }
        }
        return new String(result);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Lc_2785 sol = new Lc_2785();

        String result = sol.sortVowels(s);
        System.out.println(result);
    }
}