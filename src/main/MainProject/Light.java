import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Light extends Component {
    private float power;
    private String type;

    public Light(String model, Producers producer, float power, String type){
        super(model, producer);
        this.power = power;
        this.type = type;
    }

    @Override
    public void display() {
        Logger logger = (Logger) LogManager.getLogger("name");
        super.display();
        logger.log(Level.INFO, "Power of light: " + this.getPower());
        logger.log(Level.INFO,"Type of light: " + this.getType() + "\n");

    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}