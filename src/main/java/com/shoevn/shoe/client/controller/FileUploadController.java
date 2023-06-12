package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

@RestController
public class FileUploadController {
    @Autowired
    UploadFileService storageService;

    @GetMapping("/avatar/{url:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getFileByUrl(@PathVariable String url) {
        Resource file = storageService.loadByUrl(url,"avatar");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }



    @GetMapping("/upload/{directory}/{url:.+}")
    @ResponseBody
    public ResponseEntity<String> getFileByUrl(@PathVariable String url,
                                                 @PathVariable String directory
    ) throws IOException {
        Resource file = storageService.loadByUrl(directory+'/'+url,"upload");

        // Create an EncodedResource object from the resource
        EncodedResource encodedResource = new EncodedResource(file);

        // Get an input stream to the resource
        InputStream inputStream = encodedResource.getInputStream();

        // Encode the input stream to a Base64 string
        String base64String = Base64.getEncoder().encodeToString(inputStream.readAllBytes());

        // Print the Base64 string
        //System.out.println(base64String);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(base64String);
    }

}
