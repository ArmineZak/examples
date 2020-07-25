public class IsEven {
    public static void main(String[] args) {

        isEven(12);
        isEven(15);

    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
