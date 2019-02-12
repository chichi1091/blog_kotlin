package com.example.blog.dao;

import com.example.blog.entity.BlogEntity;
import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@ConfigAutowireable
@Dao
public interface BlogDao {
    @Select
    BlogEntity selectId(int id);

    @Select
    List<BlogEntity> selectAll();

    @Insert(excludeNull = true)
    Result<BlogEntity> insert(BlogEntity entity);

    @Update(excludeNull = true)
    Result<BlogEntity> update(BlogEntity entity);

    @Delete
    Result<BlogEntity> delete(BlogEntity entity);
}
