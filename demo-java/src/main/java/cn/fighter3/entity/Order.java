import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 */
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = -48889920182173429L;
    
    private Integer orderid;
    
    private Date ordertime;
    
    private String orderacceptstatus;
    
    private Integer clerkclerkid;
    
    private Integer ruserruserid;


    /*public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrderacceptstatus() {
        return orderacceptstatus;
    }

    public void setOrderacceptstatus(String orderacceptstatus) {
        this.orderacceptstatus = orderacceptstatus;
    }

    public Integer getClerkclerkid() {
        return clerkclerkid;
    }

    public void setClerkclerkid(Integer clerkclerkid) {
        this.clerkclerkid = clerkclerkid;
    }

    public Integer getRuserruserid() {
        return ruserruserid;
    }

    public void setRuserruserid(Integer ruserruserid) {
        this.ruserruserid = ruserruserid;
    }
*/
}