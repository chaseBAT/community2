package com.nowcoder.community;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.service.DiscussService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class CaffeineTests {

    @Autowired
    private DiscussService discussService;

    @Test
    public void initDataForTest(){
        for (int i = 0; i < 300000; i++) {
            DiscussPost post = new DiscussPost();
            post.setUserId(111);
            post.setTitle("互联网求职暖春计划");
            post.setContent("今年的就业形势，确实不容乐观，过了个年，仿佛跳水一般，整个讨论区哀鸿遍野！19届真的没人要了吗！");
            post.setCreatetime(new Date());
            post.setScore(Math.random() * 2000);
            discussService.addDiscussPost(post);
        }
    }

    @Test
    public void testCache(){
        System.out.println(discussService.findDiscussPosts(0, 0, 10, 1));
        System.out.println(discussService.findDiscussPosts(0, 0, 10, 1));
        System.out.println(discussService.findDiscussPosts(0, 0, 10, 1));
        System.out.println(discussService.findDiscussPosts(0, 0, 10, 0));
    }

}
