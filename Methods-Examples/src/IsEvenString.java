public class IsEvenString {

    public static void main(String[] args) {
        int i = 10;
        for (i = 0; i < 12; i++){
            System.out.println(isEven(5));}
    }

    public static String isEven(int num) {
        String str;
        if (num % 2 == 0) {
            str = num + " is even";
        } else {
            str = num + " is odd";

        }
        return str;
    }

}
