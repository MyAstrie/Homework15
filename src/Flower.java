import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private Double cost;
    private Integer lifeSpan = 3;

    public Flower(String flowerName, String flowerColor, String country, Double cost, Integer lifeSpan) {
        setFlowerName(flowerName);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public Flower(String flowerName, String flowerColor, String country, Double cost) {
        setFlowerName(flowerName);
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerName(String flowerName) {
        if(flowerName == null || flowerName.isEmpty())
            this.flowerName = "Ромашка";
        else
            this.flowerName = flowerName;
    }

    public void setFlowerColor(String flowerColor) {
        if(flowerColor == null || flowerColor.isEmpty())
            this.flowerColor = "Белый";
        else
            this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        if(country == null || country.isEmpty())
            this.country = "Россия";
        else
            this.country = country;
    }

    public void setCost(Double cost) {
        double scale = Math.pow(10, 3);
        cost = Math.ceil(cost * scale) / scale;
        if(cost > 0)
            this.cost = cost;
        else
            this.cost = 1.0;
    }

    public void setLifeSpan(Integer lifeSpan) {
        if(lifeSpan == null || lifeSpan < 0)
            this.lifeSpan = 3;
        else
            this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
