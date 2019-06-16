package net.asifhossain.csvimporter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping("/file")
public class FileUploadController {
    @GetMapping("/upload")
    String showFileUploadForm() {
        return "fileUploadForm";
    }

    @PostMapping("/upload")
    String saveUploadedFile(@RequestParam("file") MultipartFile file) throws Exception {
        File targetFile = new File(System.getProperty("java.io.tmpdir") + "/" + System.currentTimeMillis() + file.getOriginalFilename());
        file.transferTo(targetFile);
        System.out.println(targetFile.getAbsolutePath());

        return "fileUploadForm";
    }
}
