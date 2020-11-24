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
        System.out.println("Info about body");
        super.display();
        System.out.println("Height: " + this.getHeight() + " cm");
        System.out.println("Width: " + this.getWidth() + " cm");
        System.out.println("Length: " + this.getLength() + " cm");
        System.out.println("Material: " + this.getMaterial() + "\n");
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