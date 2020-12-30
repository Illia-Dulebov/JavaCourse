import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Info about HD");
        super.display();
        logger.log(Level.INFO,"Type of RAM: " + this.getTypeHD());
        logger.log(Level.INFO,"Frequency of reading: " + this.getFrequencyRead() + " MB/s");
        logger.log(Level.INFO,"Frequency of recording: " + this.getFrequencyRecord() + " MB/s" + "\n");
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