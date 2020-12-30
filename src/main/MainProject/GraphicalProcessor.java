import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GraphicalProcessor extends Component {

    private float capacity;
    private String type;
    private float busWidth;
    private float frequency;


    public GraphicalProcessor(String model, Producers producer, float capacity, String type, float busWidth,
                     float frequency) {
        super(model, producer);
        this.capacity = capacity;
        this.type = type;
        this.busWidth = busWidth;
        this.frequency = frequency;
    }


    @Override
    public void display() {
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Info about graphical processor");
        super.display();
        logger.log(Level.INFO,"Capacity of memory: " + this.getCapacity() + " GB");
        logger.log(Level.INFO,"Type of memory: " + this.getType());
        logger.log(Level.INFO,"Bus Width: " + this.getBusWidth() + " bit");
        logger.log(Level.INFO,"Frequency: " + this.getFrequency() + " Mhz" + "\n");
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

    public float getBusWidth() {
        return busWidth;
    }

    public void setBusWidth(float busWidth) {
        this.busWidth = busWidth;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public float getDivided(float a, float b, Calculate obj1) {
        Calculate obj = obj1;
        return obj.getCapacityDividedFrequency(a, b);
    }
}