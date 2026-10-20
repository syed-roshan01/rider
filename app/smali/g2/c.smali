.class public abstract Lg2/c;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;La2/a0;Ld1/d;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 5

    iget v0, p2, Ld1/d;->a:F

    iget v1, p2, Ld1/d;->c:F

    cmpl-float v0, v0, v1

    if-gez v0, :cond_1

    iget v0, p2, Ld1/d;->b:F

    iget p2, p2, Ld1/d;->d:F

    cmpl-float v1, v0, p2

    if-ltz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, La2/a0;->g(F)I

    move-result v0

    invoke-virtual {p1, p2}, La2/a0;->g(F)I

    move-result p2

    if-gt v0, p2, :cond_1

    :goto_0
    invoke-virtual {p1, v0}, La2/a0;->h(I)F

    move-result v1

    invoke-virtual {p1, v0}, La2/a0;->k(I)F

    move-result v2

    invoke-virtual {p1, v0}, La2/a0;->i(I)F

    move-result v3

    invoke-virtual {p1, v0}, La2/a0;->d(I)F

    move-result v4

    invoke-static {p0, v1, v2, v3, v4}, Lc3/d;->h(Landroid/view/inputmethod/CursorAnchorInfo$Builder;FFFF)V

    if-eq v0, p2, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p0
.end method
