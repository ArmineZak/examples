public class Hello {
    public static void main(String[] args) {

        sayHello();
        sayHelloTo("Ben");
        int x = returnFive();
        System.out.println(x);

        System.out.println(square(returnFive()));

    }

    //method returns value and takes data, works with data
    static int square(int x) {
        return x * x;
    }


    //it neither takes any data nor returns value
    static void sayHello() {
        System.out.println("Hello");
    }

    //method takes data and works with it
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    //method returns some value
    static int returnFive() {
        return 5;
    }

}

