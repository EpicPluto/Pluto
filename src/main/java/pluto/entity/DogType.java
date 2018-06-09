package pluto.entity;

public class DogType {
    private Integer dogtypeid;

    private String dogtype;

    @Override
    public String toString() {
        return "DogType{" +
                "dogtypeid=" + dogtypeid +
                ", dogtype='" + dogtype + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogType dogType = (DogType) o;

        if (!dogtypeid.equals(dogType.dogtypeid)) return false;
        return dogtype.equals(dogType.dogtype);
    }

    @Override
    public int hashCode() {
        int result = dogtypeid.hashCode();
        result = 31 * result + dogtype.hashCode();
        return result;
    }

    public Integer getDogtypeid() {

        return dogtypeid;
    }

    public void setDogtypeid(Integer dogtypeid) {
        this.dogtypeid = dogtypeid;
    }

    public String getDogtype() {
        return dogtype;
    }

    public void setDogtype(String dogtype) {
        this.dogtype = dogtype;
    }

    public DogType(Integer dogtypeid, String dogtype) {

        this.dogtypeid = dogtypeid;
        this.dogtype = dogtype;
    }

    public DogType(String dogtype) {

        this.dogtype = dogtype;
    }

    public DogType() {

    }
}