package l;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ride.accepter.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import u1.t3;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends f3.a implements View.OnClickListener {
    public static final /* synthetic */ int E = 0;
    public int A;
    public int B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LayoutInflater f10852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SearchView f10853r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SearchableInfo f10854s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f10855t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WeakHashMap f10856u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f10859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10860y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10861z;

    public n2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f6137b = true;
        this.f6138c = null;
        this.f6136a = false;
        this.f6139d = -1;
        this.f6140e = new t3(this);
        this.f6141f = new l1(this, 1);
        this.f10851p = suggestionRowLayout;
        this.f10850o = suggestionRowLayout;
        this.f10852q = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f10858w = 1;
        this.f10860y = -1;
        this.f10861z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.f10853r = searchView;
        this.f10854s = searchableInfo;
        this.f10857v = searchView.getSuggestionCommitIconResId();
        this.f10855t = context;
        this.f10856u = weakHashMap;
    }

    public static String h(int i10, Cursor cursor) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    @Override // f3.a
    public final void a(View view, Cursor cursor) {
        int i10;
        Drawable drawableF;
        CharSequence charSequenceH;
        m2 m2Var = (m2) view.getTag();
        int i11 = this.D;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        TextView textView = m2Var.f10843a;
        if (textView != null) {
            String strH = h(this.f10860y, cursor);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f10855t;
        TextView textView2 = m2Var.f10844b;
        if (textView2 != null) {
            String strH2 = h(this.A, cursor);
            if (strH2 != null) {
                if (this.f10859x == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f10859x = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f10859x, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(this.f10861z, cursor);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = m2Var.f10845c;
        if (imageView != null) {
            int i13 = this.B;
            if (i13 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i13));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f10854s.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f10856u;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbQ = a7.a.q("Invalid icon resource ", iconResource, " for ");
                                    sbQ.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbQ.toString());
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.w("SuggestionsAdapter", e4.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView2 = m2Var.f10846d;
        if (imageView2 == null) {
            i10 = 1;
        } else {
            int i14 = this.C;
            Drawable drawableF2 = i14 == -1 ? null : f(cursor.getString(i14));
            imageView2.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView2.setVisibility(8);
                i10 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableF2.setVisible(false, false);
                i10 = 1;
                drawableF2.setVisible(true, false);
            }
        }
        int i15 = this.f10858w;
        ImageView imageView3 = m2Var.f10847e;
        if (i15 != 2 && (i15 != i10 || (i12 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // f3.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f10860y = cursor.getColumnIndex("suggest_text_1");
                this.f10861z = cursor.getColumnIndex("suggest_text_2");
                this.A = cursor.getColumnIndex("suggest_text_2_url");
                this.B = cursor.getColumnIndex("suggest_icon_1");
                this.C = cursor.getColumnIndex("suggest_icon_2");
                this.D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // f3.a
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor.getColumnIndex("suggest_intent_query"), cursor);
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f10854s;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor.getColumnIndex("suggest_intent_data"), cursor)) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor.getColumnIndex("suggest_text_1"), cursor)) == null) {
            return null;
        }
        return strH;
    }

    @Override // f3.a
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f10852q.inflate(this.f10850o, viewGroup, false);
        viewInflate.setTag(new m2(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f10857v);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f10855t.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f10856u;
        Context context = this.f10855t;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i10;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = r2.k.getDrawable(context, i10);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e4) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e10) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e11) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
                    if (drawableE != null) {
                        weakHashMap.put(str, drawableE.getConstantState());
                    }
                    return drawableE;
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f10855t.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // f3.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View viewInflate = this.f10852q.inflate(this.f10851p, viewGroup, false);
            if (viewInflate != null) {
                ((m2) viewInflate.getTag()).f10843a.setText(e4.toString());
            }
            return viewInflate;
        }
    }

    @Override // f3.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View viewD = d(viewGroup);
            ((m2) viewD.getTag()).f10843a.setText(e4.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f6138c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f6138c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f10853r.n((CharSequence) tag);
        }
    }
}
