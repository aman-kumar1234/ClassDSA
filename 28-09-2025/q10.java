// Q10. Write a program to convert a binary number to a decimal number and vice versa.

class Q10 {
    public static void main(String[] args) {
        String bin = "1011";
        int dec = Integer.parseInt(bin, 2);
        System.out.println("Binary " + bin + " = Decimal " + dec);

        int x = 13;
        System.out.println("Decimal " + x + " = Binary " + Integer.toBinaryString(x));
    }
}
