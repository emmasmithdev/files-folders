package com.example.codeclan.FilesFolders.repositories;

import com.example.codeclan.FilesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
