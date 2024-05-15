package Lesson_4;
public class Main {
    public static void main(String[] args) {
        Dog dogBelka = new Dog("Белка");
        Cat catStrelka = new Cat("Стрелка");
        Cat catTom = new Cat("Том");

        Animal[] animals = {dogBelka, catStrelka, catTom};

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        Cat[] cats = {catStrelka, catTom};
        Bowl bowl = new Bowl(30);

        for (Cat cat : cats) {
            cat.eat(15);
        }

        bowl.addFood(20);

        for (Cat cat : cats) {
            cat.eat(25);
        }

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + cat.isFullBowl());
        }
    }
}