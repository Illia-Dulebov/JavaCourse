public class Processor extends Component {

    private float clockFrequency;
    private int bitDepth;
    private float workTemparature;
    private int numCores;

    public Processor(String model, Producers producer, float clckFrq, int bitDepth, float workTemparature,
                     int numCores) {
        super(model, producer);
        this.clockFrequency = clckFrq;
        this.bitDepth = bitDepth;
        this.workTemparature = workTemparature;
        this.numCores = numCores;
    }


    @Override
    public void display() {
        System.out.println("Info about processor");
        super.display();
        System.out.println("Clock Frequency: " + this.getClockFrequency() + " GHz");
        System.out.println("Bit Depth: " + "x" + this.getBitDepth());
        System.out.println("Work Temperature: " + this.getWorkTemparature() + "°C");
        System.out.println("Amount of cores: " + this.getNumCores() + "\n");
    }

    public float getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(float clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getBitDepth() {
        return bitDepth;
    }

    public void setBitDepth(int bitDepth) {
        this.bitDepth = bitDepth;
    }

    public float getWorkTemparature() {
        return workTemparature;
    }

    public void setWorkTemparature(float workTemparature) {
        this.workTemparature = workTemparature;
    }

    public int getNumCores() {
        return numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }
}