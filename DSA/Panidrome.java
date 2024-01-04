package DSA;

public class Panidrome {
    public static void main(String[] args) {
        String s = "race ne car";
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "");

        String result = cleanedString.toLowerCase();

        System.out.println(result);
        int n = result.length();
        for (int i = 0; i < n / 2; i++) {
            System.out.println(" "+result.charAt(i)+"->"+result.charAt(n - i - 1));
            if (result.charAt(i) != result.charAt(n - i - 1)) {
                System.out.println("Not a palindrome");
                break;
            } else {
                System.out.println("Palindrome");
            }
        
        }

    }
}