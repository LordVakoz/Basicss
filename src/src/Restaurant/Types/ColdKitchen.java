package Restaurant.Types;

public enum ColdKitchen {
    Salad("SALAD"),
    IceCream("IceCream"),
    Cake("Cake");

    public String Cold;
    ColdKitchen(String Cold){
        this.Cold=Cold;
    }
    public String GetCold(){
        return Cold;
    }

}
