import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Info about processor");
        super.display();
        logger.log(Level.INFO,"Clock Frequency: " + this.getClockFrequency() + " GHz");
        logger.log(Level.INFO,"Bit Depth: " + "x" + this.getBitDepth());
        logger.log(Level.INFO,"Work Temperature: " + this.getWorkTemparature() + "°C");
        logger.log(Level.INFO,"Amount of cores: " + this.getNumCores() + "\n");
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