package com.example.community.dao;

import com.example.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    /**
     *
     * @param userId =0的话表示查询所有用户的帖子  不等于0表示查询该用户id下的帖子
     * @param offset 起始行
     * @param limit 每页显示多少条数据
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    /**
     *  查询帖子的数量  userId=0 表示查询所有用户的帖子
     * @param userId @Param注解用于给参数取别名  如果只有一个参数 并且在sql中的<if>标签中使用，则必须加别名
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
