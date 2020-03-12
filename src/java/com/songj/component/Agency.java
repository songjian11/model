package com.songj.component;

import java.util.Iterator;
import java.util.List;

public abstract class Agency {
    /**
     * 将该层数据加入到父类集合中
     * @param list (没有进行上下级排序的集合)
     * 注意：不要直接使用
     */
    protected abstract void operate(List<Agency> list);

    /**
     * 获取当前code
     * @return
     */
    public abstract String getKey();

    /**
     * 获取父类code
     * @return
     */
    public abstract String getParentKey();

    /**
     * 根据code从该层级中获取对应的子层级数据
     * @param code
     * @return
     */
    public abstract Agency getAgencyByCode(String code);

    /**
     * 添加
     * @param agency
     */
    public void add(Agency agency){
        // 什么也不做,子类可以重写
    };

    /**
     * 获取上下级排序的list
     * @param list (没有上下级排序的集合)
     * @param supperParentKey (最顶级的父类编号)
     * @return
     */
    public static List<Agency> getSubordinateList(List<Agency> list, String supperParentKey){
        for(Agency agency : list){
            agency.operate(list);
        }
        Iterator<Agency> it = list.iterator();
        while(it.hasNext()){
            if(!supperParentKey.equals(it.next().getParentKey())){
                it.remove();
            }
        }
        return list;
    }

    /**
     * 根据code从List中获取对应层级的数据
     * @param list
     * @param code
     * @return
     */
    public static Agency getAgencyByCode(List<Agency> list, String code){
        Agency subAgency = null;
        for(Agency agency : list){
            subAgency = agency.getAgencyByCode(code);
            if(null != subAgency){
                break;
            }
        }
        return subAgency;
    }
}
