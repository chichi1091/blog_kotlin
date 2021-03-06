package com.example.blog.dao;

import com.example.blog.entity.UserEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Result;

import java.util.List;
import java.util.Optional;

@ConfigAutowireable
@Dao
public interface UserDao {
    @Select
    List<UserEntity> selectAll();

    @Select
    Optional<UserEntity> selectLoginUser(String username);

    @Insert(excludeNull = true)
    Result<UserEntity> insert(UserEntity user);
}
