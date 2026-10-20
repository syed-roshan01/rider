package n4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d7.t;
import java.util.List;
import m9.d0;
import s4.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f12201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f12202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12206f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f12207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f12208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f12209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f12210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i4.e f12211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s4.j f12212s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, a aVar, n nVar, List list, i4.e eVar, s4.j jVar, u8.e eVar2) {
        super(2, eVar2);
        this.f12207n = iVar;
        this.f12208o = aVar;
        this.f12209p = nVar;
        this.f12210q = list;
        this.f12211r = eVar;
        this.f12212s = jVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        h hVar = new h(this.f12207n, this.f12208o, this.f12209p, this.f12210q, this.f12211r, this.f12212s, eVar);
        hVar.f12206f = obj;
        return hVar;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        n nVar;
        Bitmap bitmapA;
        List list;
        int size;
        int i10;
        v8.a aVar = v8.a.f15963a;
        int i11 = this.f12205e;
        i4.e eVar = this.f12211r;
        a aVar2 = this.f12208o;
        if (i11 == 0) {
            t.v0(obj);
            d0Var = (d0) this.f12206f;
            Drawable drawable = aVar2.f12144a;
            this.f12207n.getClass();
            boolean z10 = drawable instanceof BitmapDrawable;
            nVar = this.f12209p;
            if (z10) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (b9.b.F(config, w4.e.f16163a)) {
                    bitmapA = bitmap;
                } else {
                    bitmapA = w4.g.a(drawable, nVar.f14023b, nVar.f14025d, nVar.f14026e, nVar.f14027f);
                }
            } else {
                bitmapA = w4.g.a(drawable, nVar.f14023b, nVar.f14025d, nVar.f14026e, nVar.f14027f);
            }
            eVar.getClass();
            list = this.f12210q;
            size = list.size();
            i10 = 0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f12204d;
            int i12 = this.f12203c;
            nVar = this.f12202b;
            list = this.f12201a;
            d0Var = (d0) this.f12206f;
            t.v0(obj);
            bitmapA = (Bitmap) obj;
            h6.g.S(d0Var.q());
            i10 = i12 + 1;
        }
        if (i10 >= size) {
            eVar.getClass();
            return new a(new BitmapDrawable(this.f12212s.f13995a.getResources(), bitmapA), aVar2.f12145b, aVar2.f12146c, aVar2.f12147d);
        }
        a7.a.w(list.get(i10));
        t4.f fVar = nVar.f14025d;
        this.f12206f = d0Var;
        this.f12201a = list;
        this.f12202b = nVar;
        this.f12203c = i10;
        this.f12204d = size;
        this.f12205e = 1;
        throw null;
    }
}
