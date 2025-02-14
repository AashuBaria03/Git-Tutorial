import java.util.Scanner;

class InJava {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter first binary string: ");
        String a = scanner.nextLine();
        
        System.out.print("Enter second binary string: ");
        String b = scanner.nextLine();

        // Creating object of Solution class
        InJava solution = new InJava();
        String sum = solution.addBinary(a, b);
        
        // Printing result
        System.out.println("Sum of binary strings: " + sum);
        
        scanner.close();
    }
}
