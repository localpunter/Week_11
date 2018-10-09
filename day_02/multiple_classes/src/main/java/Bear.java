import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<>();
    }

    public int foodCount() {
        return belly.size();
    }

    public void eat(Salmon salmon) {
        belly.add(salmon);
    }

    public void sleep() {
        belly.clear();
    }

    public void eatFromRiver(River river) {
        Salmon salmon = river.takeFish();
        eat(salmon);
    }
}