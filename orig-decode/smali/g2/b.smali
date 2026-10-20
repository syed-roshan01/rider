.class public abstract Lg2/b;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ld1/d;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;
    .locals 6

    invoke-static {}, Landroidx/activity/q;->l()Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object v0

    new-instance v1, Landroid/graphics/RectF;

    iget v2, p1, Ld1/d;->a:F

    iget v3, p1, Ld1/d;->b:F

    iget v4, p1, Ld1/d;->c:F

    iget v5, p1, Ld1/d;->d:F

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {v0, v1}, Landroidx/activity/q;->m(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object v0

    new-instance v1, Landroid/graphics/RectF;

    iget p1, p1, Ld1/d;->a:F

    invoke-direct {v1, p1, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {v0, v1}, Landroidx/activity/q;->u(Landroid/view/inputmethod/EditorBoundsInfo$Builder;Landroid/graphics/RectF;)Landroid/view/inputmethod/EditorBoundsInfo$Builder;

    move-result-object p1

    invoke-static {p1}, Landroidx/activity/q;->n(Landroid/view/inputmethod/EditorBoundsInfo$Builder;)Landroid/view/inputmethod/EditorBoundsInfo;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/activity/q;->k(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroid/view/inputmethod/EditorBoundsInfo;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    move-result-object p0

    return-object p0
.end method
