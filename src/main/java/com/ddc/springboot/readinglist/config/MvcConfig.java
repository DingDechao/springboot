package com.ddc.springboot.readinglist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 访问 /old 时 302 跳转到 /new
        registry.addRedirectViewController("/", "/readingList")
                .setStatusCode(HttpStatus.FOUND)   // 302（默认就是 302，可省略）
                .setKeepQueryParams(true)          // 把 ?a=1&b=2 带过去
                .setContextRelative(true);         // true=相对路径，false=绝对
    }
}
