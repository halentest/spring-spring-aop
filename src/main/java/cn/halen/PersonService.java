package cn.halen;

/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 13-12-3
 * Time: 上午12:00
 * To change this template use File | Settings | File Templates.
 */
public interface PersonService {
    public int save(String name);
    public void update(String name, Integer id);
    public String getPersonName(Integer id);
}
