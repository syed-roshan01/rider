package z;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v extends d9.j implements c9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f17147b = new v(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f17148c = new v(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17149a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10) {
        super(1);
        this.f17149a = i10;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        switch (this.f17149a) {
            case 0:
                return q8.l.f13235a;
            default:
                List list = (List) obj;
                return new g0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
