package com.example.codeclan.FilesFolders.components;

import com.example.codeclan.FilesFolders.models.File;
import com.example.codeclan.FilesFolders.models.Folder;
import com.example.codeclan.FilesFolders.models.User;
import com.example.codeclan.FilesFolders.repositories.FileRepository;
import com.example.codeclan.FilesFolders.repositories.FolderRepository;
import com.example.codeclan.FilesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private FileRepository fileRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args){
        User user = new User("Arthur");
        userRepository.save(user);
        Folder folder = new Folder("Gameplay", user);
        folderRepository.save(folder);
        File file = new File("progress", "doc", 4, folder);
        fileRepository.save(file);
        folder.addFile(file);
        folderRepository.save(folder);
        user.addFolder(folder);
        userRepository.save(user);
    }
}
