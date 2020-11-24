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
        super.display();
        System.out.println("Power of light: " + this.getPower());
        System.out.println("Type of light: " + this.getType() + "\n");

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