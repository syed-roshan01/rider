.class public final Lc1/p;
.super Ly0/n;

# interfaces
.implements Lt1/m;
.implements Lt1/f1;
.implements Ls1/f;


# instance fields
.field public u:Z

.field public v:Z

.field public w:Lc1/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly0/n;-><init>()V

    sget-object v0, Lc1/o;->c:Lc1/o;

    iput-object v0, p0, Lc1/p;->w:Lc1/o;

    return-void
.end method


# virtual methods
.method public final B0()V
    .locals 3

    invoke-virtual {p0}, Lc1/p;->H0()Lc1/o;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lc1/p;->J0()V

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lc1/p;->J0()V

    invoke-static {p0}, Landroidx/compose/ui/focus/a;->E(Lc1/p;)Lc1/q;

    move-result-object v0

    :try_start_0
    iget-boolean v2, v0, Lc1/q;->c:Z

    if-eqz v2, :cond_2

    invoke-static {v0}, Lc1/q;->a(Lc1/q;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    :goto_0
    iput-boolean v1, v0, Lc1/q;->c:Z

    sget-object v1, Lc1/o;->c:Lc1/o;

    invoke-virtual {p0, v1}, Lc1/p;->K0(Lc1/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lc1/q;->b(Lc1/q;)V

    goto :goto_2

    :goto_1
    invoke-static {v0}, Lc1/q;->b(Lc1/q;)V

    throw v1

    :cond_3
    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    check-cast v0, Lc1/f;

    invoke-virtual {v0, v1, v1}, Lc1/f;->a(ZZ)V

    :goto_2
    return-void
.end method

.method public final G()V
    .locals 2

    invoke-virtual {p0}, Lc1/p;->H0()Lc1/o;

    move-result-object v0

    invoke-virtual {p0}, Lc1/p;->I0()V

    invoke-virtual {p0}, Lc1/p;->H0()Lc1/o;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/focus/a;->B(Lc1/p;)V

    :cond_0
    return-void
.end method

.method public final G0()Lc1/i;
    .locals 11

    new-instance v0, Lc1/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lc1/i;->a:Z

    sget-object v2, Lc1/k;->b:Lc1/k;

    iput-object v2, v0, Lc1/i;->b:Lc1/k;

    iput-object v2, v0, Lc1/i;->c:Lc1/k;

    iput-object v2, v0, Lc1/i;->d:Lc1/k;

    iput-object v2, v0, Lc1/i;->e:Lc1/k;

    iput-object v2, v0, Lc1/i;->f:Lc1/k;

    iput-object v2, v0, Lc1/i;->g:Lc1/k;

    iput-object v2, v0, Lc1/i;->h:Lc1/k;

    iput-object v2, v0, Lc1/i;->i:Lc1/k;

    sget-object v2, Lc1/g;->b:Lc1/g;

    iput-object v2, v0, Lc1/i;->j:Lc1/g;

    sget-object v2, Lc1/g;->c:Lc1/g;

    iput-object v2, v0, Lc1/i;->k:Lc1/g;

    iget-object v2, p0, Ly0/n;->a:Ly0/n;

    iget-boolean v3, v2, Ly0/n;->t:Z

    if-eqz v3, :cond_c

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v3

    move-object v4, v2

    :goto_0
    if-eqz v3, :cond_b

    iget-object v5, v3, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v5, v5, Lt1/x0;->e:Ly0/n;

    iget v5, v5, Ly0/n;->d:I

    and-int/lit16 v5, v5, 0xc00

    const/4 v6, 0x0

    if-eqz v5, :cond_9

    :goto_1
    if-eqz v4, :cond_9

    iget v5, v4, Ly0/n;->c:I

    and-int/lit16 v7, v5, 0xc00

    if-eqz v7, :cond_8

    if-eq v4, v2, :cond_0

    and-int/lit16 v7, v5, 0x400

    if-eqz v7, :cond_0

    goto/16 :goto_6

    :cond_0
    and-int/lit16 v5, v5, 0x800

    if-eqz v5, :cond_8

    move-object v5, v4

    move-object v7, v6

    :goto_2
    if-eqz v5, :cond_8

    instance-of v8, v5, Lc1/j;

    if-eqz v8, :cond_1

    check-cast v5, Lc1/j;

    invoke-interface {v5, v0}, Lc1/j;->s0(Lc1/h;)V

    goto :goto_5

    :cond_1
    iget v8, v5, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x800

    if-eqz v8, :cond_7

    instance-of v8, v5, Lt1/o;

    if-eqz v8, :cond_7

    move-object v8, v5

    check-cast v8, Lt1/o;

    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    const/4 v9, 0x0

    :goto_3
    if-eqz v8, :cond_6

    iget v10, v8, Ly0/n;->c:I

    and-int/lit16 v10, v10, 0x800

    if-eqz v10, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v1, :cond_2

    move-object v5, v8

    goto :goto_4

    :cond_2
    if-nez v7, :cond_3

    new-instance v7, Lo0/i;

    const/16 v10, 0x10

    new-array v10, v10, [Ly0/n;

    invoke-direct {v7, v10}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v7, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v5, v6

    :cond_4
    invoke-virtual {v7, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_6
    if-ne v9, v1, :cond_7

    goto :goto_2

    :cond_7
    :goto_5
    invoke-static {v7}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v5

    goto :goto_2

    :cond_8
    iget-object v4, v4, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_9
    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v3

    if-eqz v3, :cond_a

    iget-object v4, v3, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v4, :cond_a

    iget-object v4, v4, Lt1/x0;->d:Lt1/s1;

    goto :goto_0

    :cond_a
    move-object v4, v6

    goto :goto_0

    :cond_b
    :goto_6
    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitAncestors called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H0()Lc1/o;
    .locals 1

    iget-object v0, p0, Ly0/n;->a:Ly0/n;

    iget-object v0, v0, Ly0/n;->o:Lt1/c1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lc1/f;

    iget-object v0, v0, Lc1/f;->c:Lc1/q;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lc1/q;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc1/o;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lc1/p;->w:Lc1/o;

    :cond_2
    return-object v0
.end method

.method public final I0()V
    .locals 3

    invoke-virtual {p0}, Lc1/p;->H0()Lc1/o;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lu/r0;

    const/16 v2, 0xa

    invoke-direct {v1, v2, v0, p0}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v1}, Lt1/g;->w(Ly0/n;Lc9/a;)V

    iget-object v0, v0, Ld9/u;->a:Ljava/lang/Object;

    if-eqz v0, :cond_2

    check-cast v0, Lc1/h;

    invoke-interface {v0}, Lc1/h;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    check-cast v0, Lc1/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v1}, Lc1/f;->a(ZZ)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const-string v0, "focusProperties"

    invoke-static {v0}, Ld7/a;->D(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final J0()V
    .locals 11

    iget-object v0, p0, Ly0/n;->a:Ly0/n;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    const/4 v3, 0x1

    const/16 v4, 0x10

    const/4 v5, 0x0

    if-eqz v0, :cond_7

    instance-of v6, v0, Lc1/c;

    if-eqz v6, :cond_0

    check-cast v0, Lc1/c;

    invoke-static {v0}, Landroidx/compose/ui/focus/a;->q(Lc1/c;)V

    goto :goto_3

    :cond_0
    iget v6, v0, Ly0/n;->c:I

    and-int/lit16 v6, v6, 0x1000

    if-eqz v6, :cond_6

    instance-of v6, v0, Lt1/o;

    if-eqz v6, :cond_6

    move-object v6, v0

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    :goto_1
    if-eqz v6, :cond_5

    iget v7, v6, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x1000

    if-eqz v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v3, :cond_1

    move-object v0, v6

    goto :goto_2

    :cond_1
    if-nez v2, :cond_2

    new-instance v2, Lo0/i;

    new-array v7, v4, [Ly0/n;

    invoke-direct {v2, v7}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v2, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_3
    invoke-virtual {v2, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_5
    if-ne v5, v3, :cond_6

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {v2}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_0

    :cond_7
    iget-object v0, p0, Ly0/n;->a:Ly0/n;

    iget-boolean v2, v0, Ly0/n;->t:Z

    if-eqz v2, :cond_14

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v2

    :goto_4
    if-eqz v2, :cond_13

    iget-object v6, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v6, v6, Lt1/x0;->e:Ly0/n;

    iget v6, v6, Ly0/n;->d:I

    and-int/lit16 v6, v6, 0x1400

    if-eqz v6, :cond_11

    :goto_5
    if-eqz v0, :cond_11

    iget v6, v0, Ly0/n;->c:I

    and-int/lit16 v7, v6, 0x1400

    if-eqz v7, :cond_10

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_8

    goto :goto_a

    :cond_8
    iget-boolean v6, v0, Ly0/n;->t:Z

    if-eqz v6, :cond_10

    move-object v6, v0

    move-object v7, v1

    :goto_6
    if-eqz v6, :cond_10

    instance-of v8, v6, Lc1/c;

    if-eqz v8, :cond_9

    check-cast v6, Lc1/c;

    invoke-static {v6}, Landroidx/compose/ui/focus/a;->q(Lc1/c;)V

    goto :goto_9

    :cond_9
    iget v8, v6, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x1000

    if-eqz v8, :cond_f

    instance-of v8, v6, Lt1/o;

    if-eqz v8, :cond_f

    move-object v8, v6

    check-cast v8, Lt1/o;

    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    move v9, v5

    :goto_7
    if-eqz v8, :cond_e

    iget v10, v8, Ly0/n;->c:I

    and-int/lit16 v10, v10, 0x1000

    if-eqz v10, :cond_d

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v3, :cond_a

    move-object v6, v8

    goto :goto_8

    :cond_a
    if-nez v7, :cond_b

    new-instance v7, Lo0/i;

    new-array v10, v4, [Ly0/n;

    invoke-direct {v7, v10}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_b
    if-eqz v6, :cond_c

    invoke-virtual {v7, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v6, v1

    :cond_c
    invoke-virtual {v7, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_d
    :goto_8
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_7

    :cond_e
    if-ne v9, v3, :cond_f

    goto :goto_6

    :cond_f
    :goto_9
    invoke-static {v7}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v6

    goto :goto_6

    :cond_10
    :goto_a
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_5

    :cond_11
    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v2

    if-eqz v2, :cond_12

    iget-object v0, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v0, :cond_12

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    goto :goto_4

    :cond_12
    move-object v0, v1

    goto :goto_4

    :cond_13
    return-void

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitAncestors called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final K0(Lc1/o;)V
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/focus/a;->E(Lc1/p;)Lc1/q;

    move-result-object v0

    iget-object v0, v0, Lc1/q;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
