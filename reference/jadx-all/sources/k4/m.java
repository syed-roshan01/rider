package k4;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f9769a;

    static {
        String[] strArr = {"image/jpeg", "image/webp", "image/heic", "image/heif"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(z6.a.T(4));
        for (int i10 = 0; i10 < 4; i10++) {
            linkedHashSet.add(strArr[i10]);
        }
        f9769a = linkedHashSet;
    }
}
