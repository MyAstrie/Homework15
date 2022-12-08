public class Main {
    public static void main(String[] args) {
        /*var newMaxim = new Human(35, "Максим", "Минск", "Бренд-менеджер");
        var newAnya = new Human(29, "Anya", "Москва", "Методист образовательных программ");
        var newKatya = new Human(28, "Катя", "Калининград", "Продакт-менеджер");
        var newArtiom = new Human(28, "Катя", "Калининград", "Директор по развитию бизнеса");

        ArrayList<Human> Humans = new ArrayList<>();
        Humans.add(newMaxim);
        Humans.add(newAnya);
        Humans.add(newKatya);
        Humans.add(newArtiom);

        for(var i : Humans){
            System.out.println(" Привет! Меня зовут " + i.getName() +
                    ". Я из города " + i.getTown() +
                    ". Я родился в " + LocalDate.now().minusYears(i.getYearOfBirth()) + " году. Будем знакомы!");
        }

        //ask 2

        var newLada = new transport.Car("Lada", "Grande", 1.7f, "Желтый", 2015, "Россия");
        var newAudi = new transport.Car("Audi", "A8 50 L TDI quattro", 3.0f, "Черный", 2020, "Германия");
        var newBmw = new transport.Car("BMW", "Z8", 3.0f, "Черный", 2018, "Германия");
        var newKia = new transport.Car("Kia", "Sportage 4", 2.4f, "Красный", 2018, "Южная Корея");
        var newHyundai = new transport.Car("Hyundai", "Avante", 1.6f, "Оранжевый", 2016, "Южная Корея");

        ArrayList<transport.Car> Cars = new ArrayList<>();
        Cars.add(newLada);
        Cars.add(newAudi);
        Cars.add(newBmw);
        Cars.add(newKia);
        Cars.add(newHyundai);

        for(var i : Cars){
            System.out.println(i.getBrand() + " " + i.getModel() +
                    ", Страна сборки: " + i.getProductionCountry() +
                    ", объем двигателя " + i.getEngineVolume() + " листра" +
                    ", год выпуска: " + i.getProductionYear() + " год");
        }

        //endregion

        //region homework 3

        //task 1

        newAnya.setYearOfBirth(-100);
        System.out.println(newAnya.getYearOfBirth());

        //task 2

        newAudi.setEngineVolume(-20);
        newBmw.setProductionYear(1999);

        for(var i : Cars){
            System.out.println(i.getBrand() + " " + i.getModel() +
                    ", Страна сборки: " + i.getProductionCountry() +
                    ", объем двигателя " + i.getEngineVolume() + " листра" +
                    ", год выпуска: " + i.getProductionYear() + " год");
        }*/

        Flower rose = new Flower("Роза обыкновенная", "","Голландия", 35.59);
        Flower chrysanthemum = new Flower("Хризантема", "","Голландия", 15.00, 5);
        Flower peony = new Flower("Пион", "","Голландия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "","Голландия", 19.5, 10);
        gypsophila.setFlowerColor(null);

        Bouquet bouquet = new Bouquet();
        bouquet.add(rose);
        bouquet.add(rose);
        bouquet.add(rose);
        bouquet.add(chrysanthemum);
        bouquet.add(chrysanthemum);
        bouquet.add(chrysanthemum);
        bouquet.add(chrysanthemum);
        bouquet.add(chrysanthemum);
        bouquet.add(gypsophila);

        bouquet.printInfo();

        var lada = new transport.Car("Lada", "Grande", 1.7f, "Желтый", 2015, "Россия");
        var audi = new transport.Car("Audi", "A8 50 L TDI quattro", 3.0f, "Черный", 2020, "Германия");
        var bmw = new transport.Car("BMW", "Z8", 3.0f, "Черный", 2018, "Германия");
        var kia = new transport.Car("Kia", "Sportage 4", 2.4f, "Красный", 2018, "Южная Корея");
        var hyundai = new transport.Car("Hyundai", "Avante", 1.6f, "Оранжевый", 2016, "Южная Корея");

        kia.setRegistrationNumber("W213xZ139");
        System.out.println(kia.getRegistrationNumber());
    }
}