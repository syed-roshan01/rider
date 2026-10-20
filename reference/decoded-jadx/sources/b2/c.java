package b2;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2527a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2529c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2528b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2530d = 0;

    public c(CharSequence charSequence, int i10) {
        this.f2527a = charSequence;
        this.f2529c = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f2530d;
        if (i10 == this.f2529c) {
            return '\uffff';
        }
        return this.f2527a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f2530d = this.f2528b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f2528b;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f2529c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f2530d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f2528b;
        int i11 = this.f2529c;
        if (i10 == i11) {
            this.f2530d = i11;
            return '\uffff';
        }
        int i12 = i11 - 1;
        this.f2530d = i12;
        return this.f2527a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f2530d + 1;
        this.f2530d = i10;
        int i11 = this.f2529c;
        if (i10 < i11) {
            return this.f2527a.charAt(i10);
        }
        this.f2530d = i11;
        return '\uffff';
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f2530d;
        if (i10 <= this.f2528b) {
            return '\uffff';
        }
        int i11 = i10 - 1;
        this.f2530d = i11;
        return this.f2527a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f2529c || this.f2528b > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f2530d = i10;
        return current();
    }
}
