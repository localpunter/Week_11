import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public ArrayList<Person> getQueueArray() {
        return queue;
    }

    public int getQueue() {
        return queue.size();
    }


    public void addToQueue(Person person) {
        queue.add(person);
    }

    public Person removeFromQueue() {
        return queue.remove(0);
    }
}
