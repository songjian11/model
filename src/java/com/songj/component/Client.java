package com.songj.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Agency> list = getAgency();

        list = Agency.getSubordinateList(list, "-1");

        Agency agency = Agency.getAgencyByCode(list, "102");

        System.out.println(agency.toString());
    }

    public static List<Agency> getAgency(){
        List<Agency> list = new ArrayList<>();
        AgencyComposite agency1 = new AgencyComposite("湖南", "1", "-1");
        AgencyLeaf agency2 = new AgencyLeaf("长沙", "101", "1");
        AgencyComposite agency3 = new AgencyComposite("浏阳", "102", "1");
        AgencyComposite agency4 = new AgencyComposite("浙江", "2", "-1");
        AgencyLeaf agency5 = new AgencyLeaf("杭州", "201", "2");
        AgencyLeaf agency6 = new AgencyLeaf("绍兴", "202", "2");
        AgencyLeaf agency7 = new AgencyLeaf("永安镇", "10201", "102");
        AgencyLeaf agency8 = new AgencyLeaf("未知地", "10202", "102");
        list.add(agency1);
        list.add(agency2);
        list.add(agency3);
        list.add(agency4);
        list.add(agency5);
        list.add(agency6);
        list.add(agency7);
        list.add(agency8);
        return list;
    }
}
