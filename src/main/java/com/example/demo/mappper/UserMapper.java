/**
 * 
 */
package com.example.demo.mappper;

import java.util.List;

import com.example.demo.domain.User;

/**
 *
 * @author 黄永琦
 * @since 2021-01-12
 * @see
 */
public interface UserMapper {
    List<User> selectAll();

    int updateByPrimaryKeySelective(User user);

    User selectByPrimaryKey(User user);
}
