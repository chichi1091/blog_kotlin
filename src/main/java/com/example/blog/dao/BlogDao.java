package com.example.blog.dao;

import com.example.blog.entity.BlogEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

import java.util.List;

@ConfigAutowireable
@Dao
public interface BlogDao {
    @Select
    List<BlogEntity> selectAll();

    @Insert(excludeNull = true)
    Result<BlogEntity> insert(BlogEntity entity);
}
