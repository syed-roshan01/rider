package o1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f12366b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f12367c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12368d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12369e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12370f = -1;

    /* JADX WARN: Code duplicated, block: B:100:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:129:0x01aa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176  */
    /* JADX WARN: Code duplicated, block: B:90:0x0184  */
    public final w a(MotionEvent motionEvent, b0 b0Var) {
        int i10;
        int i11;
        long jValueAt;
        long j10;
        long jQ;
        long jA;
        long jA2;
        int toolType;
        char c10;
        int i12;
        int historySize;
        int i13;
        char c11;
        long jF;
        float historicalX;
        int i14;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f12366b;
        SparseBooleanArray sparseBooleanArray = this.f12367c;
        if (actionMasked == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f12369e || source != this.f12370f) {
                this.f12369e = toolType2;
                this.f12370f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j11 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j12 = this.f12365a;
                this.f12365a = j12 + 1;
                sparseLongArray.put(pointerId, j12);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j13 = this.f12365a;
                this.f12365a = j13 + 1;
                sparseLongArray.put(pointerId2, j13);
            }
        }
        boolean z10 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z11 = actionMasked == 8;
        if (z10) {
            i10 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i10 = 1;
        }
        int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f12368d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i15 = 0;
        while (i15 < pointerCount) {
            boolean z12 = (z10 || i15 == actionIndex2 || (z11 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i15);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j14 = this.f12365a;
                this.f12365a = j14 + j11;
                sparseLongArray.put(pointerId3, j14);
                jValueAt = j14;
            }
            float pressure = motionEvent.getPressure(i15);
            long jF2 = d9.i.f(motionEvent.getX(i15), motionEvent.getY(i15));
            long jA3 = d1.c.a(jF2, 3);
            if (i15 == 0) {
                jA = d9.i.f(motionEvent.getRawX(), motionEvent.getRawY());
                jA2 = ((u1.w) b0Var).A(jA);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jA = h.f12374a.a(motionEvent, i15);
                    jA2 = ((u1.w) b0Var).A(jA);
                } else {
                    j10 = jF2;
                    jQ = ((u1.w) b0Var).q(jF2);
                }
                toolType = motionEvent.getToolType(i15);
                if (toolType != 0) {
                    if (toolType != 1) {
                        i14 = 2;
                        if (toolType != 2) {
                            c10 = 3;
                            if (toolType != 3) {
                                i14 = 4;
                                if (toolType != 4) {
                                }
                            }
                            i12 = i14;
                        } else {
                            c10 = 3;
                            i12 = 3;
                        }
                    } else {
                        c10 = 3;
                        i12 = 1;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i13 = 0; i13 < historySize; i13++) {
                        historicalX = motionEvent.getHistoricalX(i15, i13);
                        float historicalY = motionEvent.getHistoricalY(i15, i13);
                        if (Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                            long jF3 = d9.i.f(historicalX, historicalY);
                            arrayList2.add(new d(motionEvent.getHistoricalEventTime(i13), jF3, jF3));
                        }
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        c11 = '\t';
                        jF = d9.i.f(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                    } else {
                        c11 = '\t';
                        jF = d1.c.f4326b;
                    }
                    arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jQ, j10, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i15), false), arrayList2, jF, jA3));
                    i15++;
                    z11 = z11;
                    pointerCount = pointerCount;
                    j11 = 1;
                } else {
                    c10 = 3;
                }
                i12 = 0;
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i13 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i15, i13);
                    float historicalY2 = motionEvent.getHistoricalY(i15, i13);
                    if (Float.isInfinite(historicalX)) {
                    }
                }
                if (motionEvent.getActionMasked() == 8) {
                    c11 = '\t';
                    jF = d9.i.f(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c11 = '\t';
                    jF = d1.c.f4326b;
                }
                arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jQ, j10, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i15), false), arrayList3, jF, jA3));
                i15++;
                z11 = z11;
                pointerCount = pointerCount;
                j11 = 1;
            }
            jQ = jA;
            j10 = jA2;
            toolType = motionEvent.getToolType(i15);
            if (toolType != 0) {
                if (toolType != 1) {
                    i14 = 2;
                    if (toolType != 2) {
                        c10 = 3;
                        if (toolType != 3) {
                            i14 = 4;
                            if (toolType != 4) {
                            }
                        }
                        i12 = i14;
                    } else {
                        c10 = 3;
                        i12 = 3;
                    }
                } else {
                    c10 = 3;
                    i12 = 1;
                }
                ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i13 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i15, i13);
                    float historicalY3 = motionEvent.getHistoricalY(i15, i13);
                    if (Float.isInfinite(historicalX)) {
                    }
                }
                if (motionEvent.getActionMasked() == 8) {
                    c11 = '\t';
                    jF = d9.i.f(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c11 = '\t';
                    jF = d1.c.f4326b;
                }
                arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jQ, j10, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i15), false), arrayList4, jF, jA3));
                i15++;
                z11 = z11;
                pointerCount = pointerCount;
                j11 = 1;
            } else {
                c10 = 3;
            }
            i12 = 0;
            ArrayList arrayList5 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i13 < historySize) {
                historicalX = motionEvent.getHistoricalX(i15, i13);
                float historicalY4 = motionEvent.getHistoricalY(i15, i13);
                if (Float.isInfinite(historicalX)) {
                }
            }
            if (motionEvent.getActionMasked() == 8) {
                c11 = '\t';
                jF = d9.i.f(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                c11 = '\t';
                jF = d1.c.f4326b;
            }
            arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jQ, j10, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i15), false), arrayList5, jF, jA3));
            i15++;
            z11 = z11;
            pointerCount = pointerCount;
            j11 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i11 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i11 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i16 = i11;
                while (true) {
                    if (i16 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i16) == iKeyAt) {
                        break;
                    }
                    i16++;
                }
            }
        }
        motionEvent.getEventTime();
        return new w(arrayList, motionEvent);
    }
}
