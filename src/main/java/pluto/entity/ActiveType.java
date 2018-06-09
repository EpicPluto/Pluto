package pluto.entity;

public class ActiveType {
    private Integer activetypeid;

    private String activename;

    public Integer getActivetypeid() {
        return activetypeid;
    }

    public void setActivetypeid(Integer activetypeid) {
        this.activetypeid = activetypeid;
    }

    public String getActivename() {
        return activename;
    }

    public void setActivename(String activename) {
        this.activename = activename == null ? null : activename.trim();
    }

    public ActiveType(Integer activetypeid, String activename) {
        this.activetypeid = activetypeid;
        this.activename = activename;
    }

    public ActiveType() {
    }

    public ActiveType(String activename) {
        this.activename = activename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActiveType that = (ActiveType) o;

        if (!activetypeid.equals(that.activetypeid)) return false;
        return activename.equals(that.activename);
    }

    @Override
    public int hashCode() {
        int result = activetypeid.hashCode();
        result = 31 * result + activename.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ActiveType{" +
                "activetypeid=" + activetypeid +
                ", activename='" + activename + '\'' +
                '}';
    }
}