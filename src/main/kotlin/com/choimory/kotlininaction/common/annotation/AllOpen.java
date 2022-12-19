package com.choimory.kotlininaction.common.annotation;

import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

/**
 * Kotlin All-Open 플러그인 타겟 Annotation
 */
@Target(allowedTargets = AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public @interface AllOpen {
}
