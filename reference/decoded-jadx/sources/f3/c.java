package f3;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import l.n2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f6143a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((n2) this.f6143a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorG;
        n2 n2Var = (n2) this.f6143a;
        if (charSequence == null) {
            string = "";
        } else {
            n2Var.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = n2Var.f10853r;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = n2Var.g(n2Var.f10854s, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e4) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e4);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f6143a;
        Cursor cursor = ((a) bVar).f6138c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((n2) bVar).b((Cursor) obj);
    }
}
