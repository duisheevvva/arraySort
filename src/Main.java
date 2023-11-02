
public class Main {
    public static void main(String[] args) {
        int countJava = 0;
        int countJS = 0;
        int summ = 0;

        Student student1 = new Student("Nurlan", 18, "Java");
        Student student2 = new Student("Atabek", 20, "Java");
        Student student3 = new Student("Nurislam", 21, "Java");
        Student student4 = new Student("Eldiyar", 18, "Js");
        Student student5 = new Student("Kudaiberdi", 18, "Js");

        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println("Tesssst");
        for (Student student : students) {
            summ += student.age;
            if (student.group.equals("Java")) {
                countJava++;
            } else {
                countJS++;
            }
        }
        int result = summ / students.length;


        System.out.println("Java : " + countJava);
        System.out.println("Js: " + countJS);
        System.out.println("Result: " + result);

    }
}