package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/12/5
 */
@RestController
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req) {
        String realPath =
                req.getSession().getServletContext().getRealPath("/uploadFile/");
        String format = sdf.format(new Date());
        File folder = new File(realPath + format);
        String filePath="";
        if (!folder.isDirectory()) {
            folder.mkdirs();
            String oldName = uploadFile.getOriginalFilename();
            assert oldName != null;
            String newName = UUID.randomUUID().toString() +
                    oldName.substring(oldName.lastIndexOf("."), oldName.length());
            try {
                uploadFile.transferTo(new File(folder, newName));
                filePath = req.getScheme() + "://" + req.getServerName() + ":" +
                        req.getServerPort() + "/uploadFile/" + format + newName;

            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败! ";
            }
        }
        return filePath;
    }


//    @PostMapping("/uploads")
//    @ResponseBody
//    public String uploads(HttpServletRequest  request){
//
//        List<MultipartFile> fileList=((MultipartHttpServletRequest) request).getFiles("file");
//
//        MultipartFile file=null;
//        for (int i=0;i<fileList.size();i++){
//            file=fileList.get(i);
//            if (!file.isEmpty()){
//                try{
//                    //获取原始名称
//                    String fileName=file.getOriginalFilename();
//                    //获取后缀名
//                    assert fileName != null;
//                    //String suffixName=fileName.substring(fileName.lastIndexOf("."));
//                    //文件保存路径
//                    String filePath="/Users/nol/IdeaProjects/backend/demo1/src/main/resources/static";
//                    //文件重命名,防止重复
//                    fileName=filePath+ UUID.randomUUID()+fileName;
//                    //文件对象
//                    File dest=new File(fileName);
//                    //判断路径是否存在,如果不存在则创建
//                    //如果不判断文件是否存在，会报路径不存在异常
//                    if (!dest.getParentFile().exists()){
//                        dest.getParentFile().mkdir();
//                    }
//                    //保存到服务器当中
//                    file.transferTo(dest);
//                }catch (IOException e){
//                    e.printStackTrace();
//                    return "上传失败";
//                }
//            }else {
//                return "上传失败";
//            }
//        }
//        return "上传成功";
//    }


    @PostMapping("/fileUpload")
    public String fileUpload(MultipartFile file) throws IOException {

        file.transferTo(new File("/Users/nol/IdeaProjects/backend/demo1/src/main/resources/static"+ file.getOriginalFilename()));
        return "ok";//返回字符串
    }
}

