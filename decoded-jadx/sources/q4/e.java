package q4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import i4.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.z2;
import r8.s;
import r8.v;
import s4.n;
import s4.q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4.i f13134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f13135b;

    public e(i4.i iVar, z2 z2Var) {
        this.f13134a = iVar;
        this.f13135b = z2Var;
    }

    public static q c(n4.l lVar, s4.j jVar, c cVar, d dVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f13995a.getResources(), dVar.f13132a);
        k4.f fVar = k4.f.f9754a;
        Map map = dVar.f13133b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = w4.e.f16163a;
        return new q(bitmapDrawable, jVar, fVar, cVar, str, zBooleanValue, (lVar instanceof n4.l) && lVar.f12227g);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00fe A[PHI: r16
  0x00fe: PHI (r16v1 q4.d) = (r16v0 q4.d), (r16v0 q4.d), (r16v2 q4.d) binds: [B:68:0x00fb, B:63:0x00ef, B:55:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r7 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (d7.a.d(r2, r20.toString()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        if (r7 != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d a(s4.j jVar, c cVar, t4.f fVar, t4.e eVar) {
        d dVarA;
        d dVar;
        if (!jVar.f14014t.f13932a) {
            return null;
        }
        f fVar2 = (f) ((o) this.f13134a).f8058b.getValue();
        if (fVar2 != null) {
            dVarA = fVar2.f13136a.a(cVar);
            if (dVarA == null) {
                dVarA = fVar2.f13137b.a(cVar);
            }
        } else {
            dVarA = null;
        }
        if (dVarA != null) {
            Bitmap bitmap = dVarA.f13132a;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            this.f13135b.getClass();
            if (config != Bitmap.Config.HARDWARE || jVar.f14011q) {
                Object obj = dVarA.f13133b.get("coil#is_sampled");
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (!d7.a.d(fVar, t4.f.f14657c)) {
                    String str = (String) cVar.f13131b.get("coil#transformation_size");
                    if (str == null) {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        f6.a aVar = fVar.f14658a;
                        int i10 = aVar instanceof t4.a ? ((t4.a) aVar).f14647z : Integer.MAX_VALUE;
                        f6.a aVar2 = fVar.f14659b;
                        int i11 = aVar2 instanceof t4.a ? ((t4.a) aVar2).f14647z : Integer.MAX_VALUE;
                        double dF = h6.g.f(width, height, i10, i11, eVar);
                        boolean zA = w4.d.a(jVar);
                        if (zA) {
                            double d10 = dF > 1.0d ? 1.0d : dF;
                            dVar = dVarA;
                            if (Math.abs(((double) i10) - (((double) width) * d10)) > 1.0d && Math.abs(((double) i11) - (d10 * ((double) height))) > 1.0d) {
                                if (dF != 1.0d) {
                                    if (zA) {
                                    }
                                }
                                if (dF > 1.0d) {
                                }
                            }
                        } else {
                            dVar = dVarA;
                            if ((!(i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE) && Math.abs(i10 - width) > 1) || (i11 != Integer.MIN_VALUE && i11 != Integer.MAX_VALUE && Math.abs(i11 - height) > 1)) {
                                if (dF != 1.0d) {
                                    if (zA) {
                                    }
                                }
                                if (dF > 1.0d) {
                                }
                            }
                        }
                    }
                }
                return dVar;
            }
        }
        return null;
    }

    public final c b(s4.j jVar, Object obj, n nVar, i4.e eVar) {
        String strA;
        Map linkedHashMap;
        c cVar = jVar.f13999e;
        if (cVar != null) {
            return cVar;
        }
        List list = ((o) this.f13134a).f8060d.f8025c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            q8.f fVar = (q8.f) list.get(i10);
            o4.b bVar = (o4.b) fVar.f13225a;
            if (((Class) fVar.f13226b).isAssignableFrom(obj.getClass())) {
                d7.a.k(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = bVar.a(obj, nVar);
                if (strA != null) {
                    break;
                }
            }
            i10++;
        }
        if (strA == null) {
            return null;
        }
        Map map = jVar.D.f14038a;
        boolean zIsEmpty = map.isEmpty();
        s sVar = s.f13662a;
        if (zIsEmpty) {
            linkedHashMap = sVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                a7.a.w(((Map.Entry) it.next()).getValue());
                throw null;
            }
        }
        List list2 = jVar.f14006l;
        if (list2.isEmpty() && linkedHashMap.isEmpty()) {
            return new c(strA, sVar);
        }
        LinkedHashMap linkedHashMapI0 = v.I0(linkedHashMap);
        if (!list2.isEmpty()) {
            if (list2.size() > 0) {
                a7.a.w(list2.get(0));
                throw null;
            }
            linkedHashMapI0.put("coil#transformation_size", nVar.f14025d.toString());
        }
        return new c(strA, linkedHashMapI0);
    }
}
