package pluto.entity;

import java.util.Date;

public class ActiveSignUp {
    private Integer signupid;

    private User user;

    private Date activedate;

    private ActiveType activetype;

    private ActiveGrade activegrade;

    public ActiveSignUp(Integer signupid, User user, Date activedate, ActiveType activetype, ActiveGrade activegrade) {
        this.signupid = signupid;
        this.user = user;
        this.activedate = activedate;
        this.activetype = activetype;
        this.activegrade = activegrade;
    }

    public Integer getSignupid() {
        return signupid;
    }

    public void setSignupid(Integer signupid) {
        this.signupid = signupid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getActivedate() {
        return activedate;
    }

    public void setActivedate(Date activedate) {
        this.activedate = activedate;
    }

    public ActiveType getActivetype() {
        return activetype;
    }

    public void setActivetype(ActiveType activetype) {
        this.activetype = activetype;
    }

    public ActiveGrade getActivegrade() {
        return activegrade;
    }

    public void setActivegrade(ActiveGrade activegrade) {
        this.activegrade = activegrade;
    }

    public ActiveSignUp() {
    }

    public ActiveSignUp(User user, Date activedate, ActiveType activetype, ActiveGrade activegrade) {
        this.user = user;
        this.activedate = activedate;
        this.activetype = activetype;
        this.activegrade = activegrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActiveSignUp that = (ActiveSignUp) o;

        if (!signupid.equals(that.signupid)) return false;
        if (!user.equals(that.user)) return false;
        if (!activedate.equals(that.activedate)) return false;
        if (!activetype.equals(that.activetype)) return false;
        return activegrade.equals(that.activegrade);
    }

    @Override
    public int hashCode() {
        int result = signupid.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + activedate.hashCode();
        result = 31 * result + activetype.hashCode();
        result = 31 * result + activegrade.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ActiveSignUp{" +
                "signupid=" + signupid +
                ", user=" + user +
                ", activedate=" + activedate +
                ", activetype=" + activetype +
                ", activegrade=" + activegrade +
                '}';
    }
}