package l3;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11240d;

    public c(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }

    public static c a(long j10, ByteOrder byteOrder) {
        long[] jArr = {j10};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(byteBufferWrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        byteBufferWrap.putInt((int) eVar2.f11245a);
        byteBufferWrap.putInt((int) eVar2.f11246b);
        return new c(byteBufferWrap.array(), 5, 1);
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i10}[0]);
        return new c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f11245a / eVar.f11246b;
    }

    public final int e(ByteOrder byteOrder) {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i10 < jArr.length) {
                sb.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i10 < iArr.length) {
                sb.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i10 < dArr.length) {
                sb.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i10 < eVarArr.length) {
            sb.append(eVarArr[i10].f11245a);
            sb.append('/');
            sb.append(eVarArr[i10].f11246b);
            i10++;
            if (i10 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:166:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.io.Serializable, l3.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.io.Serializable, l3.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v30, types: [double[], java.io.Serializable] */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        byte b10;
        byte[] bArr = this.f11240d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.f11234b = byteOrder;
                    int i10 = this.f11237a;
                    int length = 0;
                    int i11 = this.f11238b;
                    switch (i10) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                String str = new String(bArr, g.N);
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b10 + 48)});
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i11 >= g.F.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = g.F;
                                    if (i12 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            try {
                                while (length < i11) {
                                    byte b11 = bArr[length];
                                    if (b11 == 0) {
                                        String string = sb.toString();
                                        bVar.close();
                                        return string;
                                    }
                                    if (b11 >= 32) {
                                        sb.append((char) b11);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                bVar.close();
                                break;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            String string2 = sb.toString();
                            return string2;
                        case 3:
                            ?? r14 = new int[i11];
                            while (length < i11) {
                                r14[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return r14;
                        case 4:
                            ?? r15 = new long[i11];
                            while (length < i11) {
                                r15[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r15;
                        case 5:
                            ?? r16 = new e[i11];
                            while (length < i11) {
                                r16[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r16;
                        case 8:
                            ?? r17 = new int[i11];
                            while (length < i11) {
                                r17[length] = bVar.readShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e15) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return r17;
                        case 9:
                            ?? r18 = new int[i11];
                            while (length < i11) {
                                r18[length] = bVar.readInt();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e16) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                            }
                            return r18;
                        case 10:
                            ?? r19 = new e[i11];
                            while (length < i11) {
                                r19[length] = new e(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e17) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                            return r19;
                        case 11:
                            ?? r110 = new double[i11];
                            while (length < i11) {
                                r110[length] = bVar.readFloat();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e18) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                            }
                            return r110;
                        case 12:
                            ?? r111 = new double[i11];
                            while (length < i11) {
                                r111[length] = bVar.readDouble();
                                length++;
                            }
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e19) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                            return r111;
                        default:
                            try {
                                bVar.close();
                                break;
                            } catch (IOException e20) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                            }
                            return null;
                    }
                } catch (IOException e21) {
                    e = e21;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e22) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e23) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                    }
                }
                throw th;
            }
        } catch (IOException e24) {
            e = e24;
            bVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + g.D[this.f11237a] + ", data length:" + this.f11240d.length + ")";
    }

    public c(long j10, byte[] bArr, int i10, int i11) {
        this.f11237a = i10;
        this.f11238b = i11;
        this.f11239c = j10;
        this.f11240d = bArr;
    }
}
