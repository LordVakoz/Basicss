package Restaurant.Model;

public class Client {
    private String datein;
    private String dateout;
    private int table;

    public Client(String datein, String dateout, int table) {
        this.datein = datein;
        this.dateout = dateout;
        this.table = table;
    }

    public String getDatein() {
        return datein;
    }

    public void setDatein(String datein) {
        this.datein = datein;
    }

    public String getDateout() {
        return dateout;
    }

    public void setDateout(String dateout) {
        this.dateout = dateout;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Client{" +
                "datein='" + datein + '\'' +
                ", dateout='" + dateout + '\'' +
                ", table=" + table +
                '}';
    }
}
