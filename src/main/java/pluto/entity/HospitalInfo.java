package pluto.entity;

public class HospitalInfo {
    private Integer hospitalid;

    private String hospitalname;

    private String hospitalintroduce;

    private City city;

    private District district;

    private Street street;

    public Integer getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(Integer hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getHospitalintroduce() {
        return hospitalintroduce;
    }

    public void setHospitalintroduce(String hospitalintroduce) {
        this.hospitalintroduce = hospitalintroduce;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public HospitalInfo() {
    }

    public HospitalInfo(Integer hospitalid, String hospitalname, String hospitalintroduce, City city, District district, Street street) {
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.hospitalintroduce = hospitalintroduce;
        this.city = city;
        this.district = district;
        this.street = street;
    }


    @Override
    public String toString() {
        return "HospitalInfo{" +
                "hospitalid=" + hospitalid +
                ", hospitalname='" + hospitalname + '\'' +
                ", hospitalintroduce='" + hospitalintroduce + '\'' +
                ", city=" + city +
                ", district=" + district +
                ", street=" + street +
                '}';
    }
}