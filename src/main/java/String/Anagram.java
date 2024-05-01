package String;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("geeks","ekgs"));
    }

    private static boolean anagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        int[] tempArray = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char c=s1.toCharArray()[i];
            tempArray[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char c=s2.toCharArray()[i];
            tempArray[c]--;
        }

        for (int i = 0; i < tempArray.length; i++) {
            if(i!=0)
                return false;
            return true;
        }
       return true;
    }
}
