package com.poc.parser.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Record
public class Device {

    @Field(at = 0, length = 15)
    private String macAddress;

    @Field(at = 15, length = 15)
    private String ipAddress;

    @Field(at = 31, length = 9)
    private String hostInterface;

    @Field(at = 45, length = 12)
    private String macState;

    @Field(at = 63, length = 4)
    private String primarySId;

    @Field(at = 69, length = 1)
    private String cpe;

    @Field(at = 73, length = 10)
    private String primaryDownstram;

    @Field(at = 88, length = 4)
    private String dsRfId;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getHostInterface() {
        return hostInterface;
    }

    public void setHostInterface(String hostInterface) {
        this.hostInterface = hostInterface;
    }

    public String getMacState() {
        return macState;
    }

    public void setMacState(String macState) {
        this.macState = macState;
    }

    public String getPrimarySId() {
        return primarySId;
    }

    public void setPrimarySId(String primarySId) {
        this.primarySId = primarySId;
    }

    public String getCpe() {
        return cpe;
    }

    public void setCpe(String cpe) {
        this.cpe = cpe;
    }

    public String getPrimaryDownstram() {
        return primaryDownstram;
    }

    public void setPrimaryDownstram(String primaryDownstram) {
        this.primaryDownstram = primaryDownstram;
    }

    public String getDsRfId() {
        return dsRfId;
    }

    public void setDsRfId(String dsRfId) {
        this.dsRfId = dsRfId;
    }

    @Override
    public String toString() {
        return "Device{" +
                "macAddress='" + macAddress + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", hostInterface='" + hostInterface + '\'' +
                ", macState='" + macState + '\'' +
                ", primarySId='" + primarySId + '\'' +
                ", cpe='" + cpe + '\'' +
                ", primaryDownstram='" + primaryDownstram + '\'' +
                ", dsRfId='" + dsRfId + '\'' +
                '}';
    }
}
