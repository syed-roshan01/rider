package u1;

import android.os.Looper;
import android.view.Choreographer;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f15217b = new q0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q0 f15218c = new q0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f15219d = new q0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q0 f15220e = new q0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q0 f15221f = new q0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q0 f15222n = new q0(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q0 f15223o = new q0(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q0 f15224p = new q0(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q0 f15225q = new q0(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q0 f15226r = new q0(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q0 f15227s = new q0(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q0 f15228t = new q0(11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q0 f15229u = new q0(12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q0 f15230v = new q0(13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q0 f15231w = new q0(14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final q0 f15232x = new q0(15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q0 f15233y = new q0(16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final q0 f15234z = new q0(17);
    public static final q0 A = new q0(18);
    public static final q0 B = new q0(19);
    public static final q0 C = new q0(20);
    public static final q0 D = new q0(21);
    public static final q0 E = new q0(22);
    public static final q0 F = new q0(23);
    public static final q0 G = new q0(24);
    public static final q0 H = new q0(25);
    public static final q0 I = new q0(26);
    public static final q0 J = new q0(27);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10) {
        super(0);
        this.f15235a = i10;
    }

    @Override // c9.a
    public final Object invoke() {
        Choreographer choreographer;
        int i10 = this.f15235a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.FALSE;
                    default:
                        return Boolean.FALSE;
                }
            case 1:
                return Float.valueOf(0.0f);
            case 2:
                y0.b("LocalConfiguration");
                throw null;
            case 3:
                y0.b("LocalContext");
                throw null;
            case 4:
                y0.b("LocalImageVectorCache");
                throw null;
            case 5:
                y0.b("LocalLifecycleOwner");
                throw null;
            case 6:
                y0.b("LocalSavedStateRegistryOwner");
                throw null;
            case 7:
                y0.b("LocalView");
                throw null;
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    t9.d dVar = m9.m0.f11969a;
                    choreographer = (Choreographer) z6.a.d0(r9.o.f13724a, new b1(2, null));
                }
                e1 e1Var = new e1(choreographer, o1.s.r(Looper.getMainLooper()));
                return e1Var.O(e1Var.f15083s);
            case 9:
            case 10:
                return null;
            case 11:
                s1.b("LocalAutofillTree");
                throw null;
            case 12:
                s1.b("LocalClipboardManager");
                throw null;
            case 13:
                s1.b("LocalDensity");
                throw null;
            case Code.UNAVAILABLE /* 14 */:
                s1.b("LocalFocusManager");
                throw null;
            case 15:
                s1.b("LocalFontFamilyResolver");
                throw null;
            case Code.UNAUTHENTICATED /* 16 */:
                s1.b("LocalFontLoader");
                throw null;
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                s1.b("LocalHapticFeedback");
                throw null;
            case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                s1.b("LocalInputManager");
                throw null;
            case 19:
                s1.b("LocalLayoutDirection");
                throw null;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
            case 21:
            case 22:
                return null;
            case 23:
                s1.b("LocalTextToolbar");
                throw null;
            case 24:
                s1.b("LocalUriHandler");
                throw null;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                s1.b("LocalViewConfiguration");
                throw null;
            case 26:
                s1.b("LocalWindowInfo");
                throw null;
            default:
                switch (i10) {
                    case 0:
                        return Boolean.FALSE;
                    default:
                        return Boolean.FALSE;
                }
        }
    }
}
