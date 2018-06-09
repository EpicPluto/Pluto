package pluto.entity;

public class ServiceType {
    private Integer servicetypeid;

    private String serviceinfo;

    private String servicename;

    private Double nowprice;

    private Double vipprice;

    public Integer getServicetypeid() {
        return servicetypeid;
    }

    public void setServicetypeid(Integer servicetypeid) {
        this.servicetypeid = servicetypeid;
    }

    public String getServiceinfo() {
        return serviceinfo;
    }

    public void setServiceinfo(String serviceinfo) {
        this.serviceinfo = serviceinfo;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Double getNowprice() {
        return nowprice;
    }

    public void setNowprice(Double nowprice) {
        this.nowprice = nowprice;
    }

    public Double getVipprice() {
        return vipprice;
    }

    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }

    public ServiceType(Integer servicetypeid, String serviceinfo, String servicename, Double nowprice, Double vipprice) {
        this.servicetypeid = servicetypeid;
        this.serviceinfo = serviceinfo;
        this.servicename = servicename;
        this.nowprice = nowprice;
        this.vipprice = vipprice;
    }

    public ServiceType() {
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "servicetypeid=" + servicetypeid +
                ", serviceinfo='" + serviceinfo + '\'' +
                ", servicename='" + servicename + '\'' +
                ", nowprice=" + nowprice +
                ", vipprice=" + vipprice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceType that = (ServiceType) o;

        if (servicetypeid != null ? !servicetypeid.equals(that.servicetypeid) : that.servicetypeid != null)
            return false;
        if (serviceinfo != null ? !serviceinfo.equals(that.serviceinfo) : that.serviceinfo != null) return false;
        if (servicename != null ? !servicename.equals(that.servicename) : that.servicename != null) return false;
        if (nowprice != null ? !nowprice.equals(that.nowprice) : that.nowprice != null) return false;
        return vipprice != null ? vipprice.equals(that.vipprice) : that.vipprice == null;
    }

    @Override
    public int hashCode() {
        int result = servicetypeid != null ? servicetypeid.hashCode() : 0;
        result = 31 * result + (serviceinfo != null ? serviceinfo.hashCode() : 0);
        result = 31 * result + (servicename != null ? servicename.hashCode() : 0);
        result = 31 * result + (nowprice != null ? nowprice.hashCode() : 0);
        result = 31 * result + (vipprice != null ? vipprice.hashCode() : 0);
        return result;
    }
}