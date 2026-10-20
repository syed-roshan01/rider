package f3;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import l.l1;
import l.n2;
import l.q;
import u1.t3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f6138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t3 f6140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l1 f6141f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f6142n;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f6138c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                t3 t3Var = this.f6140e;
                if (t3Var != null) {
                    cursor2.unregisterContentObserver(t3Var);
                }
                l1 l1Var = this.f6141f;
                if (l1Var != null) {
                    cursor2.unregisterDataSetObserver(l1Var);
                }
            }
            this.f6138c = cursor;
            if (cursor != null) {
                t3 t3Var2 = this.f6140e;
                if (t3Var2 != null) {
                    cursor.registerContentObserver(t3Var2);
                }
                l1 l1Var2 = this.f6141f;
                if (l1Var2 != null) {
                    cursor.registerDataSetObserver(l1Var2);
                }
                this.f6139d = cursor.getColumnIndexOrThrow("_id");
                this.f6136a = true;
                notifyDataSetChanged();
            } else {
                this.f6139d = -1;
                this.f6136a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f6136a || (cursor = this.f6138c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f6136a) {
            return null;
        }
        this.f6138c.moveToPosition(i10);
        if (view == null) {
            n2 n2Var = (n2) this;
            view = n2Var.f10852q.inflate(n2Var.f10851p, viewGroup, false);
        }
        a(view, this.f6138c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f6142n == null) {
            c cVar = new c();
            cVar.f6143a = this;
            this.f6142n = cVar;
        }
        return this.f6142n;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f6136a || (cursor = this.f6138c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f6138c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f6136a && (cursor = this.f6138c) != null && cursor.moveToPosition(i10)) {
            return this.f6138c.getLong(this.f6139d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f6136a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f6138c.moveToPosition(i10)) {
            throw new IllegalStateException(q.g("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f6138c);
        return view;
    }
}
