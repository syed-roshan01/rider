package i3;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.internal.measurement.zzpg;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import e8.c2;
import g8.l3;
import i7.b1;
import i7.h1;
import i7.t1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import k6.l4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements FragmentComponentBuilder, ViewComponentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7944d;

    public /* synthetic */ a0(y4.n nVar, y4.j jVar, y4.h hVar) {
        this.f7941a = nVar;
        this.f7942b = jVar;
        this.f7943c = hVar;
    }

    public final void a(e7.f fVar, Object obj, h1 h1Var, boolean z10) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentMap) this.f7942b) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (fVar == null && obj == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (h1Var.E() != b1.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) this.f7942b;
        Integer numValueOf = Integer.valueOf(h1Var.C());
        if (h1Var.D() == t1.RAW) {
            numValueOf = null;
        }
        v6.b bVarA = d7.k.f4898b.a(d7.s.a(h1Var.B().C(), h1Var.B().D(), h1Var.B().B(), h1Var.D(), numValueOf));
        int iOrdinal = h1Var.D().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(h1Var.C()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(h1Var.C()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(h1Var.C()).array();
        } else {
            bArrArray = v6.b.f15905a;
        }
        v6.n nVar = new v6.n(fVar, obj, bArrArray, h1Var.E(), h1Var.D(), h1Var.C(), h1Var.B().C(), bVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar);
        byte[] bArr = nVar.f15924c;
        v6.o oVar = new v6.o(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentMap.put(oVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(nVar);
            concurrentMap.put(oVar, Collections.unmodifiableList(arrayList2));
        }
        if (z10) {
            if (((v6.n) this.f7943c) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f7943c = nVar;
        }
    }

    public final e7.m b() {
        Integer num = (Integer) this.f7941a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f7942b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((e7.k) this.f7943c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((e7.l) this.f7944d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f7941a));
        }
        int iIntValue = ((Integer) this.f7942b).intValue();
        e7.k kVar = (e7.k) this.f7943c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
        }
        if (kVar == e7.k.f5170b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (kVar == e7.k.f5171c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (kVar == e7.k.f5172d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (kVar == e7.k.f5173e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (kVar != e7.k.f5174f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new e7.m(((Integer) this.f7941a).intValue(), ((Integer) this.f7942b).intValue(), (e7.l) this.f7944d, (e7.k) this.f7943c);
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public final FragmentComponent build() {
        z6.a.g(androidx.fragment.app.d0.class, (androidx.fragment.app.d0) this.f7944d);
        return new y4.k((y4.n) this.f7941a, (y4.j) this.f7942b, (y4.h) this.f7943c);
    }

    public final void c(c2 c2Var) {
        synchronized (this.f7941a) {
            try {
                if (((c2) this.f7943c) != null) {
                    return;
                }
                this.f7943c = c2Var;
                boolean zIsEmpty = ((Collection) this.f7942b).isEmpty();
                if (zIsEmpty) {
                    ((l3) this.f7944d).D.f(c2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(d7.b bVar) throws GeneralSecurityException {
        d7.v vVar = new d7.v(bVar.f4884b, bVar.f4883a);
        if (!((Map) this.f7942b).containsKey(vVar)) {
            ((Map) this.f7942b).put(vVar, bVar);
            return;
        }
        d7.b bVar2 = (d7.b) ((Map) this.f7942b).get(vVar);
        if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + vVar);
    }

    public final void e(d7.d dVar) throws GeneralSecurityException {
        d7.w wVar = new d7.w(dVar.f4886a, dVar.f4887b);
        if (!((Map) this.f7941a).containsKey(wVar)) {
            ((Map) this.f7941a).put(wVar, dVar);
            return;
        }
        d7.d dVar2 = (d7.d) ((Map) this.f7941a).get(wVar);
        if (dVar2.equals(dVar) && dVar.equals(dVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + wVar);
    }

    public final void f(d7.l lVar) throws GeneralSecurityException {
        d7.v vVar = new d7.v(lVar.f4901b, lVar.f4900a);
        if (!((Map) this.f7944d).containsKey(vVar)) {
            ((Map) this.f7944d).put(vVar, lVar);
            return;
        }
        d7.l lVar2 = (d7.l) ((Map) this.f7944d).get(vVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + vVar);
    }

    @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public final FragmentComponentBuilder fragment(androidx.fragment.app.d0 d0Var) {
        d0Var.getClass();
        this.f7944d = d0Var;
        return this;
    }

    public final void g(d7.m mVar) throws GeneralSecurityException {
        d7.w wVar = new d7.w(mVar.f4902a, mVar.f4903b);
        if (!((Map) this.f7943c).containsKey(wVar)) {
            ((Map) this.f7943c).put(wVar, mVar);
            return;
        }
        d7.m mVar2 = (d7.m) ((Map) this.f7943c).get(wVar);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + wVar);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    public final Bundle h() {
        byte b10;
        if (((Bundle) this.f7943c) == null) {
            String string = ((l4) this.f7944d).s().getString((String) this.f7941a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b10 = 3;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b10 != 3) {
                                if (b10 != 4) {
                                    ((l4) this.f7944d).zzj().f9964f.c("Unrecognized persisted bundle type. Type", string3);
                                } else if (zzpg.zza() && ((l4) this.f7944d).h().v(null, k6.x.D0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    long[] jArr = new long[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        jArr[i11] = jSONArray2.optLong(i11);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            } else if (zzpg.zza() && ((l4) this.f7944d).h().v(null, k6.x.D0)) {
                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                int length2 = jSONArray3.length();
                                int[] iArr = new int[length2];
                                for (int i12 = 0; i12 < length2; i12++) {
                                    iArr[i12] = jSONArray3.optInt(i12);
                                }
                                bundle.putIntArray(string2, iArr);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            ((l4) this.f7944d).zzj().f9964f.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f7943c = bundle;
                } catch (JSONException unused2) {
                    ((l4) this.f7944d).zzj().f9964f.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f7943c) == null) {
                this.f7943c = (Bundle) this.f7942b;
            }
        }
        return (Bundle) this.f7943c;
    }

    public final void i(Bundle bundle) {
        Iterator<String> it;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        SharedPreferences.Editor editorEdit = ((l4) this.f7944d).s().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove((String) this.f7941a);
        } else {
            String str = (String) this.f7941a;
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        if (zzpg.zza()) {
                            it = it2;
                            try {
                                if (((l4) this.f7944d).h().v(null, k6.x.D0)) {
                                    if (obj instanceof String) {
                                        jSONObject.put("v", String.valueOf(obj));
                                        jSONObject.put("t", "s");
                                    } else if (obj instanceof Long) {
                                        jSONObject.put("v", String.valueOf(obj));
                                        jSONObject.put("t", "l");
                                    } else if (obj instanceof int[]) {
                                        jSONObject.put("v", Arrays.toString((int[]) obj));
                                        jSONObject.put("t", "ia");
                                    } else if (obj instanceof long[]) {
                                        jSONObject.put("v", Arrays.toString((long[]) obj));
                                        jSONObject.put("t", "la");
                                    } else if (obj instanceof Double) {
                                        jSONObject.put("v", String.valueOf(obj));
                                        jSONObject.put("t", "d");
                                    } else {
                                        ((l4) this.f7944d).zzj().f9964f.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                    }
                                    jSONArray.put(jSONObject);
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                ((l4) this.f7944d).zzj().f9964f.c("Cannot serialize bundle value to SharedPreferences", e);
                            }
                            it2 = it;
                        } else {
                            it = it2;
                        }
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else {
                            if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                ((l4) this.f7944d).zzj().f9964f.c("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        e = e10;
                        it = it2;
                    }
                    it2 = it;
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f7943c = bundle2;
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public final ViewComponentBuilder view(View view) {
        view.getClass();
        this.f7944d = view;
        return this;
    }

    public a0(int i10) {
        if (i10 == 4) {
            this.f7941a = null;
            this.f7942b = new ArrayList();
            this.f7943c = null;
            this.f7944d = "";
            return;
        }
        switch (i10) {
            case 7:
                this.f7941a = null;
                this.f7942b = null;
                this.f7943c = null;
                this.f7944d = w6.j.f16212d;
                break;
            case 8:
                this.f7941a = null;
                this.f7942b = null;
                this.f7943c = null;
                this.f7944d = w6.n.f16224d;
                break;
            case 9:
                this.f7941a = new HashMap();
                this.f7942b = new HashMap();
                this.f7943c = new HashMap();
                this.f7944d = new HashMap();
                break;
            case 10:
                this.f7941a = null;
                this.f7942b = null;
                this.f7943c = null;
                this.f7944d = e7.l.f5179e;
                break;
            default:
                this.f7941a = new q.f();
                this.f7942b = new SparseArray();
                this.f7943c = new q.l();
                this.f7944d = new q.f();
                break;
        }
    }

    @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
    /* JADX INFO: renamed from: build, reason: collision with other method in class */
    public final ViewComponent mo6133build() {
        z6.a.g(View.class, (View) this.f7944d);
        return new y4.l();
    }

    public a0(d7.x xVar) {
        this.f7941a = new HashMap(xVar.f4922a);
        this.f7942b = new HashMap(xVar.f4923b);
        this.f7943c = new HashMap(xVar.f4924c);
        this.f7944d = new HashMap(xVar.f4925d);
    }

    public a0(Typeface typeface, j3.b bVar) {
        int i10;
        int i11;
        this.f7944d = typeface;
        this.f7941a = bVar;
        this.f7943c = new z(1024);
        j3.b bVar2 = (j3.b) this.f7941a;
        int iA = bVar2.a(6);
        if (iA != 0) {
            int i12 = iA + bVar2.f8335a;
            i10 = bVar2.f8336b.getInt(bVar2.f8336b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f7942b = new char[i10 * 2];
        j3.b bVar3 = (j3.b) this.f7941a;
        int iA2 = bVar3.a(6);
        if (iA2 != 0) {
            int i13 = iA2 + bVar3.f8335a;
            i11 = bVar3.f8336b.getInt(bVar3.f8336b.getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            d0 d0Var = new d0(this, i14);
            j3.a aVarC = d0Var.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? aVarC.f8336b.getInt(iA3 + aVarC.f8335a) : 0, (char[]) this.f7942b, i14 * 2);
            if (d0Var.b() > 0) {
                ((z) this.f7943c).a(d0Var, 0, d0Var.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public a0(l4 l4Var, String str) {
        this.f7944d = l4Var;
        f6.a.u(str);
        this.f7941a = str;
        this.f7942b = new Bundle();
    }
}
