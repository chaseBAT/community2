package com.nowcoder.community.dao.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
//泛型参数1 代表封装的实体类，参数2代表封装的主键
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost,Integer>{

}


