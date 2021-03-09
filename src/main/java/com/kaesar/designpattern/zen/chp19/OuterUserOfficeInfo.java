package com.kaesar.designpattern.zen.chp19;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    // 员工的工作信息，比如职位等
    @Override
    public Map getUseOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是boss...");
        officeInfo.put("officeTelNum", "员工的办公电话是...");
        return officeInfo;
    }
}
