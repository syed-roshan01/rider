package l;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10885a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Class cls, String str, int i10) {
        super(cls, str);
        this.f10885a = i10;
    }

    public final void a(View view, PointF pointF) {
        switch (this.f10885a) {
            case 3:
                f4.z.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                break;
            case 4:
                f4.z.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                break;
            default:
                int iRound = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                f4.z.a(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
                break;
        }
    }

    public final void b(f4.e eVar, PointF pointF) {
        switch (this.f10885a) {
            case 1:
                eVar.getClass();
                eVar.f6152a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f6153b = iRound;
                int i10 = eVar.f6157f + 1;
                eVar.f6157f = i10;
                if (i10 == eVar.f6158g) {
                    f4.z.a(eVar.f6156e, eVar.f6152a, iRound, eVar.f6154c, eVar.f6155d);
                    eVar.f6157f = 0;
                    eVar.f6158g = 0;
                }
                break;
            default:
                eVar.getClass();
                eVar.f6154c = Math.round(pointF.x);
                int iRound2 = Math.round(pointF.y);
                eVar.f6155d = iRound2;
                int i11 = eVar.f6158g + 1;
                eVar.f6158g = i11;
                if (eVar.f6157f == i11) {
                    f4.z.a(eVar.f6156e, eVar.f6152a, eVar.f6153b, eVar.f6154c, iRound2);
                    eVar.f6157f = 0;
                    eVar.f6158g = 0;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f10885a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).G);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return Float.valueOf(f4.z.f6227a.L((View) obj));
            default:
                Field field = b3.q0.f2670a;
                return b3.d0.a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f10885a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                b((f4.e) obj, (PointF) obj2);
                break;
            case 2:
                b((f4.e) obj, (PointF) obj2);
                break;
            case 3:
                a((View) obj, (PointF) obj2);
                break;
            case 4:
                a((View) obj, (PointF) obj2);
                break;
            case 5:
                a((View) obj, (PointF) obj2);
                break;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                f4.z.f6227a.M((View) obj, fFloatValue);
                break;
            default:
                Field field = b3.q0.f2670a;
                b3.d0.c((View) obj, (Rect) obj2);
                break;
        }
    }
}
