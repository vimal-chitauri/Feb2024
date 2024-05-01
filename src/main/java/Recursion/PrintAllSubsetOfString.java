package Recursion;

public class PrintAllSubsetOfString {
    public static void main(String[] args) {
        String inputString = "abc";
        System.out.println("Subsets of " + inputString + " are:");
        printAllSubsets(inputString);
    }

    public static void printAllSubsets(String s) {
        printAllSubsetsHelper(s, "", 0);
    }

    private static void printAllSubsetsHelper(String s, String current, int index) {
        // Base case: when index reaches the length of the string
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character


        // Exclude the current character
        printAllSubsetsHelper(s, current, index + 1);
        printAllSubsetsHelper(s, current + s.charAt(index), index + 1);
    }
}
