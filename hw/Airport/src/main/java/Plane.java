import java.util.ArrayList;

public class Plane {
    private PlaneType type;
    private PlaneType capacity;
    private String airline;
    private ArrayList<Person> passengers;


    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = "BA";
//        this.plane = capacity;
        this.passengers = new ArrayList<>();
    }


    public int getPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        passengers.add(person);
    }

    public void removePassenger() {
        passengers.remove(0);
    }


    public String getAirline() {
        return airline;
    }

    public int getPlaneCapacity() {
        return this.type.getCapacity();

    }
}
