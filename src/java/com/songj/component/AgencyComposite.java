package com.songj.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgencyComposite extends Agency {
    private String name;
    private String code;
    private String parentCode;
    private List<Agency> list = new ArrayList<>();

    public AgencyComposite(String name, String code, String parentCode) {
        this.name = name;
        this.code = code;
        this.parentCode = parentCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
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

    public List<Agency> getList() {
        return list;
    }

    public void setList(List<Agency> list) {
        this.list = list;
    }

    @Override
    public void add(Agency agency) {
        this.list.add(agency);
    }

    protected void operate(List<Agency> list) {
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
        Agency agency = null;
        if(code.equals(this.code)){
            return this;
        }else{
            for(Agency agency1 : list){
                agency = agency1.getAgencyByCode(code);
                if(null != agency){
                    break;
                }
            }
        }
        return agency;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                ", code:'" + code + '\'' +
                ", parentCode:'" + parentCode + '\'' +
                ", list:" + list +
                "}";
    }
}
