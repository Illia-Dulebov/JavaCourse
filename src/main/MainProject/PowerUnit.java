public class PowerUnit extends Component {

    private float power;
    private String cooling;
    private int plugs;

    public PowerUnit(String model, Producers producer, float power, String cooling, int plugs) {
        super(model, producer);
        this.power = power;
        this.cooling = cooling;
        this.plugs = plugs;
    }


    @Override
    public void display() {
        System.out.println("Info about power unit");
        super.display();
        System.out.println("Power: " + this.getPower() + "Wt");
        System.out.println("Cooling: " + this.getCooling());
        System.out.println("Plugs for all devices: " + this.getPlugs() + "\n");
    }

    public void globalSetter(float power, String cooling, int plugs) {
        this.power = power;
        this.cooling = cooling;
        this.plugs = plugs;
    }

    public void globalSetter(float power, String cooling){
        this.power = power;
        this.cooling = cooling;
    }

    public void globalSetter(String cooling, int plugs){
        this.cooling = cooling;
        this.plugs = plugs;
    }

    public void globalSetter(float power, int plugs){
        this.plugs = plugs;
        this.power = power;
    }


    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public int getPlugs() {
        return plugs;
    }

    public void setPlugs(int plugs) {
        this.plugs = plugs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var objCast = (PowerUnit) obj;
        return objCast.getPower() == this.getPower() && objCast.getPlugs() == this.getPlugs() &&
                objCast.getCooling().equals(this.getCooling());
    }

}