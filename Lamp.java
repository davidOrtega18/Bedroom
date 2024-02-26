public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;


    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.print("The lamp is being turned on");
    }


    public String getStyle(String style){
        return style;
    }

    public boolean isBattery(boolean battery){
        return battery;
    }

    public int getGlobRating(int globRating){
        return globRating;
    }


}
