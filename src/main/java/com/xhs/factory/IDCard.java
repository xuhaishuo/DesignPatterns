package com.xhs.factory;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/24 10:43
 * @since
 */
public class IDCard extends Product {
    private String owner;
    private Integer id;

    IDCard(String owner, Integer id) {
        System.out.println("制作 " + owner + " 的ID卡");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getId() {
        return id;
    }
}
