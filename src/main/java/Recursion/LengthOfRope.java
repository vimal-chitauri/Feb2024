package Recursion;

public class LengthOfRope {
    public static void main(String[] args) {
        // int no=5,a=2,b=5,c=1;
        int no = 23, a = 12, b = 9, c = 11;
        System.out.println(lengthOfRope(no, a, b, c));
    }

    public static int n = 0;

    private static int lengthOfRope(int no, int a, int b, int c) {
        if (no == 0) return 0;
        if (no < 0)
            return -1;
        int result = Math.max(Math.max(lengthOfRope(no - a, a, b, c), lengthOfRope(no - b, a, b, c)), lengthOfRope(no - c, a, b, c));

        if (result == -1) return -1;
        return result + 1;
    }
}
