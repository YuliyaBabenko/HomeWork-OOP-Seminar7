package Phones;

public abstract class Phone {
    private String producer;
    private String color;
    
    public Phone(String producer, String color) {
        this.producer = producer;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}