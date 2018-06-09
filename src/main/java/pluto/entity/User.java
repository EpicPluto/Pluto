package pluto.entity;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String tel;

    private Double userbalance;

    private String vip;

    private byte[] userpicture;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Double getUserbalance() {
        return userbalance;
    }

    public void setUserbalance(Double userbalance) {
        this.userbalance = userbalance;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip == null ? null : vip.trim();
    }

    public byte[] getUserpicture() {
        return userpicture;
    }

    public void setUserpicture(byte[] userpicture) {
        this.userpicture = userpicture;
    }

    public User(String username, String password, String tel) {
        this.username = username;
        this.password = password;
        this.tel = tel;
    }

    public User(Double userbalance) {
        this.userbalance = userbalance;
    }

    public User(Integer userid, String username, String password, String tel, Double userbalance) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.userbalance = userbalance;
    }

    public User() {
    }
}