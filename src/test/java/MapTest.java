import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yang Liu
 * @create 2022-10-26-13:07
 */
public class MapTest {
    @Test
    public void test1() {
        Map<String,Integer> m = new HashMap<String,Integer>();

        m.put("zhangsan", 19);
        m.put("lisi", 49);
        m.put("wangwu", 19);
        m.put("lisi",20);
        m.put("hanmeimei", null);
        System.out.println(m);

        System.out.println(m.values());
    }
}
