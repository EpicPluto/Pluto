package pluto.entity;

public class DogHouse {
    private Integer doghouseid;

    private String doghousename;

    private DogHouseGrade dogHouseGrade;

    private DogSize dogSize;

    @Override
    public String toString() {
        return "DogHouse{" +
                "doghouseid=" + doghouseid +
                ", doghousename='" + doghousename + '\'' +
                ", dogHouseGrades=" + dogHouseGrade +
                ", dogSizes=" + dogSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogHouse dogHouse = (DogHouse) o;

        if (!doghouseid.equals(dogHouse.doghouseid)) return false;
        if (!doghousename.equals(dogHouse.doghousename)) return false;
        if (!dogHouseGrade.equals(dogHouse.dogHouseGrade)) return false;
        return dogSize.equals(dogHouse.dogSize);
    }

    @Override
    public int hashCode() {
        int result = doghouseid.hashCode();
        result = 31 * result + doghousename.hashCode();
        result = 31 * result + dogHouseGrade.hashCode();
        result = 31 * result + dogSize.hashCode();
        return result;
    }

    public Integer getDoghouseid() {

        return doghouseid;
    }

    public void setDoghouseid(Integer doghouseid) {
        this.doghouseid = doghouseid;
    }

    public String getDoghousename() {
        return doghousename;
    }

    public void setDoghousename(String doghousename) {
        this.doghousename = doghousename;
    }

    public DogHouseGrade getDogHouseGrades() {
        return dogHouseGrade;
    }

    public void setDogHouseGrade(DogHouseGrade dogHouseGrade) {
        this.dogHouseGrade = dogHouseGrade;
    }

    public DogSize getDogSize() {
        return dogSize;
    }

    public void setDogSize(DogSize dogSize) {
        this.dogSize= dogSize;
    }

    public DogHouse(String doghousename, DogHouseGrade dogHouseGrade, DogSize dogSize) {

        this.doghousename = doghousename;
        this.dogHouseGrade = dogHouseGrade;
        this.dogSize= dogSize;
    }

    public DogHouse(Integer doghouseid, String doghousename,DogHouseGrade dogHouseGrade, DogSize dogSize) {

        this.doghouseid = doghouseid;
        this.doghousename = doghousename;
        this.dogHouseGrade = dogHouseGrade;
        this.dogSize= dogSize;
    }

    public DogHouse() {

    }
}