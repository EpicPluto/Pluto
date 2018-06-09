package pluto.entity;

public class ServiceGrade {
    private Integer servicegradeid;

    private String servicegradename;

    private Double servicegradediscount;


    public Integer getServicegradeid() {
        return servicegradeid;
    }

    public void setServicegradeid(Integer servicegradeid) {
        this.servicegradeid = servicegradeid;
    }

    public String getServicegradename() {
        return servicegradename;
    }

    public void setServicegradename(String servicegradename) {
        this.servicegradename = servicegradename;
    }

    public Double getServicegradediscount() {
        return servicegradediscount;
    }

    public void setServicegradediscount(Double servicegradediscount) {
        this.servicegradediscount = servicegradediscount;
    }

    public ServiceGrade() {
    }

    public ServiceGrade(Integer servicegradeid, String servicegradename, Double servicegradediscount) {
        this.servicegradeid = servicegradeid;
        this.servicegradename = servicegradename;
        this.servicegradediscount = servicegradediscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceGrade that = (ServiceGrade) o;

        if (servicegradeid != null ? !servicegradeid.equals(that.servicegradeid) : that.servicegradeid != null)
            return false;
        if (servicegradename != null ? !servicegradename.equals(that.servicegradename) : that.servicegradename != null)
            return false;
        return servicegradediscount != null ? servicegradediscount.equals(that.servicegradediscount) : that.servicegradediscount == null;
    }

    @Override
    public int hashCode() {
        int result = servicegradeid != null ? servicegradeid.hashCode() : 0;
        result = 31 * result + (servicegradename != null ? servicegradename.hashCode() : 0);
        result = 31 * result + (servicegradediscount != null ? servicegradediscount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServiceGrade{" +
                "servicegradeid=" + servicegradeid +
                ", servicegradename='" + servicegradename + '\'' +
                ", servicegradediscount=" + servicegradediscount +
                '}';
    }
}