package Lesson_6;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------- 1 ---------");
        System.out.println();
        String[] wordsArray = {"Сюда", "будем", "писать", "любые", "слова", ",", "слова", "могут", "повторяться", "."};
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " - встречается " + wordCount.get(word) + " раз(а)");
        }
        System.out.println();
        System.out.println("---------- 2 ---------");
        System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Фамилия", "89280000001");
        phoneBook.add("Фамилия", "89280000002");
        phoneBook.add("Хачунаев", "89288888888");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Фамилия"));
        System.out.println("Телефон Петрова: " + phoneBook.get("Хачунаев"));
    }
}