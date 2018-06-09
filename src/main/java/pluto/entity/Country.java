package pluto.entity;

public class Country {

    private Integer countryid;

    private String countryname;

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Country() {
    }

    public Country(Integer countryid, String countryname) {
        this.countryid = countryid;
        this.countryname = countryname;
    }
}