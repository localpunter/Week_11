import java.util.ArrayList;

public class River {
    private ArrayList<Salmon> fish;

    public River() {
        this.fish= new ArrayList<>();
    }

    public int fishCount() {
        return fish.size();
    }

    public void addFish(Salmon salmon) {
        fish.add(salmon);
    }

    public Salmon takeFish() {
        return fish.remove(0);
    }
}
