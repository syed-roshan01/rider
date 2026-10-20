package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import i5.c;
import i5.e;
import j5.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import l.z2;
import l5.j;
import l5.l;
import l5.s;
import l5.u;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(ComponentContainer componentContainer) {
        Set setSingleton;
        byte[] bytes;
        u.b((Context) componentContainer.get(Context.class));
        u uVarA = u.a();
        a aVar = a.f8375e;
        uVarA.getClass();
        if (aVar instanceof l) {
            aVar.getClass();
            setSingleton = Collections.unmodifiableSet(a.f8374d);
        } else {
            setSingleton = Collections.singleton(new c("proto"));
        }
        z2 z2VarA = j.a();
        aVar.getClass();
        z2VarA.L("cct");
        String str = aVar.f8376a;
        String str2 = aVar.f8377b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            Object[] objArr = new Object[4];
            objArr[0] = "1$";
            objArr[1] = str;
            objArr[2] = "\\";
            if (str2 == null) {
                str2 = "";
            }
            objArr[3] = str2;
            bytes = String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
        }
        z2VarA.f10984c = bytes;
        return new s(setSingleton, z2VarA.j(), uVarA);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(e.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new l7.a(5)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
