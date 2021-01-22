package com.xg.renting.until;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

public class FileUtil {

    //获取文件后缀
    public static String fileExtensionName (MultipartFile file){
        //获取文件名称,包含后缀
        String fileName = file.getOriginalFilename();
        //获取后缀
        return fileName.substring(fileName.lastIndexOf(".")+1);
    }


    //文件上传
    public static String upload (MultipartFile file) {
        File targetFile = new File("F:/img/");
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        //获取后缀
        String fileExtensionName = fileExtensionName(file);
        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;
        File localFile = new File("F:/img/", uploadFileName);
        if (!file.isEmpty()) {
            try {
                file.transferTo(localFile);
            } catch (Exception e) {
                return "error";
            }
        }
        return "/img/"+uploadFileName; //上传成功
    }

    //文件删除
    public static String deleteFile(String filepath) {
        File file = new File("F:" + filepath);
        //删除文件
        if (file.exists()) {
            if (file.delete()) {
                return "success";
            }
        }
        return "error";
    }
}
