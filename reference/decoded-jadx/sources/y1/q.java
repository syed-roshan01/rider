package y1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends d9.j implements c9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f16803b = new q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f16804c = new q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f16805d = new q(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f16806e = new q(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f16807f = new q(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f16808n = new q(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f16809o = new q(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f16810p = new q(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f16811q = new q(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f16812r = new q(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f16813s = new q(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f16814t = new q(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(2);
        this.f16815a = i10;
    }

    public final List a(List list, List list2) {
        switch (this.f16815a) {
            case 0:
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListY0 = r8.p.Y0(list);
                arrayListY0.addAll(list2);
                return arrayListY0;
            default:
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListY1 = r8.p.Y0(list);
                arrayListY1.addAll(list2);
                return arrayListY1;
        }
    }

    public final void b(q8.l lVar) {
        switch (this.f16815a) {
            case 1:
                return;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            default:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        q8.a aVar;
        int i10 = this.f16815a;
        switch (i10) {
            case 0:
                return a((List) obj, (List) obj2);
            case 1:
                q8.l lVar = (q8.l) obj;
                b(lVar);
                return lVar;
            case 2:
                q8.l lVar2 = (q8.l) obj;
                b(lVar2);
                return lVar2;
            case 3:
                q8.l lVar3 = (q8.l) obj;
                b(lVar3);
                return lVar3;
            case 4:
                String str2 = (String) obj;
                switch (i10) {
                    case 4:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str2;
                }
            case 5:
                g gVar = (g) obj;
                int i11 = ((g) obj2).f16757a;
                return gVar;
            case 6:
                String str3 = (String) obj;
                switch (i10) {
                    case 4:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str3;
                }
            case 7:
                return a((List) obj, (List) obj2);
            case 8:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 9:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 10:
                a aVar2 = (a) obj;
                a aVar3 = (a) obj2;
                if (aVar2 == null || (str = aVar2.f16745a) == null) {
                    str = aVar3.f16745a;
                }
                if (aVar2 == null || (aVar = aVar2.f16746b) == null) {
                    aVar = aVar3.f16746b;
                }
                return new a(str, aVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
