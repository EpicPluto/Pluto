package pluto.entity;

public class DogAge {
    private Integer dogageid;

    private String age;

    @Override
    public String toString() {
        return "DogAge{" +
                "dogageid=" + dogageid +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogAge dogAge = (DogAge) o;

        if (!dogageid.equals(dogAge.dogageid)) return false;
        return age.equals(dogAge.age);
    }

    @Override
    public int hashCode() {
        int result = dogageid.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }

    public Integer getDogageid() {

        return dogageid;
    }

    public void setDogageid(Integer dogageid) {
        this.dogageid = dogageid;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public DogAge(String age) {

        this.age = age;
    }

    public DogAge(Integer dogageid, String age) {

        this.dogageid = dogageid;
        this.age = age;
    }

    public DogAge() {

    }
}