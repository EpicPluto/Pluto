package pluto.entity;

public class Address {
    private Integer addressid;

    private Country country;

    private Province province;

    private City city;

    private District district;

    private Street street;

    private User user;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address() {

    }

    public Address(Integer addressid, Country country, Province province, City city, District district, Street street, User user) {
        this.addressid = addressid;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.user = user;
    }

    public Address(Country country, Province province, City city, District district, Street street, User user) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.user = user;
    }
}
