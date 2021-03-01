package com.kaesar.designpattern.zen.chp13;

public class Client13_5 {
    // 发送账单的数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 把模板定义出来，这个是从数据库中获得
        Mail2 mail2 = new Mail2(new AdvTemplate());
        mail2.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            // 以下是每封邮件不同的地方
            Mail2 cloneMail = mail2.clone();
            cloneMail.setAppellation(Client13_3.getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(Client13_3.getRandString(5) + "@" + Client13_3.getRandString(8) + ".com");
            // 然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail2 mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }
}
