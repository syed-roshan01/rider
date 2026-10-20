package m4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.MimeTypeMap;
import d7.t;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import r8.p;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f11830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.n f11831c;

    public /* synthetic */ b(Uri uri, s4.n nVar, int i10) {
        this.f11829a = i10;
        this.f11830b = uri;
        this.f11831c = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    @Override // m4.g
    public final Object a(u8.e eVar) throws FileNotFoundException {
        ArrayList arrayList;
        Iterable iterableJ0;
        Object objL0;
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        int i10 = this.f11829a;
        Uri uri = this.f11830b;
        s4.n nVar = this.f11831c;
        switch (i10) {
            case 0:
                List<String> pathSegments2 = uri.getPathSegments();
                d7.a.m(pathSegments2, "<this>");
                if (pathSegments2 instanceof Collection) {
                    List<String> list = pathSegments2;
                    int size2 = list.size() - 1;
                    if (size2 <= 0) {
                        iterableJ0 = r.f13661a;
                    } else if (size2 == 1) {
                        if (pathSegments2 instanceof List) {
                            objL0 = p.L0(pathSegments2);
                        } else {
                            Iterator<T> it = pathSegments2.iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException("Collection is empty.");
                            }
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            objL0 = next;
                        }
                        iterableJ0 = t.d0(objL0);
                    } else {
                        arrayList = new ArrayList(size2);
                        if (pathSegments2 instanceof List) {
                            if (pathSegments2 instanceof RandomAccess) {
                                int size3 = list.size();
                                for (int i11 = 1; i11 < size3; i11++) {
                                    arrayList.add(pathSegments2.get(i11));
                                }
                            } else {
                                ListIterator<String> listIterator = pathSegments2.listIterator(1);
                                while (listIterator.hasNext()) {
                                    arrayList.add(listIterator.next());
                                }
                            }
                            iterableJ0 = arrayList;
                        }
                    }
                    String strK0 = p.K0(iterableJ0, "/", null, null, null, 62);
                    return new n(new k4.r(r9.a.c(r9.a.o(nVar.f14022a.getAssets().open(strK0))), new k4.a(strK0)), w4.e.b(MimeTypeMap.getSingleton(), strK0), k4.f.f9756c);
                }
                arrayList = new ArrayList();
                int i12 = 0;
                for (Object obj : pathSegments2) {
                    if (i12 >= 1) {
                        arrayList.add(obj);
                    } else {
                        i12++;
                    }
                }
                iterableJ0 = t.j0(arrayList);
                String strK1 = p.K0(iterableJ0, "/", null, null, null, 62);
                return new n(new k4.r(r9.a.c(r9.a.o(nVar.f14022a.getAssets().open(strK1))), new k4.a(strK1)), w4.e.b(MimeTypeMap.getSingleton(), strK1), k4.f.f9756c);
            default:
                ContentResolver contentResolver = nVar.f14022a.getContentResolver();
                if (d7.a.d(uri.getAuthority(), "com.android.contacts") && d7.a.d(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && d7.a.d(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && d7.a.d(pathSegments.get(size - 3), "audio") && d7.a.d(pathSegments.get(size - 2), "albums")) {
                    t4.f fVar = nVar.f14025d;
                    f6.a aVar = fVar.f14658a;
                    t4.a aVar2 = aVar instanceof t4.a ? (t4.a) aVar : null;
                    if (aVar2 != null) {
                        f6.a aVar3 = fVar.f14659b;
                        t4.a aVar4 = aVar3 instanceof t4.a ? (t4.a) aVar3 : null;
                        if (aVar4 != null) {
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(aVar2.f14647z, aVar4.f14647z));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new n(new k4.r(r9.a.c(r9.a.o(inputStreamOpenInputStream)), new k4.a(uri)), contentResolver.getType(uri), k4.f.f9756c);
        }
    }
}
