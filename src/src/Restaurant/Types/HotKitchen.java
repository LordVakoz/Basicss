package Restaurant.Types;

public enum HotKitchen {
    Borsh("BORSH"),
    Steak("STEAK"),
    Sausage("SAUSAGE");

    public String Hot;
    HotKitchen(String Hot){
        this.Hot=Hot;
    }
    public String GetHot(){
        return Hot;
    }

}
