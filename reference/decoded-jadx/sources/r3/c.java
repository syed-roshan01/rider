package r3;

import androidx.lifecycle.e1;
import androidx.lifecycle.f1;
import androidx.lifecycle.w;
import java.io.PrintWriter;
import q.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f13445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13446b;

    public c(w wVar, f1 f1Var) {
        this.f13445a = wVar;
        this.f13446b = (b) new e1(f1Var, b.f13443b).a(b.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        a0 a0Var = this.f13446b.f13444a;
        if (a0Var.f12977c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (a0Var.f12977c <= 0) {
                return;
            }
            a7.a.w(a0Var.f12976b[0]);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(a0Var.f12975a[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        w wVar = this.f13445a;
        if (wVar == null) {
            sb.append("null");
        } else {
            String simpleName = wVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = wVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(wVar)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
