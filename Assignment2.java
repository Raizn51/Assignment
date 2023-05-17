import java.util.Scanner;

class PalindromeChecker
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int OriNumber= s.nextInt();
        int number=OriNumber;
        int revNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            revNumber = revNumber * 10 + remainder;
            number /= 10;
        }

        if (OriNumber==revNumber) 
        {
            System.out.println(OriNumber + " is a palindrome.");
        } else {
            System.out.println(OriNumber + " is not a palindrome.");
        }
    }
}
