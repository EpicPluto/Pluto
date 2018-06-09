package pluto.entity;

public class ServiceDetail {
    private Integer servicedetailid;

    private Integer servicecount;

    private Double oneservicecountprice;

    private Order order;

    private ServiceType servicetype;

    private  ServiceGrade servicegrade;

    private DogWeight dogweight;

    public Integer getServicedetailid() {
        return servicedetailid;
    }

    public void setServicedetailid(Integer servicedetailid) {
        this.servicedetailid = servicedetailid;
    }

    public Integer getServicecount() {
        return servicecount;
    }

    public void setServicecount(Integer servicecount) {
        this.servicecount = servicecount;
    }

    public Double getOneservicecountprice() {
        return oneservicecountprice;
    }

    public void setOneservicecountprice(Double oneservicecountprice) {
        this.oneservicecountprice = oneservicecountprice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ServiceType getServicetype() {
        return servicetype;
    }

    public void setServicetype(ServiceType servicetype) {
        this.servicetype = servicetype;
    }

    public ServiceGrade getServicegrade() {
        return servicegrade;
    }

    public void setServicegrade(ServiceGrade servicegrade) {
        this.servicegrade = servicegrade;
    }

    public DogWeight getDogweight() {
        return dogweight;
    }

    public void setDogweight(DogWeight dogweight) {
        this.dogweight = dogweight;
    }

    public ServiceDetail() {
    }

    public ServiceDetail(Integer servicedetailid, Integer servicecount, Double oneservicecountprice, Order order, ServiceType servicetype, ServiceGrade servicegrade, DogWeight dogweight) {
        this.servicedetailid = servicedetailid;
        this.servicecount = servicecount;
        this.oneservicecountprice = oneservicecountprice;
        this.order = order;
        this.servicetype = servicetype;
        this.servicegrade = servicegrade;
        this.dogweight = dogweight;
    }

    public ServiceDetail(Integer servicecount, Double oneservicecountprice, Order order, ServiceType servicetype, ServiceGrade servicegrade, DogWeight dogweight) {
        this.servicecount = servicecount;
        this.oneservicecountprice = oneservicecountprice;
        this.order = order;
        this.servicetype = servicetype;
        this.servicegrade = servicegrade;
        this.dogweight = dogweight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceDetail that = (ServiceDetail) o;

        if (servicedetailid != null ? !servicedetailid.equals(that.servicedetailid) : that.servicedetailid != null)
            return false;
        if (servicecount != null ? !servicecount.equals(that.servicecount) : that.servicecount != null) return false;
        if (oneservicecountprice != null ? !oneservicecountprice.equals(that.oneservicecountprice) : that.oneservicecountprice != null)
            return false;
        if (order != null ? !order.equals(that.order) : that.order != null) return false;
        if (servicetype != null ? !servicetype.equals(that.servicetype) : that.servicetype != null) return false;
        if (servicegrade != null ? !servicegrade.equals(that.servicegrade) : that.servicegrade != null) return false;
        return dogweight != null ? dogweight.equals(that.dogweight) : that.dogweight == null;
    }

    @Override
    public int hashCode() {
        int result = servicedetailid != null ? servicedetailid.hashCode() : 0;
        result = 31 * result + (servicecount != null ? servicecount.hashCode() : 0);
        result = 31 * result + (oneservicecountprice != null ? oneservicecountprice.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (servicetype != null ? servicetype.hashCode() : 0);
        result = 31 * result + (servicegrade != null ? servicegrade.hashCode() : 0);
        result = 31 * result + (dogweight != null ? dogweight.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServiceDetail{" +
                "servicedetailid=" + servicedetailid +
                ", servicecount=" + servicecount +
                ", oneservicecountprice=" + oneservicecountprice +
                ", order=" + order +
                ", servicetype=" + servicetype +
                ", servicegrade=" + servicegrade +
                ", dogweight=" + dogweight +
                '}';
    }
}