package practice;

public class HotDrink {

    protected String name;
    protected int volume;



public HotDrink(String name, int volume){
 this.name = name;
 this.volume = volume;
}


    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return this.volume;
    }
public void setVolume(int volume){
    this.volume = volume;
}
}
