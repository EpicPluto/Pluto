package pluto.entity;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Date orderdate;

    private Double totalprice;

    private String orderstatus;

    private PayWay payway;

    private User user;

    private  UserConsumption userconsumption;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public PayWay getPayway() {
        return payway;
    }

    public void setPayway(PayWay payway) {
        this.payway = payway;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserConsumption getUserconsumption() {
        return userconsumption;
    }

    public void setUserconsumption(UserConsumption userconsumption) {
        this.userconsumption = userconsumption;
    }

    public Order() {
    }

    public Order(Integer orderid, Date orderdate, Double totalprice, String orderstatus, PayWay payway, User user, UserConsumption userconsumption) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.totalprice = totalprice;
        this.orderstatus = orderstatus;
        this.payway = payway;
        this.user = user;
        this.userconsumption = userconsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderid != null ? !orderid.equals(order.orderid) : order.orderid != null) return false;
        if (orderdate != null ? !orderdate.equals(order.orderdate) : order.orderdate != null) return false;
        if (totalprice != null ? !totalprice.equals(order.totalprice) : order.totalprice != null) return false;
        if (orderstatus != null ? !orderstatus.equals(order.orderstatus) : order.orderstatus != null) return false;
        if (payway != null ? !payway.equals(order.payway) : order.payway != null) return false;
        if (user != null ? !user.equals(order.user) : order.user != null) return false;
        return userconsumption != null ? userconsumption.equals(order.userconsumption) : order.userconsumption == null;
    }

    @Override
    public int hashCode() {
        int result = orderid != null ? orderid.hashCode() : 0;
        result = 31 * result + (orderdate != null ? orderdate.hashCode() : 0);
        result = 31 * result + (totalprice != null ? totalprice.hashCode() : 0);
        result = 31 * result + (orderstatus != null ? orderstatus.hashCode() : 0);
        result = 31 * result + (payway != null ? payway.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (userconsumption != null ? userconsumption.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", orderdate=" + orderdate +
                ", totalprice=" + totalprice +
                ", orderstatus='" + orderstatus + '\'' +
                ", payway=" + payway +
                ", user=" + user +
                ", userconsumption=" + userconsumption +
                '}';
    }
}