package pluto.entity;

import java.util.List;

public class UserConsumption {
    private Integer userconsumptionid;

    private Double consumptionamount;

    private User  user;

    private Double rechargeamount;

    public Integer getUserconsumptionid() {
        return userconsumptionid;
    }

    public void setUserconsumptionid(Integer userconsumptionid) {
        this.userconsumptionid = userconsumptionid;
    }

    public Double getConsumptionamount() {
        return consumptionamount;
    }

    public void setConsumptionamount(Double consumptionamount) {
        this.consumptionamount = consumptionamount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getRechargeamount() {
        return rechargeamount;
    }

    public void setRechargeamount(Double rechargeamount) {
        this.rechargeamount = rechargeamount;
    }

    public UserConsumption() {
    }
    public UserConsumption(Integer userconsumptionid, Double consumptionamount, User user, Double rechargeamount) {
        this.userconsumptionid = userconsumptionid;
        this.consumptionamount = consumptionamount;
        this.user = user;
        this.rechargeamount = rechargeamount;
    }

    @Override
    public String toString() {
        return "UserConsumption{" +
                "userconsumptionid=" + userconsumptionid +
                ", consumptionamount=" + consumptionamount +
                ", user=" + user +
                ", rechargeamount=" + rechargeamount +
                '}';
    }
}