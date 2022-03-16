package com.example.springsecuritydemo1.repository;

import com.example.springsecuritydemo1.entity.Role;
import com.example.springsecuritydemo1.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    List<Role> findAllByName(RoleName name);
}
