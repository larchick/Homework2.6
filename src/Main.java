import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("cat","dog","dog","body", "body"));
        task1(list);
        task2(list);
        task3(words);
        task4(words);

    }

    public static void task1(List<Integer> list) {
        System.out.println("Задание 1");
        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.println(integer);
            }
        }
    }

    public static void task2(List<Integer> list) {
        System.out.println("Задание 2");
        Collections.sort(list);

        Set<Integer> alreadyPrintedNumbers = new HashSet<>();

        for (Integer integer : list) {
            if (!alreadyPrintedNumbers.contains(integer)) {
                if (integer % 2 == 0) {
                    System.out.println(integer);
                    alreadyPrintedNumbers.add(integer);
                }
            }

        }
    }

    public static void task3(List<String> words) {
        System.out.println("Задание 3");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);


    }

    public static void task4(List<String> words) {
        System.out.println("Задание 4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else {
                map.put(word, 1);
            }

        }
        for (String key : map.keySet()) {
            System.out.println(map.get(key));


        }


    }
}