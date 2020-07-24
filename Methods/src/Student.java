class Student {
    int id;
    String name;
}


//object init by reference
class TestStudent1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 25;
        student1.name = "John";

        {
            System.out.println(student1.id + " " + student1.name);
        }
    }
}

