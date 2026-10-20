.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;


# instance fields
.field public final p:I

.field public final q:Lm0/z1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v0, Lm0/z1;

    invoke-direct {v0}, Lm0/z1;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:Lm0/z1;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-static {p1, p2, p3, p4}, La4/e0;->x(Landroid/content/Context;Landroid/util/AttributeSet;II)La4/d0;

    move-result-object p1

    iget p1, p1, La4/d0;->b:I

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    if-lt p1, p2, :cond_1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    invoke-virtual {v0}, Lm0/z1;->b()V

    invoke-virtual {p0}, La4/e0;->I()V

    :goto_0
    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Span count should be at least 1. Provided "

    invoke-static {p3, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final R(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->R(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final S(ILa4/l0;La4/o0;)I
    .locals 1

    iget-boolean p3, p3, La4/o0;->d:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:Lm0/z1;

    if-nez p3, :cond_0

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Lm0/z1;->a(II)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p2, p1}, La4/l0;->a(I)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Cannot find span size for pre layout position. "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GridLayoutManager"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p1}, Lm0/z1;->a(II)I

    move-result p1

    return p1
.end method

.method public final d(La4/f0;)Z
    .locals 0

    instance-of p1, p1, La4/n;

    return p1
.end method

.method public final l()La4/f0;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, La4/n;

    invoke-direct {v0, v2, v1}, La4/f0;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, La4/n;

    invoke-direct {v0, v1, v2}, La4/f0;-><init>(II)V

    return-object v0
.end method

.method public final m(Landroid/content/Context;Landroid/util/AttributeSet;)La4/f0;
    .locals 1

    new-instance v0, La4/n;

    invoke-direct {v0, p1, p2}, La4/f0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup$LayoutParams;)La4/f0;
    .locals 1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    new-instance v0, La4/n;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, La4/f0;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    new-instance v0, La4/n;

    invoke-direct {v0, p1}, La4/f0;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final q(La4/l0;La4/o0;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    return p1

    :cond_0
    invoke-virtual {p2}, La4/o0;->a()I

    move-result v0

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, La4/o0;->a()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->S(ILa4/l0;La4/o0;)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final y(La4/l0;La4/o0;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->p:I

    return p1

    :cond_0
    invoke-virtual {p2}, La4/o0;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, La4/o0;->a()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->S(ILa4/l0;La4/o0;)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method
