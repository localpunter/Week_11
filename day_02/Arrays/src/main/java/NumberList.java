import java.util.ArrayList;


    public class NumberList {
        private ArrayList<Integer> numbers;

        public NumberList(ArrayList<Integer> numbers) {
            this.numbers = numbers;
        }

        public int numberCount() {
            return numbers.size();
        }

        public void addNumber(int number) {
            numbers.add(number);
        }


        public int getNumberAtIndex(int index) {
            return numbers.get(index);
        }

        public int sum() {
            int result = 0;

            for (Integer number : numbers) {
                result += number;
            }

            return result;
        }
    }

