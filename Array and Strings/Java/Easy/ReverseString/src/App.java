import java.util.Scanner;

public class App {
    static String reverse(String word)
    {
        String temp = "";
        for(int i = 0; i < word.length(); i++)
        {
            temp += word.substring(word.length() - (i + 1), word.length() - i);
        }
        return temp;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = input.nextLine();
        System.out.println(reverse(word));
        input.close();
    }
}
