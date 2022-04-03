package com.xhs.abstract_factory.factory;

/**
 * @author haishuo.xu
 * @description 抽象工厂
 * @create_at 2022/3/28 9:11
 * @since
 */
public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到" + classname + "类");;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
