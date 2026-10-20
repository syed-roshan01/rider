package k3;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f9733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9734p;

    public g(TextView textView) {
        super(6, (Object) null);
        this.f9732n = textView;
        this.f9734p = true;
        this.f9733o = new e(textView);
    }

    @Override // x9.v
    public final void H(boolean z10) {
        if (z10) {
            TextView textView = this.f9732n;
            textView.setTransformationMethod(K(textView.getTransformationMethod()));
        }
    }

    @Override // x9.v
    public final void I(boolean z10) {
        this.f9734p = z10;
        TextView textView = this.f9732n;
        textView.setTransformationMethod(K(textView.getTransformationMethod()));
        textView.setFilters(s(textView.getFilters()));
    }

    @Override // x9.v
    public final TransformationMethod K(TransformationMethod transformationMethod) {
        if (this.f9734p) {
            return ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod);
        }
        return transformationMethod instanceof j ? ((j) transformationMethod).f9740a : transformationMethod;
    }

    @Override // x9.v
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!this.f9734p) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof e) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            e eVar = this.f9733o;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == eVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override // x9.v
    public final boolean z() {
        return this.f9734p;
    }
}
