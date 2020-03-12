package com.songj.component;

import java.util.List;

public class AgencyLeaf extends Agency {
    private String name;
    private String code;
    private String parentCode;

    public AgencyLeaf(String name, String code, String parentCode) {
        this.name = name;
        this.code = code;
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public void operate(List<Agency> list) {
        if(!"-1".equals(this.parentCode)){
            for(Agency agency : list){
                if(parentCode.equals(agency.getKey())){
                    agency.add(this);
                    break;
                }
            }
        }
    }

    @Override
    public String getKey() {
        return this.code;
    }

    @Override
    public String getParentKey() {
        return this.parentCode;
    }

    @Override
    public Agency getAgencyByCode(String code) {
        if(code.equals(this.code)){
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", code:'" + code + '\'' +
                ", parentCode:'" + parentCode + '\'' +
                '}';
    }
}
