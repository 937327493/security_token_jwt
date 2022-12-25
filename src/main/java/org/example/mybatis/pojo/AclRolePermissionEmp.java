package org.example.mybatis.pojo;

import java.util.Date;

public class AclRolePermissionEmp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acl_role_permission.id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acl_role_permission.role_id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acl_role_permission.permission_id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    private String permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acl_role_permission.is_deleted
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    private Byte isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acl_role_permission.gmt_create
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column acl_role_permission.gmt_modified
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acl_role_permission.id
     *
     * @return the value of acl_role_permission.id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acl_role_permission.id
     *
     * @param id the value for acl_role_permission.id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acl_role_permission.role_id
     *
     * @return the value of acl_role_permission.role_id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acl_role_permission.role_id
     *
     * @param roleId the value for acl_role_permission.role_id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acl_role_permission.permission_id
     *
     * @return the value of acl_role_permission.permission_id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acl_role_permission.permission_id
     *
     * @param permissionId the value for acl_role_permission.permission_id
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acl_role_permission.is_deleted
     *
     * @return the value of acl_role_permission.is_deleted
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acl_role_permission.is_deleted
     *
     * @param isDeleted the value for acl_role_permission.is_deleted
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acl_role_permission.gmt_create
     *
     * @return the value of acl_role_permission.gmt_create
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acl_role_permission.gmt_create
     *
     * @param gmtCreate the value for acl_role_permission.gmt_create
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column acl_role_permission.gmt_modified
     *
     * @return the value of acl_role_permission.gmt_modified
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column acl_role_permission.gmt_modified
     *
     * @param gmtModified the value for acl_role_permission.gmt_modified
     *
     * @mbggenerated Sun Dec 25 20:30:54 CST 2022
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}