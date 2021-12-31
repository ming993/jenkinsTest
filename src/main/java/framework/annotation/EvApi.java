package framework.annotation;

import io.swagger.annotations.ApiOperation;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * @author yunian
 * @date 2018/6/18
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
@ApiOperation("")
public @interface EvApi {
    @AliasFor(
            annotation = RequestMapping.class,
            attribute = "method"
    )
    RequestMethod[] method() default {};

    @AliasFor(
            annotation = RequestMapping.class,
            attribute = "path"
    )
    String[] path() default {};

    @AliasFor(
            annotation = RequestMapping.class,
            attribute = "value"
    )
    String[] value() default {};

    @AliasFor(
            annotation = ApiOperation.class,
            attribute = "value"
    )
    String apiTitle() default "";

    @AliasFor(
            annotation = RequestMapping.class,
            attribute = "headers"
    )
    String[] headers() default {};

    @AliasFor(
            annotation = RequestMapping.class,
            attribute = "consumes"
    )
    String[] contentType() default {};

    @AliasFor(
            annotation = RequestMapping.class,
            attribute = "produces"
    )
    String[] accept() default {};
}
