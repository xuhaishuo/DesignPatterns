package com.xhs.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/24 10:45
 * @since
 */
public class IDCardFactory extends Factory {
    private Map owners = new HashMap<>();

    @Override
    protected Product createProduct(String owner, Integer id) {
        return new IDCard(owner, id);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.put(((IDCard) product).getId(),((IDCard) product).getOwner());
    }

    public Map getOwners() {
        return owners;
    }
}
