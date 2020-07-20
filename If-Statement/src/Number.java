public class Number {
    public static void main(String[] args) {

        double num1 = -1.0, num2 = 4.5, num3 = -5.3, largestNumber;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largestNumber = num1;
            } else {
                largestNumber = num3;
            }
        } else {
            if (num2 >= num3) {
                largestNumber = num2;
            } else {
                largestNumber = num3;

            }
        }
        System.out.println("The largest number  " + largestNumber);
    }
}
