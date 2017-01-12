package cn.imeth.ctg.template.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Adi(adi@imeth.cn) on 2017/1/12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TemplateProcessor {
    /**
     * 签名
     * @return
     */
    String value();
}
