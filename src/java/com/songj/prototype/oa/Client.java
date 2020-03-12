package com.songj.prototype.oa;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log = new WeeklyLog();
        Attachment attachment = new Attachment();
        log.setAttachment(attachment);
        log.setName("周报");
        WeeklyLog cloneLog1 = log.clone();
        WeeklyLog cloneLog2 = log.clone1();
        System.out.println(cloneLog1.getAttachment() == attachment);
        System.out.println(cloneLog2.getAttachment() == attachment);
    }
}
