package com.springcourse.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
