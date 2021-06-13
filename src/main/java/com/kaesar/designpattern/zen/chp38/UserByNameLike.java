package com.kaesar.designpattern.zen.chp38;

/**
 * Like规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:27 下午
 */
public class UserByNameLike implements IUserSpecification {
    // like的标记
    private final static String LIKE_FLAG = "%";

    // 基准的like字符串
    private String likeStr;

    // 构造函数传递基准姓名
    public UserByNameLike(String likeStr) {
        this.likeStr = likeStr;
    }

    @Override
    public boolean isSatifiedBy(User user) {
        boolean result = false;
        String name = user.getName();
        // 替换掉%后的干净字符串
        String str = likeStr.replace("%", "");
        // 是以名字开头，如'国庆%'
        if (likeStr.endsWith(likeStr) && !likeStr.startsWith(LIKE_FLAG)) {
            result = name.startsWith(str);
        } else if (likeStr.startsWith(LIKE_FLAG) && !likeStr.endsWith(LIKE_FLAG)) {
            result = name.endsWith(str);
        } else {
            result = name.contains(str); // 类似'%国庆%'
        }
        return result;
    }
}
