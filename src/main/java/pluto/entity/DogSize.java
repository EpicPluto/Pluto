package pluto.entity;

public class DogSize {
    private Integer dogsizeid;

    private String dogsize;

    public Integer getDogsizeid() {
        return dogsizeid;
    }

    public void setDogsizeid(Integer dogsizeid) {
        this.dogsizeid = dogsizeid;
    }

    public String getDogsize() {
        return dogsize;
    }

    public void setDogsize(String dogsize) {
        this.dogsize = dogsize;
    }

    @Override
    public String toString() {
        return "DogSize{" +
                "dogsizeid=" + dogsizeid +
                ", dogsize='" + dogsize + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogSize dogSize = (DogSize) o;

        if (!dogsizeid.equals(dogSize.dogsizeid)) return false;
        return dogsize.equals(dogSize.dogsize);
    }

    @Override
    public int hashCode() {
        int result = dogsizeid.hashCode();
        result = 31 * result + dogsize.hashCode();
        return result;
    }

    public DogSize(Integer dogsizeid, String dogsize) {

        this.dogsizeid = dogsizeid;
        this.dogsize = dogsize;
    }

    public DogSize(String dogsize) {

        this.dogsize = dogsize;
    }

    public DogSize() {

    }
}