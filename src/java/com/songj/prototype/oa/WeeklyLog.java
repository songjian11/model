package com.songj.prototype.oa;

import java.io.*;

public class WeeklyLog implements Cloneable, Serializable {
    private Attachment attachment;

    private String name;

    private String data;

    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 浅克隆(直接调用clone方法，引用类型不会复制，只是引用)
     * @return
     */
    protected WeeklyLog clone() {
        WeeklyLog log = null;
        try {
            log = (WeeklyLog)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return log;
    }

    /**
     * 深克隆(利用Serialization)
     * @return
     */
    protected WeeklyLog clone1(){
        WeeklyLog log = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            log = (WeeklyLog) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return log;
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "attachment=" + attachment +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
