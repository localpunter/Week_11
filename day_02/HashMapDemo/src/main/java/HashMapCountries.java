import java.util.HashMap;


    public class HashMapCountries {
        public static void main(String[] args) {
            HashMap<String, Integer> population = new HashMap<>();

            population.put("UK", 64100000);
            population.put("Germany", 80620000);
            population.put("France", 66030000);
            population.put("Japan", 127300000);

            int japPop = population.get("Japan");

            String output = "Japan's population is " +japPop;

            System.out.println(output);
            // Japan's population is 127300000
            System.out.println(population.size());
            // 4
            System.out.println(population.containsKey("France"));
            // true
            System.out.println(population.containsKey("Spain"));
            // false
            System.out.println(population.values());
            // [64100000, 127300000, 66030000, 80620000]
            System.out.println(population.replace("France", 66030000, 67000000));
            // true
            System.out.println(population.keySet());
            // [UK, Japan, France, Germany]
            System.out.println(population.values());
            // [64100000, 127300000, 67000000, 80620000]
            System.out.println(population.get("UK"));
            // 64100000
            System.out.println(population.clone());
            // {France=67000000, UK=64100000, Japan=127300000, Germany=80620000}
            System.out.println(population.entrySet());
            // [UK=64100000, Japan=127300000, France=67000000, Germany=80620000]
        }
    }

