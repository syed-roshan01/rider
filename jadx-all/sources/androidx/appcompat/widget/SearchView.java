package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import b3.b0;
import b3.q0;
import com.ride.accepter.R;
import ga.i;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.a2;
import l.b2;
import l.c2;
import l.d2;
import l.e2;
import l.f2;
import l.g1;
import l.g2;
import l.h2;
import l.i1;
import l.i2;
import l.k2;
import l.k3;
import l.l2;
import l.n2;
import l.o;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends g1 implements j.b {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final i f1517n0;
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final View E;
    public l2 F;
    public final Rect G;
    public final Rect H;
    public final int[] I;
    public final int[] J;
    public final ImageView K;
    public final Drawable L;
    public final int M;
    public final int N;
    public final Intent O;
    public final Intent P;
    public final CharSequence Q;
    public View.OnFocusChangeListener R;
    public View.OnClickListener S;
    public boolean T;
    public boolean U;
    public f3.a V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f1518a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1519b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1520c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1521d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1522e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f1523f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1524g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1525h0;
    public SearchableInfo i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Bundle f1526j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b2 f1527k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final b2 f1528l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final WeakHashMap f1529m0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SearchAutoComplete f1530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f1531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f1532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f1533z;

    public static class SearchAutoComplete extends o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f1535f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1536n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final d f1537o;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1537o = new d(this);
            this.f1534e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            i iVar = SearchView.f1517n0;
            iVar.getClass();
            i.a();
            Method method = iVar.f7330c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1534e <= 0 || super.enoughToFilter();
        }

        @Override // l.o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1536n) {
                d dVar = this.f1537o;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f1535f;
            searchView.u(searchView.U);
            searchView.post(searchView.f1527k0);
            if (searchView.f1530w.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1535f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1535f.hasFocus() && getVisibility() == 0) {
                this.f1536n = true;
                Context context = getContext();
                i iVar = SearchView.f1517n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f1537o;
            if (!z10) {
                this.f1536n = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1536n = true;
                    return;
                }
                this.f1536n = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1535f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1534e = i10;
        }
    }

    static {
        i iVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            i iVar2 = new i();
            iVar2.f7328a = null;
            iVar2.f7329b = null;
            iVar2.f7330c = null;
            i.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                iVar2.f7328a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                iVar2.f7329b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                iVar2.f7330c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            iVar = iVar2;
        }
        f1517n0 = iVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1530w;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1520c0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1530w;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1520c0 = false;
    }

    public int getImeOptions() {
        return this.f1530w.getImeOptions();
    }

    public int getInputType() {
        return this.f1530w.getInputType();
    }

    public int getMaxWidth() {
        return this.f1521d0;
    }

    public CharSequence getQuery() {
        return this.f1530w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1518a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.Q : getContext().getText(this.i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.N;
    }

    public int getSuggestionRowLayout() {
        return this.M;
    }

    public f3.a getSuggestionsAdapter() {
        return this.V;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1523f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1526j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.i0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1526j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1530w;
        if (i10 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        i iVar = f1517n0;
        iVar.getClass();
        i.a();
        Method method = iVar.f7328a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        iVar.getClass();
        i.a();
        Method method2 = iVar.f7329b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f1530w;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.T) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i10) {
        int position;
        String strH;
        Cursor cursor = this.V.f6138c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentH = null;
            try {
                int i11 = n2.E;
                String strH2 = n2.h(cursor.getColumnIndex("suggest_intent_action"), cursor);
                if (strH2 == null) {
                    strH2 = this.i0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = n2.h(cursor.getColumnIndex("suggest_intent_data"), cursor);
                if (strH3 == null) {
                    strH3 = this.i0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = n2.h(cursor.getColumnIndex("suggest_intent_data_id"), cursor)) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentH = h(strH2, strH3 == null ? null : Uri.parse(strH3), n2.h(cursor.getColumnIndex("suggest_intent_extra_data"), cursor), n2.h(cursor.getColumnIndex("suggest_intent_query"), cursor));
            } catch (RuntimeException e4) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e4);
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intentH, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1530w;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i10) {
        Editable text = this.f1530w.getText();
        Cursor cursor = this.V.f6138c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String strC = this.V.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1530w;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.i0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1527k0);
        post(this.f1528l0);
        super.onDetachedFromWindow();
    }

    @Override // l.g1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int[] iArr = this.I;
            SearchAutoComplete searchAutoComplete = this.f1530w;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.J;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.G;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.H;
            rect2.set(i16, 0, i17, i18);
            l2 l2Var = this.F;
            if (l2Var == null) {
                l2 l2Var2 = new l2(rect2, rect, searchAutoComplete);
                this.F = l2Var2;
                setTouchDelegate(l2Var2);
            } else {
                l2Var.f10824b.set(rect2);
                Rect rect3 = l2Var.f10826d;
                rect3.set(rect2);
                int i19 = -l2Var.f10827e;
                rect3.inset(i19, i19);
                l2Var.f10825c.set(rect);
            }
        }
    }

    @Override // l.g1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.U) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f1521d0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1521d0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f1521d0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k2 k2Var = (k2) parcelable;
        super.onRestoreInstanceState(k2Var.f7543a);
        u(k2Var.f10820c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k2 k2Var = new k2(super.onSaveInstanceState());
        k2Var.f10820c = this.U;
        return k2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f1527k0);
    }

    public final void p() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1530w.getText());
        if (!z11 && (!this.T || this.f1524g0)) {
            z10 = false;
        }
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.C;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f1530w.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1532y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1533z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z10 = this.T;
        SearchAutoComplete searchAutoComplete = this.f1530w;
        CharSequence charSequence2 = charSequence;
        if (z10 && (drawable = this.L) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f1520c0 || !isFocusable()) {
            return false;
        }
        if (this.U) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f1530w.requestFocus(i10, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.f1533z.setVisibility(((this.W || this.f1522e0) && !this.U && (this.B.getVisibility() == 0 || this.D.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1526j0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f1530w;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        u(z10);
        r();
    }

    public void setImeOptions(int i10) {
        this.f1530w.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1530w.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1521d0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(g2 g2Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(h2 h2Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    public void setOnSuggestionListener(i2 i2Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1518a0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1519b0 = z10;
        f3.a aVar = this.V;
        if (aVar instanceof n2) {
            ((n2) aVar).f10858w = z10 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.i0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1530w;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.i0.getImeOptions());
            int inputType = this.i0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.i0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            f3.a aVar = this.V;
            if (aVar != null) {
                aVar.b(null);
            }
            if (this.i0.getSuggestAuthority() != null) {
                n2 n2Var = new n2(getContext(), this, this.i0, this.f1529m0);
                this.V = n2Var;
                searchAutoComplete.setAdapter(n2Var);
                ((n2) this.V).f10858w = this.f1519b0 ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.i0;
        boolean z10 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.i0.getVoiceSearchLaunchWebSearch()) {
                intent = this.O;
            } else if (this.i0.getVoiceSearchLaunchRecognizer()) {
                intent = this.P;
            }
            if (intent != null) {
                z10 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f1522e0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.U);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.W = z10;
        u(this.U);
    }

    public void setSuggestionsAdapter(f3.a aVar) {
        this.V = aVar;
        this.f1530w.setAdapter(aVar);
    }

    public final void t(boolean z10) {
        boolean z11 = this.W;
        this.B.setVisibility((!z11 || !(z11 || this.f1522e0) || this.U || !hasFocus() || (!z10 && this.f1522e0)) ? 8 : 0);
    }

    public final void u(boolean z10) {
        this.U = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1530w.getText());
        this.A.setVisibility(i11);
        t(!zIsEmpty);
        this.f1531x.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.K;
        imageView.setVisibility((imageView.getDrawable() == null || this.T) ? 8 : 0);
        p();
        if (this.f1522e0 && !this.U && zIsEmpty) {
            this.B.setVisibility(8);
            i10 = 0;
        }
        this.D.setVisibility(i10);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new int[2];
        this.J = new int[2];
        int i11 = 0;
        this.f1527k0 = new b2(this, i11);
        int i12 = 1;
        this.f1528l0 = new b2(this, i12);
        this.f1529m0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        e2 e2Var = new e2(this);
        f2 f2Var = new f2(this);
        i1 i1Var = new i1(this, i12);
        a2 a2Var = new a2(this);
        int[] iArr = f.a.f5581q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        z2 z2Var = new z2(i11, context, typedArrayObtainStyledAttributes);
        q0.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(z2Var.z(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1530w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1531x = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f1532y = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f1533z = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.A = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.K = imageView5;
        b0.q(viewFindViewById, z2Var.t(10));
        b0.q(viewFindViewById2, z2Var.t(14));
        imageView.setImageDrawable(z2Var.t(13));
        imageView2.setImageDrawable(z2Var.t(7));
        imageView3.setImageDrawable(z2Var.t(4));
        imageView4.setImageDrawable(z2Var.t(16));
        imageView5.setImageDrawable(z2Var.t(13));
        this.L = z2Var.t(12);
        k3.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.M = z2Var.z(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.N = z2Var.z(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(a2Var);
        searchAutoComplete.setOnEditorActionListener(e2Var);
        searchAutoComplete.setOnItemClickListener(f2Var);
        searchAutoComplete.setOnItemSelectedListener(i1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new c2(this));
        setIconifiedByDefault(z2Var.p(8, true));
        int iS = z2Var.s(1, -1);
        if (iS != -1) {
            setMaxWidth(iS);
        }
        this.Q = z2Var.C(6);
        this.f1518a0 = z2Var.C(11);
        int iV = z2Var.v(3, -1);
        if (iV != -1) {
            setImeOptions(iV);
        }
        int iV2 = z2Var.v(2, -1);
        if (iV2 != -1) {
            setInputType(iV2);
        }
        setFocusable(z2Var.p(0, true));
        z2Var.K();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.O = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.P = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.E = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new d2(this));
        }
        u(this.T);
        r();
    }
}
