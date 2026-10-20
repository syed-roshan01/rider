package u1;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class t3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(o9.c cVar, Handler handler, int i10) {
        super(handler);
        this.f15302a = i10;
        this.f15303b = cVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f15302a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        int i10 = this.f15302a;
        Object obj = this.f15303b;
        switch (i10) {
            case 0:
                ((o9.g) obj).n(q8.l.f13235a);
                break;
            case 1:
            default:
                super.onChange(z10, uri);
                break;
            case 2:
                ((i3.x) obj).c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(f3.a aVar) {
        super(new Handler());
        this.f15302a = 1;
        this.f15303b = aVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f15302a) {
            case 1:
                f3.a aVar = (f3.a) this.f15303b;
                if (aVar.f6137b && (cursor = aVar.f6138c) != null && !cursor.isClosed()) {
                    aVar.f6136a = aVar.f6138c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z10);
                break;
        }
    }
}
