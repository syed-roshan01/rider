package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ride.accepter.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f10699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10704f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z0 f10705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e3.e f10709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h.a f10710s;

    public b1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f10699a = new Rect();
        this.f10700b = 0;
        this.f10701c = 0;
        this.f10702d = 0;
        this.f10703e = 0;
        this.f10707p = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        e3.e eVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z11) {
                this.f10708q = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f10704f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.f10709r == null) {
                    this.f10709r = new e3.e(this);
                }
                e3.e eVar2 = this.f10709r;
                boolean z12 = eVar2.f5116w;
                eVar2.f5116w = true;
                eVar2.d(this, motionEvent);
            } else {
                eVar = this.f10709r;
                if (eVar != null) {
                    if (eVar.f5116w) {
                        eVar.e();
                    }
                    eVar.f5116w = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.f10708q = true;
                w0.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f10704f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f10704f = iPointToPosition;
                w0.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f10699a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f10700b;
                rect.top -= this.f10701c;
                rect.right += this.f10702d;
                rect.bottom += this.f10703e;
                if (x2.b.a()) {
                    zA = y0.a(this);
                } else {
                    Field field = a1.f10688a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (x2.b.a()) {
                        y0.b(this, z14);
                    } else {
                        Field field2 = a1.f10688a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    v2.b.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    v2.b.e(selector2, f10, f11);
                }
                z0 z0Var = this.f10705n;
                if (z0Var != null) {
                    z0Var.f10981b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            this.f10708q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10704f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f10708q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f10704f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.f10709r == null) {
                this.f10709r = new e3.e(this);
            }
            e3.e eVar3 = this.f10709r;
            boolean z15 = eVar3.f5116w;
            eVar3.f5116w = true;
            eVar3.d(this, motionEvent);
        } else {
            eVar = this.f10709r;
            if (eVar != null) {
                if (eVar.f5116w) {
                    eVar.e();
                }
                eVar.f5116w = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f10699a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f10710s != null) {
            return;
        }
        super.drawableStateChanged();
        z0 z0Var = this.f10705n;
        if (z0Var != null) {
            z0Var.f10981b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f10708q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f10707p || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f10707p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f10707p || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f10707p && this.f10706o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f10710s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 1;
        if (actionMasked == 10 && this.f10710s == null) {
            h.a aVar = new h.a(this, i11);
            this.f10710s = aVar;
            post(aVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !x0.f10971d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            x0.f10968a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            x0.f10969b.invoke(this, Integer.valueOf(iPointToPosition));
                            x0.f10970c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                        } catch (InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f10708q && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10704f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        h.a aVar = this.f10710s;
        if (aVar != null) {
            b1 b1Var = (b1) aVar.f7336b;
            b1Var.f10710s = null;
            b1Var.removeCallbacks(aVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f10706o = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        z0 z0Var = null;
        if (drawable != null) {
            z0 z0Var2 = new z0();
            Drawable drawable2 = z0Var2.f10980a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            z0Var2.f10980a = drawable;
            drawable.setCallback(z0Var2);
            z0Var2.f10981b = true;
            z0Var = z0Var2;
        }
        this.f10705n = z0Var;
        super.setSelector(z0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f10700b = rect.left;
        this.f10701c = rect.top;
        this.f10702d = rect.right;
        this.f10703e = rect.bottom;
    }
}
