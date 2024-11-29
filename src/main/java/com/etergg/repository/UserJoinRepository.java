package com.etergg.repository;

import com.etergg.entity.UserJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJoinRepository extends JpaRepository<UserJoin, Long> {
}
