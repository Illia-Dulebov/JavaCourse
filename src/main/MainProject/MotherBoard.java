import org.apache.logging.log4j.LogManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MotherBoard extends Component {

    private String chipSlot;
    private String chipSet;

    private Light rgbLight;

    protected Slots slots;


    class Slots {
        private int amountRAM;
        private int amountPCI;
        private int amountSATA;

        public Slots(int amountRam, int amountPci, int amountSata) {
            this.amountRAM = amountRam;
            this.amountPCI = amountPci;
            this.amountSATA = amountSata;
        }

        public int getAmountRAM() {
            return amountRAM;
        }

        public void setAmountRAM(int amountRAM) {
            this.amountRAM = amountRAM;
        }

        public int getAmountPCI() {
            return amountPCI;
        }

        public void setAmountPCI(int amountPCI) {
            this.amountPCI = amountPCI;
        }

        public int getAmountSATA() {
            return amountSATA;
        }

        public void setAmountSATA(int amountSATA) {
            this.amountSATA = amountSATA;
        }
    }

    public MotherBoard(String model, Producers producer, String chipSlot, String chipSet, int amountRam,
                int amountPci, int amountSata, String modelLight, Producers producerLight, int power, String type) {

        super(model, producer);
        this.chipSlot = chipSlot;
        this.chipSet = chipSet;
        if (amountRam <= 0 || amountPci <= 0 || amountSata <= 0) {
            try {
                throw new SlotsAmountException("Invalid amount of slots", this);
            } catch (SlotsAmountException e) {
                e.printStackTrace();
            } finally {
                System.err.println("Error");
            }
        }
        this.slots = new Slots(amountRam, amountPci, amountSata);

        rgbLight = new Light(modelLight, producerLight, 100, "rgb");
    }

    public MotherBoard(String model, Producers producer, String chipSlot, String chipSet, int amountRam,
                       int amountPci, int amountSata) {

        super(model, producer);
        this.chipSlot = chipSlot;
        this.chipSet = chipSet;
        if (amountRam <= 0 || amountPci <= 0 || amountSata <= 0) {
            try {
                throw new SlotsAmountException("Invalid amount of slots", this);
            } catch (SlotsAmountException e) {
                e.printStackTrace();
            } finally {
                System.err.println("Error");
            }
        }
        this.slots = new Slots(amountRam, amountPci, amountSata);

    }

    @Override
    public void display() {
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Info about motherboard");
        super.display();
        logger.log(Level.INFO,"Type of chip slot: " + this.getChipSlot());
        logger.log(Level.INFO,"Type of chip set: " + this.getChipSlot());
        logger.log(Level.INFO,"Info about motherboard`s slots");
        logger.log(Level.INFO,"Amount RAM slots: " + this.getSlots().getAmountRAM());
        logger.log(Level.INFO,"Amount PCI slots: " + this.getSlots().getAmountPCI());
        logger.log(Level.INFO,"Amount SATA slots: " + this.getSlots().getAmountSATA() + "\n");

        if(this.getRgbLight() != null){
            this.getRgbLight().display();
        }
    }

    public void createLight(String modelLight, Producers producerLight) {
        rgbLight = new Light(modelLight, producerLight, 100, "rgb");
    }

    public void setChipSlot(String chipSlot) {
        this.chipSlot = chipSlot;
    }

    public String getChipSlot() {
        return chipSlot;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }

    public String getChipSet() {
        return chipSet;
    }

    public Slots getSlots(){
        return slots;
    }

    public Light getRgbLight() {
        return rgbLight;
    }

    public void setRgbLight(Light rgbLight) {
        this.rgbLight = rgbLight;
    }

}