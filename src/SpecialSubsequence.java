import java.util.Scanner;

public class SpecialSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scanner.next();
        int output = findSpecialSubsequence(word);
        System.out.println("Output : " + output);
    }

    private static int findSpecialSubsequence(String word) {
        int aCounter = 0, result = 0;
        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'A'){
                aCounter++;
            } else if (word.charAt(i) == 'G') {
                result += aCounter;
            }
            else{
                continue;
            }
        }
        return result;
    }
}
