import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 3;
        this.passengers = new ArrayList<>();
    }

    public int getPassengers() {
        return passengers.size();
    }

    public boolean addPassenger(Person person) {
        if (getPassengers() < capacity) {
            passengers.add(person);
            return true;
        }

        return false;


    }

    public void removePassenger() {
        passengers.remove(0);
    }


    public void pickUp(BusStop busStop) {
        Person person = busStop.removeFromQueue();
        addPassenger(person);

    }

    public  void pickUpOurWay(BusStop busStop) {
        if (busStop.getQueue() > 0) {
            Person person = busStop.getQueueArray().get(0);
            addPassenger(person);
        }

    }
}
