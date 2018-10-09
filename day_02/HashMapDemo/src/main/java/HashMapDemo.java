import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 52);
        ages.put("Bob", 24);
        ages.put("Alan", 45);

        int alanAge = ages.get("Alan");

        String output = "Alan's age is " + alanAge;

        System.out.println(output);

        System.out.println(ages.size());
        System.out.println(ages.containsValue(21));
        System.out.println(ages.containsKey("Alan"));

//        HashMap<String, String> favouriteFruit = new HashMap<>();
//
//        favouriteFruit.put("Alice", "Apples");
//        favouriteFruit.put("Jarrod", "Banana");
//        favouriteFruit.put("Colin", "Pear");
//
//        System.out.println(favouriteFruit.get("Colin"));
    }
}

