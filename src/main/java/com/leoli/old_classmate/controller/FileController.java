package com.leoli.old_classmate.controller;

import com.leoli.old_classmate.model.Result;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class FileController {

    @PostMapping(value = "/api/v1/upload/file")
    @ResponseBody
    public Result fileUpload(@RequestPart List<MultipartFile> files){
        if (!CollectionUtils.isEmpty(files)) {
            files.forEach(file -> {
                System.out.println(file.getOriginalFilename());
                System.out.println(file.getSize());
            });
        }
        return Result.OK;
    }
}
