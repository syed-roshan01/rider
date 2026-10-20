package l8;

import com.google.protobuf.b2;
import com.google.protobuf.l0;
import com.google.protobuf.t1;
import e8.n1;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f11388d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f11389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f11390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11391c;

    public b(l0 l0Var) {
        e.J(l0Var, "defaultInstance cannot be null");
        this.f11390b = l0Var;
        this.f11389a = l0Var.getParserForType();
        this.f11391c = -1;
    }
}
