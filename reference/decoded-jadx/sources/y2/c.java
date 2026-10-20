package y2;

import a4.c0;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l.p;
import l.q;
import m0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f16851a = new r(3);

    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    public static c0 a(Context context, p pVar) throws Throwable {
        Object[] objArr;
        Cursor cursor;
        ArrayList arrayList;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) pVar.f10889c;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(q.x("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) pVar.f10890d;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList2 = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList2.add(signature.toByteArray());
        }
        r rVar = f16851a;
        Collections.sort(arrayList2, rVar);
        List listD = (List) pVar.f10892f;
        if (listD == null) {
            listD = i1.b.D(resources, pVar.f10888b);
        }
        int i10 = 0;
        loop1: while (true) {
            objArr = null;
            if (i10 >= listD.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList3 = new ArrayList((Collection) listD.get(i10));
            Collections.sort(arrayList3, rVar);
            if (arrayList2.size() == arrayList3.size()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList2.get(i11), (byte[]) arrayList3.get(i11))) {
                        break;
                    }
                    i11++;
                }
            }
            i10++;
        }
        int i12 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new c0(i12, objArr);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList4 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str4).appendPath("file").build();
        try {
            Cursor cursorA = b.a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) pVar.f10891e}, null, null);
            if (cursorA != null) {
                try {
                    if (cursorA.getCount() > 0) {
                        int columnIndex = cursorA.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorA.getColumnIndex("_id");
                        int columnIndex3 = cursorA.getColumnIndex("file_id");
                        int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorA.getColumnIndex("font_weight");
                        int columnIndex6 = cursorA.getColumnIndex("font_italic");
                        while (cursorA.moveToNext()) {
                            arrayList.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorA.getInt(columnIndex) : 0));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                arrayList = arrayList4;
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return new c0(0, (h[]) arrayList.toArray(new h[0]));
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
