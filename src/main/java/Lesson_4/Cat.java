public class Cat extends Animal {
    private boolean fullnessBowl;

    public Cat(String name) {
        super(name, 200, 0);
        fullnessBowl = false;
    }

    public void eat(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя покушать отрицательное количество еды.");
            return;
        }

        System.out.println(name + " пытается покушать " + amount + " еды.");

        if (amount <= 20) {
            fullnessBowl = true;
            System.out.println(name + " поел и стал сытым.");
        } else {
            System.out.println("В миске не хватает еды.");
        }
    }

    public boolean isFullBowl() {
        return fullnessBowl;
    }
}
