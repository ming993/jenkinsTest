package framework.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EnableSwagger2
@Configuration
@EnableKnife4j
public class Swagger2Config {

    @Bean("设备管理")
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Device")
                .ignoredParameterTypes(ApiIgnore.class)
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .select()
                .apis(requestHandler -> {
                    String packageName = requestHandler.getHandlerMethod().getMethod()
                            .getDeclaringClass().getPackage().getName();
                    return packageName.startsWith("com.ev.apis.controller");
                })
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                ;
    }

    @Bean("车间MES")
    public Docket createRest2Api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Mes")
                .ignoredParameterTypes(ApiIgnore.class)
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .select()
                .apis(requestHandler -> {
                    String packageName = requestHandler.getHandlerMethod().getMethod()
                            .getDeclaringClass().getPackage().getName();
                    return packageName.startsWith("com.ev.apis.controller")
                            && packageName.contains(".mes");
                })
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                ;
    }

    @Bean("供应链管理SCM")
    public Docket createRestScmApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Scm")
                .ignoredParameterTypes(ApiIgnore.class)
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .select()
                .apis(requestHandler -> {
                    String packageName = requestHandler.getHandlerMethod().getMethod()
                            .getDeclaringClass().getPackage().getName();
                    return packageName.startsWith("com.ev.apis.controller")
                            && packageName.contains(".scm");
                })
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                ;
    }
    @Bean("财务管理")
    public Docket createRestFMApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Fm")
                .ignoredParameterTypes(ApiIgnore.class)
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .select()
                .apis(requestHandler -> {
                    String packageName = requestHandler.getHandlerMethod().getMethod()
                            .getDeclaringClass().getPackage().getName();
                    return packageName.startsWith("com.ev.apis.controller")
                            && packageName.contains(".fm");
                })
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                ;
    }
    @Bean("HR管理")
    public Docket createRestHRApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("HR")
                .ignoredParameterTypes(ApiIgnore.class)
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .select()
                .apis(requestHandler -> {
                    String packageName = requestHandler.getHandlerMethod().getMethod()
                            .getDeclaringClass().getPackage().getName();
                    return packageName.startsWith("com.ev.apis.controller")
                            && packageName.contains(".hr");
                })
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                ;
    }
//    private ApiInfo apiInfo(String name,String description,String version) {
//        ApiInfo apiInfo = new ApiInfoBuilder().title(name).description(description).version(version).build();
//        return apiInfo;
//    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("新发企管系统web端接口")
                //创建人
                .contact(new Contact("xinsoft", "", ""))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(
                null,// url
                "none",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering => schema
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
                false,        // enableJsonEditor      => true | false
                true);
    }
}