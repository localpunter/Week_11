public class Planet {
    private String name;
    private int size;

    public Planet(String name, int size) {

        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public boolean willExplode(){
        if (this.size >= 900000) {
            return true;
        }   else {
            return false;
        }
    }
}
