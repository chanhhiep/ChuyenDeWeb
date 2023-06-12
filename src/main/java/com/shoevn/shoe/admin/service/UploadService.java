package com.shoevn.shoe.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class UploadService {
    public String uploadFile(MultipartFile file, String directoryName) throws IOException {
        directoryName = createDirectory(directoryName);
        Path path = Paths.get(directoryName);
        UUID uuid = UUID.randomUUID();
        String name = uuid.toString() + "." + file.getOriginalFilename().split("\\.")[1];

        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(path.resolve(name).toFile()));
        stream.write(file.getBytes());
        stream.close();
        //return directoryName.substring(54) + "/" + name;
        return directoryName + "/" + name;
    }
    //create directory
    private String createDirectory(String directoryName) {
        Path path = Paths.get(directoryName);
        if (!path.toFile().exists()) {
            path.toFile().mkdir();
        }
        //create directory theo ngày
        LocalDate localDate = LocalDate.now();
        path = Paths.get(directoryName, localDate.toString());
        if (!path.toFile().exists()) {
            path.toFile().mkdir();
        }
        return path.toString();
    }
}
