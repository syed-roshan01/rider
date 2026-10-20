package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import b3.b0;
import b3.q0;
import com.ride.accepter.R;
import f.a;
import java.lang.reflect.Field;
import k.l;
import k.m;
import k.t;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements t, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f1445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f1447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f1448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f1449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f1450f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f1451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f1452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f1453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Drawable f1454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1455r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f1456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1457t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Drawable f1458u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f1459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayoutInflater f1460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1461x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z2 z2VarI = z2.I(getContext(), attributeSet, a.f5578n, R.attr.listMenuViewStyle);
        this.f1454q = z2VarI.t(5);
        this.f1455r = z2VarI.z(1, -1);
        this.f1457t = z2VarI.p(7, false);
        this.f1456s = context;
        this.f1458u = z2VarI.t(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1459v = typedArrayObtainStyledAttributes.hasValue(0);
        z2VarI.K();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1460w == null) {
            this.f1460w = LayoutInflater.from(getContext());
        }
        return this.f1460w;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1451n;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    @Override // k.t
    public final void a(m mVar) {
        boolean z10;
        int i10;
        String string;
        this.f1445a = mVar;
        setVisibility(mVar.isVisible() ? 0 : 8);
        setTitle(mVar.f8652e);
        setCheckable(mVar.isCheckable());
        if (mVar.f8661n.n()) {
            if ((mVar.f8661n.m() ? mVar.f8657j : mVar.f8655h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        mVar.f8661n.m();
        if (z10) {
            m mVar2 = this.f1445a;
            if (mVar2.f8661n.n()) {
                i10 = (mVar2.f8661n.m() ? mVar2.f8657j : mVar2.f8655h) == 0 ? 8 : 0;
            }
        }
        if (i10 == 0) {
            TextView textView = this.f1450f;
            m mVar3 = this.f1445a;
            char c10 = mVar3.f8661n.m() ? mVar3.f8657j : mVar3.f8655h;
            if (c10 == 0) {
                string = "";
            } else {
                l lVar = mVar3.f8661n;
                Resources resources = lVar.f8628a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(lVar.f8628a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = lVar.m() ? mVar3.f8658k : mVar3.f8656i;
                m.a(sb, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                m.a(sb, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                m.a(sb, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                m.a(sb, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                m.a(sb, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                m.a(sb, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c10 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb.append(c10);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1450f.getVisibility() != i10) {
            this.f1450f.setVisibility(i10);
        }
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
        setSubMenuArrowVisible(mVar.hasSubMenu());
        setContentDescription(mVar.f8664q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1452o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1452o.getLayoutParams();
        rect.top = this.f1452o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // k.t
    public m getItemData() {
        return this.f1445a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = q0.f2670a;
        b0.q(this, this.f1454q);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1448d = textView;
        int i10 = this.f1455r;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1456s, i10);
        }
        this.f1450f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1451n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1458u);
        }
        this.f1452o = (ImageView) findViewById(R.id.group_divider);
        this.f1453p = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f1446b != null && this.f1457t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1446b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1447c == null && this.f1449e == null) {
            return;
        }
        if ((this.f1445a.f8671x & 4) != 0) {
            if (this.f1447c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1447c = radioButton;
                LinearLayout linearLayout = this.f1453p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1447c;
            view = this.f1449e;
        } else {
            if (this.f1449e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1449e = checkBox;
                LinearLayout linearLayout2 = this.f1453p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1449e;
            view = this.f1447c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1445a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1449e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1447c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f1445a.f8671x & 4) != 0) {
            if (this.f1447c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1447c = radioButton;
                LinearLayout linearLayout = this.f1453p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1447c;
        } else {
            if (this.f1449e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1449e = checkBox;
                LinearLayout linearLayout2 = this.f1453p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1449e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1461x = z10;
        this.f1457t = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1452o;
        if (imageView != null) {
            imageView.setVisibility((this.f1459v || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1445a.f8661n.getClass();
        boolean z10 = this.f1461x;
        if (z10 || this.f1457t) {
            ImageView imageView = this.f1446b;
            if (imageView == null && drawable == null && !this.f1457t) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1446b = imageView2;
                LinearLayout linearLayout = this.f1453p;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1457t) {
                this.f1446b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1446b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1446b.getVisibility() != 0) {
                this.f1446b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1448d.getVisibility() != 8) {
                this.f1448d.setVisibility(8);
            }
        } else {
            this.f1448d.setText(charSequence);
            if (this.f1448d.getVisibility() != 0) {
                this.f1448d.setVisibility(0);
            }
        }
    }
}
