package com.entities;


/**
 * Created by 看什么看没见过屏幕啊 on 2017/4/6.
 */
public class TbManager {

    private Integer id;
    private String name;
    private Integer parentInd;
    private Integer theOrder;
    private Integer theLever;
    private Integer childNum;
    private boolean isLeaf;
    private boolean delFlag;
    private String channel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentInd() {
        return parentInd;
    }

    public void setParentInd(Integer parentInd) {
        this.parentInd = parentInd;
    }

    public Integer getTheOrder() {
        return theOrder;
    }

    public void setTheOrder(Integer theOrder) {
        this.theOrder = theOrder;
    }

    public Integer getTheLever() {
        return theLever;
    }

    public void setTheLever(Integer theLever) {
        this.theLever = theLever;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TbManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentInd=" + parentInd +
                ", theOrder=" + theOrder +
                ", theLever=" + theLever +
                ", childNum=" + childNum +
                ", isLeaf=" + isLeaf +
                ", delFlag=" + delFlag +
                ", channel='" + channel + '\'' +
                '}';
    }


}
