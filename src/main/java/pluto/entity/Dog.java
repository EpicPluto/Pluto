package pluto.entity;

public class Dog {
    private Integer dogid;

    private String dogname;

    private DogSize dogsize;

    private DogType dogtype;

    private Country country;

    @Override
    public String toString() {
        return "Dog{" +
                "dogid=" + dogid +
                ", dogname='" + dogname + '\'' +
                ", dogsize=" + dogsize +
                ", dogtype=" + dogtype +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (!dogid.equals(dog.dogid)) return false;
        if (!dogname.equals(dog.dogname)) return false;
        if (!dogsize.equals(dog.dogsize)) return false;
        if (!dogtype.equals(dog.dogtype)) return false;
        return country.equals(dog.country);
    }

    @Override
    public int hashCode() {
        int result = dogid.hashCode();
        result = 31 * result + dogname.hashCode();
        result = 31 * result + dogsize.hashCode();
        result = 31 * result + dogtype.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    public Integer getDogid() {

        return dogid;
    }

    public void setDogid(Integer dogid) {
        this.dogid = dogid;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public DogSize getDogsize() {
        return dogsize;
    }

    public void setDogsize(DogSize dogsize) {
        this.dogsize = dogsize;
    }

    public DogType getDogtype() {
        return dogtype;
    }

    public void setDogtype(DogType dogtype) {
        this.dogtype = dogtype;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Dog(String dogname, DogSize dogsize, DogType dogtype, Country country) {

        this.dogname = dogname;
        this.dogsize = dogsize;
        this.dogtype = dogtype;
        this.country = country;
    }

    public Dog(Integer dogid, String dogname, DogSize dogsize, DogType dogtype, Country country) {

        this.dogid = dogid;
        this.dogname = dogname;
        this.dogsize = dogsize;
        this.dogtype = dogtype;
        this.country = country;
    }

    public Dog() {

    }
}