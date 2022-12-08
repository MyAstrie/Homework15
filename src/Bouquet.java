import java.util.*;

public class Bouquet {
    ArrayList<Flower> bouquet;

    Bouquet(){
        bouquet = new ArrayList<>();
    }

    Bouquet(Flower flower){
        bouquet = new ArrayList<>();
        bouquet.add(flower);
    }

    public void add(Flower flower){
        bouquet.add(flower);
    }

    public void remove(Flower flower) {
        bouquet.remove(flower);
    }

    public Double getCost(){
        var flowerCost = bouquet.stream().mapToDouble(Flower::getCost).sum();
        return flowerCost * 1.1;
    }

    public Integer getLifeSpan(){
        var min = this.bouquet.stream().filter(flower -> flower.getLifeSpan() != null).min(Comparator.comparing(Flower::getLifeSpan)).orElseThrow(NoSuchElementException::new);
        return min.getLifeSpan();
    }

    public void printInfo(){
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (var temp : bouquet) {
            Integer count = map.get(temp.getFlowerName());
            map.put(temp.getFlowerName(), (count == null) ? 1 : count + 1);
        }
        System.out.println("Букет в котором: ");
        printMap(map);
        System.out.printf("будет стоить - %.2f рублей. И проживет - %d суток \n", getCost(), getLifeSpan());
    }

    private void printMap(Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }
    }

    public void print(){
        for(var flower : bouquet){
            System.out.println(flower);
        }
    }
}
