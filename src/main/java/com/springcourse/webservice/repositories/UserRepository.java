package com.springcourse.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcourse.webservice.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
