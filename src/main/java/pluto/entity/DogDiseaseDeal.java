package pluto.entity;

public class DogDiseaseDeal {
    private Integer dogdiseasedealid;

    private String dealmethod;

    private DogCommonDisease dogcommondisease;

    @Override
    public String toString() {
        return "DogDiseaseDeal{" +
                "dogdiseasedealid=" + dogdiseasedealid +
                ", dealmethod='" + dealmethod + '\'' +
                ", dogcommondisease=" + dogcommondisease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogDiseaseDeal that = (DogDiseaseDeal) o;

        if (!dogdiseasedealid.equals(that.dogdiseasedealid)) return false;
        if (!dealmethod.equals(that.dealmethod)) return false;
        return dogcommondisease.equals(that.dogcommondisease);
    }

    @Override
    public int hashCode() {
        int result = dogdiseasedealid.hashCode();
        result = 31 * result + dealmethod.hashCode();
        result = 31 * result + dogcommondisease.hashCode();
        return result;
    }

    public Integer getDogdiseasedealid() {

        return dogdiseasedealid;
    }

    public void setDogdiseasedealid(Integer dogdiseasedealid) {
        this.dogdiseasedealid = dogdiseasedealid;
    }

    public String getDealmethod() {
        return dealmethod;
    }

    public void setDealmethod(String dealmethod) {
        this.dealmethod = dealmethod;
    }

    public DogCommonDisease getDogcommondisease() {
        return dogcommondisease;
    }

    public void setDogcommondisease(DogCommonDisease dogcommondisease) {
        this.dogcommondisease = dogcommondisease;
    }

    public DogDiseaseDeal(String dealmethod, DogCommonDisease dogcommondisease) {

        this.dealmethod = dealmethod;
        this.dogcommondisease = dogcommondisease;
    }

    public DogDiseaseDeal(Integer dogdiseasedealid, String dealmethod, DogCommonDisease dogcommondisease) {

        this.dogdiseasedealid = dogdiseasedealid;
        this.dealmethod = dealmethod;
        this.dogcommondisease = dogcommondisease;
    }

    public DogDiseaseDeal() {

    }
}