.class public abstract Lm9/e0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Li3/u;

.field public static final b:Li3/u;

.field public static final c:Li3/u;

.field public static final d:Li3/u;

.field public static final e:Li3/u;

.field public static final f:Li3/u;

.field public static final g:Li3/u;

.field public static final h:Li3/u;

.field public static final i:Lm9/q0;

.field public static final j:Lm9/q0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Li3/u;

    const-string v1, "RESUME_TOKEN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->a:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "REMOVED_TASK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->b:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->c:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "COMPLETING_ALREADY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->d:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->e:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->f:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->g:Li3/u;

    new-instance v0, Li3/u;

    const-string v1, "SEALED"

    invoke-direct {v0, v1, v2}, Li3/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/e0;->h:Li3/u;

    new-instance v0, Lm9/q0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/q0;-><init>(Z)V

    sput-object v0, Lm9/e0;->i:Lm9/q0;

    new-instance v0, Lm9/q0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm9/q0;-><init>(Z)V

    sput-object v0, Lm9/e0;->j:Lm9/q0;

    return-void
.end method

.method public static final A(La2/a0;I)Ll2/h;
    .locals 2

    iget-object v0, p0, La2/a0;->a:La2/z;

    iget-object v0, v0, La2/z;->a:La2/e;

    invoke-virtual {v0}, La2/e;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, La2/a0;->f(I)I

    move-result v0

    if-eqz p1, :cond_1

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {p0, v1}, La2/a0;->f(I)I

    move-result v1

    if-eq v0, v1, :cond_2

    :cond_1
    iget-object v1, p0, La2/a0;->a:La2/z;

    iget-object v1, v1, La2/z;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq p1, v1, :cond_3

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1}, La2/a0;->f(I)I

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, La2/a0;->a(I)Ll2/h;

    move-result-object p0

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, La2/a0;->m(I)Ll2/h;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final B(II)I
    .locals 0

    shr-int/2addr p0, p1

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static final C()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid applier"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final D(Lo1/u;J)Z
    .locals 4

    iget-wide v0, p0, Lo1/u;->c:J

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result p0

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    const/4 p2, 0x0

    cmpg-float v2, p0, p2

    if-ltz v2, :cond_1

    int-to-float v1, v1

    cmpl-float p0, p0, v1

    if-gtz p0, :cond_1

    cmpg-float p0, v0, p2

    if-ltz p0, :cond_1

    int-to-float p0, p1

    cmpl-float p0, v0, p0

    if-lez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final E(Lo1/u;JJ)Z
    .locals 7

    iget v0, p0, Lo1/u;->i:I

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo1/s;->u(II)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1, p2}, Lm9/e0;->D(Lo1/u;J)Z

    move-result p0

    return p0

    :cond_0
    iget-wide v2, p0, Lo1/u;->c:J

    invoke-static {v2, v3}, Ld1/c;->d(J)F

    move-result p0

    invoke-static {v2, v3}, Ld1/c;->e(J)F

    move-result v0

    invoke-static {p3, p4}, Ld1/f;->d(J)F

    move-result v2

    neg-float v2, v2

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v3, v3

    int-to-float v3, v3

    invoke-static {p3, p4}, Ld1/f;->d(J)F

    move-result v4

    add-float/2addr v4, v3

    invoke-static {p3, p4}, Ld1/f;->b(J)F

    move-result v3

    neg-float v3, v3

    const-wide v5, 0xffffffffL

    and-long/2addr p1, v5

    long-to-int p1, p1

    int-to-float p1, p1

    invoke-static {p3, p4}, Ld1/f;->b(J)F

    move-result p2

    add-float/2addr p2, p1

    cmpg-float p1, p0, v2

    if-ltz p1, :cond_2

    cmpl-float p0, p0, v4

    if-gtz p0, :cond_2

    cmpg-float p0, v0, v3

    if-ltz p0, :cond_2

    cmpl-float p0, v0, p2

    if-lez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public static final F(Lc9/e;Lc9/c;)Lv0/p;
    .locals 1

    new-instance v0, Lv0/a;

    invoke-direct {v0, p0}, Lv0/a;-><init>(Lc9/e;)V

    const/4 p0, 0x1

    invoke-static {p0, p1}, Lz6/a;->f(ILjava/lang/Object;)V

    sget-object p0, Lv0/q;->a:Lv0/p;

    new-instance p0, Lv0/p;

    invoke-direct {p0, v0, p1}, Lv0/p;-><init>(Lc9/e;Lc9/c;)V

    return-object p0
.end method

.method public static final G(Lm0/m;Ly0/o;)Ly0/o;
    .locals 3

    sget-object v0, Ly0/k;->a:Ly0/k;

    invoke-interface {p1, v0}, Ly0/o;->c(Lc9/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p0, Lm0/q;

    const v0, 0x48ae8da7

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    sget-object v0, Ly0/l;->b:Ly0/l;

    new-instance v1, Ls/i;

    const/16 v2, 0x9

    invoke-direct {v1, p0, v2}, Ls/i;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0, v1}, Ly0/o;->e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly0/o;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm0/q;->t(Z)V

    return-object p1
.end method

.method public static final H(F)Lm0/k1;
    .locals 1

    sget v0, Lm0/b;->b:I

    new-instance v0, Lm0/k1;

    invoke-direct {v0, p0}, Lm0/k1;-><init>(F)V

    return-object v0
.end method

.method public static final I(Lo1/u;Z)J
    .locals 4

    iget-wide v0, p0, Lo1/u;->g:J

    iget-wide v2, p0, Lo1/u;->c:J

    invoke-static {v2, v3, v0, v1}, Ld1/c;->f(JJ)J

    move-result-wide v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lo1/u;->b()Z

    move-result p0

    if-eqz p0, :cond_0

    sget p0, Ld1/c;->e:I

    sget-wide v0, Ld1/c;->b:J

    :cond_0
    return-wide v0
.end method

.method public static final J(Lm0/q2;Lm0/d;I)V
    .locals 2

    :goto_0
    iget v0, p0, Lm0/q2;->t:I

    if-le p2, v0, :cond_0

    iget v1, p0, Lm0/q2;->s:I

    if-lt p2, v1, :cond_1

    :cond_0
    if-nez v0, :cond_2

    if-nez p2, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p0}, Lm0/q2;->F()V

    iget v0, p0, Lm0/q2;->t:I

    iget-object v1, p0, Lm0/q2;->b:[I

    invoke-virtual {p0, v0}, Lm0/q2;->o(I)I

    move-result v0

    invoke-static {v1, v0}, Ld7/t;->v([II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lm0/d;->h()V

    :cond_3
    invoke-virtual {p0}, Lm0/q2;->i()V

    goto :goto_0
.end method

.method public static final K(Lm0/m;)Lm0/o;
    .locals 9

    check-cast p0, Lm0/q;

    const v0, -0x457c7c0c

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lm0/s;->e:Lm0/j1;

    const/16 v1, 0xce

    invoke-virtual {p0, v1, v0}, Lm0/q;->X(ILm0/j1;)V

    iget-boolean v0, p0, Lm0/q;->O:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm0/q;->H:Lm0/q2;

    invoke-static {v0}, Lm0/q2;->t(Lm0/q2;)V

    :cond_0
    invoke-virtual {p0}, Lm0/q;->I()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm0/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lm0/n;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_4

    new-instance v6, Lm0/n;

    new-instance v7, Lm0/o;

    iget v3, p0, Lm0/q;->P:I

    iget-boolean v4, p0, Lm0/q;->p:Z

    iget-boolean v5, p0, Lm0/q;->B:Z

    iget-object v0, p0, Lm0/q;->g:Lm0/e0;

    instance-of v1, v0, Lm0/x;

    if-eqz v1, :cond_2

    check-cast v0, Lm0/x;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    iget-object v0, v0, Lm0/x;->x:Lm0/c0;

    move-object v8, v0

    goto :goto_2

    :cond_3
    move-object v8, v2

    :goto_2
    move-object v0, v7

    move-object v1, p0

    move v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lm0/o;-><init>(Lm0/q;IZZLm0/c0;)V

    invoke-direct {v6, v7}, Lm0/n;-><init>(Lm0/o;)V

    invoke-virtual {p0, v6}, Lm0/q;->m0(Ljava/lang/Object;)V

    move-object v0, v6

    :cond_4
    invoke-virtual {p0}, Lm0/q;->p()Lm0/r1;

    move-result-object v1

    iget-object v0, v0, Lm0/n;->a:Lm0/o;

    iget-object v2, v0, Lm0/o;->f:Lm0/n1;

    invoke-virtual {v2, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lm0/q;->t(Z)V

    invoke-virtual {p0, v1}, Lm0/q;->t(Z)V

    return-object v0
.end method

.method public static final L(Lt/u1;Lc9/c;Ljava/lang/Object;Lm0/m;)Ls/j0;
    .locals 6

    check-cast p3, Lm0/q;

    const v0, 0x158d233e

    invoke-virtual {p3, v0}, Lm0/q;->Z(I)V

    const/4 v0, 0x0

    const v1, -0x2b06557c

    const/4 v2, 0x0

    invoke-virtual {p3, p0, v1, v2, v0}, Lm0/q;->V(Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-virtual {p0}, Lt/u1;->d()Z

    move-result v0

    sget-object v1, Ls/j0;->a:Ls/j0;

    sget-object v3, Ls/j0;->c:Ls/j0;

    sget-object v4, Ls/j0;->b:Ls/j0;

    if-eqz v0, :cond_1

    invoke-interface {p1, p2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    :goto_0
    move-object v1, v4

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    :goto_1
    move-object v1, v3

    goto :goto_2

    :cond_1
    const v0, -0x1d58f75c

    invoke-virtual {p3, v0}, Lm0/q;->Z(I)V

    invoke-virtual {p3}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lm0/l;->a:Lk0/y0;

    if-ne v0, v5, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v5}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    invoke-virtual {p3, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {p3, v2}, Lm0/q;->t(Z)V

    check-cast v0, Lm0/g1;

    invoke-virtual {p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1, p2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {p3, v2}, Lm0/q;->t(Z)V

    invoke-virtual {p3, v2}, Lm0/q;->t(Z)V

    return-object v1
.end method

.method public static final M(Lu8/e;)Ljava/lang/String;
    .locals 3

    instance-of v0, p0, Lr9/h;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_0
    const/16 v0, 0x40

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lm9/e0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lq8/h;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lm9/e0;->z(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    move-object p0, v1

    check-cast p0, Ljava/lang/String;

    :goto_2
    return-object p0
.end method

.method public static final N(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lm9/c1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lm9/c1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lm9/c1;->a:Lm9/b1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final a(Lt/u1;Lc9/c;Ly0/o;Ls/q0;Ls/r0;Lc9/e;Lc9/f;Lm0/m;II)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v0, p7

    check-cast v0, Lm0/q;

    const v10, -0x352a56be    # -7001249.0f

    invoke-virtual {v0, v10}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v10, v9, 0x1

    if-eqz v10, :cond_0

    or-int/lit8 v10, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v10, v8, 0xe

    if-nez v10, :cond_2

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x4

    goto :goto_0

    :cond_1
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v10, v8

    goto :goto_1

    :cond_2
    move v10, v8

    :goto_1
    and-int/lit8 v12, v9, 0x2

    if-eqz v12, :cond_3

    or-int/lit8 v10, v10, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v12, v8, 0x70

    if-nez v12, :cond_5

    invoke-virtual {v0, v2}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v10, v12

    :cond_5
    :goto_3
    and-int/lit8 v12, v9, 0x4

    if-eqz v12, :cond_6

    or-int/lit16 v10, v10, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v8, 0x380

    if-nez v12, :cond_8

    invoke-virtual {v0, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v10, v12

    :cond_8
    :goto_5
    and-int/lit8 v12, v9, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v10, v10, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v8, 0x1c00

    if-nez v12, :cond_b

    invoke-virtual {v0, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v10, v12

    :cond_b
    :goto_7
    and-int/lit8 v12, v9, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v10, v10, 0x6000

    goto :goto_9

    :cond_c
    const v12, 0xe000

    and-int/2addr v12, v8

    if-nez v12, :cond_e

    invoke-virtual {v0, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v10, v12

    :cond_e
    :goto_9
    and-int/lit8 v12, v9, 0x20

    if-eqz v12, :cond_f

    const/high16 v12, 0x30000

    :goto_a
    or-int/2addr v10, v12

    goto :goto_b

    :cond_f
    const/high16 v12, 0x70000

    and-int/2addr v12, v8

    if-nez v12, :cond_11

    invoke-virtual {v0, v6}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x10000

    goto :goto_a

    :cond_11
    :goto_b
    and-int/lit8 v12, v9, 0x40

    const/4 v13, 0x0

    if-eqz v12, :cond_12

    const/high16 v12, 0x180000

    :goto_c
    or-int/2addr v10, v12

    goto :goto_d

    :cond_12
    const/high16 v12, 0x380000

    and-int/2addr v12, v8

    if-nez v12, :cond_14

    invoke-virtual {v0, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_13

    const/high16 v12, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v12, 0x80000

    goto :goto_c

    :cond_14
    :goto_d
    and-int/lit16 v12, v9, 0x80

    if-eqz v12, :cond_15

    const/high16 v12, 0xc00000

    :goto_e
    or-int/2addr v10, v12

    goto :goto_f

    :cond_15
    const/high16 v12, 0x1c00000

    and-int/2addr v12, v8

    if-nez v12, :cond_17

    invoke-virtual {v0, v7}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_16

    const/high16 v12, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v12, 0x400000

    goto :goto_e

    :cond_17
    :goto_f
    const v12, 0x16db6db

    and-int/2addr v12, v10

    const v14, 0x492492

    if-ne v12, v14, :cond_1a

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v12

    if-nez v12, :cond_18

    goto :goto_10

    :cond_18
    invoke-virtual {v0}, Lm0/q;->U()V

    :cond_19
    move-object v8, v3

    move-object v9, v7

    goto/16 :goto_1b

    :cond_1a
    :goto_10
    iget-object v12, v1, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v12}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v2, v12}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-nez v12, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v2, v12}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-nez v12, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lt/u1;->d()Z

    move-result v12

    if-eqz v12, :cond_19

    :cond_1b
    and-int/lit8 v12, v10, 0xe

    or-int/lit8 v12, v12, 0x30

    const v14, 0x48730564

    invoke-virtual {v0, v14}, Lm0/q;->Z(I)V

    and-int/lit8 v14, v12, 0xe

    const v15, 0x44faf204

    invoke-virtual {v0, v15}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v13

    sget-object v11, Lm0/l;->a:Lk0/y0;

    if-nez v16, :cond_1c

    if-ne v13, v11, :cond_1d

    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v0, v13}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1d
    const/4 v15, 0x0

    invoke-virtual {v0, v15}, Lm0/q;->t(Z)V

    invoke-virtual/range {p0 .. p0}, Lt/u1;->d()Z

    move-result v17

    if-eqz v17, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v13

    :cond_1e
    const v15, -0x1bd001fd

    invoke-virtual {v0, v15}, Lm0/q;->Z(I)V

    invoke-static {v1, v2, v13, v0}, Lm9/e0;->L(Lt/u1;Lc9/c;Ljava/lang/Object;Lm0/m;)Ls/j0;

    move-result-object v13

    const/4 v15, 0x0

    invoke-virtual {v0, v15}, Lm0/q;->t(Z)V

    iget-object v15, v1, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v15}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v15

    const v8, -0x1bd001fd

    invoke-virtual {v0, v8}, Lm0/q;->Z(I)V

    invoke-static {v1, v2, v15, v0}, Lm9/e0;->L(Lt/u1;Lc9/c;Ljava/lang/Object;Lm0/m;)Ls/j0;

    move-result-object v8

    const/4 v15, 0x0

    invoke-virtual {v0, v15}, Lm0/q;->t(Z)V

    shl-int/lit8 v12, v12, 0x6

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v12, v14

    const v14, -0xbd1ef36

    invoke-virtual {v0, v14}, Lm0/q;->Z(I)V

    const v14, 0x44faf204

    invoke-virtual {v0, v14}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_20

    if-ne v15, v11, :cond_1f

    goto :goto_12

    :cond_1f
    :goto_11
    const/4 v2, 0x0

    goto :goto_13

    :cond_20
    :goto_12
    new-instance v15, Lt/u1;

    new-instance v14, Lt/x0;

    invoke-direct {v14, v13}, Lt/x0;-><init>(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lt/u1;->b:Ljava/lang/String;

    const-string v7, " > EnterExitTransition"

    invoke-static {v2, v9, v7}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v15, v14, v2}, Lt/u1;-><init>(Lt/x0;Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_11

    :goto_13
    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    check-cast v15, Lt/u1;

    const v2, -0x2170660d

    invoke-virtual {v0, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_21

    if-ne v7, v11, :cond_22

    :cond_21
    new-instance v7, Lt/e1;

    const/4 v2, 0x2

    invoke-direct {v7, v2, v1, v15}, Lt/e1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_22
    check-cast v7, Lc9/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    invoke-static {v15, v7, v0}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    invoke-virtual/range {p0 .. p0}, Lt/u1;->d()Z

    move-result v2

    if-eqz v2, :cond_23

    iget-wide v2, v1, Lt/u1;->k:J

    invoke-virtual {v15, v13, v2, v3, v8}, Lt/u1;->g(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_14
    const/4 v2, 0x0

    goto :goto_15

    :cond_23
    shr-int/lit8 v2, v12, 0x3

    and-int/lit8 v2, v2, 0x8

    shr-int/lit8 v3, v12, 0x6

    and-int/lit8 v3, v3, 0xe

    or-int/2addr v2, v3

    invoke-virtual {v15, v8, v0, v2}, Lt/u1;->h(Ljava/lang/Object;Lm0/m;I)V

    iget-object v2, v15, Lt/u1;->j:Lm0/n1;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    goto :goto_14

    :goto_15
    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    invoke-static {v6, v0}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v2

    invoke-virtual {v15}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v3

    iget-object v7, v15, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v7}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6, v3, v8}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v8, 0x4c17454b    # 3.96547E7f

    invoke-virtual {v0, v8}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v0, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_24

    if-ne v9, v11, :cond_25

    :cond_24
    new-instance v9, Ls/d0;

    const/4 v8, 0x0

    invoke-direct {v9, v15, v2, v8}, Ls/d0;-><init>(Lt/u1;Lm0/l3;Lu8/e;)V

    invoke-virtual {v0, v9}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_25
    check-cast v9, Lc9/e;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    const v2, 0x9f8503

    invoke-virtual {v0, v2}, Lm0/q;->Z(I)V

    const v2, -0x1d58f75c

    invoke-virtual {v0, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v11, :cond_26

    sget-object v8, Lm0/o3;->a:Lm0/o3;

    invoke-static {v3, v8}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v8

    invoke-virtual {v0, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_26
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    check-cast v8, Lm0/g1;

    sget-object v12, Lq8/l;->a:Lq8/l;

    new-instance v13, Lm0/b3;

    const/4 v14, 0x0

    invoke-direct {v13, v9, v8, v14}, Lm0/b3;-><init>(Lc9/e;Lm0/g1;Lu8/e;)V

    invoke-static {v12, v13, v0}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    invoke-virtual {v15}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v3

    sget-object v9, Ls/j0;->c:Ls/j0;

    if-ne v3, v9, :cond_27

    invoke-virtual {v7}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_27

    invoke-interface {v8}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_28

    :cond_27
    const v3, 0x44faf204

    goto :goto_16

    :cond_28
    move-object/from16 v8, p2

    move-object/from16 v9, p6

    goto/16 :goto_1b

    :goto_16
    invoke-virtual {v0, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_2a

    if-ne v7, v11, :cond_29

    goto :goto_18

    :cond_29
    :goto_17
    const/4 v3, 0x0

    goto :goto_19

    :cond_2a
    :goto_18
    new-instance v7, Ls/f0;

    invoke-direct {v7}, Ls/f0;-><init>()V

    invoke-virtual {v0, v7}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_17

    :goto_19
    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    check-cast v7, Ls/f0;

    shr-int/lit8 v3, v10, 0x6

    and-int/lit8 v8, v3, 0x70

    or-int/lit16 v8, v8, 0xc00

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v8

    invoke-static {v15, v4, v5, v0, v3}, Landroidx/compose/animation/a;->a(Lt/u1;Ls/q0;Ls/r0;Lm0/m;I)Ly0/o;

    move-result-object v3

    sget-object v8, Ly0/l;->b:Ly0/l;

    invoke-interface {v3, v8}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v3

    move-object/from16 v8, p2

    invoke-interface {v8, v3}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v3

    invoke-virtual {v0, v2}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_2b

    new-instance v2, Ls/y;

    invoke-direct {v2, v7}, Ls/y;-><init>(Ls/f0;)V

    invoke-virtual {v0, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2b
    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Lm0/q;->t(Z)V

    check-cast v2, Lr1/j0;

    const v9, -0x4ee9b9da

    invoke-virtual {v0, v9}, Lm0/q;->Z(I)V

    iget v9, v0, Lm0/q;->P:I

    invoke-virtual {v0}, Lm0/q;->p()Lm0/r1;

    move-result-object v11

    sget-object v12, Lt1/l;->k:Lt1/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, Lt1/k;->b:Lt1/j;

    invoke-static {v3}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v3

    iget-object v13, v0, Lm0/q;->a:Lm0/d;

    instance-of v13, v13, Lm0/d;

    if-eqz v13, :cond_30

    invoke-virtual {v0}, Lm0/q;->c0()V

    iget-boolean v13, v0, Lm0/q;->O:Z

    if-eqz v13, :cond_2c

    invoke-virtual {v0, v12}, Lm0/q;->o(Lc9/a;)V

    goto :goto_1a

    :cond_2c
    invoke-virtual {v0}, Lm0/q;->o0()V

    :goto_1a
    sget-object v12, Lt1/k;->e:Lt1/i;

    invoke-static {v0, v2, v12}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v2, Lt1/k;->d:Lt1/i;

    invoke-static {v0, v11, v2}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v2, Lt1/k;->f:Lt1/i;

    iget-boolean v11, v0, Lm0/q;->O:Z

    if-nez v11, :cond_2d

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2e

    :cond_2d
    invoke-static {v9, v0, v9, v2}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_2e
    new-instance v2, Lm0/l2;

    invoke-direct {v2, v0}, Lm0/l2;-><init>(Lm0/m;)V

    const v9, 0x7ab4aae9

    const/4 v11, 0x0

    invoke-static {v11, v3, v2, v0, v9}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    shr-int/lit8 v2, v10, 0x12

    and-int/lit8 v2, v2, 0x70

    or-int/lit8 v2, v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v9, p6

    invoke-interface {v9, v7, v0, v2}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v11}, Lm0/q;->t(Z)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v11}, Lm0/q;->t(Z)V

    :goto_1b
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v10

    if-eqz v10, :cond_2f

    new-instance v11, Ls/a0;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ls/a0;-><init>(Lt/u1;Lc9/c;Ly0/o;Ls/q0;Ls/r0;Lc9/e;Lc9/f;II)V

    iput-object v11, v10, Lm0/x1;->d:Lc9/e;

    :cond_2f
    return-void

    :cond_30
    invoke-static {}, Lm9/e0;->C()V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final b(Ljava/lang/String;Ly0/o;La2/c0;Lc9/c;IZIILm0/m;II)V
    .locals 26

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v0, p8

    check-cast v0, Lm0/q;

    const v2, -0x46bd8e2e

    invoke-virtual {v0, v2}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0xe

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_2
    move v2, v9

    :goto_1
    and-int/lit8 v3, v10, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v9, 0x70

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v10, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v9, 0x380

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit8 v8, v10, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v2, v2, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v9, 0x1c00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v0, v11}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v2, v12

    :goto_7
    and-int/lit8 v12, v10, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v2, v2, 0x6000

    :cond_c
    move/from16 v13, p4

    goto :goto_9

    :cond_d
    const v13, 0xe000

    and-int/2addr v13, v9

    if-nez v13, :cond_c

    move/from16 v13, p4

    invoke-virtual {v0, v13}, Lm0/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v2, v14

    :goto_9
    and-int/lit8 v14, v10, 0x20

    if-eqz v14, :cond_10

    const/high16 v15, 0x30000

    or-int/2addr v2, v15

    :cond_f
    move/from16 v15, p5

    goto :goto_b

    :cond_10
    const/high16 v15, 0x70000

    and-int/2addr v15, v9

    if-nez v15, :cond_f

    move/from16 v15, p5

    invoke-virtual {v0, v15}, Lm0/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x10000

    :goto_a
    or-int v2, v2, v16

    :goto_b
    and-int/lit8 v16, v10, 0x40

    if-eqz v16, :cond_12

    const/high16 v17, 0x180000

    or-int v2, v2, v17

    move/from16 v6, p6

    goto :goto_d

    :cond_12
    const/high16 v17, 0x380000

    and-int v17, v9, v17

    move/from16 v6, p6

    if-nez v17, :cond_14

    invoke-virtual {v0, v6}, Lm0/q;->e(I)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v2, v2, v17

    :cond_14
    :goto_d
    and-int/lit16 v4, v10, 0x80

    if-eqz v4, :cond_15

    const/high16 v17, 0xc00000

    or-int v2, v2, v17

    move/from16 v6, p7

    goto :goto_f

    :cond_15
    const/high16 v17, 0x1c00000

    and-int v17, v9, v17

    move/from16 v6, p7

    if-nez v17, :cond_17

    invoke-virtual {v0, v6}, Lm0/q;->e(I)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v2, v2, v17

    :cond_17
    :goto_f
    and-int/lit16 v6, v10, 0x100

    if-eqz v6, :cond_18

    const/high16 v17, 0x2000000

    or-int v2, v2, v17

    :cond_18
    const/16 v7, 0x100

    if-ne v6, v7, :cond_1a

    const v6, 0xb6db6db

    and-int/2addr v2, v6

    const v6, 0x2492492

    if-ne v2, v6, :cond_1a

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_19

    goto :goto_10

    :cond_19
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p6

    move/from16 v8, p7

    move-object v4, v11

    move v5, v13

    move v6, v15

    goto/16 :goto_1a

    :cond_1a
    :goto_10
    sget-object v2, Ly0/l;->b:Ly0/l;

    if-eqz v3, :cond_1b

    move-object v3, v2

    goto :goto_11

    :cond_1b
    move-object/from16 v3, p1

    :goto_11
    if-eqz v5, :cond_1c

    sget-object v5, La2/c0;->d:La2/c0;

    goto :goto_12

    :cond_1c
    move-object/from16 v5, p2

    :goto_12
    const/4 v6, 0x0

    if-eqz v8, :cond_1d

    move-object v11, v6

    :cond_1d
    if-eqz v12, :cond_1e

    const/4 v13, 0x1

    :cond_1e
    if-eqz v14, :cond_1f

    const/4 v15, 0x1

    :cond_1f
    if-eqz v16, :cond_20

    const v8, 0x7fffffff

    goto :goto_13

    :cond_20
    move/from16 v8, p6

    :goto_13
    if-eqz v4, :cond_21

    const/4 v4, 0x1

    goto :goto_14

    :cond_21
    move/from16 v4, p7

    :goto_14
    invoke-static {v4, v8}, Lo7/d0;->m0(II)V

    sget-object v12, Lh0/n0;->a:Lm0/p0;

    invoke-virtual {v0, v12}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, La7/a;->w(Ljava/lang/Object;)V

    const v12, 0x392cd180

    invoke-virtual {v0, v12}, Lm0/q;->Z(I)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lm0/q;->t(Z)V

    if-eqz v11, :cond_22

    const v14, 0x392cd41e

    invoke-virtual {v0, v14}, Lm0/q;->Z(I)V

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0x1ffff

    move-object/from16 p1, v3

    move/from16 p2, v14

    move/from16 p3, v16

    move/from16 p4, v17

    move/from16 p5, v18

    move-object/from16 p6, v19

    move/from16 p7, v20

    move/from16 p8, v21

    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object v14

    new-instance v7, La2/e;

    const/4 v12, 0x6

    invoke-direct {v7, v1, v6, v12}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    sget-object v12, Lu1/s1;->h:Lm0/m3;

    invoke-virtual {v0, v12}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v20, v12

    check-cast v20, Lf2/d;

    new-instance v12, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    move-object/from16 v17, v12

    move-object/from16 v18, v7

    move-object/from16 v19, v5

    move-object/from16 v21, v11

    move/from16 v22, v13

    move/from16 v23, v15

    move/from16 v24, v8

    move/from16 v25, v4

    invoke-direct/range {v17 .. v25}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;-><init>(La2/e;La2/c0;Lf2/d;Lc9/c;IZII)V

    invoke-interface {v14, v2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v2

    invoke-interface {v2, v12}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lm0/q;->t(Z)V

    goto :goto_15

    :cond_22
    const v2, 0x392cd6bc

    invoke-virtual {v0, v2}, Lm0/q;->Z(I)V

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0x1ffff

    move-object/from16 p1, v3

    move/from16 p2, v2

    move/from16 p3, v7

    move/from16 p4, v12

    move/from16 p5, v14

    move-object/from16 p6, v17

    move/from16 p7, v18

    move/from16 p8, v19

    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/a;->k(Ly0/o;FFFFLe1/l0;ZI)Ly0/o;

    move-result-object v2

    new-instance v7, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    sget-object v12, Lu1/s1;->h:Lm0/m3;

    invoke-virtual {v0, v12}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf2/d;

    move-object/from16 p1, v7

    move-object/from16 p2, p0

    move-object/from16 p3, v5

    move-object/from16 p4, v12

    move/from16 p5, v13

    move/from16 p6, v15

    move/from16 p7, v8

    move/from16 p8, v4

    invoke-direct/range {p1 .. p8}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;-><init>(Ljava/lang/String;La2/c0;Lf2/d;IZII)V

    invoke-interface {v2, v7}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lm0/q;->t(Z)V

    :goto_15
    sget-object v7, Lf0/l0;->a:Lf0/l0;

    const v12, 0x207baf9a

    invoke-virtual {v0, v12}, Lm0/q;->Z(I)V

    iget v12, v0, Lm0/q;->P:I

    invoke-static {v0, v2}, Lm9/e0;->G(Lm0/m;Ly0/o;)Ly0/o;

    move-result-object v2

    invoke-virtual {v0}, Lm0/q;->p()Lm0/r1;

    move-result-object v14

    sget-object v17, Lt1/l;->k:Lt1/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lt1/k;->b:Lt1/j;

    const v1, 0x53ca7ea5

    invoke-virtual {v0, v1}, Lm0/q;->Z(I)V

    iget-object v1, v0, Lm0/q;->a:Lm0/d;

    instance-of v1, v1, Lm0/d;

    if-eqz v1, :cond_27

    invoke-virtual {v0}, Lm0/q;->c0()V

    iget-boolean v1, v0, Lm0/q;->O:Z

    if-eqz v1, :cond_23

    new-instance v1, Lu/e1;

    move-object/from16 p8, v3

    const/4 v3, 0x3

    invoke-direct {v1, v6, v3}, Lu/e1;-><init>(Lc9/a;I)V

    invoke-virtual {v0, v1}, Lm0/q;->o(Lc9/a;)V

    goto :goto_16

    :cond_23
    move-object/from16 p8, v3

    invoke-virtual {v0}, Lm0/q;->o0()V

    :goto_16
    sget-object v1, Lt1/k;->e:Lt1/i;

    invoke-static {v0, v7, v1}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->d:Lt1/i;

    invoke-static {v0, v14, v1}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->c:Lt1/i;

    invoke-static {v0, v2, v1}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->f:Lt1/i;

    iget-boolean v2, v0, Lm0/q;->O:Z

    if-nez v2, :cond_25

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    goto :goto_18

    :cond_24
    :goto_17
    const/4 v1, 0x1

    goto :goto_19

    :cond_25
    :goto_18
    invoke-static {v12, v0, v12, v1}, Ll/q;->r(ILm0/q;ILt1/i;)V

    goto :goto_17

    :goto_19
    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    move-object/from16 v2, p8

    move-object v3, v5

    move v7, v8

    move v5, v13

    move v6, v15

    move v8, v4

    move-object v4, v11

    :goto_1a
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v11

    if-eqz v11, :cond_26

    new-instance v12, Lf0/i;

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lf0/i;-><init>(Ljava/lang/String;Ly0/o;La2/c0;Lc9/c;IZIIII)V

    iput-object v12, v11, Lm0/x1;->d:Lc9/e;

    :cond_26
    return-void

    :cond_27
    invoke-static {}, Lm9/e0;->C()V

    const/4 v0, 0x0

    throw v0
.end method

.method public static c(Le1/f;I)Lh1/a;
    .locals 7

    sget-wide v2, Lm2/i;->b:J

    iget-object v0, p0, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v1, v0}, Lo1/s;->e(II)J

    move-result-wide v4

    new-instance v6, Lh1/a;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lh1/a;-><init>(Le1/y;JJ)V

    iput p1, v6, Lh1/a;->p:I

    return-object v6
.end method

.method public static final d(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V
    .locals 30

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v0, p10

    check-cast v0, Lm0/q;

    const v1, 0x26c01063

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v11

    :goto_1
    and-int/lit8 v4, v12, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit8 v7, v12, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v11, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-virtual {v0, v9}, Lm0/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    :goto_5
    and-int/lit16 v10, v11, 0xc00

    if-nez v10, :cond_b

    and-int/lit8 v10, v12, 0x8

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v10, p3

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v3, v13

    goto :goto_7

    :cond_b
    move-object/from16 v10, p3

    :goto_7
    and-int/lit16 v13, v11, 0x6000

    if-nez v13, :cond_e

    and-int/lit8 v13, v12, 0x10

    if-nez v13, :cond_c

    move-object/from16 v13, p4

    invoke-virtual {v0, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v13, p4

    :cond_d
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v3, v14

    goto :goto_9

    :cond_e
    move-object/from16 v13, p4

    :goto_9
    const/high16 v14, 0x30000

    and-int/2addr v14, v11

    if-nez v14, :cond_11

    and-int/lit8 v14, v12, 0x20

    if-nez v14, :cond_f

    move-object/from16 v14, p5

    invoke-virtual {v0, v14}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v14, p5

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v3, v15

    goto :goto_b

    :cond_11
    move-object/from16 v14, p5

    :goto_b
    and-int/lit8 v15, v12, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_12

    or-int v3, v3, v16

    move-object/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v16, v11, v16

    move-object/from16 v8, p6

    if-nez v16, :cond_14

    invoke-virtual {v0, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    :cond_14
    :goto_d
    and-int/lit16 v2, v12, 0x80

    const/high16 v17, 0xc00000

    if-eqz v2, :cond_15

    or-int v3, v3, v17

    move-object/from16 v5, p7

    goto :goto_f

    :cond_15
    and-int v17, v11, v17

    move-object/from16 v5, p7

    if-nez v17, :cond_17

    invoke-virtual {v0, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v18, 0x400000

    :goto_e
    or-int v3, v3, v18

    :cond_17
    :goto_f
    and-int/lit16 v1, v12, 0x100

    const/high16 v18, 0x6000000

    if-eqz v1, :cond_18

    or-int v3, v3, v18

    move-object/from16 v5, p8

    goto :goto_11

    :cond_18
    and-int v18, v11, v18

    move-object/from16 v5, p8

    if-nez v18, :cond_1a

    invoke-virtual {v0, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v3, v3, v18

    :cond_1a
    :goto_11
    and-int/lit16 v5, v12, 0x200

    const/high16 v18, 0x30000000

    if-eqz v5, :cond_1c

    or-int v3, v3, v18

    :cond_1b
    move-object/from16 v5, p9

    goto :goto_13

    :cond_1c
    and-int v5, v11, v18

    if-nez v5, :cond_1b

    move-object/from16 v5, p9

    invoke-virtual {v0, v5}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1d

    const/high16 v18, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v18, 0x10000000

    :goto_12
    or-int v3, v3, v18

    :goto_13
    const v18, 0x12492493

    and-int v5, v3, v18

    const v6, 0x12492492

    if-ne v5, v6, :cond_1f

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v5

    if-nez v5, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object/from16 v2, p1

    move-object v7, v8

    move v3, v9

    move-object v4, v10

    move-object v5, v13

    move-object v6, v14

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    goto/16 :goto_2a

    :cond_1f
    :goto_14
    invoke-virtual {v0}, Lm0/q;->W()V

    and-int/lit8 v5, v11, 0x1

    sget-object v6, Lm0/l;->a:Lk0/y0;

    const v18, -0x70001

    const/16 v19, 0x1

    const v20, -0xe001

    if-eqz v5, :cond_24

    invoke-virtual {v0}, Lm0/q;->E()Z

    move-result v5

    if-eqz v5, :cond_20

    goto :goto_16

    :cond_20
    invoke-virtual {v0}, Lm0/q;->U()V

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_21

    and-int/lit16 v3, v3, -0x1c01

    :cond_21
    and-int/lit8 v1, v12, 0x10

    if-eqz v1, :cond_22

    and-int v3, v3, v20

    :cond_22
    and-int/lit8 v1, v12, 0x20

    if-eqz v1, :cond_23

    and-int v3, v3, v18

    :cond_23
    move-object/from16 v4, p1

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object v5, v10

    move-object v7, v13

    move-object v10, v14

    :goto_15
    move v13, v3

    move-object/from16 v3, p8

    goto/16 :goto_1d

    :cond_24
    :goto_16
    if-eqz v4, :cond_25

    sget-object v4, Ly0/l;->b:Ly0/l;

    goto :goto_17

    :cond_25
    move-object/from16 v4, p1

    :goto_17
    if-eqz v7, :cond_26

    move/from16 v9, v19

    :cond_26
    and-int/lit8 v5, v12, 0x8

    if-eqz v5, :cond_27

    sget-object v5, Lk0/z;->a:Ly/u0;

    const v5, -0x499b6e0d

    invoke-virtual {v0, v5}, Lm0/q;->Z(I)V

    sget v5, Ll0/g;->b:I

    invoke-static {v5, v0}, Lk0/r2;->a(ILm0/m;)Le1/l0;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lm0/q;->t(Z)V

    and-int/lit16 v3, v3, -0x1c01

    goto :goto_18

    :cond_27
    move-object v5, v10

    :goto_18
    and-int/lit8 v7, v12, 0x10

    if-eqz v7, :cond_28

    sget-object v7, Lk0/z;->a:Ly/u0;

    const v7, 0x5661c77d

    invoke-virtual {v0, v7}, Lm0/q;->Z(I)V

    sget-object v7, Lk0/k0;->a:Lm0/m3;

    invoke-virtual {v0, v7}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk0/i0;

    invoke-static {v7}, Lk0/z;->c(Lk0/i0;)Lk0/y;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Lm0/q;->t(Z)V

    and-int v3, v3, v20

    goto :goto_19

    :cond_28
    move-object v7, v13

    :goto_19
    and-int/lit8 v10, v12, 0x20

    if-eqz v10, :cond_29

    const/4 v10, 0x0

    const/16 v13, 0x1f

    invoke-static {v10, v0, v13}, Lk0/z;->b(FLm0/m;I)Lk0/d0;

    move-result-object v10

    and-int v3, v3, v18

    goto :goto_1a

    :cond_29
    move-object v10, v14

    :goto_1a
    if-eqz v15, :cond_2a

    const/4 v13, 0x0

    goto :goto_1b

    :cond_2a
    move-object/from16 v13, p6

    :goto_1b
    if-eqz v2, :cond_2b

    sget-object v2, Lk0/z;->a:Ly/u0;

    goto :goto_1c

    :cond_2b
    move-object/from16 v2, p7

    :goto_1c
    if-eqz v1, :cond_2d

    const v1, 0x3116aa2b

    invoke-virtual {v0, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_2c

    new-instance v1, Lx/m;

    invoke-direct {v1}, Lx/m;-><init>()V

    invoke-virtual {v0, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v1, Lx/m;

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lm0/q;->t(Z)V

    move/from16 v29, v3

    move-object v3, v1

    move-object v1, v13

    move/from16 v13, v29

    goto :goto_1d

    :cond_2d
    move-object v1, v13

    goto/16 :goto_15

    :goto_1d
    invoke-virtual {v0}, Lm0/q;->u()V

    if-eqz v9, :cond_2e

    iget-wide v14, v7, Lk0/y;->a:J

    :goto_1e
    move-wide/from16 v20, v14

    goto :goto_1f

    :cond_2e
    iget-wide v14, v7, Lk0/y;->c:J

    goto :goto_1e

    :goto_1f
    if-eqz v9, :cond_2f

    iget-wide v14, v7, Lk0/y;->b:J

    goto :goto_20

    :cond_2f
    iget-wide v14, v7, Lk0/y;->d:J

    :goto_20
    const v8, 0x3116ab16

    invoke-virtual {v0, v8}, Lm0/q;->Z(I)V

    if-nez v10, :cond_30

    move-object/from16 v27, v1

    move-object/from16 v26, v3

    move-object/from16 v28, v5

    move-object/from16 v25, v7

    const/4 v3, 0x0

    const/4 v8, 0x0

    goto/16 :goto_26

    :cond_30
    shr-int/lit8 v22, v13, 0x6

    and-int/lit8 v22, v22, 0xe

    shr-int/lit8 v23, v13, 0x15

    and-int/lit8 v23, v23, 0x70

    or-int v22, v22, v23

    shr-int/lit8 v13, v13, 0x9

    and-int/lit16 v13, v13, 0x380

    or-int v13, v22, v13

    const v8, -0x79e5feb9

    invoke-virtual {v0, v8}, Lm0/q;->Z(I)V

    and-int/lit8 v8, v13, 0xe

    and-int/lit8 v22, v13, 0x70

    or-int v8, v8, v22

    and-int/lit16 v13, v13, 0x380

    or-int/2addr v8, v13

    const v13, -0x4e3b51fe

    invoke-virtual {v0, v13}, Lm0/q;->Z(I)V

    const v13, -0x2ae93d02

    invoke-virtual {v0, v13}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_31

    new-instance v13, Lw0/u;

    invoke-direct {v13}, Lw0/u;-><init>()V

    invoke-virtual {v0, v13}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_31
    check-cast v13, Lw0/u;

    move-object/from16 v25, v7

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lm0/q;->t(Z)V

    const v7, -0x2ae93ca9

    invoke-virtual {v0, v7}, Lm0/q;->Z(I)V

    and-int/lit8 v7, v8, 0x70

    const/16 v22, 0x30

    xor-int/lit8 v7, v7, 0x30

    const/16 v11, 0x20

    if-le v7, v11, :cond_32

    invoke-virtual {v0, v3}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_33

    :cond_32
    and-int/lit8 v7, v8, 0x30

    if-ne v7, v11, :cond_34

    :cond_33
    move/from16 v7, v19

    goto :goto_21

    :cond_34
    const/4 v7, 0x0

    :goto_21
    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_35

    if-ne v11, v6, :cond_36

    :cond_35
    new-instance v11, Lk0/b0;

    const/4 v7, 0x0

    invoke-direct {v11, v3, v13, v7}, Lk0/b0;-><init>(Lx/l;Lw0/u;Lu8/e;)V

    invoke-virtual {v0, v11}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_36
    check-cast v11, Lc9/e;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lm0/q;->t(Z)V

    invoke-static {v3, v11, v0}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-static {v13}, Lr8/p;->M0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lx/k;

    if-nez v9, :cond_37

    iget v11, v10, Lk0/d0;->e:F

    goto :goto_22

    :cond_37
    instance-of v11, v7, Lx/o;

    if-eqz v11, :cond_38

    iget v11, v10, Lk0/d0;->b:F

    goto :goto_22

    :cond_38
    instance-of v11, v7, Lx/h;

    if-eqz v11, :cond_39

    iget v11, v10, Lk0/d0;->d:F

    goto :goto_22

    :cond_39
    instance-of v11, v7, Lx/d;

    if-eqz v11, :cond_3a

    iget v11, v10, Lk0/d0;->c:F

    goto :goto_22

    :cond_3a
    iget v11, v10, Lk0/d0;->a:F

    :goto_22
    const v13, -0x2ae9367d

    invoke-virtual {v0, v13}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_3b

    new-instance v13, Lt/d;

    new-instance v12, Lm2/e;

    invoke-direct {v12, v11}, Lm2/e;-><init>(F)V

    move-object/from16 v26, v3

    sget-object v3, Lt/y1;->c:Lt/x1;

    move-object/from16 v27, v1

    const/16 v1, 0xc

    move-object/from16 v28, v5

    const/4 v5, 0x0

    invoke-direct {v13, v12, v3, v5, v1}, Lt/d;-><init>(Ljava/lang/Object;Lt/x1;Ljava/lang/Object;I)V

    invoke-virtual {v0, v13}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_23

    :cond_3b
    move-object/from16 v27, v1

    move-object/from16 v26, v3

    move-object/from16 v28, v5

    :goto_23
    check-cast v13, Lt/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    new-instance v1, Lm2/e;

    invoke-direct {v1, v11}, Lm2/e;-><init>(F)V

    const v3, -0x2ae93629

    invoke-virtual {v0, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v13}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v0, v11}, Lm0/q;->d(F)Z

    move-result v5

    or-int/2addr v3, v5

    and-int/lit8 v5, v8, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v12, 0x4

    if-le v5, v12, :cond_3c

    invoke-virtual {v0, v9}, Lm0/q;->h(Z)Z

    move-result v5

    if-nez v5, :cond_3d

    :cond_3c
    and-int/lit8 v5, v8, 0x6

    if-ne v5, v12, :cond_3e

    :cond_3d
    move/from16 v5, v19

    goto :goto_24

    :cond_3e
    const/4 v5, 0x0

    :goto_24
    or-int/2addr v3, v5

    and-int/lit16 v5, v8, 0x380

    xor-int/lit16 v5, v5, 0x180

    const/16 v12, 0x100

    if-le v5, v12, :cond_3f

    invoke-virtual {v0, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_41

    :cond_3f
    and-int/lit16 v5, v8, 0x180

    if-ne v5, v12, :cond_40

    goto :goto_25

    :cond_40
    const/16 v19, 0x0

    :cond_41
    :goto_25
    or-int v3, v3, v19

    invoke-virtual {v0, v7}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_42

    if-ne v5, v6, :cond_43

    :cond_42
    new-instance v5, Lk0/c0;

    const/4 v3, 0x0

    move-object/from16 p1, v5

    move-object/from16 p2, v13

    move/from16 p3, v11

    move/from16 p4, v9

    move-object/from16 p5, v10

    move-object/from16 p6, v7

    move-object/from16 p7, v3

    invoke-direct/range {p1 .. p7}, Lk0/c0;-><init>(Lt/d;FZLk0/d0;Lx/k;Lu8/e;)V

    invoke-virtual {v0, v5}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_43
    check-cast v5, Lc9/e;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    invoke-static {v1, v5, v0}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    iget-object v8, v13, Lt/d;->c:Lt/o;

    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    :goto_26
    invoke-virtual {v0, v3}, Lm0/q;->t(Z)V

    if-eqz v8, :cond_44

    iget-object v1, v8, Lt/o;->b:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/e;

    iget v1, v1, Lm2/e;->a:F

    :goto_27
    move/from16 v23, v1

    goto :goto_28

    :cond_44
    int-to-float v1, v3

    goto :goto_27

    :goto_28
    if-eqz v10, :cond_46

    if-eqz v9, :cond_45

    iget v1, v10, Lk0/d0;->a:F

    goto :goto_29

    :cond_45
    iget v1, v10, Lk0/d0;->e:F

    goto :goto_29

    :cond_46
    int-to-float v1, v3

    :goto_29
    sget-object v5, Lk0/t;->c:Lk0/t;

    invoke-static {v4, v3, v5}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v5

    new-instance v3, Lk0/e0;

    const/4 v6, 0x0

    move-object/from16 p1, v3

    move-wide/from16 p2, v14

    move-object/from16 p4, v2

    move-object/from16 p5, p9

    move/from16 p6, v6

    invoke-direct/range {p1 .. p6}, Lk0/e0;-><init>(JLjava/lang/Object;Ljava/lang/Object;I)V

    const v6, 0x3902db2e

    invoke-static {v0, v6, v3}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v24

    sget-object v3, Lk0/p3;->a:Lm0/p0;

    const v3, -0x2f12abe4

    invoke-virtual {v0, v3}, Lm0/q;->Z(I)V

    sget-object v3, Lk0/p3;->a:Lm0/p0;

    invoke-virtual {v0, v3}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm2/e;

    iget v6, v6, Lm2/e;->a:F

    add-float/2addr v1, v6

    sget-object v6, Lk0/s0;->a:Lm0/p0;

    new-instance v7, Le1/r;

    invoke-direct {v7, v14, v15}, Le1/r;-><init>(J)V

    invoke-virtual {v6, v7}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v6

    new-instance v7, Lm2/e;

    invoke-direct {v7, v1}, Lm2/e;-><init>(F)V

    invoke-virtual {v3, v7}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v3

    filled-new-array {v6, v3}, [Lm0/v1;

    move-result-object v3

    new-instance v6, Lk0/o3;

    move-object v13, v6

    move-object v14, v5

    move-object/from16 v15, v28

    move-wide/from16 v16, v20

    move/from16 v18, v1

    move-object/from16 v19, v27

    move-object/from16 v20, v26

    move/from16 v21, v9

    move-object/from16 v22, p0

    invoke-direct/range {v13 .. v24}, Lk0/o3;-><init>(Ly0/o;Le1/l0;JFLu/w;Lx/m;ZLc9/a;FLu0/b;)V

    const v1, 0x4c46b75c    # 5.209227E7f

    invoke-static {v0, v1, v6}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v1

    const/16 v5, 0x30

    invoke-static {v3, v1, v0, v5}, Lf6/a;->c([Lm0/v1;Lc9/e;Lm0/m;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm0/q;->t(Z)V

    move-object v8, v2

    move-object v2, v4

    move v3, v9

    move-object v6, v10

    move-object/from16 v5, v25

    move-object/from16 v9, v26

    move-object/from16 v7, v27

    move-object/from16 v4, v28

    :goto_2a
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v14

    if-eqz v14, :cond_47

    new-instance v15, Lk0/f0;

    const/4 v13, 0x0

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v13}, Lk0/f0;-><init>(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;III)V

    iput-object v15, v14, Lm0/x1;->d:Lc9/e;

    :cond_47
    return-void
.end method

.method public static final e(Lk0/x2;Ly0/o;Lc9/f;Lm0/m;II)V
    .locals 21

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v9, p3

    check-cast v9, Lm0/q;

    const v0, -0x4e7a54a0

    invoke-virtual {v9, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_2

    invoke-virtual {v9, v6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_2
    move v0, v8

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v2, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_3

    move-object/from16 v2, p1

    invoke-virtual {v9, v2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x20

    goto :goto_2

    :cond_5
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    :goto_4
    move v10, v0

    goto :goto_6

    :cond_7
    and-int/lit16 v3, v8, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v9, v7}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x100

    goto :goto_5

    :cond_8
    const/16 v3, 0x80

    :goto_5
    or-int/2addr v0, v3

    goto :goto_4

    :goto_6
    and-int/lit16 v0, v10, 0x93

    const/16 v3, 0x92

    if-ne v0, v3, :cond_a

    invoke-virtual {v9}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v9}, Lm0/q;->U()V

    goto/16 :goto_e

    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    sget-object v0, Ly0/l;->b:Ly0/l;

    move-object v11, v0

    goto :goto_8

    :cond_b
    move-object v11, v2

    :goto_8
    const v0, -0x2bb4f512

    invoke-virtual {v9, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v9}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm0/l;->a:Lk0/y0;

    if-ne v0, v1, :cond_c

    new-instance v0, Lk0/a1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lk0/a1;->a:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lk0/a1;->b:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_c
    move-object v12, v0

    check-cast v12, Lk0/a1;

    const/4 v13, 0x0

    invoke-virtual {v9, v13}, Lm0/q;->t(Z)V

    iget-object v0, v12, Lk0/a1;->a:Ljava/lang/Object;

    invoke-static {v6, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v14, v12, Lk0/a1;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_11

    iput-object v6, v12, Lk0/a1;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v13

    :goto_9
    if-ge v2, v1, :cond_d

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk0/z0;

    iget-object v3, v3, Lk0/z0;->a:Ljava/lang/Object;

    check-cast v3, Lk0/x2;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_d
    invoke-static {v0}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v15

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v13

    :goto_a
    if-ge v1, v0, :cond_10

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v13

    :goto_b
    if-ge v3, v4, :cond_11

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lk0/x2;

    new-instance v1, Lk0/z0;

    new-instance v0, Ls/k;

    const/16 v16, 0x3

    move-object/from16 p1, v0

    move-object v13, v1

    move-object v1, v2

    move-object/from16 v17, v2

    move-object/from16 v2, p0

    move/from16 v18, v3

    move-object v3, v15

    move/from16 v19, v4

    move-object v4, v12

    move-object/from16 v20, v5

    move/from16 v5, v16

    invoke-direct/range {v0 .. v5}, Ls/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x62a075c5

    move-object/from16 v1, p1

    invoke-static {v9, v0, v1}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-direct {v13, v1, v0}, Lk0/z0;-><init>(Lk0/x2;Lu0/b;)V

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v18, 0x1

    move/from16 v4, v19

    move-object/from16 v5, v20

    const/4 v13, 0x0

    goto :goto_b

    :cond_11
    shr-int/lit8 v0, v10, 0x3

    and-int/lit8 v0, v0, 0xe

    const v1, 0x2bb5b5d7

    invoke-virtual {v9, v1}, Lm0/q;->Z(I)V

    sget-object v1, Ly0/a;->a:Ly0/g;

    const/4 v2, 0x0

    invoke-static {v1, v2, v9}, Ly/p;->c(Ly0/g;ZLm0/m;)Lr1/j0;

    move-result-object v1

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const v2, -0x4ee9b9da

    invoke-virtual {v9, v2}, Lm0/q;->Z(I)V

    iget v2, v9, Lm0/q;->P:I

    invoke-virtual {v9}, Lm0/q;->p()Lm0/r1;

    move-result-object v3

    sget-object v4, Lt1/l;->k:Lt1/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt1/k;->b:Lt1/j;

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v5

    shl-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    const/4 v10, 0x6

    or-int/2addr v0, v10

    iget-object v13, v9, Lm0/q;->a:Lm0/d;

    instance-of v13, v13, Lm0/d;

    const/4 v15, 0x0

    if-eqz v13, :cond_18

    invoke-virtual {v9}, Lm0/q;->c0()V

    iget-boolean v13, v9, Lm0/q;->O:Z

    if-eqz v13, :cond_12

    invoke-virtual {v9, v4}, Lm0/q;->o(Lc9/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v9}, Lm0/q;->o0()V

    :goto_c
    sget-object v4, Lt1/k;->e:Lt1/i;

    invoke-static {v9, v1, v4}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->d:Lt1/i;

    invoke-static {v9, v3, v1}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v1, Lt1/k;->f:Lt1/i;

    iget-boolean v3, v9, Lm0/q;->O:Z

    if-nez v3, :cond_13

    invoke-virtual {v9}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {v2, v9, v2, v1}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_14
    new-instance v1, Lm0/l2;

    invoke-direct {v1, v9}, Lm0/l2;-><init>(Lm0/m;)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v1, v9, v0}, Lu0/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-virtual {v9, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v9}, Lm0/q;->D()Lm0/x1;

    move-result-object v0

    if-eqz v0, :cond_17

    iget v1, v0, Lm0/x1;->a:I

    const/4 v2, 0x1

    or-int/2addr v1, v2

    iput v1, v0, Lm0/x1;->a:I

    iput-object v0, v12, Lk0/a1;->c:Lm0/w1;

    const v0, -0x2bb4eb9b

    invoke-virtual {v9, v0}, Lm0/q;->Z(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v0, :cond_15

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk0/z0;

    iget-object v4, v3, Lk0/z0;->a:Ljava/lang/Object;

    check-cast v4, Lk0/x2;

    const v5, 0x33db9154

    const/4 v12, 0x0

    invoke-virtual {v9, v4, v5, v12, v15}, Lm0/q;->V(Ljava/lang/Object;IILjava/lang/Object;)V

    new-instance v5, Lv/n0;

    invoke-direct {v5, v10, v7, v4}, Lv/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, -0x43ac567f

    invoke-static {v9, v4, v5}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v3, v3, Lk0/z0;->b:Lc9/f;

    invoke-interface {v3, v4, v9, v5}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v12}, Lm0/q;->t(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_15
    const/4 v12, 0x0

    invoke-static {v9, v12, v12, v2, v12}, Ll/q;->v(Lm0/q;ZZZZ)V

    invoke-virtual {v9, v12}, Lm0/q;->t(Z)V

    move-object v2, v11

    :goto_e
    invoke-virtual {v9}, Lm0/q;->x()Lm0/x1;

    move-result-object v9

    if-eqz v9, :cond_16

    new-instance v10, La0/r;

    const/4 v11, 0x2

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move v6, v11

    invoke-direct/range {v0 .. v6}, La0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq8/a;III)V

    iput-object v10, v9, Lm0/x1;->d:Lc9/e;

    :cond_16
    return-void

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no recompose scope found"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-static {}, Lm9/e0;->C()V

    throw v15
.end method

.method public static final f(Lb0/h0;Ly0/o;Ly/t0;Lb0/j;IFLy0/c;Lw/h;ZZLc9/c;Ln1/a;Lc9/g;Lm0/m;III)V
    .locals 37

    move-object/from16 v15, p0

    move/from16 v14, p14

    move/from16 v13, p15

    move/from16 v11, p16

    move-object/from16 v10, p13

    check-cast v10, Lm0/q;

    const v0, 0x58e189a1

    invoke-virtual {v10, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, v11, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v0, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, v14, 0xe

    if-nez v0, :cond_2

    invoke-virtual {v10, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v14

    goto :goto_1

    :cond_2
    move v0, v14

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v14, 0x70

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v14, 0x380

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, v11, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v1, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v1, v14, 0x1c00

    if-nez v1, :cond_9

    move-object/from16 v1, p3

    invoke-virtual {v10, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/16 v16, 0x800

    goto :goto_6

    :cond_b
    const/16 v16, 0x400

    :goto_6
    or-int v0, v0, v16

    :goto_7
    and-int/lit8 v16, v11, 0x10

    const v17, 0xe000

    if-eqz v16, :cond_c

    or-int/lit16 v0, v0, 0x6000

    move/from16 v2, p4

    goto :goto_9

    :cond_c
    and-int v18, v14, v17

    move/from16 v2, p4

    if-nez v18, :cond_e

    invoke-virtual {v10, v2}, Lm0/q;->e(I)Z

    move-result v19

    if-eqz v19, :cond_d

    const/16 v19, 0x4000

    goto :goto_8

    :cond_d
    const/16 v19, 0x2000

    :goto_8
    or-int v0, v0, v19

    :cond_e
    :goto_9
    and-int/lit8 v19, v11, 0x20

    const/high16 v20, 0x70000

    if-eqz v19, :cond_f

    const/high16 v21, 0x30000

    or-int v0, v0, v21

    move/from16 v6, p5

    goto :goto_b

    :cond_f
    and-int v21, v14, v20

    move/from16 v6, p5

    if-nez v21, :cond_11

    invoke-virtual {v10, v6}, Lm0/q;->d(F)Z

    move-result v22

    if-eqz v22, :cond_10

    const/high16 v22, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v22, 0x10000

    :goto_a
    or-int v0, v0, v22

    :cond_11
    :goto_b
    and-int/lit8 v22, v11, 0x40

    const/high16 v23, 0x380000

    if-eqz v22, :cond_12

    const/high16 v24, 0x180000

    or-int v0, v0, v24

    move-object/from16 v7, p6

    goto :goto_d

    :cond_12
    and-int v24, v14, v23

    move-object/from16 v7, p6

    if-nez v24, :cond_14

    invoke-virtual {v10, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v25, 0x80000

    :goto_c
    or-int v0, v0, v25

    :cond_14
    :goto_d
    const/high16 v25, 0x1c00000

    and-int v26, v14, v25

    if-nez v26, :cond_17

    and-int/lit16 v12, v11, 0x80

    if-nez v12, :cond_15

    move-object/from16 v12, p7

    invoke-virtual {v10, v12}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_16

    const/high16 v27, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v12, p7

    :cond_16
    const/high16 v27, 0x400000

    :goto_e
    or-int v0, v0, v27

    goto :goto_f

    :cond_17
    move-object/from16 v12, p7

    :goto_f
    and-int/lit16 v1, v11, 0x100

    const/high16 v27, 0xe000000

    if-eqz v1, :cond_18

    const/high16 v28, 0x6000000

    or-int v0, v0, v28

    move/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v28, v14, v27

    move/from16 v2, p8

    if-nez v28, :cond_1a

    invoke-virtual {v10, v2}, Lm0/q;->h(Z)Z

    move-result v28

    if-eqz v28, :cond_19

    const/high16 v28, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v28, 0x2000000

    :goto_10
    or-int v0, v0, v28

    :cond_1a
    :goto_11
    and-int/lit16 v2, v11, 0x200

    const/high16 v28, 0x70000000

    if-eqz v2, :cond_1b

    const/high16 v29, 0x30000000

    or-int v0, v0, v29

    move/from16 v4, p9

    goto :goto_13

    :cond_1b
    and-int v29, v14, v28

    move/from16 v4, p9

    if-nez v29, :cond_1d

    invoke-virtual {v10, v4}, Lm0/q;->h(Z)Z

    move-result v29

    if-eqz v29, :cond_1c

    const/high16 v29, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v29, 0x10000000

    :goto_12
    or-int v0, v0, v29

    :cond_1d
    :goto_13
    and-int/lit16 v4, v11, 0x400

    if-eqz v4, :cond_1e

    or-int/lit8 v18, v13, 0x6

    move-object/from16 v6, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v29, v13, 0xe

    move-object/from16 v6, p10

    if-nez v29, :cond_20

    invoke-virtual {v10, v6}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1f

    const/16 v18, 0x4

    goto :goto_14

    :cond_1f
    const/16 v18, 0x2

    :goto_14
    or-int v18, v13, v18

    goto :goto_15

    :cond_20
    move/from16 v18, v13

    :goto_15
    and-int/lit16 v6, v11, 0x800

    if-eqz v6, :cond_21

    or-int/lit8 v18, v18, 0x10

    :cond_21
    move/from16 v7, v18

    and-int/lit16 v8, v11, 0x1000

    if-eqz v8, :cond_22

    or-int/lit16 v7, v7, 0x180

    :goto_16
    const/16 v8, 0x800

    goto :goto_18

    :cond_22
    and-int/lit16 v8, v13, 0x380

    if-nez v8, :cond_24

    move-object/from16 v8, p12

    invoke-virtual {v10, v8}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_23

    const/16 v21, 0x100

    goto :goto_17

    :cond_23
    const/16 v21, 0x80

    :goto_17
    or-int v7, v7, v21

    goto :goto_16

    :cond_24
    move-object/from16 v8, p12

    goto :goto_16

    :goto_18
    if-ne v6, v8, :cond_26

    const v8, 0x5b6db6db

    and-int/2addr v8, v0

    const v12, 0x12492492

    if-ne v8, v12, :cond_26

    and-int/lit16 v8, v7, 0x2db

    const/16 v12, 0x92

    if-ne v8, v12, :cond_26

    invoke-virtual {v10}, Lm0/q;->G()Z

    move-result v8

    if-nez v8, :cond_25

    goto :goto_19

    :cond_25
    invoke-virtual {v10}, Lm0/q;->U()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v20, v10

    move/from16 v10, p9

    goto/16 :goto_2e

    :cond_26
    :goto_19
    invoke-virtual {v10}, Lm0/q;->W()V

    and-int/lit8 v8, v14, 0x1

    if-eqz v8, :cond_2a

    invoke-virtual {v10}, Lm0/q;->E()Z

    move-result v8

    if-eqz v8, :cond_27

    goto :goto_1a

    :cond_27
    invoke-virtual {v10}, Lm0/q;->U()V

    and-int/lit16 v1, v11, 0x80

    if-eqz v1, :cond_28

    const v1, -0x1c00001

    and-int/2addr v0, v1

    :cond_28
    if-eqz v6, :cond_29

    and-int/lit8 v7, v7, -0x71

    :cond_29
    move-object/from16 v19, p1

    move-object/from16 v30, p2

    move-object/from16 v26, p3

    move/from16 v29, p4

    move/from16 v22, p5

    move-object/from16 v21, p6

    move-object/from16 v24, p7

    move/from16 v31, p8

    move/from16 v32, p9

    move-object/from16 v33, p10

    move-object/from16 v34, p11

    goto/16 :goto_2d

    :cond_2a
    :goto_1a
    if-eqz v3, :cond_2b

    sget-object v3, Ly0/l;->b:Ly0/l;

    goto :goto_1b

    :cond_2b
    move-object/from16 v3, p1

    :goto_1b
    const/4 v8, 0x0

    if-eqz v5, :cond_2c

    int-to-float v5, v8

    new-instance v12, Ly/u0;

    invoke-direct {v12, v5, v5, v5, v5}, Ly/u0;-><init>(FFFF)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v12, p2

    :goto_1c
    if-eqz v9, :cond_2d

    sget-object v5, Lb0/i;->a:Lb0/i;

    goto :goto_1d

    :cond_2d
    move-object/from16 v5, p3

    :goto_1d
    if-eqz v16, :cond_2e

    move v9, v8

    goto :goto_1e

    :cond_2e
    move/from16 v9, p4

    :goto_1e
    move-object/from16 v16, v3

    if-eqz v19, :cond_2f

    int-to-float v3, v8

    goto :goto_1f

    :cond_2f
    move/from16 v3, p5

    :goto_1f
    if-eqz v22, :cond_30

    sget-object v19, Ly0/a;->n:Ly0/f;

    goto :goto_20

    :cond_30
    move-object/from16 v19, p6

    :goto_20
    and-int/lit16 v8, v11, 0x80

    move/from16 v22, v3

    if-eqz v8, :cond_34

    sget-object v8, Lb0/m;->a:Lt/w1;

    const v8, -0xb9132f0

    invoke-virtual {v10, v8}, Lm0/q;->Z(I)V

    new-instance v8, Lb0/c0;

    invoke-direct {v8}, Lb0/c0;-><init>()V

    sget-object v3, Lb0/m;->a:Lt/w1;

    move-object/from16 v26, v5

    invoke-static {v10}, Ls/a1;->a(Lm0/m;)Lt/y;

    move-result-object v5

    move/from16 v29, v9

    const/4 v9, 0x5

    const/high16 v11, 0x43c80000    # 400.0f

    move-object/from16 v30, v12

    const/4 v12, 0x0

    invoke-static {v11, v12, v9}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v9

    sget-object v11, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {v10, v11}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lm2/b;

    move-object/from16 p1, p0

    move-object/from16 p2, v3

    move-object/from16 p3, v5

    move-object/from16 p4, v9

    move-object/from16 p5, v8

    move-object/from16 p6, v11

    filled-new-array/range {p1 .. p6}, [Ljava/lang/Object;

    move-result-object v11

    const v12, -0x21de6e89

    invoke-virtual {v10, v12}, Lm0/q;->Z(I)V

    const/4 v12, 0x0

    const/4 v13, 0x6

    const/16 v18, 0x0

    :goto_21
    if-ge v12, v13, :cond_31

    aget-object v13, v11, v12

    invoke-virtual {v10, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int v18, v18, v13

    add-int/lit8 v12, v12, 0x1

    const/4 v13, 0x6

    goto :goto_21

    :cond_31
    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v11

    if-nez v18, :cond_33

    sget-object v12, Lm0/l;->a:Lk0/y0;

    if-ne v11, v12, :cond_32

    goto :goto_23

    :cond_32
    :goto_22
    const/4 v3, 0x0

    goto :goto_24

    :cond_33
    :goto_23
    new-instance v11, Lb0/p;

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-direct {v11, v12, v5, v8, v15}, Lb0/p;-><init>(FLt/y;Lb0/b0;Lb0/h0;)V

    new-instance v8, Lw/h;

    invoke-direct {v8, v11, v3, v5, v9}, Lw/h;-><init>(Lb0/p;Lt/n;Lt/y;Lt/n;)V

    invoke-virtual {v10, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v11, v8

    goto :goto_22

    :goto_24
    invoke-virtual {v10, v3}, Lm0/q;->t(Z)V

    move-object v5, v11

    check-cast v5, Lw/h;

    invoke-virtual {v10, v3}, Lm0/q;->t(Z)V

    const v3, -0x1c00001

    and-int/2addr v0, v3

    goto :goto_25

    :cond_34
    move-object/from16 v26, v5

    move/from16 v29, v9

    move-object/from16 v30, v12

    move-object/from16 v5, p7

    :goto_25
    if-eqz v1, :cond_35

    const/4 v1, 0x1

    goto :goto_26

    :cond_35
    move/from16 v1, p8

    :goto_26
    if-eqz v2, :cond_36

    const/4 v2, 0x0

    goto :goto_27

    :cond_36
    move/from16 v2, p9

    :goto_27
    if-eqz v4, :cond_37

    const/16 v24, 0x0

    goto :goto_28

    :cond_37
    move-object/from16 v24, p10

    :goto_28
    if-eqz v6, :cond_3a

    const v3, 0x44faf204

    invoke-virtual {v10, v3}, Lm0/q;->Z(I)V

    invoke-virtual {v10, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v10}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_39

    sget-object v3, Lm0/l;->a:Lk0/y0;

    if-ne v4, v3, :cond_38

    goto :goto_2a

    :cond_38
    :goto_29
    const/4 v3, 0x0

    goto :goto_2b

    :cond_39
    :goto_2a
    sget-object v3, Lb0/m;->a:Lt/w1;

    new-instance v4, Lb0/a;

    invoke-direct {v4, v15}, Lb0/a;-><init>(Lb0/h0;)V

    invoke-virtual {v10, v4}, Lm0/q;->l0(Ljava/lang/Object;)V

    goto :goto_29

    :goto_2b
    invoke-virtual {v10, v3}, Lm0/q;->t(Z)V

    move-object v3, v4

    check-cast v3, Ln1/a;

    and-int/lit8 v7, v7, -0x71

    move/from16 v31, v1

    move/from16 v32, v2

    move-object/from16 v34, v3

    :goto_2c
    move-object/from16 v21, v19

    move-object/from16 v33, v24

    move-object/from16 v24, v5

    move-object/from16 v19, v16

    goto :goto_2d

    :cond_3a
    move-object/from16 v34, p11

    move/from16 v31, v1

    move/from16 v32, v2

    goto :goto_2c

    :goto_2d
    invoke-virtual {v10}, Lm0/q;->u()V

    sget-object v4, Lv/h1;->b:Lv/h1;

    sget-object v12, Ly0/a;->p:Ly0/e;

    const/4 v1, 0x6

    shr-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6000

    shl-int/lit8 v3, v0, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v2, v3

    shr-int/lit8 v3, v0, 0x12

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shr-int/lit8 v3, v0, 0x6

    and-int v5, v3, v20

    or-int/2addr v2, v5

    and-int v3, v3, v23

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0x9

    and-int v5, v3, v25

    or-int/2addr v2, v5

    and-int v3, v3, v27

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0x12

    and-int v3, v3, v28

    or-int v16, v2, v3

    shl-int/lit8 v2, v7, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/lit16 v2, v2, 0x188

    shr-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v1, v7, 0x6

    and-int v1, v1, v17

    or-int v17, v0, v1

    const/16 v18, 0x0

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move-object/from16 v2, v30

    move/from16 v3, v32

    move-object/from16 v5, v24

    move/from16 v6, v31

    move/from16 v7, v29

    move/from16 v8, v22

    move-object/from16 v9, v26

    move-object/from16 v20, v10

    move-object/from16 v10, v34

    move-object/from16 v11, v33

    move-object/from16 v13, v21

    move-object/from16 v14, p12

    move-object/from16 v15, v20

    invoke-static/range {v0 .. v18}, Ld7/t;->g(Ly0/o;Lb0/h0;Ly/t0;ZLv/h1;Lw/h;ZIFLb0/j;Ln1/a;Lc9/c;Ly0/b;Ly0/c;Lc9/g;Lm0/m;III)V

    move-object/from16 v2, v19

    move-object/from16 v7, v21

    move/from16 v6, v22

    move-object/from16 v8, v24

    move-object/from16 v4, v26

    move/from16 v5, v29

    move-object/from16 v3, v30

    move/from16 v9, v31

    move/from16 v10, v32

    move-object/from16 v11, v33

    move-object/from16 v12, v34

    :goto_2e
    invoke-virtual/range {v20 .. v20}, Lm0/q;->x()Lm0/x1;

    move-result-object v15

    if-eqz v15, :cond_3b

    new-instance v14, Lb0/o;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v13, p12

    move-object/from16 v35, v14

    move/from16 v14, p14

    move-object/from16 v36, v15

    move/from16 v15, p15

    move/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Lb0/o;-><init>(Lb0/h0;Ly0/o;Ly/t0;Lb0/j;IFLy0/c;Lw/h;ZZLc9/c;Ln1/a;Lc9/g;III)V

    move-object/from16 v1, v35

    move-object/from16 v0, v36

    iput-object v1, v0, Lm0/x1;->d:Lc9/e;

    :cond_3b
    return-void
.end method

.method public static final g(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V
    .locals 26

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v0, p10

    check-cast v0, Lm0/q;

    const v1, -0x6504b8df

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v11

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v12, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-virtual {v0, v6}, Lm0/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    :goto_5
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_b

    and-int/lit8 v7, v12, 0x8

    if-nez v7, :cond_9

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v7, p3

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    goto :goto_7

    :cond_b
    move-object/from16 v7, p3

    :goto_7
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_e

    and-int/lit8 v8, v12, 0x10

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-virtual {v0, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v8, p4

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v2, v9

    goto :goto_9

    :cond_e
    move-object/from16 v8, p4

    :goto_9
    and-int/lit8 v9, v12, 0x20

    const/high16 v10, 0x30000

    if-eqz v9, :cond_10

    or-int/2addr v2, v10

    :cond_f
    move-object/from16 v10, p5

    goto :goto_b

    :cond_10
    and-int/2addr v10, v11

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-virtual {v0, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v2, v13

    :goto_b
    const/high16 v13, 0x180000

    and-int/2addr v13, v11

    if-nez v13, :cond_14

    and-int/lit8 v13, v12, 0x40

    if-nez v13, :cond_12

    move-object/from16 v13, p6

    invoke-virtual {v0, v13}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_13

    const/high16 v14, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v13, p6

    :cond_13
    const/high16 v14, 0x80000

    :goto_c
    or-int/2addr v2, v14

    goto :goto_d

    :cond_14
    move-object/from16 v13, p6

    :goto_d
    and-int/lit16 v14, v12, 0x80

    const/high16 v15, 0xc00000

    if-eqz v14, :cond_16

    or-int/2addr v2, v15

    :cond_15
    move-object/from16 v15, p7

    goto :goto_f

    :cond_16
    and-int/2addr v15, v11

    if-nez v15, :cond_15

    move-object/from16 v15, p7

    invoke-virtual {v0, v15}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v16, 0x400000

    :goto_e
    or-int v2, v2, v16

    :goto_f
    and-int/lit16 v1, v12, 0x100

    const/high16 v16, 0x6000000

    if-eqz v1, :cond_18

    or-int v2, v2, v16

    move-object/from16 v4, p8

    goto :goto_11

    :cond_18
    and-int v16, v11, v16

    move-object/from16 v4, p8

    if-nez v16, :cond_1a

    invoke-virtual {v0, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    const/high16 v16, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v16, 0x2000000

    :goto_10
    or-int v2, v2, v16

    :cond_1a
    :goto_11
    and-int/lit16 v4, v12, 0x200

    const/high16 v16, 0x30000000

    if-eqz v4, :cond_1c

    or-int v2, v2, v16

    :cond_1b
    move-object/from16 v4, p9

    goto :goto_13

    :cond_1c
    and-int v4, v11, v16

    if-nez v4, :cond_1b

    move-object/from16 v4, p9

    invoke-virtual {v0, v4}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1d

    const/high16 v16, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v16, 0x10000000

    :goto_12
    or-int v2, v2, v16

    :goto_13
    const v16, 0x12492493

    and-int v4, v2, v16

    const v6, 0x12492492

    if-ne v4, v6, :cond_1f

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v9, p8

    move-object v4, v7

    move-object v5, v8

    move-object v6, v10

    move-object v7, v13

    move-object v8, v15

    goto/16 :goto_1e

    :cond_1f
    :goto_14
    invoke-virtual {v0}, Lm0/q;->W()V

    and-int/lit8 v4, v11, 0x1

    const v6, -0x380001

    const v16, -0xe001

    if-eqz v4, :cond_24

    invoke-virtual {v0}, Lm0/q;->E()Z

    move-result v4

    if-eqz v4, :cond_20

    goto :goto_15

    :cond_20
    invoke-virtual {v0}, Lm0/q;->U()V

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_21

    and-int/lit16 v2, v2, -0x1c01

    :cond_21
    and-int/lit8 v1, v12, 0x10

    if-eqz v1, :cond_22

    and-int v2, v2, v16

    :cond_22
    and-int/lit8 v1, v12, 0x40

    if-eqz v1, :cond_23

    and-int/2addr v2, v6

    :cond_23
    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v1, p8

    move-object v5, v7

    move-object v7, v8

    move-object v8, v10

    move-object v9, v13

    move-object v10, v15

    goto/16 :goto_1d

    :cond_24
    :goto_15
    if-eqz v3, :cond_25

    sget-object v3, Ly0/l;->b:Ly0/l;

    goto :goto_16

    :cond_25
    move-object/from16 v3, p1

    :goto_16
    if-eqz v5, :cond_26

    const/4 v4, 0x1

    goto :goto_17

    :cond_26
    move/from16 v4, p2

    :goto_17
    and-int/lit8 v5, v12, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_27

    sget-object v5, Lk0/z;->a:Ly/u0;

    const v5, -0x79e77989

    invoke-virtual {v0, v5}, Lm0/q;->Z(I)V

    sget v5, Ll0/k;->a:F

    const/4 v5, 0x5

    invoke-static {v5, v0}, Lk0/r2;->a(ILm0/m;)Le1/l0;

    move-result-object v5

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    and-int/lit16 v2, v2, -0x1c01

    goto :goto_18

    :cond_27
    move-object v5, v7

    :goto_18
    and-int/lit8 v7, v12, 0x10

    if-eqz v7, :cond_28

    sget-object v7, Lk0/z;->a:Ly/u0;

    const v7, -0x502957c5

    invoke-virtual {v0, v7}, Lm0/q;->Z(I)V

    sget-object v7, Lk0/k0;->a:Lm0/m3;

    invoke-virtual {v0, v7}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk0/i0;

    invoke-static {v7}, Lk0/z;->d(Lk0/i0;)Lk0/y;

    move-result-object v7

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    and-int v2, v2, v16

    goto :goto_19

    :cond_28
    move-object v7, v8

    :goto_19
    if-eqz v9, :cond_29

    const/4 v8, 0x0

    goto :goto_1a

    :cond_29
    move-object v8, v10

    :goto_1a
    and-int/lit8 v9, v12, 0x40

    if-eqz v9, :cond_2a

    invoke-static {v0}, Lk0/z;->f(Lm0/m;)Lu/w;

    move-result-object v9

    const v10, -0x380001

    and-int/2addr v2, v10

    goto :goto_1b

    :cond_2a
    move-object v9, v13

    :goto_1b
    if-eqz v14, :cond_2b

    sget-object v10, Lk0/z;->a:Ly/u0;

    goto :goto_1c

    :cond_2b
    move-object v10, v15

    :goto_1c
    if-eqz v1, :cond_2d

    const v1, -0xd1c6fe8

    invoke-virtual {v0, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v13, Lm0/l;->a:Lk0/y0;

    if-ne v1, v13, :cond_2c

    new-instance v1, Lx/m;

    invoke-direct {v1}, Lx/m;-><init>()V

    invoke-virtual {v0, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v1, Lx/m;

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    goto :goto_1d

    :cond_2d
    move-object/from16 v1, p8

    :goto_1d
    invoke-virtual {v0}, Lm0/q;->u()V

    and-int/lit8 v6, v2, 0xe

    and-int/lit8 v13, v2, 0x70

    or-int/2addr v6, v13

    and-int/lit16 v13, v2, 0x380

    or-int/2addr v6, v13

    and-int/lit16 v13, v2, 0x1c00

    or-int/2addr v6, v13

    const v13, 0xe000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x70000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x380000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x1c00000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0xe000000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x70000000

    and-int/2addr v2, v13

    or-int v24, v6, v2

    const/16 v25, 0x0

    move-object/from16 v13, p0

    move-object v14, v3

    move v15, v4

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move-object/from16 v21, v1

    move-object/from16 v22, p9

    move-object/from16 v23, v0

    invoke-static/range {v13 .. v25}, Lm9/e0;->d(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    move-object v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v1

    :goto_1e
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v14

    if-eqz v14, :cond_2e

    new-instance v15, Lk0/f0;

    const/4 v13, 0x1

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v13}, Lk0/f0;-><init>(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;III)V

    iput-object v15, v14, Lm0/x1;->d:Lc9/e;

    :cond_2e
    return-void
.end method

.method public static final h(JJ)Ld1/d;
    .locals 5

    new-instance v0, Ld1/d;

    invoke-static {p0, p1}, Ld1/c;->d(J)F

    move-result v1

    invoke-static {p0, p1}, Ld1/c;->e(J)F

    move-result v2

    invoke-static {p0, p1}, Ld1/c;->d(J)F

    move-result v3

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result v4

    add-float/2addr v4, v3

    invoke-static {p0, p1}, Ld1/c;->e(J)F

    move-result p0

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result p1

    add-float/2addr p1, p0

    invoke-direct {v0, v1, v2, v4, p1}, Ld1/d;-><init>(FFFF)V

    return-object v0
.end method

.method public static final i(Lk0/a3;Ly0/o;Lc9/f;Lm0/m;II)V
    .locals 12

    move-object v1, p0

    move/from16 v4, p4

    move-object v0, p3

    check-cast v0, Lm0/q;

    const v2, 0x1baacc01

    invoke-virtual {v0, v2}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    move-object v5, p1

    invoke-virtual {v0, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    move-object v7, p2

    invoke-virtual {v0, p2}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit16 v8, v2, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object v2, v5

    move-object v3, v7

    goto :goto_9

    :cond_a
    :goto_6
    if-eqz v3, :cond_b

    sget-object v3, Ly0/l;->b:Ly0/l;

    goto :goto_7

    :cond_b
    move-object v3, v5

    :goto_7
    if-eqz v6, :cond_c

    sget-object v5, Lk0/p0;->a:Lu0/b;

    move-object v11, v5

    goto :goto_8

    :cond_c
    move-object v11, v7

    :goto_8
    iget-object v5, v1, Lk0/a3;->b:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk0/x2;

    sget-object v6, Lu1/s1;->a:Lm0/m3;

    invoke-virtual {v0, v6}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu1/i;

    const v7, -0x5384869e

    invoke-virtual {v0, v7}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v5}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0, v6}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_d

    sget-object v7, Lm0/l;->a:Lk0/y0;

    if-ne v8, v7, :cond_e

    :cond_d
    new-instance v8, Lk0/u2;

    const/4 v7, 0x0

    invoke-direct {v8, v5, v6, v7}, Lk0/u2;-><init>(Lk0/x2;Lu1/i;Lu8/e;)V

    invoke-virtual {v0, v8}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc9/e;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    invoke-static {v5, v8, v0}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    iget-object v5, v1, Lk0/a3;->b:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk0/x2;

    and-int/lit8 v6, v2, 0x70

    and-int/lit16 v2, v2, 0x380

    or-int v9, v6, v2

    const/4 v10, 0x0

    move-object v6, v3

    move-object v7, v11

    move-object v8, v0

    invoke-static/range {v5 .. v10}, Lm9/e0;->e(Lk0/x2;Ly0/o;Lc9/f;Lm0/m;II)V

    move-object v2, v3

    move-object v3, v11

    :goto_9
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v8, La0/r;

    const/4 v6, 0x3

    move-object v0, v8

    move-object v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq8/a;III)V

    iput-object v8, v7, Lm0/x1;->d:Lc9/e;

    :cond_f
    return-void
.end method

.method public static final j(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V
    .locals 26

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v0, p10

    check-cast v0, Lm0/q;

    const v1, -0x7d8d8bca

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v11

    :goto_1
    and-int/lit8 v3, v12, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v12, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-virtual {v0, v6}, Lm0/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    :goto_5
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_b

    and-int/lit8 v7, v12, 0x8

    if-nez v7, :cond_9

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v7, p3

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    goto :goto_7

    :cond_b
    move-object/from16 v7, p3

    :goto_7
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_e

    and-int/lit8 v8, v12, 0x10

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-virtual {v0, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v8, p4

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v2, v9

    goto :goto_9

    :cond_e
    move-object/from16 v8, p4

    :goto_9
    and-int/lit8 v9, v12, 0x20

    const/high16 v10, 0x30000

    if-eqz v9, :cond_10

    or-int/2addr v2, v10

    :cond_f
    move-object/from16 v10, p5

    goto :goto_b

    :cond_10
    and-int/2addr v10, v11

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-virtual {v0, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v2, v13

    :goto_b
    and-int/lit8 v13, v12, 0x40

    const/high16 v14, 0x180000

    if-eqz v13, :cond_13

    or-int/2addr v2, v14

    :cond_12
    move-object/from16 v14, p6

    goto :goto_d

    :cond_13
    and-int/2addr v14, v11

    if-nez v14, :cond_12

    move-object/from16 v14, p6

    invoke-virtual {v0, v14}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_14

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v2, v15

    :goto_d
    and-int/lit16 v15, v12, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_15

    or-int v2, v2, v16

    move-object/from16 v1, p7

    goto :goto_f

    :cond_15
    and-int v16, v11, v16

    move-object/from16 v1, p7

    if-nez v16, :cond_17

    invoke-virtual {v0, v1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_16

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v16, 0x400000

    :goto_e
    or-int v2, v2, v16

    :cond_17
    :goto_f
    and-int/lit16 v1, v12, 0x100

    const/high16 v16, 0x6000000

    if-eqz v1, :cond_18

    or-int v2, v2, v16

    move-object/from16 v4, p8

    goto :goto_11

    :cond_18
    and-int v16, v11, v16

    move-object/from16 v4, p8

    if-nez v16, :cond_1a

    invoke-virtual {v0, v4}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    const/high16 v16, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v16, 0x2000000

    :goto_10
    or-int v2, v2, v16

    :cond_1a
    :goto_11
    and-int/lit16 v4, v12, 0x200

    const/high16 v16, 0x30000000

    if-eqz v4, :cond_1c

    or-int v2, v2, v16

    :cond_1b
    move-object/from16 v4, p9

    goto :goto_13

    :cond_1c
    and-int v4, v11, v16

    if-nez v4, :cond_1b

    move-object/from16 v4, p9

    invoke-virtual {v0, v4}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1d

    const/high16 v16, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v16, 0x10000000

    :goto_12
    or-int v2, v2, v16

    :goto_13
    const v16, 0x12492493

    and-int v4, v2, v16

    const v6, 0x12492492

    if-ne v4, v6, :cond_1f

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v9, p8

    move-object v4, v7

    move-object v5, v8

    move-object v6, v10

    move-object v7, v14

    move-object/from16 v8, p7

    goto/16 :goto_1d

    :cond_1f
    :goto_14
    invoke-virtual {v0}, Lm0/q;->W()V

    and-int/lit8 v4, v11, 0x1

    const v6, -0xe001

    if-eqz v4, :cond_23

    invoke-virtual {v0}, Lm0/q;->E()Z

    move-result v4

    if-eqz v4, :cond_20

    goto :goto_15

    :cond_20
    invoke-virtual {v0}, Lm0/q;->U()V

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_21

    and-int/lit16 v2, v2, -0x1c01

    :cond_21
    and-int/lit8 v1, v12, 0x10

    if-eqz v1, :cond_22

    and-int/2addr v2, v6

    :cond_22
    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v9, p7

    move-object/from16 v1, p8

    move-object v5, v7

    move-object v7, v8

    move-object v8, v14

    goto/16 :goto_1c

    :cond_23
    :goto_15
    if-eqz v3, :cond_24

    sget-object v3, Ly0/l;->b:Ly0/l;

    goto :goto_16

    :cond_24
    move-object/from16 v3, p1

    :goto_16
    if-eqz v5, :cond_25

    const/4 v4, 0x1

    goto :goto_17

    :cond_25
    move/from16 v4, p2

    :goto_17
    and-int/lit8 v5, v12, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_26

    sget-object v5, Lk0/z;->a:Ly/u0;

    const v5, -0x14cf2c33

    invoke-virtual {v0, v5}, Lm0/q;->Z(I)V

    const/4 v5, 0x5

    invoke-static {v5, v0}, Lk0/r2;->a(ILm0/m;)Le1/l0;

    move-result-object v5

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    and-int/lit16 v2, v2, -0x1c01

    goto :goto_18

    :cond_26
    move-object v5, v7

    :goto_18
    and-int/lit8 v7, v12, 0x10

    if-eqz v7, :cond_27

    sget-object v7, Lk0/z;->a:Ly/u0;

    const v7, 0x7013bc50

    invoke-virtual {v0, v7}, Lm0/q;->Z(I)V

    sget-object v7, Lk0/k0;->a:Lm0/m3;

    invoke-virtual {v0, v7}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk0/i0;

    invoke-static {v7}, Lk0/z;->e(Lk0/i0;)Lk0/y;

    move-result-object v7

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    const v8, -0xe001

    and-int/2addr v2, v8

    goto :goto_19

    :cond_27
    move-object v7, v8

    :goto_19
    const/4 v8, 0x0

    if-eqz v9, :cond_28

    move-object v10, v8

    :cond_28
    if-eqz v13, :cond_29

    goto :goto_1a

    :cond_29
    move-object v8, v14

    :goto_1a
    if-eqz v15, :cond_2a

    sget-object v9, Lk0/z;->b:Ly/u0;

    goto :goto_1b

    :cond_2a
    move-object/from16 v9, p7

    :goto_1b
    if-eqz v1, :cond_2c

    const v1, 0x2363d5a2

    invoke-virtual {v0, v1}, Lm0/q;->Z(I)V

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v1

    sget-object v13, Lm0/l;->a:Lk0/y0;

    if-ne v1, v13, :cond_2b

    new-instance v1, Lx/m;

    invoke-direct {v1}, Lx/m;-><init>()V

    invoke-virtual {v0, v1}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v1, Lx/m;

    invoke-virtual {v0, v6}, Lm0/q;->t(Z)V

    goto :goto_1c

    :cond_2c
    move-object/from16 v1, p8

    :goto_1c
    invoke-virtual {v0}, Lm0/q;->u()V

    and-int/lit8 v6, v2, 0xe

    and-int/lit8 v13, v2, 0x70

    or-int/2addr v6, v13

    and-int/lit16 v13, v2, 0x380

    or-int/2addr v6, v13

    and-int/lit16 v13, v2, 0x1c00

    or-int/2addr v6, v13

    const v13, 0xe000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x70000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x380000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x1c00000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0xe000000

    and-int/2addr v13, v2

    or-int/2addr v6, v13

    const/high16 v13, 0x70000000

    and-int/2addr v2, v13

    or-int v24, v6, v2

    const/16 v25, 0x0

    move-object/from16 v13, p0

    move-object v14, v3

    move v15, v4

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    move-object/from16 v18, v10

    move-object/from16 v19, v8

    move-object/from16 v20, v9

    move-object/from16 v21, v1

    move-object/from16 v22, p9

    move-object/from16 v23, v0

    invoke-static/range {v13 .. v25}, Lm9/e0;->d(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

    move-object v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v7

    move-object v7, v8

    move-object v8, v9

    move-object v6, v10

    move-object v9, v1

    :goto_1d
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v14

    if-eqz v14, :cond_2d

    new-instance v15, Lk0/f0;

    const/4 v13, 0x2

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v13}, Lk0/f0;-><init>(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;III)V

    iput-object v15, v14, Lm0/x1;->d:Lc9/e;

    :cond_2d
    return-void
.end method

.method public static final k(Lr1/l0;ILg2/i0;La2/a0;ZI)Ld1/d;
    .locals 1

    if-eqz p3, :cond_0

    iget-object p2, p2, Lg2/i0;->b:Lg2/s;

    invoke-interface {p2, p1}, Lg2/s;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, La2/a0;->c(I)Ld1/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ld1/d;->e:Ld1/d;

    :goto_0
    sget p2, Lf0/n1;->b:F

    invoke-interface {p0, p2}, Lm2/b;->J(F)I

    move-result p0

    iget p2, p1, Ld1/d;->a:F

    if-eqz p4, :cond_1

    int-to-float p3, p5

    sub-float/2addr p3, p2

    int-to-float v0, p0

    sub-float/2addr p3, v0

    goto :goto_1

    :cond_1
    move p3, p2

    :goto_1
    if-eqz p4, :cond_2

    int-to-float p0, p5

    sub-float/2addr p0, p2

    goto :goto_2

    :cond_2
    int-to-float p0, p0

    add-float/2addr p0, p2

    :goto_2
    new-instance p2, Ld1/d;

    iget p4, p1, Ld1/d;->b:F

    iget p1, p1, Ld1/d;->d:F

    invoke-direct {p2, p3, p4, p0, p1}, Ld1/d;-><init>(FFFF)V

    return-object p2
.end method

.method public static final l(ILjava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    array-length v0, p3

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p3, v0, v1, p0, v2}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    add-int/lit8 v1, p0, 0x2

    array-length v2, p3

    invoke-static {v1, p0, v2, p3, v0}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    aput-object p1, v0, p0

    add-int/lit8 p0, p0, 0x1

    aput-object p2, v0, p0

    return-object v0
.end method

.method public static final m(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final n(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    array-length v0, p1

    add-int/lit8 v0, v0, -0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, p0, v2}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    add-int/lit8 v1, p0, 0x2

    array-length v2, p1

    invoke-static {p0, v1, v2, p1, v0}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final o(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, p0, v2}, Lb9/b;->L([Ljava/lang/Object;[Ljava/lang/Object;III)V

    add-int/lit8 v1, p0, 0x1

    array-length v2, p1

    invoke-static {p0, v1, v2, p1, v0}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final p(Lo1/h0;Lu8/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lv/z0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv/z0;

    iget v1, v0, Lv/z0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv/z0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv/z0;

    invoke-direct {v0, p1}, Lw8/c;-><init>(Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lv/z0;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lv/z0;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lv/z0;->a:Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lo1/h0;->e:Lo1/j0;

    iget-object p1, p1, Lo1/j0;->w:Lo1/k;

    iget-object p1, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v5, v4

    :goto_1
    if-ge v5, v2, :cond_4

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo1/u;

    iget-boolean v6, v6, Lo1/u;->d:Z

    if-eqz v6, :cond_3

    move p1, v3

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    move p1, v4

    :goto_2
    xor-int/2addr p1, v3

    if-nez p1, :cond_7

    :goto_3
    sget-object p1, Lo1/l;->c:Lo1/l;

    iput-object p0, v0, Lv/z0;->a:Lo1/h0;

    iput v3, v0, Lv/z0;->c:I

    invoke-virtual {p0, p1, v0}, Lo1/h0;->a(Lo1/l;Lw8/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_4
    check-cast p1, Lo1/k;

    iget-object p1, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v5, v4

    :goto_5
    if-ge v5, v2, :cond_7

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo1/u;

    iget-boolean v6, v6, Lo1/u;->d:Z

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_7
    sget-object p0, Lq8/l;->a:Lq8/l;

    return-object p0
.end method

.method public static final q(Lo1/z;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p2}, Lu8/e;->getContext()Lu8/j;

    move-result-object v0

    new-instance v1, Lv/a1;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lv/a1;-><init>(Lu8/j;Lc9/e;Lu8/e;)V

    check-cast p0, Lo1/j0;

    invoke-virtual {p0, v1, p2}, Lo1/j0;->G0(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lv8/a;->a:Lv8/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lq8/l;->a:Lq8/l;

    return-object p0
.end method

.method public static final r(Lo1/u;)Z
    .locals 1

    iget-boolean v0, p0, Lo1/u;->h:Z

    if-nez v0, :cond_0

    iget-boolean p0, p0, Lo1/u;->d:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final s(Lo1/u;)Z
    .locals 1

    invoke-virtual {p0}, Lo1/u;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo1/u;->h:Z

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Lo1/u;->d:Z

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final t(Lo1/u;)Z
    .locals 1

    iget-boolean v0, p0, Lo1/u;->h:Z

    if-eqz v0, :cond_0

    iget-boolean p0, p0, Lo1/u;->d:Z

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final u(Lx/l;Lm0/m;I)Lm0/g1;
    .locals 4

    check-cast p1, Lm0/q;

    const p2, -0x6b9dfad0

    invoke-virtual {p1, p2}, Lm0/q;->Z(I)V

    const p2, -0x1d58f75c

    invoke-virtual {p1, p2}, Lm0/q;->Z(I)V

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lm0/l;->a:Lk0/y0;

    if-ne p2, v0, :cond_0

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {p2, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    check-cast p2, Lm0/g1;

    const v2, -0x54535144

    invoke-virtual {p1, v2}, Lm0/q;->Z(I)V

    invoke-virtual {p1, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p1, p2}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p1}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    if-ne v3, v0, :cond_2

    :cond_1
    new-instance v3, Lx/g;

    const/4 v0, 0x0

    invoke-direct {v3, p0, p2, v0}, Lx/g;-><init>(Lx/l;Lm0/g1;Lu8/e;)V

    invoke-virtual {p1, v3}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lc9/e;

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    invoke-static {p0, v3, p1}, Lm0/s;->b(Ljava/lang/Object;Lc9/e;Lm0/m;)V

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    return-object p2
.end method

.method public static final v(Ly0/o;Lc9/f;)Ly0/o;
    .locals 1

    new-instance v0, Ly0/j;

    invoke-direct {v0, p1}, Ly0/j;-><init>(Lc9/f;)V

    invoke-interface {p0, v0}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object p0

    return-object p0
.end method

.method public static final w(JZIF)J
    .locals 0

    if-nez p2, :cond_0

    const/4 p2, 0x2

    invoke-static {p3, p2}, Lh6/g;->T(II)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    invoke-static {p0, p1}, Lm2/a;->e(J)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1}, Lm2/a;->i(J)I

    move-result p2

    goto :goto_0

    :cond_1
    const p2, 0x7fffffff

    :goto_0
    invoke-static {p0, p1}, Lm2/a;->k(J)I

    move-result p3

    if-ne p3, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p4}, Ld9/i;->n(F)I

    move-result p3

    invoke-static {p0, p1}, Lm2/a;->k(J)I

    move-result p4

    invoke-static {p3, p4, p2}, Lz6/a;->r(III)I

    move-result p2

    :goto_1
    invoke-static {p0, p1}, Lm2/a;->h(J)I

    move-result p0

    const/4 p1, 0x5

    invoke-static {p2, p0, p1}, Lo1/s;->b(III)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final x(II)J
    .locals 2

    const v0, 0x3fffe

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/16 v1, 0x1fff

    if-ge p0, v1, :cond_0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 v0, 0x7fff

    if-ge p0, v0, :cond_1

    const v0, 0xfffe

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    const v0, 0xffff

    if-ge p0, v0, :cond_2

    const/16 v0, 0x7ffe

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_2
    const/16 v0, 0x1ffe

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    invoke-static {p0, p1}, Ll2/l;->d(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final y(Lm0/m;)I
    .locals 0

    check-cast p0, Lm0/q;

    iget p0, p0, Lm0/q;->P:I

    return p0
.end method

.method public static final z(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
