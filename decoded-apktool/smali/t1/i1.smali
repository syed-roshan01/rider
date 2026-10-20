.class public final Lt1/i1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;

.field public b:[Landroidx/compose/ui/node/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Landroidx/compose/ui/node/a;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lt1/i1;->a:Lo0/i;

    return-void
.end method

.method public static a(Landroidx/compose/ui/node/a;)V
    .locals 10

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v0, Lt1/n0;->c:I

    const/4 v2, 0x1

    const/4 v3, 0x5

    const/4 v4, 0x0

    if-ne v1, v3, :cond_a

    iget-boolean v1, v0, Lt1/n0;->e:Z

    if-nez v1, :cond_a

    iget-boolean v0, v0, Lt1/n0;->d:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->J:Z

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->D()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->e:Ly0/n;

    iget v1, v0, Ly0/n;->d:I

    const/16 v3, 0x100

    and-int/2addr v1, v3

    if-eqz v1, :cond_a

    :goto_0
    if-eqz v0, :cond_a

    iget v1, v0, Ly0/n;->c:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    move-object v5, v0

    move-object v6, v1

    :goto_1
    if-eqz v5, :cond_9

    instance-of v7, v5, Lt1/t;

    if-eqz v7, :cond_2

    check-cast v5, Lt1/t;

    invoke-static {v5, v3}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v7

    invoke-interface {v5, v7}, Lt1/t;->r0(Lt1/c1;)V

    goto :goto_4

    :cond_2
    iget v7, v5, Ly0/n;->c:I

    and-int/2addr v7, v3

    if-eqz v7, :cond_8

    instance-of v7, v5, Lt1/o;

    if-eqz v7, :cond_8

    move-object v7, v5

    check-cast v7, Lt1/o;

    iget-object v7, v7, Lt1/o;->v:Ly0/n;

    move v8, v4

    :goto_2
    if-eqz v7, :cond_7

    iget v9, v7, Ly0/n;->c:I

    and-int/2addr v9, v3

    if-eqz v9, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v2, :cond_3

    move-object v5, v7

    goto :goto_3

    :cond_3
    if-nez v6, :cond_4

    new-instance v6, Lo0/i;

    const/16 v9, 0x10

    new-array v9, v9, [Ly0/n;

    invoke-direct {v6, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v5, :cond_5

    invoke-virtual {v6, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v5, v1

    :cond_5
    invoke-virtual {v6, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_7
    if-ne v8, v2, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v6}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v5

    goto :goto_1

    :cond_9
    iget v1, v0, Ly0/n;->d:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_a

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_a
    :goto_5
    iput-boolean v4, p0, Landroidx/compose/ui/node/a;->I:Z

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object p0

    iget v0, p0, Lo0/i;->c:I

    if-lez v0, :cond_c

    iget-object p0, p0, Lo0/i;->a:[Ljava/lang/Object;

    :cond_b
    aget-object v1, p0, v4

    check-cast v1, Landroidx/compose/ui/node/a;

    invoke-static {v1}, Lt1/i1;->a(Landroidx/compose/ui/node/a;)V

    add-int/2addr v4, v2

    if-lt v4, v0, :cond_b

    :cond_c
    return-void
.end method
