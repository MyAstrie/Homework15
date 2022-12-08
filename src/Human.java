public class Human {
    private Integer yearOfBirth = 0;
    private String name = "Информация не указана";
    private String town = "Информация не указана";
    private String job = "Информация не указана";

    public Human() {}

    public Human(int yearOfBirth, String name, String town, String job) {
        setYearOfBirth(yearOfBirth);
        setName(name);
        setTown(town);
        setJob(job);
    }

    public Human(int yearOfBirth, String name, String town) {
        setYearOfBirth(yearOfBirth);
        setName(name);
        setTown(town);
    }

    public Human(String name, String town, String job) {
        setName(name);
        setTown(town);
        setJob(job);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJob() {
        return job;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if(yearOfBirth < 0)
            this.yearOfBirth = yearOfBirth;
        else
            this.yearOfBirth = 0;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
            this.name = name;
        else
            this.name = "Информация не указана";
    }

    public void setTown(String town) {
        if(town == null || town.isEmpty())
            this.town = town;
        else
            this.town = "Информация не указана";
    }

    public void setJob(String job) {
        if(job == null || job.isEmpty())
            this.job = job;
        else
            this.job = "Информация не указана";
    }
}