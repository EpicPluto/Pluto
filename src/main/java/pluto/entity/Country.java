package pluto.entity;

public class Country {

    private Integer countryid;

    private String countryname;

    public Country(Integer countryid, String countryname) {
        this.countryid = countryid;
        this.countryname = countryname;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryid=" + countryid +
                ", countryname='" + countryname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!countryid.equals(country.countryid)) return false;
        return countryname.equals(country.countryname);
    }

    @Override
    public int hashCode() {
        int result = countryid.hashCode();
        result = 31 * result + countryname.hashCode();
        return result;
    }

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

    public Country(String countryname) {


        this.countryname = countryname;
    }

    public Country() {

    }
}