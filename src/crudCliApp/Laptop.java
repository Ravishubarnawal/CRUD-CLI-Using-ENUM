package crudCliApp;

public class Laptop {
    private int lapId;
    private String lapName;
    private int lapPrice;

    public Laptop(int lapId, String lapName, int lapPrice) {
        this.lapId = lapId;
        this.lapName = lapName;
        this.lapPrice = lapPrice;
    }

    public int getLapId() {
        return lapId;
    }

    public void setLapId(int lapId) {
        this.lapId = lapId;
    }

    public String getLapName() {
        return lapName;
    }

    public void setLapName(String lapName) {
        this.lapName = lapName;
    }

    public int getLapPrice() {
        return lapPrice;
    }

    public void setLapPrice(int lapPrice) {
        this.lapPrice = lapPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lapId=" + lapId +
                ", lapName='" + lapName + '\'' +
                ", lapPrice=" + lapPrice +
                '}';
    }
}
