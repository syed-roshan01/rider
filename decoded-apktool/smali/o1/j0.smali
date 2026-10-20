.class public final Lo1/j0;
.super Ly0/n;

# interfaces
.implements Lo1/d0;
.implements Lo1/z;
.implements Lm2/b;


# instance fields
.field public A:J

.field public u:Lc9/e;

.field public v:Lm9/x1;

.field public w:Lo1/k;

.field public final x:Lo0/i;

.field public final y:Lo0/i;

.field public z:Lo1/k;


# direct methods
.method public constructor <init>(Lc9/e;)V
    .locals 2

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lo1/j0;->u:Lc9/e;

    sget-object p1, Lo1/c0;->a:Lo1/k;

    iput-object p1, p0, Lo1/j0;->w:Lo1/k;

    new-instance p1, Lo0/i;

    const/16 v0, 0x10

    new-array v1, v0, [Lo1/h0;

    invoke-direct {p1, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lo1/j0;->x:Lo0/i;

    new-instance p1, Lo0/i;

    new-array v0, v0, [Lo1/h0;

    invoke-direct {p1, v0}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lo1/j0;->y:Lo0/i;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo1/j0;->A:J

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 0

    invoke-virtual {p0}, Lo1/j0;->I0()V

    return-void
.end method

.method public final G0(Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p2, Lo1/h0;

    invoke-direct {p2, p0, v0}, Lo1/h0;-><init>(Lo1/j0;Lm9/l;)V

    iget-object v1, p0, Lo1/j0;->x:Lo0/i;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lo1/j0;->x:Lo0/i;

    invoke-virtual {v2, p2}, Lo0/i;->c(Ljava/lang/Object;)V

    new-instance v2, Lu8/l;

    invoke-static {p2, p2, p1}, Ld7/t;->M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;

    move-result-object p1

    invoke-static {p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p1

    sget-object v3, Lv8/a;->a:Lv8/a;

    invoke-direct {v2, v3, p1}, Lu8/l;-><init>(Lv8/a;Lu8/e;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-virtual {v2, p1}, Lu8/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    new-instance p1, Lh1/b;

    const/4 v1, 0x2

    invoke-direct {p1, p2, v1}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lm9/l;->v(Lc9/c;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final H0(Lo1/k;Lo1/l;)V
    .locals 6

    iget-object v0, p0, Lo1/j0;->x:Lo0/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo1/j0;->y:Lo0/i;

    iget-object v2, p0, Lo1/j0;->x:Lo0/i;

    iget v3, v1, Lo0/i;->c:I

    invoke-virtual {v1, v3, v2}, Lo0/i;->d(ILo0/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo1/j0;->y:Lo0/i;

    iget v3, v0, Lo0/i;->c:I

    if-lez v3, :cond_6

    sub-int/2addr v3, v2

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    :cond_1
    aget-object v2, v0, v3

    check-cast v2, Lo1/h0;

    iget-object v4, v2, Lo1/h0;->d:Lo1/l;

    if-ne p2, v4, :cond_2

    iget-object v4, v2, Lo1/h0;->c:Lm9/k;

    if-eqz v4, :cond_2

    iput-object v1, v2, Lo1/h0;->c:Lm9/k;

    invoke-interface {v4, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v3, v3, -0x1

    if-gez v3, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lo1/j0;->y:Lo0/i;

    iget v2, v0, Lo0/i;->c:I

    if-lez v2, :cond_6

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_4
    aget-object v4, v0, v3

    check-cast v4, Lo1/h0;

    iget-object v5, v4, Lo1/h0;->d:Lo1/l;

    if-ne p2, v5, :cond_5

    iget-object v5, v4, Lo1/h0;->c:Lm9/k;

    if-eqz v5, :cond_5

    iput-object v1, v4, Lo1/h0;->c:Lm9/k;

    invoke-interface {v5, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_4

    :cond_6
    :goto_0
    iget-object p1, p0, Lo1/j0;->y:Lo0/i;

    invoke-virtual {p1}, Lo0/i;->g()V

    return-void

    :goto_1
    iget-object p2, p0, Lo1/j0;->y:Lo0/i;

    invoke-virtual {p2}, Lo0/i;->g()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final I0()V
    .locals 3

    iget-object v0, p0, Lo1/j0;->v:Lm9/x1;

    if-eqz v0, :cond_0

    new-instance v1, Lt/y0;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lt/y0;-><init>(I)V

    invoke-virtual {v0, v1}, Lm9/p1;->a(Ljava/util/concurrent/CancellationException;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lo1/j0;->v:Lm9/x1;

    :cond_0
    return-void
.end method

.method public final X()V
    .locals 0

    invoke-virtual {p0}, Lo1/j0;->I0()V

    return-void
.end method

.method public final b0()V
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lo1/j0;->z:Lo1/k;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo1/u;

    iget-boolean v5, v5, Lo1/u;->d:Z

    xor-int/lit8 v5, v5, 0x1

    if-nez v5, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo1/u;

    iget-wide v7, v5, Lo1/u;->a:J

    iget-wide v14, v5, Lo1/u;->c:J

    iget-wide v11, v5, Lo1/u;->b:J

    iget v13, v5, Lo1/u;->e:F

    iget-boolean v5, v5, Lo1/u;->d:Z

    new-instance v9, Lo1/u;

    const/16 v16, 0x0

    const/16 v21, 0x1

    sget-wide v22, Ld1/c;->b:J

    move-object v6, v9

    move-object/from16 v24, v9

    move-wide v9, v11

    move-wide/from16 v17, v11

    move-wide v11, v14

    move/from16 v19, v13

    move/from16 v13, v16

    move-wide/from16 v25, v14

    move/from16 v14, v19

    move-wide/from16 v15, v17

    move-wide/from16 v17, v25

    move/from16 v19, v5

    move/from16 v20, v5

    invoke-direct/range {v6 .. v23}, Lo1/u;-><init>(JJJZFJJZZIJ)V

    move-object/from16 v5, v24

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-instance v1, Lo1/k;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo1/k;-><init>(Ljava/util/List;Lo1/f;)V

    iput-object v1, v0, Lo1/j0;->w:Lo1/k;

    sget-object v2, Lo1/l;->a:Lo1/l;

    invoke-virtual {v0, v1, v2}, Lo1/j0;->H0(Lo1/k;Lo1/l;)V

    sget-object v2, Lo1/l;->b:Lo1/l;

    invoke-virtual {v0, v1, v2}, Lo1/j0;->H0(Lo1/k;Lo1/l;)V

    sget-object v2, Lo1/l;->c:Lo1/l;

    invoke-virtual {v0, v1, v2}, Lo1/j0;->H0(Lo1/k;Lo1/l;)V

    iput-object v3, v0, Lo1/j0;->z:Lo1/k;

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final c()F
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final k()V
    .locals 0

    invoke-virtual {p0}, Lo1/j0;->I0()V

    return-void
.end method

.method public final m()F
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 4

    iput-wide p3, p0, Lo1/j0;->A:J

    sget-object p3, Lo1/l;->a:Lo1/l;

    if-ne p2, p3, :cond_0

    iput-object p1, p0, Lo1/j0;->w:Lo1/k;

    :cond_0
    iget-object p3, p0, Lo1/j0;->v:Lm9/x1;

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-nez p3, :cond_1

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object p3

    new-instance v1, Lo1/i0;

    invoke-direct {v1, p0, p4}, Lo1/i0;-><init>(Lo1/j0;Lu8/e;)V

    const/4 v2, 0x4

    invoke-static {p3, p4, v2, v1, v0}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    move-result-object p3

    iput-object p3, p0, Lo1/j0;->v:Lm9/x1;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lo1/j0;->H0(Lo1/k;Lo1/l;)V

    iget-object p2, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p3, :cond_3

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/u;

    invoke-static {v3}, Lm9/e0;->t(Lo1/u;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    move v1, v0

    :goto_1
    xor-int/lit8 p2, v1, 0x1

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p4

    :goto_2
    iput-object p1, p0, Lo1/j0;->z:Lo1/k;

    return-void
.end method
