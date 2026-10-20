package m4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import k4.q;
import k4.r;
import o7.d0;
import org.xmlpull.v1.XmlPullParserException;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public final class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f11858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.n f11859b;

    public m(Uri uri, s4.n nVar) {
        this.f11858a = uri;
        this.f11859b = nVar;
    }

    @Override // m4.g
    public final Object a(u8.e eVar) throws XmlPullParserException, IOException {
        Integer numD0;
        Drawable drawableA;
        Uri uri = this.f11858a;
        String authority = uri.getAuthority();
        if (authority != null) {
            boolean z10 = true;
            if (!(!l9.i.R0(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) p.M0(uri.getPathSegments());
                if (str == null || (numD0 = l9.h.D0(str)) == null) {
                    throw new IllegalStateException("Invalid android.resource URI: " + uri);
                }
                int iIntValue = numD0.intValue();
                s4.n nVar = this.f11859b;
                Context context = nVar.f14022a;
                Resources resources = d7.a.d(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strB = w4.e.b(MimeTypeMap.getSingleton(), charSequence.subSequence(l9.i.S0(charSequence, '/', 0, 6), charSequence.length()).toString());
                if (!d7.a.d(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new n(new r(r9.a.c(r9.a.o(resources.openRawResource(iIntValue, typedValue2))), new q(typedValue2.density)), strB, k4.f.f9756c);
                }
                if (d7.a.d(authority, context.getPackageName())) {
                    drawableA = d0.C(context, iIntValue);
                    if (drawableA == null) {
                        throw new IllegalStateException(l.q.g("Invalid resource ID: ", iIntValue).toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = t2.n.f14622a;
                    drawableA = t2.i.a(resources, iIntValue, theme);
                    if (drawableA == null) {
                        throw new IllegalStateException(l.q.g("Invalid resource ID: ", iIntValue).toString());
                    }
                }
                if (!(drawableA instanceof VectorDrawable) && !(drawableA instanceof g4.c)) {
                    z10 = false;
                }
                if (z10) {
                    drawableA = new BitmapDrawable(context.getResources(), w4.g.a(drawableA, nVar.f14023b, nVar.f14025d, nVar.f14026e, nVar.f14027f));
                }
                return new d(drawableA, z10, k4.f.f9756c);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}
