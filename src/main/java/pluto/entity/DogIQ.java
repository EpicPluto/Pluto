package pluto.entity;

public class DogIQ {
    private Integer dogiqid;

    private String iq;

    public Integer getDogiqid() {
        return dogiqid;
    }

    public void setDogiqid(Integer dogiqid) {
        this.dogiqid = dogiqid;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq == null ? null : iq.trim();
    }

    @Override
    public String toString() {
        return "DogIQ{" +
                "dogiqid=" + dogiqid +
                ", iq='" + iq + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogIQ dogIQ = (DogIQ) o;

        if (!dogiqid.equals(dogIQ.dogiqid)) return false;
        return iq.equals(dogIQ.iq);
    }

    @Override
    public int hashCode() {
        int result = dogiqid.hashCode();
        result = 31 * result + iq.hashCode();
        return result;
    }

    public DogIQ() {

    }

    public DogIQ(String iq) {

        this.iq = iq;
    }

    public DogIQ(Integer dogiqid, String iq) {

        this.dogiqid = dogiqid;
        this.iq = iq;
    }
}