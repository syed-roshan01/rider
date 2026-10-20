package b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b0.l0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.ServiceStarter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import i3.a0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k5.n;
import m0.l3;
import r5.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements d.c, s5.b, r5.k, Deferred.DeferredHandler, Continuation, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2290b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f2289a = i10;
        this.f2290b = obj;
    }

    @Override // d.c
    public final void a(Object obj) {
        ((c9.c) ((l3) this.f2290b).getValue()).invoke(obj);
    }

    @Override // r5.k
    public final Object apply(Object obj) {
        URL url;
        j5.c cVar;
        int i10 = this.f2289a;
        Object obj2 = this.f2290b;
        switch (i10) {
            case 3:
                j5.d dVar = (j5.d) obj2;
                j5.b bVar = (j5.b) obj;
                dVar.getClass();
                URL url2 = bVar.f8378a;
                String strConcat = "TRuntime.".concat("CctTransportBackend");
                if (Log.isLoggable(strConcat, 4)) {
                    Log.i(strConcat, String.format("Making request to: %s", url2));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f8378a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f8390g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = bVar.f8380c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    try {
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                                try {
                                    dVar.f8384a.encode(bVar.f8379b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                                    gZIPOutputStream.close();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    int responseCode = httpURLConnection.getResponseCode();
                                    Integer numValueOf = Integer.valueOf(responseCode);
                                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                                    if (Log.isLoggable(strConcat2, 4)) {
                                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                                    }
                                    y3.e.Z("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                                    y3.e.Z("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                        cVar = new j5.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                    } else {
                                        if (responseCode != 200) {
                                            return new j5.c(responseCode, null, 0L);
                                        }
                                        InputStream inputStream = httpURLConnection.getInputStream();
                                        try {
                                            InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                            try {
                                                cVar = new j5.c(responseCode, null, n.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f9849a);
                                                if (gZIPInputStream != null) {
                                                    gZIPInputStream.close();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                            } catch (Throwable th) {
                                                if (gZIPInputStream == null) {
                                                    throw th;
                                                }
                                                try {
                                                    gZIPInputStream.close();
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            if (inputStream == null) {
                                                throw th3;
                                            }
                                            try {
                                                inputStream.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                                throw th3;
                                            }
                                        }
                                    }
                                    return cVar;
                                } catch (Throwable th5) {
                                    try {
                                        gZIPOutputStream.close();
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th7) {
                                if (outputStream == null) {
                                    throw th7;
                                }
                                try {
                                    outputStream.close();
                                    throw th7;
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                    throw th7;
                                }
                            }
                        } catch (EncodingException | IOException e4) {
                            y3.e.d0("CctTransportBackend", "Couldn't encode request, returning with 400", e4);
                            return new j5.c(400, null, 0L);
                        }
                    } catch (ConnectException | UnknownHostException e10) {
                        e = e10;
                        url = null;
                        y3.e.d0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                        return new j5.c(ServiceStarter.ERROR_UNKNOWN, url, 0L);
                    }
                } catch (ConnectException | UnknownHostException e11) {
                    e = e11;
                    url = null;
                    y3.e.d0("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new j5.c(ServiceStarter.ERROR_UNKNOWN, url, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                i5.c cVar2 = m.f13502f;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j10));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j10), hashSet);
                    }
                    hashSet.add(new r5.l(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // s5.b
    public final Object b() {
        int i10 = this.f2289a;
        int i11 = 0;
        Object obj = this.f2290b;
        switch (i10) {
            case 4:
                m mVar = (m) ((r5.d) obj);
                return Integer.valueOf(((Integer) mVar.e(new r5.f(mVar, ((t5.c) mVar.f13504b).a() - mVar.f13506d.f13478d))).intValue());
            case 5:
                m mVar2 = (m) ((q5.i) obj).f13186i;
                mVar2.getClass();
                mVar2.e(new r5.h(mVar2, i11));
                return null;
            case 6:
                m mVar3 = (m) ((r5.c) obj);
                mVar3.getClass();
                int i12 = o5.a.f12522e;
                int i13 = 4;
                a0 a0Var = new a0(4);
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = mVar3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    o5.a aVar = (o5.a) m.q(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new p5.b(mVar3, map, a0Var, i13));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                q5.k kVar = (q5.k) obj;
                m mVar4 = (m) kVar.f13197b;
                mVar4.getClass();
                Iterator it = ((Iterable) mVar4.e(new l0(13))).iterator();
                while (it.hasNext()) {
                    ((q5.c) kVar.f13198c).a((l5.j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        ((FirebaseAuthCredentialsProvider) this.f2290b).lambda$new$1(provider);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4((ConfigFetchHandler.FetchResponse) this.f2290b, (ConfigContainer) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f2289a;
        Object obj = this.f2290b;
        switch (i10) {
            case 12:
                return ((Transaction) obj).lambda$lookup$0(task);
            default:
                return FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) obj, task);
        }
    }
}
