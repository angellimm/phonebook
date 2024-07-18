

// Реализуйте структуру телефонной книги с помощью HashMap.
// // Программа также должна учитывать, 
// что в во входной структуре будут повторяющиеся имена
//  с разными телефонами, их необходимо считать, как одного человека
//   с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;



public class Phonebook {

public static void addContact(Map<String, Set<String>> phoneBook, String name, String phoneNumber) 
{
    if (phoneBook.containsKey(name)) 
    {
        Set<String> phoneNumbers = phoneBook.get(name);
        phoneNumbers.add(phoneNumber);
    } 
    else 
    {
        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }
}



    public static void main(String[] args) 
    {
        Map<String, Set<String>> phoneBook = new HashMap<>();
        addContact(phoneBook, "Petrov", "384982");
        addContact(phoneBook, "Ivanov", "1233434");
        addContact(phoneBook, "Svitkova", "546809585");
        addContact(phoneBook, "Nahodkina", "88834344");
        addContact(phoneBook, "Ivanov", "444444");
        addContact(phoneBook, "Petkin", "999999");
        addContact(phoneBook, "Ovoshev", "39235794");
        addContact(phoneBook, "Ivanov", "16478120");
        addContact(phoneBook, "Petrov", "437693578");

        phoneBook.entrySet().stream()
        .sorted((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()))
        .forEach(entry -> 
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
}
    
}