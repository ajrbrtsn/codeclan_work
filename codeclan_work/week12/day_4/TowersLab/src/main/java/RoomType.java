public enum RoomType {

    SINGLE(1),
    DOUBLE(2),

    CONF(50);

    private int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
