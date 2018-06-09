package pluto.entity;

public class DogDisease {
    private Integer dogdiseaseid;

    private Pet pet;

    private DogCommonDisease dogcommondisease;

    @Override
    public String toString() {
        return "DogDisease{" +
                "dogdiseaseid=" + dogdiseaseid +
                ", pet=" + pet +
                ", dogcommondisease=" + dogcommondisease +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogDisease that = (DogDisease) o;

        if (!dogdiseaseid.equals(that.dogdiseaseid)) return false;
        if (!pet.equals(that.pet)) return false;
        return dogcommondisease.equals(that.dogcommondisease);
    }

    @Override
    public int hashCode() {
        int result = dogdiseaseid.hashCode();
        result = 31 * result + pet.hashCode();
        result = 31 * result + dogcommondisease.hashCode();
        return result;
    }

    public Integer getDogdiseaseid() {

        return dogdiseaseid;
    }

    public void setDogdiseaseid(Integer dogdiseaseid) {
        this.dogdiseaseid = dogdiseaseid;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public DogCommonDisease getDogcommondisease() {
        return dogcommondisease;
    }

    public void setDogcommondisease(DogCommonDisease dogcommondisease) {
        this.dogcommondisease = dogcommondisease;
    }

    public DogDisease(Pet pet, DogCommonDisease dogcommondisease) {

        this.pet = pet;
        this.dogcommondisease = dogcommondisease;
    }

    public DogDisease(Integer dogdiseaseid, Pet pet, DogCommonDisease dogcommondisease) {

        this.dogdiseaseid = dogdiseaseid;
        this.pet = pet;
        this.dogcommondisease = dogcommondisease;
    }

    public DogDisease() {

    }
}