package y3;

import androidx.compose.ui.draw.C0029;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.TreeMap;
import o8.C0371;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16888d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f16892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TreeMap f16893i;

    public c(String str, String str2, long j10, int i10, int i11, int i12, int[] iArr, TreeMap treeMap) {
        this.f16885a = str;
        this.f16886b = str2;
        this.f16887c = j10;
        this.f16889e = i10;
        this.f16890f = i11;
        this.f16891g = i12;
        this.f16892h = iArr;
        this.f16893i = treeMap;
        int iM568 = C0029.m568();
        int i13 = 1616;
        while (true) {
            i13 ^= 1633;
            switch (i13) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM568 >= 0) {
                        i13 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Integer.decode(C0371.m7286("TnITM")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i13 = 1678;
        }
    }
}
