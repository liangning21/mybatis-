package cn.lihuan.com.pojo;

public class AddressCode {
    private Integer acId;

    private String acCitycode;

    private String acAdcode;

    private String acName;

    private String acCenter;

    private String acLevel;

    private String acParentcode;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getAcCitycode() {
        return acCitycode;
    }

    public void setAcCitycode(String acCitycode) {
        this.acCitycode = acCitycode == null ? null : acCitycode.trim();
    }

    public String getAcAdcode() {
        return acAdcode;
    }

    public void setAcAdcode(String acAdcode) {
        this.acAdcode = acAdcode == null ? null : acAdcode.trim();
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName == null ? null : acName.trim();
    }

    public String getAcCenter() {
        return acCenter;
    }

    public void setAcCenter(String acCenter) {
        this.acCenter = acCenter == null ? null : acCenter.trim();
    }

    public String getAcLevel() {
        return acLevel;
    }

    public void setAcLevel(String acLevel) {
        this.acLevel = acLevel == null ? null : acLevel.trim();
    }

    public String getAcParentcode() {
        return acParentcode;
    }

    public void setAcParentcode(String acParentcode) {
        this.acParentcode = acParentcode == null ? null : acParentcode.trim();
    }
}