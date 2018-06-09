package pluto.entity;

public class DogHouseGrade {
    private Integer doghousegradeid;

    private String doghousegrade;

    private Double doghousevipprice;

    private Double doghouseprice;

    @Override
    public String toString() {
        return "DogHouseGrade{" +
                "doghousegradeid=" + doghousegradeid +
                ", doghousegrade='" + doghousegrade + '\'' +
                ", doghousevipprice=" + doghousevipprice +
                ", doghouseprice=" + doghouseprice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogHouseGrade that = (DogHouseGrade) o;

        if (!doghousegradeid.equals(that.doghousegradeid)) return false;
        if (!doghousegrade.equals(that.doghousegrade)) return false;
        if (!doghousevipprice.equals(that.doghousevipprice)) return false;
        return doghouseprice.equals(that.doghouseprice);
    }

    @Override
    public int hashCode() {
        int result = doghousegradeid.hashCode();
        result = 31 * result + doghousegrade.hashCode();
        result = 31 * result + doghousevipprice.hashCode();
        result = 31 * result + doghouseprice.hashCode();
        return result;
    }

    public DogHouseGrade(Integer doghousegradeid, String doghousegrade, Double doghousevipprice, Double doghouseprice) {

        this.doghousegradeid = doghousegradeid;
        this.doghousegrade = doghousegrade;
        this.doghousevipprice = doghousevipprice;
        this.doghouseprice = doghouseprice;
    }

    public DogHouseGrade(String doghousegrade, Double doghousevipprice, Double doghouseprice) {

        this.doghousegrade = doghousegrade;
        this.doghousevipprice = doghousevipprice;
        this.doghouseprice = doghouseprice;
    }

    public DogHouseGrade() {

    }

    public Integer getDoghousegradeid() {
        return doghousegradeid;
    }

    public void setDoghousegradeid(Integer doghousegradeid) {
        this.doghousegradeid = doghousegradeid;
    }

    public String getDoghousegrade() {
        return doghousegrade;
    }

    public void setDoghousegrade(String doghousegrade) {
        this.doghousegrade = doghousegrade == null ? null : doghousegrade.trim();
    }

    public Double getDoghousevipprice() {
        return doghousevipprice;
    }

    public void setDoghousevipprice(Double doghousevipprice) {
        this.doghousevipprice = doghousevipprice;
    }

    public Double getDoghouseprice() {
        return doghouseprice;
    }

    public void setDoghouseprice(Double doghouseprice) {
        this.doghouseprice = doghouseprice;
    }
}