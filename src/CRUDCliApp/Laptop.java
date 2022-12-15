package CRUDCliApp;

public class Laptop{
    private int Lap_id;
    private String Lap_name;
    private int Lap_price;

    public Laptop(int lap_id, String lap_name, int lap_price) {
        Lap_id = lap_id;
        Lap_name = lap_name;
        Lap_price = lap_price;
    }

    public int getLap_id() {
        return Lap_id;
    }

    public void setLap_id(int lap_id) {
        Lap_id = lap_id;
    }

    public String getLap_name() {
        return Lap_name;
    }

    public void setLap_name(String lap_name) {
        Lap_name = lap_name;
    }

    public int getLap_price() {
        return Lap_price;
    }

    public void setLap_price(int lap_price) {
        Lap_price = lap_price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Lap_id=" + Lap_id +
                ", Lap_name='" + Lap_name + '\'' +
                ", Lap_price=" + Lap_price +
                '}';
    }
}