abstract class Component {

    private String model;
    private Producers producer;

    public Component(String model, Producers producer) {
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
        System.out.println("Model: " + this.getModel());
        System.out.println(this.getProducer());
    }
}

