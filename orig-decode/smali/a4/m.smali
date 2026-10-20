.class public final La4/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final e:Ljava/lang/ThreadLocal;

.field public static final f:Lt1/p;


# instance fields
.field public a:Ljava/util/ArrayList;

.field public b:J

.field public c:J

.field public d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, La4/m;->e:Ljava/lang/ThreadLocal;

    new-instance v0, Lt1/p;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt1/p;-><init>(I)V

    sput-object v0, La4/m;->f:Lt1/p;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, La4/m;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, La4/m;->b:J

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->e0:La4/k;

    iput p2, p1, La4/k;->a:I

    iput p3, p1, La4/k;->b:I

    return-void
.end method

.method public final b(J)V
    .locals 12

    iget-object p1, p0, La4/m;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v1, p2, :cond_2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3}, Landroid/view/View;->getWindowVisibility()I

    move-result v4

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->e0:La4/k;

    iput v0, v3, La4/k;->c:I

    iget-object v4, v3, La4/k;->d:[I

    if-eqz v4, :cond_0

    const/4 v5, -0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    iget v3, v3, La4/k;->c:I

    add-int/2addr v2, v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, La4/m;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    move v2, v0

    move v3, v2

    :goto_1
    if-ge v2, p2, :cond_7

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->getWindowVisibility()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_5

    :cond_3
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->e0:La4/k;

    iget v6, v5, La4/k;->a:I

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v7, v5, La4/k;->b:I

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    add-int/2addr v7, v6

    move v6, v0

    :goto_2
    iget v8, v5, La4/k;->c:I

    mul-int/lit8 v8, v8, 0x2

    if-ge v6, v8, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-lt v3, v8, :cond_4

    new-instance v8, La4/l;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La4/l;

    :goto_3
    iget-object v9, v5, La4/k;->d:[I

    add-int/lit8 v10, v6, 0x1

    aget v10, v9, v10

    if-gt v10, v7, :cond_5

    const/4 v11, 0x1

    goto :goto_4

    :cond_5
    move v11, v0

    :goto_4
    iput-boolean v11, v8, La4/l;->a:Z

    iput v7, v8, La4/l;->b:I

    iput v10, v8, La4/l;->c:I

    iput-object v4, v8, La4/l;->d:Landroidx/recyclerview/widget/RecyclerView;

    aget v9, v9, v6

    iput v9, v8, La4/l;->e:I

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v6, v6, 0x2

    goto :goto_2

    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    sget-object p1, La4/m;->f:Lt1/p;

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_a

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La4/l;

    iget-object p2, p1, La4/l;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p2, :cond_8

    goto :goto_6

    :cond_8
    iget p1, p1, La4/l;->e:I

    iget-object v1, p2, Landroidx/recyclerview/widget/RecyclerView;->d:La4/c;

    invoke-virtual {v1}, La4/c;->e()I

    move-result v1

    const/4 v2, 0x0

    if-gtz v1, :cond_9

    iget-object v1, p2, Landroidx/recyclerview/widget/RecyclerView;->a:La4/l0;

    :try_start_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->n()V

    invoke-virtual {v1, p1}, La4/l0;->b(I)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->o(Z)V

    throw p1

    :cond_9
    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView;->d:La4/c;

    invoke-virtual {p1, v0}, La4/c;->d(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)V

    throw v2

    :cond_a
    :goto_6
    return-void
.end method

.method public final run()V
    .locals 9

    const-wide/16 v0, 0x0

    :try_start_0
    const-string v2, "RV Prefetch"

    sget v3, Lx2/q;->a:I

    invoke-static {v2}, Lx2/p;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, La4/m;->a:Ljava/util/ArrayList;

    :try_start_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    iput-wide v0, p0, La4/m;->b:J

    invoke-static {}, Lx2/p;->b()V

    return-void

    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move-wide v5, v0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    cmp-long v2, v5, v0

    if-nez v2, :cond_3

    iput-wide v0, p0, La4/m;->b:J

    invoke-static {}, Lx2/p;->b()V

    return-void

    :cond_3
    :try_start_3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    iget-wide v4, p0, La4/m;->c:J

    add-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, La4/m;->b(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iput-wide v0, p0, La4/m;->b:J

    invoke-static {}, Lx2/p;->b()V

    return-void

    :goto_2
    iput-wide v0, p0, La4/m;->b:J

    sget v0, Lx2/q;->a:I

    invoke-static {}, Lx2/p;->b()V

    throw v2
.end method
