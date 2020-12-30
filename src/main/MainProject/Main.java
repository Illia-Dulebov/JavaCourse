import org.apache.logging.log4j.LogManager;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        MotherBoard m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155",
                "P67", 4, 3, 8, "LightYourFate", Producers.DeepCool,
                100, "rgb");
        Processor p1 = new Processor("Intel Core i5-9400F", Producers.Intel, 2.9f, 64,
                50f, 6);

        ArrayList <RAM> set = new ArrayList<>();

        RAM r1 = new RAM("HyperX Fury Black", Producers.HyperX, 8, "RAM", "DDR3",
                3200f);

        for (int i = 0; i < 5; i++) {
            set.add(r1);
        }

        HardDrive hd1 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240, "Hard Drive",
                "SSD", 500f, 350f);
        HardDrive hd2 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240, "Hard Drive",
                "SSD", 500f, 350f);

        PowerUnit pu1 = new PowerUnit("DE600 v2", Producers.DeepCool, 600f, "Ventilators", 6);
        GraphicalProcessor gp1 = new GraphicalProcessor("GeForce GTX 1050 Ti", Producers.MSI, 4f,
                "GDDR5", 128f, 7f);
        Body b1 = new Body("Pardo White", Producers.DeepCool, 45.6f, 20.3f, 35f, "Plastic");

        SystemBlock dream = new SystemBlock(m1, p1, hd1, gp1, pu1, set, b1);
        dream.display();

        Logger logger = (Logger) LogManager.getLogger("name");

        logger.log(Level.INFO,"Similar objects: " + hd1.equals(hd2));
        logger.log(Level.INFO, Producers.ASUS.getSimilarProducers().toString());
    }
}
