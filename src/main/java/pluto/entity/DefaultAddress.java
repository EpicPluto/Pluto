package pluto.entity;

public class DefaultAddress {
    private Integer defautladdressid;

    private Country country;

    private Province province;

    private City city;

    private District district;

    private Street street;

    private User user;

    public DefaultAddress(Integer defautladdressid, Country country, Province province, City city, District district, Street street, User user) {
        this.defautladdressid = defautladdressid;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.user = user;
    }

    public DefaultAddress(Country country, Province province, City city, District district, Street street, User user) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.street = street;
        this.user = user;
    }
}