package Restaurant.Types;

public enum BarKitchen {
    ABSENT ("ABSENT"),
    VODKA("VODKA"),
    BEER("BEER");

    public String Bar;
    BarKitchen(String Bar){
        this.Bar=Bar;
    }
    public String GetBar(){
        return Bar;
    }

}


