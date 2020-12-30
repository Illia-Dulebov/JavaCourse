import org.apache.logging.log4j.LogManager;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemBlock implements Compatibile {

    private MotherBoard motherboard;
    private Processor processor;
    private HardDrive hardDrive;
    private GraphicalProcessor graphicalProcessor;
    private PowerUnit powerUnit;
    private Body body;
    ArrayList <RAM> setRam;


    public SystemBlock(MotherBoard mb, Processor pr, HardDrive hd, GraphicalProcessor gp, PowerUnit pw,
                       ArrayList <RAM> set, Body bd) {
        this.motherboard = mb;
        this.processor = pr;
        this.hardDrive = hd;
        this.graphicalProcessor = gp;
        this.powerUnit = pw;
        this.body = bd;
        this.setRam = set;
    }

    public void display() {
        Logger logger = (Logger) LogManager.getLogger("name");
        logger.log(Level.INFO,"Info about system block" + "\n");

        this.getMb().display();
        this.getPr().display();
        this.getHd().display();
        this.getGp().display();
        this.getPw().display();

        if(testCompatibility(this.getMb().getSlots().getAmountRAM(), this.getRAMs().size())) {
            Iterator<RAM> iter = this.getRAMs().iterator();
            while (iter.hasNext()) {
                iter.next().display();
            }
        }
        else {
            logger.log(Level.INFO,"Quantity of RAM boards inserted are bigger than motherboard can hold!\n");
        }

        this.getBd().display();
    }

    public MotherBoard getMb() {
        return motherboard;
    }

    public void setMb(MotherBoard mb) {
        this.motherboard = mb;
    }

    public Body getBd() {
        return body;
    }

    public void setBd(Body mb) {
        this.body = mb;
    }

    public Processor getPr() {
        return processor;
    }

    public void setPr(Processor pr) {
        this.processor = pr;
    }

    public HardDrive getHd() {
        return hardDrive;
    }

    public void setHd(HardDrive hd) {
        this.hardDrive = hd;
    }

    public GraphicalProcessor getGp() {
        return graphicalProcessor;
    }

    public void setGp(GraphicalProcessor gp) {
        this.graphicalProcessor = gp;
    }

    public PowerUnit getPw() {
        return powerUnit;
    }

    public void setPw(PowerUnit pw) {
        this.powerUnit = pw;
    }

    public ArrayList<RAM> getRAMs(){
        return setRam;
    }

    public void setRAMs(ArrayList<RAM> rams){
        this.setRam = rams;
    }

    @Override
    public boolean testCompatibility(int quantityGet, int quantityInsert) {
        return quantityGet >= quantityInsert;
    }
}