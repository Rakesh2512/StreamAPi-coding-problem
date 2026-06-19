package FindMinumNumber;

public class Anagram {

    public static String sortedChar(String s){
        return s.toLowerCase().chars().filter(c -> c != ' ')
        .sorted()
        .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
    }
    public static boolean isAnagram(String s1,String s2){
        return sortedChar(s1).equals(sortedChar(s2));
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(isAnagram(s1,s2)){
            System.out.println("Given string is Anagram");
        }
        else{
            System.out.println("Given string is not Anagram");
        }
    }
}
