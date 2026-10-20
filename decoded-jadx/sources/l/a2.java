package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10689a;

    public a2(SearchView searchView) {
        this.f10689a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        SearchView searchView = this.f10689a;
        Editable text = searchView.f1530w.getText();
        searchView.f1523f0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.t(!zIsEmpty);
        int i13 = 8;
        if (searchView.f1522e0 && !searchView.U && zIsEmpty) {
            searchView.B.setVisibility(8);
            i13 = 0;
        }
        searchView.D.setVisibility(i13);
        searchView.p();
        searchView.s();
        charSequence.toString();
        searchView.getClass();
    }
}
