package com.test.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class SwagConfig {
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                //要扫描的API(Controller)基础包
                .apis(RequestHandlerSelectors.basePackage("com.test.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @param
     * @return springfox.documentation.service.ApiInfo
     * @Title: 构建API基本信息
     * @methodName: buildApiInfo
     * @Description:
     * @author: 王延飞
     * @date: 2017-12-11  8:44
     */
    private ApiInfo buildApiInfo() {

        return new ApiInfoBuilder()
                .title("API文档")
                .description("调试测试功能")
                .contact("杨苗苗")
                .version("1.0")
                .build();

    }
}
