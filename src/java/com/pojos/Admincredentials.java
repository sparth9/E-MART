package com.pojos;
// Generated Nov 9, 2013 6:18:21 PM by Hibernate Tools 3.6.0



/**
 * Admincredentials generated by hbm2java
 */
public class Admincredentials  implements java.io.Serializable {


     private Integer uacId;
     private Useradmin useradmin;
     private String login;
     private String password;
     private Integer active;

    public Admincredentials() {
    }

    public Admincredentials(Useradmin useradmin, String login, String password, Integer active) {
       this.useradmin = useradmin;
       this.login = login;
       this.password = password;
       this.active = active;
    }
   
    public Integer getUacId() {
        return this.uacId;
    }
    
    public void setUacId(Integer uacId) {
        this.uacId = uacId;
    }
    public Useradmin getUseradmin() {
        return this.useradmin;
    }
    
    public void setUseradmin(Useradmin useradmin) {
        this.useradmin = useradmin;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getActive() {
        return this.active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }




}


