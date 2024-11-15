package com.zen.oauth.dao;

import com.zen.oauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface UserDao extends JpaRepository<User, Long> {
//    @Query(value = "SELECT * FROM get_user_details(:username)", nativeQuery = true)
//    User findUserByFunction(@Param("username") String username);

    User findByUsername(String username);
}
