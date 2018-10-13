import java.util.ArrayList;

public class Plane {
    private String airline;
    private ArrayList<Person> passengers;


    public Plane(String airline) {
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }


    public int getPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        passengers.add(person);
    }
}
