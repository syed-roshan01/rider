.class public final La4/q0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/widget/OverScroller;

.field public d:Landroid/view/animation/Interpolator;

.field public e:Z

.field public f:Z

.field public final synthetic n:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/q0;->n:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->s0:La4/v;

    iput-object v0, p0, La4/q0;->d:Landroid/view/animation/Interpolator;

    const/4 v1, 0x0

    iput-boolean v1, p0, La4/q0;->e:Z

    iput-boolean v1, p0, La4/q0;->f:Z

    new-instance v1, Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v1, p0, La4/q0;->c:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, La4/q0;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, La4/q0;->f:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, La4/q0;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0, p0}, Lb3/b0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final run()V
    .locals 13

    iget-object v0, p0, La4/q0;->n:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->p:La4/e0;

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, La4/q0;->c:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, La4/q0;->f:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, La4/q0;->e:Z

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->d()V

    iget-object v3, p0, La4/q0;->c:Landroid/widget/OverScroller;

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->p:La4/e0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v4

    if-eqz v4, :cond_d

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->l0:[I

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v5

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v6

    iget v7, p0, La4/q0;->a:I

    sub-int v11, v5, v7

    iget v7, p0, La4/q0;->b:I

    sub-int v12, v6, v7

    iput v5, p0, La4/q0;->a:I

    iput v6, p0, La4/q0;->b:I

    iget-object v5, p0, La4/q0;->n:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v10, 0x0

    const/4 v8, 0x1

    move v6, v11

    move v7, v12

    move-object v9, v4

    invoke-virtual/range {v5 .. v10}, Landroidx/recyclerview/widget/RecyclerView;->f(III[I[I)Z

    move-result v5

    if-eqz v5, :cond_1

    aget v5, v4, v1

    sub-int/2addr v11, v5

    aget v4, v4, v2

    sub-int/2addr v12, v4

    :cond_1
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->q:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    invoke-virtual {v0, v11, v12}, Landroidx/recyclerview/widget/RecyclerView;->c(II)V

    :cond_3
    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->g(I[I)Z

    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_4
    if-eqz v12, :cond_5

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->p:La4/e0;

    invoke-virtual {v4}, La4/e0;->c()Z

    move-result v4

    if-eqz v4, :cond_5

    if-nez v12, :cond_5

    move v4, v2

    goto :goto_0

    :cond_5
    move v4, v1

    :goto_0
    if-eqz v11, :cond_6

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->p:La4/e0;

    invoke-virtual {v5}, La4/e0;->b()Z

    move-result v5

    if-eqz v5, :cond_6

    if-nez v11, :cond_6

    move v5, v2

    goto :goto_1

    :cond_6
    move v5, v1

    :goto_1
    if-nez v11, :cond_7

    if-eqz v12, :cond_9

    :cond_7
    if-nez v5, :cond_9

    if-eqz v4, :cond_8

    goto :goto_2

    :cond_8
    move v4, v1

    goto :goto_3

    :cond_9
    :goto_2
    move v4, v2

    :goto_3
    invoke-virtual {v3}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v3

    if-nez v3, :cond_b

    if-nez v4, :cond_a

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->k()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {p0}, La4/q0;->a()V

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:La4/m;

    if-eqz v2, :cond_d

    invoke-virtual {v2, v0, v11, v12}, La4/m;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    goto :goto_5

    :cond_b
    :goto_4
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:La4/k;

    iget-object v4, v3, La4/k;->d:[I

    if-eqz v4, :cond_c

    const/4 v5, -0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->fill([II)V

    :cond_c
    iput v1, v3, La4/k;->c:I

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->w(I)V

    :cond_d
    :goto_5
    iput-boolean v1, p0, La4/q0;->e:Z

    iget-boolean v0, p0, La4/q0;->f:Z

    if-eqz v0, :cond_e

    invoke-virtual {p0}, La4/q0;->a()V

    :cond_e
    return-void
.end method
