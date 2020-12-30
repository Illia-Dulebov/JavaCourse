import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        Logger logger = (Logger) LogManager.getLogger("name");
        super.display();
        logger.log(Level.INFO, "Capacity: " + this.getCapacity() + " GB");
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