package h8;

import g8.d6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    static {
        Logger.getLogger(w.class.getName());
    }

    public static byte[][] a(List list) {
        int size = list.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            j8.c cVar = (j8.c) it.next();
            int i11 = i10 + 1;
            bArr[i10] = cVar.f8451a.s();
            i10 += 2;
            bArr[i11] = cVar.f8452b.s();
        }
        Logger logger = d6.f6732a;
        int i12 = 0;
        while (i12 < size) {
            byte[] bArr2 = bArr[i12];
            int i13 = i12 + 1;
            byte[] bArr3 = bArr[i13];
            byte[] bArr4 = d6.f6733b;
            if (d6.a(bArr2, bArr4)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        ArrayList arrayList = new ArrayList(size + 10);
                        for (int i14 = 0; i14 < i12; i14++) {
                            arrayList.add(bArr[i14]);
                        }
                        while (i12 < size) {
                            byte[] bArr5 = bArr[i12];
                            byte[] bArr6 = bArr[i12 + 1];
                            if (d6.a(bArr5, bArr4)) {
                                int i15 = 0;
                                for (int i16 = 0; i16 <= bArr6.length; i16++) {
                                    if (i16 == bArr6.length || bArr6[i16] == 44) {
                                        byte[] bArrA = s6.e.f14057c.a(new String(bArr6, i15, i16 - i15, q6.d.f13203a));
                                        arrayList.add(bArr5);
                                        arrayList.add(bArrA);
                                        i15 = i16 + 1;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i12 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i13] = s6.e.f14057c.a(new String(bArr3, q6.d.f13203a));
            }
            i12 += 2;
        }
        return bArr;
    }
}
