package practice.impl;
import practice.HotDrink;

public class HotDrinkTemp extends HotDrink {
private int  temperature;

    public HotDrinkTemp(String name, int volume, int temperature){
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
    return temperature;
    }
public void setTemperature(int temperature){
    this.temperature = temperature;
}
@Override
public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", volume" + volume +
            ", temperature=" + temperature +
            '}';
}
}

