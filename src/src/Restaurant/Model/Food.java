package Restaurant.Model;

public class Food {

    private String type;
    private String name;
    private int cost;

    public Food(String type, String name, int cost ) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }
    public void setType(){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;

    }
    public int getCost(){
        return cost;
    }
    public void setCost(){
        this.cost = cost;
    }
}
