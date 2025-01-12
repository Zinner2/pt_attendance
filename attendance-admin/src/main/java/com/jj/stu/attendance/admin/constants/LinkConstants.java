package com.jj.stu.attendance.admin.constants;

/**
 * 链接常量类
 *
 * @author 任人子
 */
public enum LinkConstants {

    LINK_TYPE_FRIENDSHIP(0, "友链"),
    LINK_TYPE_RECOMMENDED(1, "推荐"),
    LINK_TYPE_PRIVATE(2, "个人网站");

    private final Integer LinkTypeId;
    private final String LinkTypeName;

    LinkConstants(Integer linkTypeId, String linkTypeName) {
        LinkTypeId = linkTypeId;
        LinkTypeName = linkTypeName;
    }

    public Integer getLinkTypeId() {
        return LinkTypeId;
    }

    public String getLinkTypeName() {
        return LinkTypeName;
    }
}
