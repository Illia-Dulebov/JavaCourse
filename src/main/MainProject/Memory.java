class Memory extends Component {

    private String type;
    private float capacity;

    public Memory(String model, Producers producer, float capacity, String type) {
        super(model, producer);
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Capacity: " + this.getCapacity() + " GB");
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}