package com.shyloostyle.dtodemo.repository;

import com.shyloostyle.dtodemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
