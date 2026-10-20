.class public final Lu1/r3;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:Lm9/d0;

.field public final synthetic b:Lm0/p1;

.field public final synthetic c:Lm0/g2;

.field public final synthetic d:Ld9/u;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lr9/e;Lm0/p1;Lm0/g2;Ld9/u;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/r3;->a:Lm9/d0;

    iput-object p2, p0, Lu1/r3;->b:Lm0/p1;

    iput-object p3, p0, Lu1/r3;->c:Lm0/g2;

    iput-object p4, p0, Lu1/r3;->d:Ld9/u;

    iput-object p5, p0, Lu1/r3;->e:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 11

    sget-object v0, Lu1/n3;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq p2, v2, :cond_7

    const/4 p1, 0x2

    if-eq p2, p1, :cond_2

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1

    if-eq p2, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object p1, p0, Lu1/r3;->c:Lm0/g2;

    invoke-virtual {p1}, Lm0/g2;->t()V

    goto/16 :goto_5

    :cond_1
    iget-object p1, p0, Lu1/r3;->c:Lm0/g2;

    iget-object p2, p1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iput-boolean v2, p1, Lm0/g2;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_2
    iget-object p1, p0, Lu1/r3;->b:Lm0/p1;

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p1, Lm0/p1;->b:Lm0/x0;

    iget-object v1, p1, Lm0/x0;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v3, p1, Lm0/x0;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-boolean v4, p1, Lm0/x0;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v4, :cond_3

    monitor-exit v1

    goto :goto_2

    :cond_3
    :try_start_4
    iget-object v3, p1, Lm0/x0;->b:Ljava/util/List;

    iget-object v4, p1, Lm0/x0;->c:Ljava/util/List;

    iput-object v4, p1, Lm0/x0;->b:Ljava/util/List;

    iput-object v3, p1, Lm0/x0;->c:Ljava/util/List;

    iput-boolean v2, p1, Lm0/x0;->d:Z

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p1

    move v2, p2

    :goto_0
    if-ge v2, p1, :cond_4

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/e;

    sget-object v5, Lq8/l;->a:Lq8/l;

    invoke-interface {v4, v5}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v1

    goto :goto_2

    :catchall_2
    move-exception p1

    :try_start_5
    monitor-exit v3

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_1
    monitor-exit v1

    throw p1

    :cond_5
    :goto_2
    iget-object p1, p0, Lu1/r3;->c:Lm0/g2;

    iget-object v1, p1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_6
    iget-boolean v2, p1, Lm0/g2;->q:Z

    if-eqz v2, :cond_6

    iput-boolean p2, p1, Lm0/g2;->q:Z

    invoke-virtual {p1}, Lm0/g2;->u()Lm9/k;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    goto :goto_4

    :cond_6
    :goto_3
    monitor-exit v1

    if-eqz v0, :cond_8

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_5

    :goto_4
    monitor-exit v1

    throw p1

    :cond_7
    iget-object p2, p0, Lu1/r3;->a:Lm9/d0;

    new-instance v10, Lu1/q3;

    iget-object v4, p0, Lu1/r3;->d:Ld9/u;

    iget-object v5, p0, Lu1/r3;->c:Lm0/g2;

    iget-object v8, p0, Lu1/r3;->e:Landroid/view/View;

    const/4 v9, 0x0

    move-object v3, v10

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v3 .. v9}, Lu1/q3;-><init>(Ld9/u;Lm0/g2;Landroidx/lifecycle/w;Lu1/r3;Landroid/view/View;Lu8/e;)V

    invoke-static {p2, v0, v1, v10, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_8
    :goto_5
    return-void
.end method
