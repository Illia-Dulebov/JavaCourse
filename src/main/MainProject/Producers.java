import java.util.ArrayList;

public enum Producers {
    DeepCool("China"), ASUS("Taiwan"), Intel("USA"),
    HyperX("USA"), Kingston("USA"), MSI("Taiwan");

    private String producerCountry;

    Producers(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducer(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public String getSimilarProducers() {
        Producers [] prodCountries = Producers.values();
        StringBuilder result = new StringBuilder("Similar producers from country: ");
        for (Producers prodCountry : prodCountries) {
            if (this.getProducerCountry().compareTo(prodCountry.getProducerCountry()) == 0)
                result.append(prodCountry.name()).append(" ");
        }
        return result.toString();
    }

    //Для того чтобы изменить какие то страны, если у нас есть строка

    public ArrayList splitProducersCountry(String countries){
        ArrayList<String> listCountries = new ArrayList();
        for (String retval : countries.split(",")) {
            listCountries.add(retval);
        }
        return listCountries;
    }


    @Override
    public String toString() {
        return "Producer: " + this.name() + "\n" + "Producer`s country: " + this.getProducerCountry();
    }

}