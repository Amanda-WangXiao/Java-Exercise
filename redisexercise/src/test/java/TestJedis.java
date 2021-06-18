import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class TestJedis {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void Test(){
        redisTemplate.opsForValue().set("hello","world");
        String world = (String)redisTemplate.opsForValue().get("hello");
        System.out.println(world);
    }
}
