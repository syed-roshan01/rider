.class public final Ls/p0;
.super Ly0/n;

# interfaces
.implements Lt1/b0;


# instance fields
.field public A:Ls/k0;

.field public B:J

.field public C:Ly0/g;

.field public final D:Ls/o0;

.field public final E:Ls/o0;

.field public u:Lt/u1;

.field public v:Lt/n1;

.field public w:Lt/n1;

.field public x:Lt/n1;

.field public y:Ls/q0;

.field public z:Ls/r0;


# direct methods
.method public constructor <init>(Lt/u1;Lt/n1;Lt/n1;Lt/n1;Ls/q0;Ls/r0;Ls/k0;)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Ls/p0;->u:Lt/u1;

    iput-object p2, p0, Ls/p0;->v:Lt/n1;

    iput-object p3, p0, Ls/p0;->w:Lt/n1;

    iput-object p4, p0, Ls/p0;->x:Lt/n1;

    iput-object p5, p0, Ls/p0;->y:Ls/q0;

    iput-object p6, p0, Ls/p0;->z:Ls/r0;

    iput-object p7, p0, Ls/p0;->A:Ls/k0;

    sget-wide p1, Ls/g0;->a:J

    iput-wide p1, p0, Ls/p0;->B:J

    const/16 p1, 0xf

    const/4 p2, 0x0

    invoke-static {p2, p2, p1}, Lo1/s;->b(III)J

    new-instance p1, Ls/o0;

    invoke-direct {p1, p0, p2}, Ls/o0;-><init>(Ls/p0;I)V

    iput-object p1, p0, Ls/p0;->D:Ls/o0;

    new-instance p1, Ls/o0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ls/o0;-><init>(Ls/p0;I)V

    iput-object p1, p0, Ls/p0;->E:Ls/o0;

    return-void
.end method


# virtual methods
.method public final G0()Ly0/d;
    .locals 3

    iget-object v0, p0, Ls/p0;->u:Lt/u1;

    invoke-virtual {v0}, Lt/u1;->c()Lt/o1;

    move-result-object v0

    sget-object v1, Ls/j0;->a:Ls/j0;

    sget-object v2, Ls/j0;->b:Ls/j0;

    invoke-interface {v0, v1, v2}, Lt/o1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/p0;->y:Ls/q0;

    iget-object v0, v0, Ls/q0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ls/p0;->z:Ls/r0;

    iget-object v0, v0, Ls/r0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls/p0;->z:Ls/r0;

    iget-object v0, v0, Ls/r0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ls/p0;->y:Ls/q0;

    iget-object v0, v0, Ls/q0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->g(I)I

    move-result p1

    return p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->V(I)I

    move-result p1

    return p1
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->Q(I)I

    move-result p1

    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Ls/p0;->u:Lt/u1;

    invoke-virtual {v2}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Ls/p0;->u:Lt/u1;

    iget-object v3, v3, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v3}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    iput-object v4, v0, Ls/p0;->C:Ly0/g;

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ls/p0;->C:Ly0/g;

    if-nez v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Ls/p0;->G0()Ly0/d;

    sget-object v2, Ly0/a;->a:Ly0/g;

    iput-object v2, v0, Ls/p0;->C:Ly0/g;

    :cond_1
    :goto_0
    invoke-interface/range {p1 .. p1}, Lr1/q;->q()Z

    move-result v2

    sget-object v3, Lr8/s;->a:Lr8/s;

    const/4 v5, 0x1

    const-wide v6, 0xffffffffL

    const/16 v8, 0x20

    if-eqz v2, :cond_2

    invoke-interface/range {p2 .. p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v2

    iget v4, v2, Lr1/x0;->a:I

    iget v9, v2, Lr1/x0;->b:I

    invoke-static {v4, v9}, Lo1/s;->e(II)J

    move-result-wide v9

    iput-wide v9, v0, Ls/p0;->B:J

    shr-long v11, v9, v8

    long-to-int v4, v11

    and-long/2addr v6, v9

    long-to-int v6, v6

    new-instance v7, Ls/z;

    invoke-direct {v7, v2, v5}, Ls/z;-><init>(Lr1/x0;I)V

    invoke-interface {v1, v4, v6, v3, v7}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v1

    return-object v1

    :cond_2
    iget-object v2, v0, Ls/p0;->A:Ls/k0;

    iget-object v9, v2, Ls/k0;->a:Lt/n1;

    const/4 v10, 0x0

    iget-object v11, v2, Ls/k0;->d:Ls/q0;

    iget-object v12, v2, Ls/k0;->e:Ls/r0;

    if-eqz v9, :cond_3

    new-instance v13, Ls/l0;

    invoke-direct {v13, v11, v12, v10}, Ls/l0;-><init>(Ls/q0;Ls/r0;I)V

    new-instance v14, Ls/l0;

    invoke-direct {v14, v11, v12, v5}, Ls/l0;-><init>(Ls/q0;Ls/r0;I)V

    invoke-virtual {v9, v13, v14}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object v9

    goto :goto_1

    :cond_3
    move-object v9, v4

    :goto_1
    const/4 v13, 0x2

    iget-object v14, v2, Ls/k0;->b:Lt/n1;

    const/4 v15, 0x3

    if-eqz v14, :cond_4

    new-instance v4, Ls/l0;

    invoke-direct {v4, v11, v12, v13}, Ls/l0;-><init>(Ls/q0;Ls/r0;I)V

    new-instance v6, Ls/l0;

    invoke-direct {v6, v11, v12, v15}, Ls/l0;-><init>(Ls/q0;Ls/r0;I)V

    invoke-virtual {v14, v4, v6}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    iget-object v6, v2, Ls/k0;->c:Lt/u1;

    invoke-virtual {v6}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Ls/j0;->a:Ls/j0;

    if-ne v6, v7, :cond_7

    iget-object v6, v11, Ls/q0;->a:Ls/b1;

    iget-object v6, v6, Ls/b1;->b:Ls/w0;

    if-eqz v6, :cond_5

    new-instance v7, Le1/p0;

    iget-wide v5, v6, Ls/w0;->b:J

    invoke-direct {v7, v5, v6}, Le1/p0;-><init>(J)V

    goto :goto_3

    :cond_5
    iget-object v5, v12, Ls/r0;->a:Ls/b1;

    iget-object v5, v5, Ls/b1;->b:Ls/w0;

    if-eqz v5, :cond_6

    new-instance v7, Le1/p0;

    iget-wide v5, v5, Ls/w0;->b:J

    invoke-direct {v7, v5, v6}, Le1/p0;-><init>(J)V

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    goto :goto_3

    :cond_7
    iget-object v5, v12, Ls/r0;->a:Ls/b1;

    iget-object v5, v5, Ls/b1;->b:Ls/w0;

    if-eqz v5, :cond_8

    new-instance v7, Le1/p0;

    iget-wide v5, v5, Ls/w0;->b:J

    invoke-direct {v7, v5, v6}, Le1/p0;-><init>(J)V

    goto :goto_3

    :cond_8
    iget-object v5, v11, Ls/q0;->a:Ls/b1;

    iget-object v5, v5, Ls/b1;->b:Ls/w0;

    if-eqz v5, :cond_6

    new-instance v7, Le1/p0;

    iget-wide v5, v5, Ls/w0;->b:J

    invoke-direct {v7, v5, v6}, Le1/p0;-><init>(J)V

    :goto_3
    iget-object v2, v2, Ls/k0;->f:Lt/n1;

    if-eqz v2, :cond_9

    sget-object v5, Ls/h0;->f:Ls/h0;

    new-instance v6, Lb/g;

    invoke-direct {v6, v7, v11, v12, v15}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v5, v6}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object v2

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    new-instance v5, Lb/g;

    invoke-direct {v5, v9, v4, v2, v13}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface/range {p2 .. p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v2

    iget v4, v2, Lr1/x0;->a:I

    iget v6, v2, Lr1/x0;->b:I

    invoke-static {v4, v6}, Lo1/s;->e(II)J

    move-result-wide v6

    iget-wide v11, v0, Ls/p0;->B:J

    sget-wide v14, Ls/g0;->a:J

    invoke-static {v11, v12, v14, v15}, Lm2/k;->a(JJ)Z

    move-result v9

    const/4 v4, 0x1

    xor-int/2addr v9, v4

    if-eqz v9, :cond_a

    iget-wide v11, v0, Ls/p0;->B:J

    goto :goto_5

    :cond_a
    move-wide v11, v6

    :goto_5
    iget-object v4, v0, Ls/p0;->v:Lt/n1;

    if-eqz v4, :cond_b

    new-instance v9, Ls/n0;

    invoke-direct {v9, v0, v11, v12, v10}, Ls/n0;-><init>(Ls/p0;JI)V

    iget-object v10, v0, Ls/p0;->D:Ls/o0;

    invoke-virtual {v4, v10, v9}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object v4

    goto :goto_6

    :cond_b
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lt/m1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/k;

    iget-wide v6, v4, Lm2/k;->a:J

    :cond_c
    move-wide/from16 v9, p3

    invoke-static {v9, v10, v6, v7}, Lo1/s;->o(JJ)J

    move-result-wide v6

    iget-object v4, v0, Ls/p0;->w:Lt/n1;

    if-eqz v4, :cond_d

    sget-object v9, Ls/h0;->n:Ls/h0;

    new-instance v10, Ls/n0;

    const/4 v14, 0x1

    invoke-direct {v10, v0, v11, v12, v14}, Ls/n0;-><init>(Ls/p0;JI)V

    invoke-virtual {v4, v9, v10}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object v4

    invoke-virtual {v4}, Lt/m1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/i;

    iget-wide v9, v4, Lm2/i;->a:J

    goto :goto_7

    :cond_d
    sget-wide v9, Lm2/i;->b:J

    :goto_7
    iget-object v4, v0, Ls/p0;->x:Lt/n1;

    if-eqz v4, :cond_e

    new-instance v14, Ls/n0;

    invoke-direct {v14, v0, v11, v12, v13}, Ls/n0;-><init>(Ls/p0;JI)V

    iget-object v13, v0, Ls/p0;->E:Ls/o0;

    invoke-virtual {v4, v13, v14}, Lt/n1;->a(Lc9/c;Lc9/c;)Lt/m1;

    move-result-object v4

    invoke-virtual {v4}, Lt/m1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/i;

    iget-wide v13, v4, Lm2/i;->a:J

    goto :goto_8

    :cond_e
    sget-wide v13, Lm2/i;->b:J

    :goto_8
    iget-object v4, v0, Ls/p0;->C:Ly0/g;

    if-eqz v4, :cond_f

    sget-object v21, Lm2/l;->a:Lm2/l;

    move-object/from16 v16, v4

    move-wide/from16 v17, v11

    move-wide/from16 v19, v6

    invoke-virtual/range {v16 .. v21}, Ly0/g;->a(JJLm2/l;)J

    move-result-wide v11

    goto :goto_9

    :cond_f
    sget-wide v11, Lm2/i;->b:J

    :goto_9
    sget v4, Lm2/i;->c:I

    shr-long v0, v11, v8

    long-to-int v0, v0

    move-object v1, v3

    shr-long v3, v13, v8

    long-to-int v3, v3

    add-int/2addr v0, v3

    const-wide v3, 0xffffffffL

    and-long/2addr v11, v3

    long-to-int v11, v11

    and-long v12, v13, v3

    long-to-int v12, v12

    add-int/2addr v11, v12

    invoke-static {v0, v11}, Li1/b;->c(II)J

    move-result-wide v18

    shr-long v11, v6, v8

    long-to-int v0, v11

    and-long/2addr v3, v6

    long-to-int v3, v3

    new-instance v4, Ls/m0;

    const/16 v23, 0x0

    move-object/from16 v16, v4

    move-object/from16 v17, v2

    move-wide/from16 v20, v9

    move-object/from16 v22, v5

    invoke-direct/range {v16 .. v23}, Ls/m0;-><init>(Ljava/lang/Object;JJLjava/lang/Object;I)V

    move-object/from16 v2, p1

    invoke-interface {v2, v0, v3, v1, v4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-interface {p2, p3}, Lr1/p;->X(I)I

    move-result p1

    return p1
.end method

.method public final z0()V
    .locals 2

    sget-wide v0, Ls/g0;->a:J

    iput-wide v0, p0, Ls/p0;->B:J

    return-void
.end method
