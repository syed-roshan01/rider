package s3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f13920f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f13921g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13923b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f13924c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13925d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f13926e;

    public c(Context context) {
        this.f13922a = context;
        this.f13926e = new a(this, context.getMainLooper());
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f13920f) {
            try {
                if (f13921g == null) {
                    f13921g = new c(context.getApplicationContext());
                }
                cVar = f13921g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean b(Intent intent) {
        ArrayList arrayList;
        int i10;
        String str;
        boolean z10;
        String str2;
        synchronized (this.f13923b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f13922a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = true;
                boolean z12 = false;
                Object[] objArr = (intent.getFlags() & 8) != 0;
                if (objArr != false) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f13924c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (objArr != false) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        b bVar = (b) arrayList2.get(i11);
                        if (objArr != false) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f13916a);
                        }
                        if (bVar.f13918c) {
                            if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i10 = i11;
                            str = action;
                            z10 = z11;
                        } else {
                            String str3 = action;
                            arrayList = arrayList2;
                            i10 = i11;
                            str = action;
                            z10 = z11;
                            int iMatch = bVar.f13916a.match(str3, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (objArr != false) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(bVar);
                                bVar.f13918c = z10;
                            } else if (objArr != false) {
                                if (iMatch == -4) {
                                    str2 = "category";
                                } else if (iMatch == -3) {
                                    str2 = "action";
                                } else if (iMatch != -2) {
                                    str2 = iMatch != -1 ? "unknown reason" : "type";
                                } else {
                                    str2 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                                }
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                            }
                        }
                        i11 = i10 + 1;
                        z11 = z10;
                        arrayList2 = arrayList;
                        action = str;
                        z12 = false;
                    }
                    boolean z13 = z11;
                    if (arrayList3 != null) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            ((b) arrayList3.get(i12)).f13918c = false;
                        }
                        this.f13925d.add(new t(9, intent, arrayList3));
                        if (!this.f13926e.hasMessages(z13 ? 1 : 0)) {
                            this.f13926e.sendEmptyMessage(z13 ? 1 : 0);
                        }
                        return z13;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
