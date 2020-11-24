public class HardDrive extends Memory {

    private String typeHD;
    private float frequencyRead;
    private float frequencyRecord;

    public HardDrive(String model, Producers producer, float capacity, String type, String typeHD,
               float frequencyRead, float frequencyRecord) {
        super(model, producer, capacity, type);
        this.typeHD = typeHD;
        this.frequencyRead = frequencyRead;
        this.frequencyRecord = frequencyRecord;
    }

    @Override
    public void display() {
        System.out.println("Info about HD");
        super.display();
        System.out.println("Type of RAM: " + this.getTypeHD());
        System.out.println("Frequency of reading: " + this.getFrequencyRead() + " MB/s");
        System.out.println("Frequency of recording: " + this.getFrequencyRecord() + " MB/s" + "\n");
    }

    public String getTypeHD() {
        return typeHD;
    }

    public void setTypeRAM(String typeHD) {
        this.typeHD = typeHD;
    }

    public float getFrequencyRead() {
        return frequencyRead;
    }

    public void setFrequency(float frequencyRead) {
        this.frequencyRead = frequencyRead;
    }

    public float getFrequencyRecord() {
        return frequencyRecord;
    }

    public void setFrequencyRecord(float frequencyRecord) {
        this.frequencyRecord = frequencyRecord;
    }
}