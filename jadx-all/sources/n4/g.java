package n4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d7.t;
import i4.o;
import java.util.LinkedHashMap;
import m9.d0;
import s4.n;
import s4.q;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f12194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s4.j f12195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f12197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i4.e f12198f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q4.c f12199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f12200o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, s4.j jVar, Object obj, n nVar, i4.e eVar, q4.c cVar, l lVar, u8.e eVar2) {
        super(2, eVar2);
        this.f12194b = iVar;
        this.f12195c = jVar;
        this.f12196d = obj;
        this.f12197e = nVar;
        this.f12198f = eVar;
        this.f12199n = cVar;
        this.f12200o = lVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new g(this.f12194b, this.f12195c, this.f12196d, this.f12197e, this.f12198f, this.f12199n, this.f12200o, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        q4.f fVar;
        Bitmap bitmap;
        boolean z10;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12193a;
        if (i10 == 0) {
            t.v0(obj);
            i iVar = this.f12194b;
            s4.j jVar = this.f12195c;
            Object obj2 = this.f12196d;
            n nVar = this.f12197e;
            i4.e eVar = this.f12198f;
            this.f12193a = 1;
            obj = i.b(iVar, jVar, obj2, nVar, eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        a aVar2 = (a) obj;
        q4.e eVar2 = this.f12194b.f12215c;
        eVar2.getClass();
        boolean z11 = this.f12195c.f14014t.f13933b;
        q4.c cVar = this.f12199n;
        if (!z11 || (fVar = (q4.f) ((o) eVar2.f13134a).f8058b.getValue()) == null || cVar == null) {
            z10 = false;
        } else {
            Drawable drawable = aVar2.f12144a;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z10 = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar2.f12145b));
                String str = aVar2.f12147d;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                fVar.f13136a.c(new q4.c(cVar.f13130a, y3.e.G0(cVar.f13131b)), bitmap, y3.e.G0(linkedHashMap));
                z10 = true;
            }
        }
        Drawable drawable2 = aVar2.f12144a;
        s4.j jVar2 = this.f12195c;
        k4.f fVar2 = aVar2.f12146c;
        q4.c cVar2 = z10 ? cVar : null;
        String str2 = aVar2.f12147d;
        boolean z12 = aVar2.f12145b;
        Bitmap.Config[] configArr = w4.e.f16163a;
        l lVar = this.f12200o;
        return new q(drawable2, jVar2, fVar2, cVar2, str2, z12, (lVar instanceof l) && lVar.f12227g);
    }
}
