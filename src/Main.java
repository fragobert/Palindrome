public class Main {
    //method that checks if a string is a palindrome
    public static boolean isPalindrome(String str) {
        //remove all spaces and special characters
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("str = " + str);

        //converts the string to lowercase
        str = str.toLowerCase();
        //converts the string to a character array
        char[] charArray = str.toCharArray();
        //creates a string builder object
        StringBuilder sb = new StringBuilder();
        //appends the characters of the character array to the string builder object
        for (char c : charArray) {
            sb.append(c);
        }
        //reverses the string builder object
        sb.reverse();
        //converts the string builder object to a string
        String reverse = sb.toString();
        //checks if the string is a palindrome
        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "Won’t lovers revolt now?";
        String s2 = "Das ist kein Palindrom";
        System.out.println(isPalindrome(s1));

        //print hello world








    }
}