package pluto.entity;

public class FosterDetail {
    private Integer fosterdetailid;

    private Integer fosterday;

    private Double fostertotalprice;

    private DogHouseGrade doghousegrade;

    private Pet pet;

    @Override
    public String toString() {
        return "FosterDetail{" +
                "fosterdetailid=" + fosterdetailid +
                ", fosterday=" + fosterday +
                ", fostertotalprice=" + fostertotalprice +
                ", doghousegrade=" + doghousegrade +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FosterDetail that = (FosterDetail) o;

        if (!fosterdetailid.equals(that.fosterdetailid)) return false;
        if (!fosterday.equals(that.fosterday)) return false;
        if (!fostertotalprice.equals(that.fostertotalprice)) return false;
        if (!doghousegrade.equals(that.doghousegrade)) return false;
        return pet.equals(that.pet);
    }

    @Override
    public int hashCode() {
        int result = fosterdetailid.hashCode();
        result = 31 * result + fosterday.hashCode();
        result = 31 * result + fostertotalprice.hashCode();
        result = 31 * result + doghousegrade.hashCode();
        result = 31 * result + pet.hashCode();
        return result;
    }

    public Integer getFosterdetailid() {

        return fosterdetailid;
    }

    public void setFosterdetailid(Integer fosterdetailid) {
        this.fosterdetailid = fosterdetailid;
    }

    public Integer getFosterday() {
        return fosterday;
    }

    public void setFosterday(Integer fosterday) {
        this.fosterday = fosterday;
    }

    public Double getFostertotalprice() {
        return fostertotalprice;
    }

    public void setFostertotalprice(Double fostertotalprice) {
        this.fostertotalprice = fostertotalprice;
    }

    public DogHouseGrade getDoghousegrade() {
        return doghousegrade;
    }

    public void setDoghousegrade(DogHouseGrade doghousegrade) {
        this.doghousegrade = doghousegrade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public FosterDetail(Integer fosterday, Double fostertotalprice, DogHouseGrade doghousegrade, Pet pet) {

        this.fosterday = fosterday;
        this.fostertotalprice = fostertotalprice;
        this.doghousegrade = doghousegrade;
        this.pet = pet;
    }

    public FosterDetail(Integer fosterdetailid, Integer fosterday, Double fostertotalprice, DogHouseGrade doghousegrade, Pet pet) {

        this.fosterdetailid = fosterdetailid;
        this.fosterday = fosterday;
        this.fostertotalprice = fostertotalprice;
        this.doghousegrade = doghousegrade;
        this.pet = pet;
    }

    public FosterDetail() {

    }
}