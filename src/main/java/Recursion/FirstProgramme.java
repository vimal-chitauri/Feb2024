package Recursion;

public class FirstProgramme {
    public static void main(String[] args) {
       // fistProgramme(5);
        fact(5,1);
        System.out.println(fact(5,1));
    }

    private static void fistProgramme(int i) {

        if(i<1)
            return;
        else{
            fistProgramme(i-1);
            System.out.println(i);
            fistProgramme(i-1);
            // System.out.println(i);
        }
    }

    static int value;
    private static int fact(int i, int value){
        if(i==0)
            return value;
        return fact(i-1,value*i);

    }
}
