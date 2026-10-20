.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super La4/e0;


# instance fields
.field public final h:I

.field public i:La4/q;

.field public final j:La4/s;

.field public final k:Z

.field public final l:Z

.field public m:Z

.field public final n:Z

.field public o:La4/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    invoke-direct {p0}, La4/e0;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:La4/r;

    new-instance v2, La4/p;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2}, La4/p;->a()V

    invoke-static {p1, p2, p3, p4}, La4/e0;->x(Landroid/content/Context;Landroid/util/AttributeSet;II)La4/d0;

    move-result-object p1

    iget p2, p1, La4/d0;->a:I

    if-eqz p2, :cond_1

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "invalid orientation:"

    invoke-static {p3, p2}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    if-ne p2, p3, :cond_2

    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:La4/s;

    if-nez p3, :cond_3

    :cond_2
    invoke-static {p0, p2}, La4/t;->a(La4/e0;I)La4/s;

    move-result-object p3

    iput-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:La4/s;

    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    invoke-virtual {p0}, La4/e0;->I()V

    :cond_3
    iget-boolean p2, p1, La4/d0;->c:Z

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    if-ne p2, p3, :cond_4

    goto :goto_1

    :cond_4
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    invoke-virtual {p0}, La4/e0;->I()V

    :goto_1
    iget-boolean p1, p1, La4/d0;->d:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->R(Z)V

    return-void
.end method


# virtual methods
.method public final A(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public final B(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    invoke-super {p0, p1}, La4/e0;->B(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(IIZ)Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p0, v3, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(IIZ)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v2

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v2

    :cond_2
    :goto_0
    return-void
.end method

.method public final C(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, La4/r;

    if-eqz v0, :cond_0

    check-cast p1, La4/r;

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:La4/r;

    invoke-virtual {p0}, La4/e0;->I()V

    :cond_0
    return-void
.end method

.method public final D()Landroid/os/Parcelable;
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:La4/r;

    if-eqz v0, :cond_0

    new-instance v1, La4/r;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, v0, La4/r;->a:I

    iput v2, v1, La4/r;->a:I

    iget v2, v0, La4/r;->b:I

    iput v2, v1, La4/r;->b:I

    iget-boolean v0, v0, La4/r;->c:Z

    iput-boolean v0, v1, La4/r;->c:Z

    return-object v1

    :cond_0
    new-instance v0, La4/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    iput-boolean v1, v0, La4/r;->c:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, La4/e0;->p()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    :goto_0
    invoke-virtual {p0, v2}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:La4/s;

    invoke-virtual {v2}, La4/s;->d()I

    move-result v2

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:La4/s;

    invoke-virtual {v4, v1}, La4/s;->b(Landroid/view/View;)I

    move-result v4

    sub-int/2addr v2, v4

    iput v2, v0, La4/r;->b:I

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    :cond_3
    invoke-virtual {p0, v2}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, La4/e0;->w(Landroid/view/View;)V

    throw v3

    :cond_4
    const/4 v1, -0x1

    iput v1, v0, La4/r;->a:I

    return-object v0
.end method

.method public final K(La4/o0;)I
    .locals 6

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:La4/s;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ly3/e;->P(La4/o0;La4/t;Landroid/view/View;Landroid/view/View;La4/e0;Z)I

    move-result p1

    return p1
.end method

.method public final L(La4/o0;)V
    .locals 3

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N()V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Z)Landroid/view/View;

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

.method public final M(La4/o0;)I
    .locals 6

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:La4/s;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Ly3/e;->Q(La4/o0;La4/t;Landroid/view/View;Landroid/view/View;La4/e0;Z)I

    move-result p1

    return p1
.end method

.method public final N()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->i:La4/q;

    if-nez v0, :cond_0

    new-instance v0, La4/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->i:La4/q;

    :cond_0
    return-void
.end method

.method public final O(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final P(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0}, La4/e0;->p()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final Q(IIZ)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->N()V

    const/16 v0, 0x140

    if-eqz p3, :cond_0

    const/16 p3, 0x6003

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    if-nez v1, :cond_1

    iget-object v1, p0, La4/e0;->c:La4/a1;

    invoke-virtual {v1, p1, p2, p3, v0}, La4/a1;->b(IIII)Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object v1, p0, La4/e0;->d:La4/a1;

    invoke-virtual {v1, p1, p2, p3, v0}, La4/a1;->b(IIII)Landroid/view/View;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public R(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    invoke-virtual {p0}, La4/e0;->I()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:La4/r;

    if-nez v0, :cond_0

    iget-object v0, p0, La4/e0;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

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

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final f(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->K(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final g(La4/o0;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->L(La4/o0;)V

    return-void
.end method

.method public final h(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final i(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->K(La4/o0;)I

    move-result p1

    return p1
.end method

.method public final j(La4/o0;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->L(La4/o0;)V

    return-void
.end method

.method public final k(La4/o0;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M(La4/o0;)I

    move-result p1

    return p1
.end method

.method public l()La4/f0;
    .locals 2

    new-instance v0, La4/f0;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, La4/f0;-><init>(II)V

    return-object v0
.end method

.method public final z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
