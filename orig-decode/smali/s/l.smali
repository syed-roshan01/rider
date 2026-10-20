.class public final Ls/l;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Lt/u1;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lc9/c;

.field public final synthetic d:Ls/w;

.field public final synthetic e:Lw0/u;

.field public final synthetic f:Lc9/g;


# direct methods
.method public constructor <init>(Lt/u1;Ljava/lang/Object;Lc9/c;Ls/w;Lw0/u;Lc9/g;)V
    .locals 0

    iput-object p1, p0, Ls/l;->a:Lt/u1;

    iput-object p2, p0, Ls/l;->b:Ljava/lang/Object;

    iput-object p3, p0, Ls/l;->c:Lc9/c;

    iput-object p4, p0, Ls/l;->d:Ls/w;

    iput-object p5, p0, Ls/l;->e:Lw0/u;

    iput-object p6, p0, Ls/l;->f:Lc9/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lm0/m;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lm0/q;

    invoke-virtual {v2}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lm0/q;->U()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    move-object v11, v1

    check-cast v11, Lm0/q;

    const v1, -0x1d58f75c

    invoke-virtual {v11, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lm0/l;->a:Lk0/y0;

    iget-object v4, v0, Ls/l;->d:Ls/w;

    iget-object v5, v0, Ls/l;->c:Lc9/c;

    if-ne v2, v3, :cond_2

    invoke-interface {v5, v4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls/i0;

    invoke-virtual {v11, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lm0/q;->t(Z)V

    check-cast v2, Ls/i0;

    iget-object v7, v0, Ls/l;->a:Lt/u1;

    invoke-virtual {v7}, Lt/u1;->c()Lt/o1;

    move-result-object v8

    invoke-interface {v8}, Lt/o1;->c()Ljava/lang/Object;

    move-result-object v8

    iget-object v9, v0, Ls/l;->b:Ljava/lang/Object;

    invoke-static {v8, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const v10, 0x44faf204

    invoke-virtual {v11, v10}, Lm0/q;->Z(I)V

    invoke-virtual {v11, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_3

    if-ne v10, v3, :cond_5

    :cond_3
    invoke-virtual {v7}, Lt/u1;->c()Lt/o1;

    move-result-object v8

    invoke-interface {v8}, Lt/o1;->c()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    sget-object v4, Ls/r0;->b:Ls/r0;

    :goto_1
    move-object v10, v4

    goto :goto_2

    :cond_4
    invoke-interface {v5, v4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls/i0;

    iget-object v4, v4, Ls/i0;->b:Ls/r0;

    goto :goto_1

    :goto_2
    invoke-virtual {v11, v10}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {v11, v6}, Lm0/q;->t(Z)V

    move-object v8, v10

    check-cast v8, Ls/r0;

    invoke-virtual {v11, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, v7, Lt/u1;->c:Lm0/n1;

    if-ne v1, v3, :cond_6

    new-instance v1, Ls/s;

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-boolean v5, v1, Ls/s;->b:Z

    invoke-virtual {v11, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v11, v6}, Lm0/q;->t(Z)V

    check-cast v1, Ls/s;

    iget-object v7, v2, Ls/i0;->a:Ls/q0;

    sget-object v5, Ly0/l;->b:Ly0/l;

    new-instance v10, Ls/h;

    invoke-direct {v10, v2, v6}, Ls/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v5, v10}, Landroidx/compose/ui/layout/a;->g(Ly0/o;Lc9/f;)Ly0/o;

    move-result-object v2

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    iput-boolean v4, v1, Ls/s;->b:Z

    invoke-interface {v2, v1}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v1

    iget-object v4, v0, Ls/l;->a:Lt/u1;

    new-instance v5, Lq/w;

    const/4 v2, 0x1

    invoke-direct {v5, v9, v2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    const v2, 0x279793ad

    invoke-virtual {v11, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v11, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_7

    if-ne v9, v3, :cond_8

    :cond_7
    new-instance v9, Ls/i;

    invoke-direct {v9, v8, v6}, Ls/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lc9/e;

    invoke-virtual {v11, v6}, Lm0/q;->t(Z)V

    new-instance v2, Ls/k;

    iget-object v13, v0, Ls/l;->d:Ls/w;

    iget-object v14, v0, Ls/l;->b:Ljava/lang/Object;

    iget-object v15, v0, Ls/l;->e:Lw0/u;

    iget-object v3, v0, Ls/l;->f:Lc9/g;

    const/16 v17, 0x0

    move-object v12, v2

    move-object/from16 v16, v3

    invoke-direct/range {v12 .. v17}, Ls/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, -0x24ba65ea

    invoke-static {v11, v3, v2}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v10

    const/high16 v12, 0xc00000

    const/16 v13, 0x40

    move-object v6, v1

    invoke-static/range {v4 .. v13}, Lm9/e0;->a(Lt/u1;Lc9/c;Ly0/o;Ls/q0;Ls/r0;Lc9/e;Lc9/f;Lm0/m;II)V

    :goto_3
    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1
.end method
