package homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task8 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        AddContact(phoneBook, "Иванов", "1234567890");
        AddContact(phoneBook, "Петров", "9876543210");
        AddContact(phoneBook, "Сидоров", "5555555555");
        AddContact(phoneBook, "Иванов", "9999999999");
        AddContact(phoneBook, "Сидоров", "1111111111");

        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void AddContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } 
        else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }
}
