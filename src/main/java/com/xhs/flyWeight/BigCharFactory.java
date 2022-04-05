package com.xhs.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haishuo.xu
 * @description 生成BigChar类的实例工厂
 * @create_at 2022/4/4 14:32
 * @since
 */
public class BigCharFactory {
    /** 管理已经生成的 BigChar 的实例 */
    private Map poo = new HashMap();
    /** 单例模式 */
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    /** 生成(共享) BigChar 类的实例 */
    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = (BigChar) poo.get("" + charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            poo.put("" + charName, bigChar);
        }
        return bigChar;
    }
}
