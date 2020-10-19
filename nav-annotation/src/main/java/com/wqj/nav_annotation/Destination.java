package com.wqj.nav_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author wenqingjie
 * @describe 自定义路由节点
 * @createTime 2020/10/19 5:42 PM
 * @fileName Destanition.java
 * @filePath nav-annotation/src/main/java/com/wqj/nav_annotation/Destanition.java
 * @modify
 * @email wqjuser@gmail.com
 */
@Target(ElementType.TYPE)
public @interface Destination {
    /**
     * 页面在路由中的名称
     *
     * @return
     */
    String pageUrl();

    /**
     * 是否作为路由中的第一个启动页
     *
     * @return
     */
    boolean asStater() default false;
}
