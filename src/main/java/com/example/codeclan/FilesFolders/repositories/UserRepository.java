package com.example.codeclan.FilesFolders.repositories;

import com.example.codeclan.FilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
