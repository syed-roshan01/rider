package v3;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.util.Date;
import java.util.Map;
import o5.c;
import q5.h;
import q5.i;
import r5.m;
import s5.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements b, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15891c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f15889a = i10;
        this.f15890b = obj;
        this.f15891c = obj2;
    }

    @Override // s5.b
    public final Object b() {
        int i10 = this.f15889a;
        Object obj = this.f15891c;
        Object obj2 = this.f15890b;
        switch (i10) {
            case 1:
                Iterable iterable = (Iterable) obj;
                m mVar = (m) ((i) obj2).f13180c;
                mVar.getClass();
                if (iterable.iterator().hasNext()) {
                    mVar.a().compileStatement("DELETE FROM events WHERE _id in " + m.p(iterable)).execute();
                }
                break;
            default:
                i iVar = (i) obj2;
                iVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long jIntValue = ((Integer) entry.getValue()).intValue();
                    c cVar = c.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    m mVar2 = (m) iVar.f13186i;
                    mVar2.getClass();
                    mVar2.e(new h(str, jIntValue, cVar));
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f15889a;
        Object obj = this.f15891c;
        Object obj2 = this.f15890b;
        switch (i10) {
            case 3:
                return ((ConfigFetchHandler) obj2).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) obj, task);
            case 4:
                return ((ConfigFetchHandler) obj2).lambda$fetchNowWithTypeAndAttemptNumber$1((Map) obj, task);
            default:
                return ((ConfigRealtimeHttpClient) obj2).lambda$beginRealtimeHttpStream$1((Task) obj, task);
        }
    }
}
