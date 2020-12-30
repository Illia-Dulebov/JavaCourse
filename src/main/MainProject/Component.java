import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Component {

    private String model;
    private Producers producer;

    protected Component(String model, Producers producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }

    public void display(){
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Model: " + this.getModel());
        logger.log(Level.INFO, this.getProducer().toString());
    }
}

