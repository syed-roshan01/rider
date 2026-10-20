package o9;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f12687a = new k(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12688b = r9.a.r("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12689c = r9.a.r("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i3.u f12690d = new i3.u("BUFFERED", 5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i3.u f12691e = new i3.u("SHOULD_BUFFER", 5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i3.u f12692f = new i3.u("S_RESUMING_BY_RCV", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i3.u f12693g = new i3.u("RESUMING_BY_EB", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i3.u f12694h = new i3.u("POISONED", 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i3.u f12695i = new i3.u("DONE_RCV", 5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i3.u f12696j = new i3.u("INTERRUPTED_SEND", 5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i3.u f12697k = new i3.u("INTERRUPTED_RCV", 5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i3.u f12698l = new i3.u("CHANNEL_CLOSED", 5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i3.u f12699m = new i3.u("SUSPEND", 5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i3.u f12700n = new i3.u("SUSPEND_NO_WAITER", 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i3.u f12701o = new i3.u("FAILED", 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i3.u f12702p = new i3.u("NO_RECEIVE_RESULT", 5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i3.u f12703q = new i3.u("CLOSE_HANDLER_CLOSED", 5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i3.u f12704r = new i3.u("CLOSE_HANDLER_INVOKED", 5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i3.u f12705s = new i3.u("NO_CLOSE_CAUSE", 5);

    public static final boolean a(m9.k kVar, Object obj, c9.c cVar) {
        i3.u uVarK = kVar.k(obj, cVar);
        if (uVarK == null) {
            return false;
        }
        kVar.x(uVarK);
        return true;
    }
}
