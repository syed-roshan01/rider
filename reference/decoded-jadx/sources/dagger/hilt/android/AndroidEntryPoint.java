package dagger.hilt.android;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@GeneratesRootInput
public @interface AndroidEntryPoint {
    Class<?> value() default Void.class;
}
