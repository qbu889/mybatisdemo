package com.example.demo.server;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

/**
 * Demo class
 *
 * @author nol
 * @deprecated 文件上传配置
 * @date 2022/12/6
 */

public class MultipartConfigElement {
    public javax.servlet.MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.of(30, DataUnit.MEGABYTES));
        factory.setMaxRequestSize(DataSize.of(30,DataUnit.MEGABYTES));
        return factory.createMultipartConfig();
    }
}