package pluto.entity;

public class ActiveGrade {
    private Integer activegradeid;

    private String activegrade;

    private Double activeprice;

    public ActiveGrade(Integer activegradeid, String activegrade, Double activeprice) {
        this.activegradeid = activegradeid;
        this.activegrade = activegrade;
        this.activeprice = activeprice;
    }

    public ActiveGrade(String activegrade, Double activeprice) {
        this.activegrade = activegrade;
        this.activeprice = activeprice;
    }

    public ActiveGrade() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActiveGrade that = (ActiveGrade) o;

        if (!activegradeid.equals(that.activegradeid)) return false;
        if (!activegrade.equals(that.activegrade)) return false;
        return activeprice.equals(that.activeprice);
    }

    @Override
    public int hashCode() {
        int result = activegradeid.hashCode();
        result = 31 * result + activegrade.hashCode();
        result = 31 * result + activeprice.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ActiveGrade{" +
                "activegradeid=" + activegradeid +
                ", activegrade='" + activegrade + '\'' +
                ", activeprice=" + activeprice +
                '}';
    }

    public Integer getActivegradeid() {
        return activegradeid;
    }

    public void setActivegradeid(Integer activegradeid) {
        this.activegradeid = activegradeid;
    }

    public String getActicegrade() {
        return activegrade;
    }

    public void setActicegrade(String acticegrade) {
        this.activegrade = acticegrade == null ? null : acticegrade.trim();
    }

    public Double getActiveprice() {
        return activeprice;
    }

    public void setActiveprice(Double activeprice) {
        this.activeprice = activeprice;
    }
}