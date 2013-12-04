package cn.halen;

/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 13-12-3
 * Time: 上午12:00
 * To change this template use File | Settings | File Templates.
 */
public class PersonServiceBean {

    public String getPersonName(Integer id) {
        System.out.println("我是getPersonName()方法");
        return "xxx";
    }

    public int save(String name) {
        //throw new RuntimeException("我爱例外");
        //int i = 10/0;
        System.out.println("我是save()方法");
        return 0;
    }

    public void update(String name, Integer id) {
        System.out.println("我是update()方法");
    }
}
