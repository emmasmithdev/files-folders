package com.example.codeclan.FilesFolders.repositories;

import com.example.codeclan.FilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
