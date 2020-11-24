public class RAM extends Memory {

    private String typeRAM;
    private float frequency;

    public RAM(String model, Producers producer, float capacity, String type, String typeRAM,
               float frequency) {
        super(model, producer, capacity, type);
        this.typeRAM = typeRAM;
        this.frequency = frequency;
    }

    @Override
    public void display() {
        System.out.println("Info about RAM");
        super.display();
        System.out.println("Type of RAM: " + this.getTypeRAM());
        System.out.println("Frequency: " + this.getFrequency() + " Mhz" + "\n");
    }

    public String getTypeRAM() {
        return typeRAM;
    }

    public void setTypeRAM(String typeRAM) {
        this.typeRAM = typeRAM;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
}