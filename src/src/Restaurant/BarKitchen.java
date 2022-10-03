package Restaurant;

public class BarKitchen extends Food{
    public BarKitchenType[] type = BarKitchenType.values();
enum BarKitchenType{
    MARTINI,
    VODKA,
    BEER,
    ABSENT

}
}
