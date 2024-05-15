package Lesson_3;
public class Person {
    private String fullname;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Person(String fullname, String post, String email, String tel, int salary, int age) {
        this.fullname = fullname;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;

    }
    public void info() {
        System.out.println("ФИО: " + fullname + "; Должность: " + post + "; email: " + email + "; Телефон: " + tel +
                "; Зарплата: " + salary + "; Возраст: " + age);
    }

}