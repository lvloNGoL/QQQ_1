package Lesson_6;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, new Function<String, List<String>>() {
            @Override
            public List<String> apply(String k) {
                return new ArrayList<>();
            }
        }).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }
}
