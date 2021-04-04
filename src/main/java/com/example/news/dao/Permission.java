package com.example.news.dao;

public class Permission {

    private int permissionId;
    private String permissionDes;
    private String permissionName;
    private String permissionRule;

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionDes() {
        return permissionDes;
    }

    public void setPermissionDes(String permissionDes) {
        this.permissionDes = permissionDes;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionRule() {
        return permissionRule;
    }

    public void setPermissionRule(String permissionRule) {
        this.permissionRule = permissionRule;
    }


    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", permissionDes='" + permissionDes + '\'' +
                ", permissionName='" + permissionName + '\'' +
                ", permissionRule='" + permissionRule + '\'' +
                '}';
    }
}
