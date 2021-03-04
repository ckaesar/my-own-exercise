package com.kaesar.designpattern.zen.chp19;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "混世魔王");
        baseInfoMap.put("mobileNumber", "1111111");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "2222222");
        homeInfo.put("homeAddress", "北京");
        return homeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        Map officeInfo = new HashMap();
        officeInfo.put("jobPosition", "BOSS");
        officeInfo.put("officeTelNum", "33333");
        return officeInfo;
    }
}
