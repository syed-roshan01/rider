package dagger.hilt.android;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@GeneratesRootInput
@Retention(RetentionPolicy.RUNTIME)
public @interface HiltAndroidApp {
    Class<?> value() default Void.class;
}
