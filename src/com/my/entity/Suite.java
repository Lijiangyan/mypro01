package com.my.entity;

/**
 * Created by LJ on 16/7/21.
 */
public class Suite {
    private int id;
    private String name;
    private String description;
    private int testCount;
    private String imgUrl;
    private String createTime;
    private Module module;

    @Override
    public String toString() {
        return "Suite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", testCount=" + testCount +
                ", imgUrl='" + imgUrl + '\'' +
                ", createTime='" + createTime + '\'' +
                ", module=" + module +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTestCount() {
        return testCount;
    }

    public void setTestCount(int testCount) {
        this.testCount = testCount;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
