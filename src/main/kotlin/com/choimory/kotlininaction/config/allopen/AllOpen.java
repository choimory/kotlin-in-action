package com.choimory.kotlininaction.config.allopen;

import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Target(allowedTargets = AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public @interface AllOpen {
}
