import java.util.Scanner;
public class PalindromNumbers {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
         else
            return false;

    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();
        input.close();

        System.out.println(isPalindrom(number) ? number + " is a palindrom number." : number + " is not a palindrom number.");


    }

}





