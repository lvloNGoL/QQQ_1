public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить отрицательное количество еды в миску.");
            return;
        }

        food += amount;
        System.out.println("В миску добавлено " + amount + " еды.");
    }
}
