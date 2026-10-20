.class public final Lt/u1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt/v1;

.field public final b:Ljava/lang/String;

.field public final c:Lm0/n1;

.field public final d:Lm0/n1;

.field public final e:Lm0/m1;

.field public final f:Lm0/m1;

.field public final g:Lm0/n1;

.field public final h:Lw0/u;

.field public final i:Lw0/u;

.field public final j:Lm0/n1;

.field public k:J

.field public final l:Lm0/j0;


# direct methods
.method public constructor <init>(Lt/x0;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/u1;->a:Lt/v1;

    iput-object p2, p0, Lt/u1;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/u1;->c:Lm0/n1;

    new-instance p1, Lt/p1;

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lt/p1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/u1;->d:Lm0/n1;

    sget p1, Lm0/b;->b:I

    new-instance p1, Lm0/m1;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Lm0/m1;-><init>(J)V

    iput-object p1, p0, Lt/u1;->e:Lm0/m1;

    new-instance p1, Lm0/m1;

    const-wide/high16 v0, -0x8000000000000000L

    invoke-direct {p1, v0, v1}, Lm0/m1;-><init>(J)V

    iput-object p1, p0, Lt/u1;->f:Lm0/m1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/u1;->g:Lm0/n1;

    new-instance p1, Lw0/u;

    invoke-direct {p1}, Lw0/u;-><init>()V

    iput-object p1, p0, Lt/u1;->h:Lw0/u;

    new-instance p1, Lw0/u;

    invoke-direct {p1}, Lw0/u;-><init>()V

    iput-object p1, p0, Lt/u1;->i:Lw0/u;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/u1;->j:Lm0/n1;

    new-instance p1, Ls/b0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ls/b0;-><init>(Lt/u1;I)V

    invoke-static {p1}, Ld7/t;->R(Lc9/a;)Lm0/j0;

    move-result-object p1

    iput-object p1, p0, Lt/u1;->l:Lm0/j0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm0/m;I)V
    .locals 6

    check-cast p2, Lm0/q;

    const v0, -0x59064cff

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x5b

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-ne v1, v2, :cond_5

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lm0/q;->U()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result v1

    if-nez v1, :cond_a

    and-int/lit8 v1, v0, 0xe

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Lt/u1;->h(Ljava/lang/Object;Lm0/m;I)V

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lt/u1;->f:Lm0/m1;

    invoke-virtual {v0}, Lm0/w2;->d()J

    move-result-wide v0

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v0, v0, v4

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lt/u1;->g:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_7
    :goto_4
    const v0, -0x2170a178

    invoke-virtual {p2, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne v1, v0, :cond_9

    :cond_8
    new-instance v1, Lt/s1;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lt/s1;-><init>(Lt/u1;Lu8/e;)V

    invoke-virtual {p2, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lc9/e;

    invoke-virtual {p2, v3}, Lm0/q;->t(Z)V

    invoke-static {p0, v1, p2}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    :cond_a
    :goto_5
    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lt/t1;

    invoke-direct {v0, p0, p1, p3, v3}, Lt/t1;-><init>(Lt/u1;Ljava/lang/Object;II)V

    iput-object v0, p2, Lm0/x1;->d:Lc9/e;

    :cond_b
    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt/u1;->a:Lt/v1;

    check-cast v0, Lt/x0;

    iget-object v0, v0, Lt/x0;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lt/o1;
    .locals 1

    iget-object v0, p0, Lt/u1;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/o1;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lt/u1;->j:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(FJ)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, p2

    iget-object v4, v0, Lt/u1;->f:Lm0/m1;

    invoke-virtual {v4}, Lm0/w2;->d()J

    move-result-wide v5

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v5, v5, v7

    if-nez v5, :cond_0

    invoke-virtual {v4, v2, v3}, Lm0/w2;->f(J)V

    iget-object v5, v0, Lt/u1;->a:Lt/v1;

    iget-object v5, v5, Lt/v1;->a:Lm0/n1;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_0
    iget-object v5, v0, Lt/u1;->g:Lm0/n1;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm0/w2;->d()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v4, v0, Lt/u1;->e:Lm0/m1;

    invoke-virtual {v4, v2, v3}, Lm0/w2;->f(J)V

    iget-object v2, v0, Lt/u1;->h:Lw0/u;

    invoke-virtual {v2}, Lw0/u;->size()I

    move-result v3

    const/4 v5, 0x1

    move v8, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_6

    invoke-virtual {v2, v7}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lt/q1;

    iget-object v10, v9, Lt/q1;->e:Lm0/n1;

    invoke-virtual {v10}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    iget-object v11, v9, Lt/q1;->e:Lm0/n1;

    if-nez v10, :cond_3

    invoke-virtual {v4}, Lm0/w2;->d()J

    move-result-wide v12

    const/4 v10, 0x0

    cmpl-float v10, v1, v10

    iget-object v14, v9, Lt/q1;->f:Lm0/m1;

    if-lez v10, :cond_2

    invoke-virtual {v14}, Lm0/w2;->d()J

    move-result-wide v15

    move v10, v7

    sub-long v6, v12, v15

    long-to-float v6, v6

    div-float/2addr v6, v1

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    xor-int/2addr v7, v5

    if-eqz v7, :cond_1

    float-to-long v6, v6

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Duration scale adjusted time is NaN. Duration scale: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",playTimeNanos: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", offsetTimeNanos: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Lm0/w2;->d()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    move v10, v7

    invoke-virtual {v9}, Lt/q1;->b()Lt/l1;

    move-result-object v6

    iget-wide v6, v6, Lt/l1;->h:J

    :goto_1
    invoke-virtual {v9}, Lt/q1;->b()Lt/l1;

    move-result-object v12

    invoke-virtual {v12, v6, v7}, Lt/l1;->b(J)Ljava/lang/Object;

    move-result-object v12

    iget-object v13, v9, Lt/q1;->o:Lm0/n1;

    invoke-virtual {v13, v12}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lt/q1;->b()Lt/l1;

    move-result-object v12

    invoke-virtual {v12, v6, v7}, Lt/l1;->f(J)Lt/t;

    move-result-object v12

    iput-object v12, v9, Lt/q1;->p:Lt/t;

    invoke-virtual {v9}, Lt/q1;->b()Lt/l1;

    move-result-object v9

    invoke-interface {v9, v6, v7}, Lt/j;->g(J)Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v11, v6}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const-wide/16 v6, 0x0

    invoke-virtual {v14, v6, v7}, Lm0/w2;->f(J)V

    goto :goto_2

    :cond_3
    move v10, v7

    :cond_4
    :goto_2
    invoke-virtual {v11}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_5

    const/4 v8, 0x0

    :cond_5
    add-int/lit8 v7, v10, 0x1

    goto/16 :goto_0

    :cond_6
    iget-object v2, v0, Lt/u1;->i:Lw0/u;

    invoke-virtual {v2}, Lw0/u;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v3, :cond_9

    invoke-virtual {v2, v5}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt/u1;

    iget-object v7, v6, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v7}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7, v9}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    invoke-virtual {v4}, Lm0/w2;->d()J

    move-result-wide v9

    invoke-virtual {v6, v1, v9, v10}, Lt/u1;->e(FJ)V

    :cond_7
    iget-object v7, v6, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v7}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    const/4 v8, 0x0

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_9
    if-eqz v8, :cond_a

    invoke-virtual/range {p0 .. p0}, Lt/u1;->f()V

    :cond_a
    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lt/u1;->f:Lm0/m1;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lm0/w2;->f(J)V

    iget-object v0, p0, Lt/u1;->a:Lt/v1;

    instance-of v1, v0, Lt/x0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lt/x0;

    iget-object v2, p0, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v1, v1, Lt/x0;->b:Lm0/n1;

    invoke-virtual {v1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lt/u1;->e:Lm0/m1;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Lm0/w2;->f(J)V

    iget-object v0, v0, Lt/v1;->a:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lt/u1;->f:Lm0/m1;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lm0/w2;->f(J)V

    iget-object v0, p0, Lt/u1;->a:Lt/v1;

    iget-object v1, v0, Lt/v1;->a:Lm0/n1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result v1

    iget-object v2, p0, Lt/u1;->c:Lm0/n1;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    instance-of v1, v0, Lt/x0;

    if-eqz v1, :cond_1

    check-cast v0, Lt/x0;

    iget-object v0, v0, Lt/x0;->b:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v2, p4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lt/u1;->j:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    new-instance v0, Lt/p1;

    invoke-direct {v0, p1, p4}, Lt/p1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lt/u1;->d:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_2
    iget-object p1, p0, Lt/u1;->i:Lw0/u;

    invoke-virtual {p1}, Lw0/u;->size()I

    move-result p4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_4

    invoke-virtual {p1, v1}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt/u1;

    const-string v3, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>"

    invoke-static {v2, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lt/u1;->d()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v2, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, p2, p3, v4}, Lt/u1;->g(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lt/u1;->h:Lw0/u;

    invoke-virtual {p1}, Lw0/u;->size()I

    move-result p4

    :goto_1
    if-ge v0, p4, :cond_5

    invoke-virtual {p1, v0}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt/q1;

    invoke-virtual {v1}, Lt/q1;->b()Lt/l1;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Lt/l1;->b(J)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v1, Lt/q1;->o:Lm0/n1;

    invoke-virtual {v3, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt/q1;->b()Lt/l1;

    move-result-object v2

    invoke-virtual {v2, p2, p3}, Lt/l1;->f(J)Lt/t;

    move-result-object v2

    iput-object v2, v1, Lt/q1;->p:Lt/t;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    iput-wide p2, p0, Lt/u1;->k:J

    return-void
.end method

.method public final h(Ljava/lang/Object;Lm0/m;I)V
    .locals 5

    check-cast p2, Lm0/q;

    const v0, -0x22cebf19

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x70

    if-nez v1, :cond_3

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v0, v0, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_5

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lm0/q;->U()V

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    new-instance v1, Lt/p1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lt/p1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lt/u1;->d:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lt/u1;->a:Lt/v1;

    instance-of v2, v1, Lt/x0;

    if-eqz v2, :cond_6

    check-cast v1, Lt/x0;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v2

    iget-object v1, v1, Lt/x0;->b:Lm0/n1;

    invoke-virtual {v1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can only update the current state with MutableTransitionState"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_4
    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lt/u1;->f:Lm0/m1;

    invoke-virtual {v0}, Lm0/w2;->d()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    iget-object v0, p0, Lt/u1;->g:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_5
    iget-object v0, p0, Lt/u1;->h:Lw0/u;

    invoke-virtual {v0}, Lw0/u;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v1, :cond_9

    invoke-virtual {v0, v2}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt/q1;

    iget-object v3, v3, Lt/q1;->n:Lm0/n1;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, Lt/t1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lt/t1;-><init>(Lt/u1;Ljava/lang/Object;II)V

    iput-object v0, p2, Lm0/x1;->d:Lc9/e;

    :cond_a
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lt/u1;->h:Lw0/u;

    invoke-virtual {v0}, Lw0/u;->size()I

    move-result v1

    const-string v2, "Transition animation values: "

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt/q1;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method
