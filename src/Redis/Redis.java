package Redis;


import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hcb on 2017/2/23.
 */
public class Redis {

    static Jedis jedis = new Jedis("localhost");

    public static void main(String[] args){
        setAndgetList();
    }

    /**
     * 检查REDIS连接状态
      */
    public static void CheckStatus(){
        System.out.println("Redis Connection Status is:");
        System.out.println("Status is: " + jedis.ping());
    }

    /*
        Key-Value
     */
    public static void setAndgetValue(String value){
        jedis.set("name",value);
        String returnValue = jedis.get("name");
        System.out.println(returnValue);
    }

    public static void setAndgetList(){
//        jedis.lpush("myList","joncjing");
//        jedis.lpush("myList","jingjing");

        List<String> myList = new ArrayList<String>();
        myList = jedis.lrange("myList",0,2);
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
