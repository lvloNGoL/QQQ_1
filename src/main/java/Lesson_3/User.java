package Lesson_3;
public class User {
    public void main(String[] args) {
        System.out.println(" ");

        info();
    }
    private int id;
    private String name;
    private String position;
    private int age;
    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }
    public void info() {
        System.out.println(";id: " + id + "; Имя пользователя: " + name+ "; должность: " + position + "; возраст: " + age);
    }
    public void changePosition(String position) {
        this.position = position;
        System.out.println(";Пользователь " + name + " получил новую должность: " + position);
    }
}