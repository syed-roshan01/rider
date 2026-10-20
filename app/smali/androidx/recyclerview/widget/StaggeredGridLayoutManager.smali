.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super La4/e0;


# instance fields
.field public final h:I

.field public final i:[La4/w0;

.field public final j:La4/t;

.field public final k:La4/t;

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:La4/a1;

.field public final p:I

.field public q:La4/v0;

.field public final r:Z

.field public final s:La4/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 4

    invoke-direct {p0}, La4/e0;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    new-instance v1, La4/a1;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, La4/a1;-><init>(I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:La4/a1;

    const/4 v3, 0x2

    iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    new-instance v3, La4/q;

    invoke-direct {v3, p0}, La4/q;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    new-instance v3, La4/f;

    invoke-direct {v3, p0, v2}, La4/f;-><init>(Ljava/lang/Object;I)V

    iput-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:La4/f;

    invoke-static {p1, p2, p3, p4}, La4/e0;->x(Landroid/content/Context;Landroid/util/AttributeSet;II)La4/d0;

    move-result-object p1

    iget p2, p1, La4/d0;->a:I

    if-eqz p2, :cond_1

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid orientation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    if-ne p2, p4, :cond_2

    goto :goto_1

    :cond_2
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:La4/t;

    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:La4/t;

    invoke-virtual {p0}, La4/e0;->I()V

    :goto_1
    iget p2, p1, La4/d0;->b:I

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-eq p2, p4, :cond_4

    invoke-virtual {v1}, La4/a1;->a()V

    invoke-virtual {p0}, La4/e0;->I()V

    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    new-instance p2, Ljava/util/BitSet;

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    new-array p2, p2, [La4/w0;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[La4/w0;

    move p2, v0

    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-ge p2, p4, :cond_3

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[La4/w0;

    new-instance v1, La4/w0;

    invoke-direct {v1, p0, p2}, La4/w0;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    aput-object v1, p4, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, La4/e0;->I()V

    :cond_4
    iget-boolean p1, p1, La4/d0;->c:Z

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:La4/v0;

    if-eqz p2, :cond_5

    iget-boolean p3, p2, La4/v0;->o:Z

    if-eq p3, p1, :cond_5

    iput-boolean p1, p2, La4/v0;->o:Z

    :cond_5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    invoke-virtual {p0}, La4/e0;->I()V

    new-instance p1, La4/o;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput v0, p1, La4/o;->a:I

    iput v0, p1, La4/o;->b:I

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    invoke-static {p0, p1}, La4/t;->a(La4/e0;I)La4/s;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    sub-int/2addr v2, p1

    invoke-static {p0, v2}, La4/t;->a(La4/e0;I)La4/s;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:La4/t;

    return-void
.end method


# virtual methods
.method public final A(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, La4/e0;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:La4/f;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[La4/w0;

    aget-object v1, v1, v0

    invoke-virtual {v1}, La4/w0;->b()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public final B(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, La4/e0;->B(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, La4/e0;->p()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final C(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, La4/v0;

    if-eqz v0, :cond_0

    check-cast p1, La4/v0;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:La4/v0;

    invoke-virtual {p0}, La4/e0;->I()V

    :cond_0
    return-void
.end method

.method public final D()Landroid/os/Parcelable;
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:La4/v0;

    if-eqz v0, :cond_0

    new-instance v1, La4/v0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, v0, La4/v0;->c:I

    iput v2, v1, La4/v0;->c:I

    iget v2, v0, La4/v0;->a:I

    iput v2, v1, La4/v0;->a:I

    iget v2, v0, La4/v0;->b:I

    iput v2, v1, La4/v0;->b:I

    iget-object v2, v0, La4/v0;->d:[I

    iput-object v2, v1, La4/v0;->d:[I

    iget v2, v0, La4/v0;->e:I

    iput v2, v1, La4/v0;->e:I

    iget-object v2, v0, La4/v0;->f:[I

    iput-object v2, v1, La4/v0;->f:[I

    iget-boolean v2, v0, La4/v0;->o:Z

    iput-boolean v2, v1, La4/v0;->o:Z

    iget-boolean v2, v0, La4/v0;->p:Z

    iput-boolean v2, v1, La4/v0;->p:Z

    iget-boolean v2, v0, La4/v0;->q:Z

    iput-boolean v2, v1, La4/v0;->q:Z

    iget-object v0, v0, La4/v0;->n:Ljava/util/List;

    iput-object v0, v1, La4/v0;->n:Ljava/util/List;

    return-object v1

    :cond_0
    new-instance v0, La4/v0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    iput-boolean v1, v0, La4/v0;->o:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, La4/v0;->p:Z

    iput-boolean v1, v0, La4/v0;->q:Z

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:La4/a1;

    if-eqz v2, :cond_1

    iget-object v3, v2, La4/a1;->b:Ljava/lang/Object;

    check-cast v3, [I

    if-eqz v3, :cond_1

    iput-object v3, v0, La4/v0;->f:[I

    array-length v3, v3

    iput v3, v0, La4/v0;->e:I

    iget-object v2, v2, La4/a1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iput-object v2, v0, La4/v0;->n:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput v1, v0, La4/v0;->e:I

    :goto_0
    invoke-virtual {p0}, La4/e0;->p()I

    move-result v2

    const/4 v3, -0x1

    if-lez v2, :cond_5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q()V

    iput v1, v0, La4/v0;->a:I

    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    move-result-object v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_4

    iput v3, v0, La4/v0;->b:I

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    iput v2, v0, La4/v0;->c:I

    new-array v2, v2, [I

    iput-object v2, v0, La4/v0;->d:[I

    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-ge v1, v2, :cond_6

    const/high16 v2, -0x80000000

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[La4/w0;

    aget-object v3, v3, v1

    invoke-virtual {v3, v2}, La4/w0;->d(I)I

    move-result v3

    if-eq v3, v2, :cond_3

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v2}, La4/t;->e()I

    move-result v2

    sub-int/2addr v3, v2

    :cond_3
    iget-object v2, v0, La4/v0;->d:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    :cond_5
    iput v3, v0, La4/v0;->a:I

    iput v3, v0, La4/v0;->b:I

    iput v1, v0, La4/v0;->c:I

    :cond_6
    return-object v0
.end method

.method public final E(I)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->K()Z

    :cond_0
    return-void
.end method

.method public final K()Z
    .locals 3

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    if-eqz v0, :cond_2

    iget-boolean v0, p0, La4/e0;->e:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R()V

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->S()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:La4/a1;

    if-eqz v0, :cond_2

    invoke-virtual {v2}, La4/a1;->a()V

    const/4 v0, 0x1

    invoke-virtual {p0}, La4/e0;->I()V

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method public final L(La4/o0;)I
    .locals 6

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v2

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ly3/e;->P(La4/o0;La4/t;Landroid/view/View;Landroid/view/View;La4/e0;Z)I

    move-result p1

    return p1
.end method

.method public final M(La4/o0;)V
    .locals 3

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, La4/o0;->a()I

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public final N(La4/o0;)I
    .locals 6

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v2

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ly3/e;->Q(La4/o0;La4/t;Landroid/view/View;Landroid/view/View;La4/e0;Z)I

    move-result p1

    return p1
.end method

.method public final O(Z)Landroid/view/View;
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v0}, La4/t;->e()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v1}, La4/t;->d()I

    move-result v1

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ltz v2, :cond_4

    invoke-virtual {p0, v2}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v5, v4}, La4/t;->c(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v6, v4}, La4/t;->b(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_3

    if-lt v5, v1, :cond_0

    goto :goto_2

    :cond_0
    if-le v6, v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_2

    :cond_2
    :goto_1
    return-object v4

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final P(Z)Landroid/view/View;
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v0}, La4/t;->e()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v1}, La4/t;->d()I

    move-result v1

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    invoke-virtual {p0, v4}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v6, v5}, La4/t;->c(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:La4/t;

    invoke-virtual {v7, v5}, La4/t;->b(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_3

    if-lt v6, v1, :cond_0

    goto :goto_2

    :cond_0
    if-ge v6, v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v5

    goto :goto_2

    :cond_2
    :goto_1
    return-object v5

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final Q()V
    .locals 1

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, La4/e0;->w(Landroid/view/View;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final R()V
    .locals 1

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, La4/e0;->w(Landroid/view/View;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final S()Landroid/view/View;
    .locals 6

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v3, v5}, Ljava/util/BitSet;->set(IIZ)V

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v3, -0x1

    if-ne v2, v5, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->T()Z

    move-result v2

    :cond_0
    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    if-eqz v2, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    if-ne v1, v0, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    invoke-virtual {p0, v1}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/t0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0
.end method

.method public final T()Z
    .locals 2

    iget-object v0, p0, La4/e0;->b:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0}, Lb3/c0;->d(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:La4/v0;

    if-nez v0, :cond_0

    iget-object v0, p0, La4/e0;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final d(La4/f0;)Z
    .locals 0

    instance-of p1, p1, La4/t0;

    return p1
.end method

.method public final f(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final g(La4/o0;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M(La4/o0;)V

    return-void
.end method

.method public final h(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final i(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final j(La4/o0;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M(La4/o0;)V

    return-void
.end method

.method public final k(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final l()La4/f0;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, La4/t0;

    invoke-direct {v0, v2, v1}, La4/f0;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, La4/t0;

    invoke-direct {v0, v1, v2}, La4/f0;-><init>(II)V

    return-object v0
.end method

.method public final m(Landroid/content/Context;Landroid/util/AttributeSet;)La4/f0;
    .locals 1

    new-instance v0, La4/t0;

    invoke-direct {v0, p1, p2}, La4/f0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup$LayoutParams;)La4/f0;
    .locals 1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    new-instance v0, La4/t0;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, La4/f0;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    new-instance v0, La4/t0;

    invoke-direct {v0, p1}, La4/f0;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final q(La4/l0;La4/o0;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, La4/e0;->q(La4/l0;La4/o0;)I

    return v1
.end method

.method public final y(La4/l0;La4/o0;)I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, La4/e0;->y(La4/l0;La4/o0;)I

    const/4 p1, 0x1

    return p1
.end method

.method public final z()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
