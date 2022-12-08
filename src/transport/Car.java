package transport;

import java.time.LocalDate;

public class Car{
    private String brand;
    private String model;
    private Float engineVolume;
    private String color;
    private Integer productionYear;
    private String productionCountry;
    private String transmission = "default";
    private String bodyType = "default";
    private String registrationNumber = "х000хх000";
    private Integer numberOfSeats = 4;
    private String rubberType = "летняя";
    private Key key;
    private Insurance insurance;


    public Car(){}

    public Car(String brand, String model, Float engineVolume,
               String color, Integer productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber,
               Integer numberOfSeats, String rubberType) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setProductionYear(productionYear);
        setProductionCountry(productionCountry);
        setTransmission(transmission);
        setBodyType(bodyType);
        setRegistrationNumber(registrationNumber);
        setNumberOfSeats(numberOfSeats);
        setRubberType(rubberType);
        setKey(null);
        setInsurance(null);
    }

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setProductionYear(productionYear);
        setProductionCountry(productionCountry);
    }

    public Car(String brand, String model, float engineVolume, String color, String productionCountry) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setColor(color);
        setProductionCountry(productionCountry);
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRubberType() {
        return rubberType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setKey(Key key) {
        if(key == null)
            key = new Key(false,false);

        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        if(insurance == null)
            insurance = new Insurance(null, 10_000, null);

        this.insurance = insurance;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isEmpty())
            this.brand = "default";
        else
            this.brand = brand;
    }

    public void setModel(String model) {
        if(model == null || model.isEmpty())
            this.model = "default";
        else
            this.model = model;
    }

    public void setEngineVolume(Float engineVolume) {
        if(engineVolume == null || engineVolume < 0)
            this.engineVolume = 1.5f;
        else
            this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty())
            this.color = "Белый";
        else
            this.color = color;
    }

    public void setProductionYear(Integer productionYear) {
        if(productionYear == null || productionYear < 0)
            this.productionYear = 2000;
        else
            this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        if(productionCountry == null || productionCountry.isEmpty())
            this.productionCountry = "default";
        else
            this.productionCountry = productionCountry;
    }

    public void setTransmission(String transmission) {
        if(transmission == null || transmission.isEmpty())
            this.transmission = "default";
        else
            this.transmission = transmission;
    }

    public void setBodyType(String bodyType) {
        if(bodyType == null || bodyType.isEmpty())
            this.bodyType = "default";
        else
            this.bodyType = bodyType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null || registrationNumber.isEmpty()
                || !registrationNumber.matches("^[a-zA-Z][0-9]{3}[a-zA-Z]{2}[0-9]{3}$"))
            this.registrationNumber = "х000хх000";
        else
            this.registrationNumber = registrationNumber;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        if(numberOfSeats == null || numberOfSeats < 0)
            this.numberOfSeats = 4;
        else
            this.numberOfSeats = numberOfSeats;
    }

    public void setRubberType(String rubberType) {
        if(rubberType == null || rubberType.isEmpty())
            this.rubberType = "летняя";
        else
            this.rubberType = rubberType;
    }

    public void changeRubberType(String rubberType) {
        if(rubberType.equals("летняя"))
            this.rubberType = "зимняя";
        else
            this.rubberType = "летняя";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats='" + numberOfSeats + '\'' +
                ", rubberType='" + rubberType + '\'' +
                '}';
    }

    public static class Key{

        private final boolean remoteRun;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRun, boolean withoutKeyAccess) {
            this.remoteRun = remoteRun;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRun(){
            return remoteRun;
        }

        public boolean isWithoutKeyAccess(){
            return withoutKeyAccess;
        }
    }

    public static class Insurance{

        private final LocalDate expireDate;
        private final Integer cost;
        private final String number;

        public Insurance(LocalDate expireDate, Integer cost, String number) {
            if(expireDate == null ){
                expireDate = LocalDate.now().plusYears(1);
            }
            this.expireDate = expireDate;

            if(cost <= 0){
                cost = 10_000;
            }
            this.cost = cost;

            if(number.isEmpty() || number == null){
                number = "XXXYYYZZZ";
            }
            this.number = number;
        }
        private boolean isExpired(){
            return expireDate.isAfter(LocalDate.now());
        }

        public void printExpired(){
            if(!isExpired()){
                System.out.println("Надо менять страховку");
            }
        }

        private boolean isNumberCheck(){
            return number.length() == 9;
        }

        public void printCheckNumber(){
            if(!isNumberCheck()){
                System.out.println("Номер страховки некорректный");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public Integer getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}