package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import l.v0;
import l.z2;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f8224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f8225f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f8226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f8227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8229d;

    static {
        Class[] clsArr = {Context.class};
        f8224e = clsArr;
        f8225f = clsArr;
    }

    public e(Context context) {
        super(context);
        this.f8228c = context;
        Object[] objArr = {context};
        this.f8226a = objArr;
        this.f8227b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        ColorStateList colorStateList;
        d dVar = new d(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z11) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    e eVar = dVar.D;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = eVar.f8228c.obtainStyledAttributes(attributeSet, f.a.f5576l);
                        dVar.f8199b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        dVar.f8200c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        dVar.f8201d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        dVar.f8202e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        dVar.f8203f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        dVar.f8204g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = eVar.f8228c;
                        z2 z2Var = new z2(i11, context, context.obtainStyledAttributes(attributeSet, f.a.f5577m));
                        dVar.f8206i = z2Var.z(2, 0);
                        dVar.f8207j = (z2Var.v(5, dVar.f8200c) & (-65536)) | (z2Var.v(6, dVar.f8201d) & 65535);
                        dVar.f8208k = z2Var.C(7);
                        dVar.f8209l = z2Var.C(8);
                        dVar.f8210m = z2Var.z(0, 0);
                        String strB = z2Var.B(9);
                        dVar.f8211n = strB == null ? (char) 0 : strB.charAt(0);
                        dVar.f8212o = z2Var.v(16, 4096);
                        String strB2 = z2Var.B(10);
                        dVar.f8213p = strB2 == null ? (char) 0 : strB2.charAt(0);
                        dVar.f8214q = z2Var.v(20, 4096);
                        if (z2Var.D(11)) {
                            dVar.f8215r = z2Var.p(11, false) ? 1 : 0;
                        } else {
                            dVar.f8215r = dVar.f8202e;
                        }
                        dVar.f8216s = z2Var.p(3, false);
                        dVar.f8217t = z2Var.p(4, dVar.f8203f);
                        dVar.f8218u = z2Var.p(1, dVar.f8204g);
                        dVar.f8219v = z2Var.v(21, -1);
                        dVar.f8222y = z2Var.B(12);
                        dVar.f8220w = z2Var.z(13, 0);
                        dVar.f8221x = z2Var.B(15);
                        String strB3 = z2Var.B(14);
                        boolean z12 = strB3 != null;
                        if (z12 && dVar.f8220w == 0 && dVar.f8221x == null) {
                            a7.a.w(dVar.a(strB3, f8225f, eVar.f8227b));
                        } else if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        dVar.f8223z = z2Var.C(17);
                        dVar.A = z2Var.C(22);
                        if (z2Var.D(19)) {
                            dVar.C = v0.c(z2Var.v(19, -1), dVar.C);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            dVar.C = null;
                        }
                        if (z2Var.D(18)) {
                            dVar.B = z2Var.q(18);
                        } else {
                            dVar.B = colorStateList;
                        }
                        z2Var.K();
                        dVar.f8205h = false;
                    } else if (name2.equals("menu")) {
                        dVar.f8205h = true;
                        SubMenu subMenuAddSubMenu = dVar.f8198a.addSubMenu(dVar.f8199b, dVar.f8206i, dVar.f8207j, dVar.f8208k);
                        dVar.b(subMenuAddSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        str = name2;
                        z11 = true;
                    }
                }
                z10 = z10;
            } else if (eventType != 3) {
                z10 = z10;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z11 && name3.equals(str)) {
                    z11 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        dVar.f8199b = 0;
                        dVar.f8200c = 0;
                        dVar.f8201d = 0;
                        dVar.f8202e = 0;
                        dVar.f8203f = true;
                        dVar.f8204g = true;
                    } else if (name3.equals("item")) {
                        if (!dVar.f8205h) {
                            dVar.f8205h = true;
                            dVar.b(dVar.f8198a.add(dVar.f8199b, dVar.f8206i, dVar.f8207j, dVar.f8208k));
                        }
                    } else if (name3.equals("menu")) {
                        z10 = true;
                    }
                    z10 = z10;
                }
            }
            eventType = xmlResourceParser.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof w2.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f8228c.getResources().getLayout(i10);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
