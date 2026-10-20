package j1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import o1.s;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f8328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8329b = 0;

    public a(XmlResourceParser xmlResourceParser) {
        this.f8328a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (s.S(this.f8328a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f8329b = i10 | this.f8329b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return d7.a.d(this.f8328a, aVar.f8328a) && this.f8329b == aVar.f8329b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8329b) + (this.f8328a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f8328a);
        sb.append(", config=");
        return a7.a.o(sb, this.f8329b, ')');
    }
}
