package a4;

import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q implements ea.b0, f2.o, q4.m {
    public q() {
        new e2.b();
        e2.c cVar = new e2.c();
        cVar.f5088a = e2.a.f5080a;
        cVar.f5089b = e2.a.f5081b;
        cVar.f5090c = 0;
    }

    public static final String d(q qVar, InputStream inputStream) throws UnsupportedEncodingException {
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        qVar.getClass();
        if (inputStream == null) {
            return "";
        }
        bufferedInputStream = new BufferedInputStream(inputStream);
        byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Exception unused) {
                }
            }
            bufferedInputStream.close();
            String string = byteArrayOutputStream.toString("UTF-8");
            d7.a.l(string, "toString(...)");
            return string;
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            bufferedInputStream.close();
        } catch (Exception unused3) {
        }
        String string2 = byteArrayOutputStream.toString("UTF-8");
        d7.a.l(string2, "toString(...)");
        return string2;
    }

    public static h8.t e(int i10) {
        return new h8.t(new ja.g(), Math.min(1048576, Math.max(4096, i10)));
    }

    public static float f(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
        return f16 < 0.0f ? -f16 : f16;
    }

    public static float g(float f10, float f11, float f12, float f13) {
        return (f10 * f13) - (f11 * f12);
    }

    public static long h() {
        return e1.r.f5061c;
    }

    public static e1.z i(List list) {
        return new e1.z(list, d9.i.f(0.0f, 0.0f), d9.i.f(Float.POSITIVE_INFINITY, 0.0f), 0);
    }

    public static e1.e0 j(List list, float f10, int i10) {
        long j10 = (i10 & 2) != 0 ? d1.c.f4328d : 0L;
        if ((i10 & 4) != 0) {
            f10 = Float.POSITIVE_INFINITY;
        }
        return new e1.e0(list, j10, f10, 0);
    }

    public static e1.z n(List list) {
        return new e1.z(list, d9.i.f(0.0f, 0.0f), d9.i.f(0.0f, Float.POSITIVE_INFINITY), 0);
    }

    @Override // q4.m
    public q4.d a(q4.c cVar) {
        return null;
    }

    @Override // q4.m
    public void b(int i10) {
    }

    @Override // q4.m
    public void c(q4.c cVar, Bitmap bitmap, Map map, int i10) {
    }

    public void k() {
    }

    public void l(View view, int i10, int i11) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object m(String str, String str2, String str3, boolean z10, u8.e eVar) throws Throwable {
        a5.b bVar;
        if (eVar instanceof a5.b) {
            bVar = (a5.b) eVar;
            int i10 = bVar.f1224c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f1224c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new a5.b(this, eVar);
            }
        } else {
            bVar = new a5.b(this, eVar);
        }
        Object objU0 = bVar.f1222a;
        v8.a aVar = v8.a.f15963a;
        int i11 = bVar.f1224c;
        if (i11 == 0) {
            d7.t.v0(objU0);
            t9.c cVar = m9.m0.f11970b;
            a5.c cVar2 = new a5.c(this, str, str2, str3, z10, null);
            bVar.f1224c = 1;
            objU0 = z6.a.u0(cVar, cVar2, bVar);
            if (objU0 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d7.t.v0(objU0);
        }
        return ((q8.h) objU0).f13229a;
    }

    public q(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        k();
    }
}
