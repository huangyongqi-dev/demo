/**
 * 
 */
package com.example.demo.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.example.demo.common.DynamicDataSourceEnum;

/**
 *
 * @author 黄永琦
 * @since 2021-01-12
 * @see
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSourceSelector {
    DynamicDataSourceEnum value() default DynamicDataSourceEnum.MASTER;

    boolean clear() default true;
}
