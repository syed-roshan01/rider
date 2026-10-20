.class public abstract Lu1/z3;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lu1/z3;->a:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static final a(Lu1/a;Lm0/u;Lu0/b;)Lu1/x3;
    .locals 6

    sget-object v0, Lu1/b2;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    invoke-static {v2, v3, v0}, Lz6/a;->a(ILo9/a;I)Lo9/c;

    move-result-object v0

    sget-object v2, Lu1/e1;->t:Lq8/i;

    invoke-virtual {v2}, Lq8/i;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu8/j;

    invoke-static {v2}, Ld7/a;->b(Lu8/j;)Lr9/e;

    move-result-object v2

    new-instance v4, Lu1/a2;

    invoke-direct {v4, v0, v3}, Lu1/a2;-><init>(Lo9/g;Lu8/e;)V

    const/4 v5, 0x3

    invoke-static {v2, v3, v1, v4, v5}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    new-instance v2, Lh1/b;

    const/16 v4, 0x8

    invoke-direct {v2, v0, v4}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v4, Lw0/p;->h:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4, v2}, Lr8/p;->Q0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    sput-object v2, Lw0/p;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sget-object v0, Lw0/o;->b:Lw0/o;

    invoke-static {v0}, Lw0/p;->e(Lc9/c;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lu1/w;

    if-eqz v1, :cond_1

    check-cast v0, Lu1/w;

    goto :goto_2

    :cond_1
    :goto_1
    move-object v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    goto :goto_1

    :goto_2
    if-nez v0, :cond_3

    new-instance v0, Lu1/w;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lm0/u;->g()Lu8/j;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lu1/w;-><init>(Landroid/content/Context;Lu8/j;)V

    invoke-virtual {v0}, Lu1/w;->getView()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lu1/z3;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v1, v2}, Lu1/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    new-instance p0, Lt1/w1;

    invoke-virtual {v0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lm0/a;-><init>(Ljava/lang/Object;)V

    sget-object v1, Lm0/y;->a:Ljava/lang/Object;

    new-instance v1, Lm0/x;

    invoke-direct {v1, p1, p0}, Lm0/x;-><init>(Lm0/u;Lt1/w1;)V

    invoke-virtual {v0}, Lu1/w;->getView()Landroid/view/View;

    move-result-object p0

    const p1, 0x7f0800ed

    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v2, p0, Lu1/x3;

    if-eqz v2, :cond_4

    move-object v3, p0

    check-cast v3, Lu1/x3;

    :cond_4
    if-nez v3, :cond_5

    new-instance v3, Lu1/x3;

    invoke-direct {v3, v0, v1}, Lu1/x3;-><init>(Lu1/w;Lm0/x;)V

    invoke-virtual {v0}, Lu1/w;->getView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, p1, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_5
    invoke-virtual {v3, p2}, Lu1/x3;->e(Lc9/e;)V

    return-object v3
.end method
