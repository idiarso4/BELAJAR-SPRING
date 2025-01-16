package com.example.belajarspring.repository;
import java.util.List;

import com.example.belajarspring.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.param;

import com example.belajarspring.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
`

    @Query("select u FROM User u WHERE u.name=:name")
    List<User> findUserByName(@Param("name") String name);

    @Query("SELECT u.roles, COUNT(u.roles) FROM User u GROUP BY u.roles")
    List<Object[]> countUserByRoles();

    @Query("SELECT u.name, COUNT(u.tasks) FROM User u GROUP BY u.id")
    List<Object[]> countTaskByUser();


}