package com.jiaopi404.demos0.sourceCodes.annotation;

import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * SpringBoot2 ComponentScan 注解的源码，定义扫描装配Bean
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
// @Repeatable(ComponentScans.class)
public @interface ComponentScan {
    // 定义扫描的包
    @AliasFor("basePackages")
    String[] value() default {}; // 不定义时，只扫描当前包及其子包下的路径

    // 定义扫描的包
    @AliasFor("value")
    String[] basePackages() default {};

    // 定义扫描的类
    Class<?>[] basePackageClasses() default {};

    // Bean name 生成器
    Class<? extends BeanNameGenerator> nameGenerator() default BeanNameGenerator.class;

    // 作用域解析器
    Class<? extends ScopeMetadataResolver> scopeResolver() default ScopeMetadataResolver.class;

    // 作用域代理模式
    ScopedProxyMode scopedProxy() default ScopedProxyMode.DEFAULT;

    // 资源匹配模式
    String resourcePattern() default "**/*.class";

    // 是否启用默认的过滤器
    boolean useDefaultFilters() default true;

    // 当满足过滤器的条件时扫描
    Filter[] includeFilters() default {};

    // 当不满足过滤器条件时扫描
    Filter[] excludeFilters() default {};

    // 是否延迟初始化
    boolean lazyInit() default false;

    // 定义过滤器
    @Retention(RetentionPolicy.RUNTIME)
    @Target({})
    @interface Filter {
        // 过滤器类型，可以按注解类型或者正则式等过滤
        FilterType type() default FilterType.ANNOTATION;

        // 定义过滤的类
        @AliasFor("classes")
        Class<?>[] value() default {};

        // 定义过滤的类
        @AliasFor("value")
        Class<?>[] classes() default {};

        // 匹配方式
        String[] pattern() default {};
    }
}
