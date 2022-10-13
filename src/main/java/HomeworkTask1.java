import java.util.Scanner;

public class HomeworkTask1 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово: ");
            String word = scanner.nextLine();
            int length = word.length();
            System.out.println(length);
            String word1 = word.substring(0, length / 2);
            String word2 = word.substring(length / 2, length);
            System.out.println(word1);
            System.out.println(word2);
            scanner.close();
        }
    }

