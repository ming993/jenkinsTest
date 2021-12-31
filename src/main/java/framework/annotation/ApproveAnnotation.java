package framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 尹恒星
 * @date 2020/11/24
 */
//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApproveAnnotation {
    /**
     * 数字；
     * 文本；
     * 参数；
     * 日期；
     * @return
     */
    String dataType() default "";
    /**
     * 页面显示属性的中文名称
     * 例如：请假申请中的createBy，为“创建人”
     * @return
     */
    String name() default "";

    /**
     * 参数类型
     * 固定；实体类；数据字典
     * @return
     */
    String parameterType() default "";

    /**
     * 参数类型为固定时必填，如固定的[{"id":0,"text":"是"},{"id":1,"text":"否"}]用中文“、”隔开
     * @return
     */
    String parameterContentFixed() default "";

    /**
     * 参数类型为系统中实体类时必填，如客户“Custome,id（后台传值）,name（下拉框显示）”
     * @return
     */
    String parameterContentEntity() default "";

    /**
     * 参数类型为数据字典时必填，如客户“leave_apply_type,id（后台传值）,name（下拉框显示）”
     * @return
     */
    String parameterContentDictionary() default "";

}