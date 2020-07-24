class Student {
    int id;
    String name;

}

class Student1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "John";
        s1.id = 12;

        System.out.println(s1.id + " " + s1.name);
    }
}

