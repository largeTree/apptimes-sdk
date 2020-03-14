package com.qiuxs.apptimes.request.anno;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.qiuxs.cuteframework.core.basic.utils.DateFormatUtils;

@Retention(RUNTIME)
@Target(FIELD)
public @interface ApiField {

	String value();

	String format() default DateFormatUtils.yyyy_MM_dd;

}
