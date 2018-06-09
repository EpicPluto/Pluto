package pluto.entity;

public class DogCommonDisease {
    private Integer dogcommondiseaseid;

    private String diseasename;

    public Integer getDogcommondiseaseid() {
        return dogcommondiseaseid;
    }

    public void setDogcommondiseaseid(Integer dogcommondiseaseid) {
        this.dogcommondiseaseid = dogcommondiseaseid;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename == null ? null : diseasename.trim();
    }

    @Override
    public String toString() {
        return "DogCommonDisease{" +
                "dogcommondiseaseid=" + dogcommondiseaseid +
                ", diseasename='" + diseasename + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogCommonDisease that = (DogCommonDisease) o;

        if (!dogcommondiseaseid.equals(that.dogcommondiseaseid)) return false;
        return diseasename.equals(that.diseasename);
    }

    @Override
    public int hashCode() {
        int result = dogcommondiseaseid.hashCode();
        result = 31 * result + diseasename.hashCode();
        return result;
    }

    public DogCommonDisease(String diseasename) {

        this.diseasename = diseasename;
    }

    public DogCommonDisease(Integer dogcommondiseaseid, String diseasename) {

        this.dogcommondiseaseid = dogcommondiseaseid;
        this.diseasename = diseasename;
    }

    public DogCommonDisease() {

    }
}