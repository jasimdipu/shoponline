package entity;
// Generated Oct 31, 2016 11:51:55 PM by Hibernate Tools 4.3.1



/**
 * UserRole generated by hbm2java
 */
public class UserRole  implements java.io.Serializable {


     private int roleId;
     private String roleName;

    public UserRole() {
    }

    public UserRole(int roleId, String roleName) {
       this.roleId = roleId;
       this.roleName = roleName;
    }
   
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }




}


