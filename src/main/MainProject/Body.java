import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Body extends Component {

    private float height;
    private float width;
    private float length;
    private String material;

    public Body(String model, Producers producer, float h, float w, float l, String mat) {
        super(model, producer);
        this.height = h;
        this.width = w;
        this.length = l;
        this.material = mat;
    }


    @Override
    public void display() {
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO, "Info about body");
        super.display();
        logger.log(Level.INFO,"Height: " + this.getHeight() + " cm");
        logger.log(Level.INFO,"Width: " + this.getWidth() + " cm");
        logger.log(Level.INFO,"Length: " + this.getLength() + " cm");
        logger.log(Level.INFO,"Material: " + this.getMaterial() + "\n");
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}