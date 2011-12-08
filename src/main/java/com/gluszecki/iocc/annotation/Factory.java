/**
 * 
 */
package com.gluszecki.iocc.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.gluszecki.iocc.context.Context;

/**
 * @author cthulhu
 *
 */
@Target(value = { ElementType.METHOD })
@Retention(RUNTIME)
public @interface Factory {
	
	String name() default "";

	// String namespace() default Context.DEFAULT_NAMESPACE;
	
	Scope scope() default @Scope();

}
