package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import d7.a;
import d7.t;
import d9.f;
import java.util.ArrayList;
import java.util.List;
import r8.p;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends SQLiteOpenHelper {
    public static final zzax zza = new zzax(null);
    private static final int zzb = zzax.zzb("18.4.0");
    private static zzaz zzc;

    public /* synthetic */ zzaz(Context context, f fVar) {
        super(context, "cesdb", (SQLiteDatabase.CursorFactory) null, zzb);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(p.K0(list, ", ", "(", ")", zzay.zza, 24)), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        int i10 = -1;
        try {
            if (cursorRawQuery.moveToNext()) {
                i10 = cursorRawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            cursorRawQuery.close();
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [r8.r] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        ?? arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss"));
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts"));
                    a.j(string);
                    arrayList.add(new zzba(string, j10, i10));
                } catch (Exception unused) {
                    arrayList = r.f13661a;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final boolean zzf(zzba zzbaVar) {
        return zza(t.d0(zzbaVar)) == 1;
    }
}
