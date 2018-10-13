public enum PlaneType {
    LEARJET(5),
    CESSNA(4),
    BOEING(10),
    JET(7);


    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
