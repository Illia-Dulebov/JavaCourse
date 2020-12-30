import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Info about RAM");
        super.display();
        logger.log(Level.INFO,"Type of RAM: " + this.getTypeRAM());
        logger.log(Level.INFO,"Frequency: " + this.getFrequency() + " Mhz" + "\n");
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