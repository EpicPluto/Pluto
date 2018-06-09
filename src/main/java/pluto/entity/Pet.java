package pluto.entity;

import java.util.Date;

public class Pet {
    private Integer petid;

    private DogType dogtype;

    private Date dogbirthday;

    private String dogname;

    private User user;

    public Pet(DogType dogtype, Date dogbirthday, String dogname, User user) {
        this.dogtype = dogtype;
        this.dogbirthday = dogbirthday;
        this.dogname = dogname;
        this.user = user;
    }

    public Integer getPetid() {
        return petid;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petid=" + petid +
                ", dogtype=" + dogtype +
                ", dogbirthday=" + dogbirthday +
                ", dogname='" + dogname + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (!petid.equals(pet.petid)) return false;
        if (!dogtype.equals(pet.dogtype)) return false;
        if (!dogbirthday.equals(pet.dogbirthday)) return false;
        if (!dogname.equals(pet.dogname)) return false;
        return user.equals(pet.user);
    }

    @Override
    public int hashCode() {
        int result = petid.hashCode();
        result = 31 * result + dogtype.hashCode();
        result = 31 * result + dogbirthday.hashCode();
        result = 31 * result + dogname.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public DogType getDogtype() {
        return dogtype;
    }

    public void setDogtype(DogType dogtype) {
        this.dogtype = dogtype;
    }

    public Date getDogbirthday() {
        return dogbirthday;
    }

    public void setDogbirthday(Date dogbirthday) {
        this.dogbirthday = dogbirthday;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pet(Integer petid, DogType dogtype, Date dogbirthday, String dogname, User user) {

        this.petid = petid;
        this.dogtype = dogtype;
        this.dogbirthday = dogbirthday;
        this.dogname = dogname;
        this.user = user;
    }

    public Pet() {

    }
}