package f1;

import b0.l0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f6028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f6029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f6030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f6031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f6032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f6033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f6034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f6035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f6036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f6037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f6038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f6039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f6040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f6041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f6042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f6043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f6044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f6045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q f6046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f6047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d[] f6048u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f6028a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f6029b = fArr2;
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar = j.f6062d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f6030c = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f6031d = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new l0(6), new l0(7), -0.799f, 2.399f, rVar, 2);
        f6032e = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f6033f = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f6034g = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f6035h = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f6036i = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f6037j = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f6059a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f6038k = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f6039l = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f6040m = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f6060b, new r(1.8d, 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0.0625d, 0.031248d), 11);
        f6041n = qVar12;
        s sVar2 = j.f6061c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f6042o = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f6043p = qVar14;
        t tVar = new t("Generic XYZ", c.f6021b, 14);
        f6044q = tVar;
        long j10 = c.f6022c;
        k kVar = new k("Generic L*a*b*", j10, 15);
        f6045r = kVar;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f6046s = qVar15;
        l lVar = new l("Oklab", j10, 17);
        f6047t = lVar;
        f6048u = new d[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, tVar, kVar, qVar15, lVar};
    }
}
