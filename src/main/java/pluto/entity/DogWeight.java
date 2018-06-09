package pluto.entity;

public class DogWeight {
    private Integer dogweightid;

    private Double weight;

    private Double dogweightdiscount;

    public Integer getDogweightid() {
        return dogweightid;
    }

    public void setDogweightid(Integer dogweightid) {
        this.dogweightid = dogweightid;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getDogweightdiscount() {
        return dogweightdiscount;
    }

    public void setDogweightdiscount(Double dogweightdiscount) {
        this.dogweightdiscount = dogweightdiscount;
    }

    public DogWeight() {
    }

    public DogWeight(Integer dogweightid, Double weight, Double dogweightdiscount) {
        this.dogweightid = dogweightid;
        this.weight = weight;
        this.dogweightdiscount = dogweightdiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogWeight dogWeight = (DogWeight) o;

        if (dogweightid != null ? !dogweightid.equals(dogWeight.dogweightid) : dogWeight.dogweightid != null)
            return false;
        if (weight != null ? !weight.equals(dogWeight.weight) : dogWeight.weight != null) return false;
        return dogweightdiscount != null ? dogweightdiscount.equals(dogWeight.dogweightdiscount) : dogWeight.dogweightdiscount == null;
    }

    @Override
    public int hashCode() {
        int result = dogweightid != null ? dogweightid.hashCode() : 0;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (dogweightdiscount != null ? dogweightdiscount.hashCode() : 0);
        return result;
    }



    @Override
    public String toString() {
        return "DogWeight{" +
                "dogweightid=" + dogweightid +
                ", weight=" + weight +
                ", dogweightdiscount=" + dogweightdiscount +
                '}';
    }
}