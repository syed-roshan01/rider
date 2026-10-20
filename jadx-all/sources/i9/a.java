package i9;

import d7.t;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f8174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f8175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8176c = 1;

    public a(char c10, char c11) {
        this.f8174a = c10;
        this.f8175b = (char) t.Z(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f8174a, this.f8175b, this.f8176c);
    }
}
