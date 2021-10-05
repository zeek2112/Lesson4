import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Cat", "Dog", "Leon", "Dog", "Tiger", "Len", "Dog", "Cat", "Spyder", "Mouse", "Cat", "Hamster", "Dog", "Tiger", "Hamster",
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Popov", "8999123456");
        directory.add("Popov", "8912155326");
        directory.add("Gorbynov", "8917155552");
        directory.add("Gorbynov", "8913455672");
        directory.add("Popov", "89998754125");
        directory.add("Alexandrov", "89998521436");
        directory.add("Gorbynov", "89994561298");
        directory.add("Dorofeev", "89997539514");
        directory.add("Alexandrov", "89993574598");

        System.out.println(directory.get("Popov"));
        System.out.println(directory.get("Alexandrov"));
        System.out.println(directory.get("Gorbynov"));
        System.out.println(directory.get("Dorofeev"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
