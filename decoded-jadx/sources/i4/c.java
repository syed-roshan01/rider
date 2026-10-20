package i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import r8.p;
import x9.s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8027e;

    public c(List list, List list2, List list3, List list4, List list5) {
        this.f8023a = list;
        this.f8024b = list2;
        this.f8025c = list3;
        this.f8026d = list4;
        this.f8027e = list5;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b A[SYNTHETIC] */
    public final Object a(Object obj, s4.n nVar) throws PackageManager.NameNotFoundException {
        Object objWrap;
        String scheme;
        String str;
        String authority;
        List list = this.f8024b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            q8.f fVar = (q8.f) list.get(i10);
            p4.b bVar = (p4.b) fVar.f13225a;
            if (((Class) fVar.f13226b).isAssignableFrom(obj.getClass())) {
                d7.a.k(bVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Context context = nVar.f14022a;
                Object file = null;
                switch (((p4.a) bVar).f12765a) {
                    case 0:
                        objWrap = ByteBuffer.wrap((byte[]) obj);
                        if (objWrap != null) {
                            obj = objWrap;
                        }
                        break;
                    case 1:
                        Uri uri = (Uri) obj;
                        if (!w4.e.d(uri) && ((scheme = uri.getScheme()) == null || d7.a.d(scheme, "file"))) {
                            String path = uri.getPath();
                            str = path != null ? path : "";
                            if (str.length() > 0 && d7.a.u(str.charAt(0), '/', false) && ((String) p.H0(uri.getPathSegments())) != null) {
                                if (d7.a.d(uri.getScheme(), "file")) {
                                    String path2 = uri.getPath();
                                    if (path2 != null) {
                                        file = new File(path2);
                                    }
                                } else {
                                    file = new File(uri.toString());
                                }
                            }
                        }
                        objWrap = file;
                        if (objWrap != null) {
                            obj = objWrap;
                        }
                        break;
                    case 2:
                        objWrap = ((s) obj).f16463i;
                        if (objWrap != null) {
                            obj = objWrap;
                        }
                        break;
                    case 3:
                        int iIntValue = ((Number) obj).intValue();
                        try {
                            if (context.getResources().getResourceEntryName(iIntValue) != null) {
                                file = Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                        objWrap = file;
                        if (objWrap != null) {
                            obj = objWrap;
                        }
                        break;
                    case 4:
                        Uri uri2 = (Uri) obj;
                        if (d7.a.d(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !l9.i.R0(authority) && uri2.getPathSegments().size() == 2) {
                            String authority2 = uri2.getAuthority();
                            str = authority2 != null ? authority2 : "";
                            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
                            List<String> pathSegments = uri2.getPathSegments();
                            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                            if (identifier == 0) {
                                throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                            }
                            file = Uri.parse("android.resource://" + str + '/' + identifier);
                        }
                        objWrap = file;
                        if (objWrap != null) {
                            obj = objWrap;
                        }
                        break;
                    default:
                        objWrap = Uri.parse((String) obj);
                        if (objWrap != null) {
                            obj = objWrap;
                        }
                        break;
                }
            }
        }
        return obj;
    }
}
