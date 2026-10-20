.class public final Lh0/v0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lf0/e2;

.field public b:Lg2/s;

.field public c:Lc9/c;

.field public d:Lf0/c2;

.field public final e:Lm0/n1;

.field public f:Lg2/l0;

.field public g:Lu1/p1;

.field public h:Lu1/u2;

.field public i:Lk1/a;

.field public j:Lc1/k;

.field public final k:Lm0/n1;

.field public l:J

.field public m:Ljava/lang/Integer;

.field public n:J

.field public final o:Lm0/n1;

.field public final p:Lm0/n1;

.field public q:I

.field public r:Lg2/a0;

.field public s:Lh0/q0;

.field public final t:Lh0/s0;

.field public final u:Lh0/u0;


# direct methods
.method public constructor <init>(Lf0/e2;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/v0;->a:Lf0/e2;

    sget-object p1, Lf0/g2;->a:Lf0/f2;

    iput-object p1, p0, Lh0/v0;->b:Lg2/s;

    sget-object p1, Lh0/g0;->d:Lh0/g0;

    iput-object p1, p0, Lh0/v0;->c:Lc9/c;

    new-instance p1, Lg2/a0;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x7

    invoke-direct {p1, v0, v1, v2, v3}, Lg2/a0;-><init>(Ljava/lang/String;JI)V

    sget-object v4, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lh0/v0;->e:Lm0/n1;

    sget-object p1, Lg2/k0;->a:Lg2/j0;

    iput-object p1, p0, Lh0/v0;->f:Lg2/l0;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lh0/v0;->k:Lm0/n1;

    sget-wide v5, Ld1/c;->b:J

    iput-wide v5, p0, Lh0/v0;->l:J

    iput-wide v5, p0, Lh0/v0;->n:J

    invoke-static {v0, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lh0/v0;->o:Lm0/n1;

    invoke-static {v0, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lh0/v0;->p:Lm0/n1;

    const/4 p1, -0x1

    iput p1, p0, Lh0/v0;->q:I

    new-instance p1, Lg2/a0;

    invoke-direct {p1, v0, v1, v2, v3}, Lg2/a0;-><init>(Ljava/lang/String;JI)V

    iput-object p1, p0, Lh0/v0;->r:Lg2/a0;

    new-instance p1, Lh0/s0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lh0/s0;-><init>(Lh0/v0;I)V

    iput-object p1, p0, Lh0/v0;->t:Lh0/s0;

    new-instance p1, Lh0/u0;

    invoke-direct {p1, p0}, Lh0/u0;-><init>(Lh0/v0;)V

    iput-object p1, p0, Lh0/v0;->u:Lh0/u0;

    return-void
.end method

.method public static final a(Lh0/v0;Ld1/c;)V
    .locals 0

    iget-object p0, p0, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {p0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final b(Lh0/v0;Lf0/n0;)V
    .locals 0

    iget-object p0, p0, Lh0/v0;->o:Lm0/n1;

    invoke-virtual {p0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    iget-object v3, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lf0/c2;->d()Lf0/d2;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_d

    :cond_0
    iget-object v4, v0, Lh0/v0;->b:Lg2/s;

    iget-wide v5, v1, Lg2/a0;->b:J

    sget v7, La2/b0;->c:I

    const/16 v7, 0x20

    shr-long/2addr v5, v7

    long-to-int v5, v5

    invoke-interface {v4, v5}, Lg2/s;->b(I)I

    move-result v4

    iget-object v5, v0, Lh0/v0;->b:Lg2/s;

    iget-wide v8, v1, Lg2/a0;->b:J

    const-wide v10, 0xffffffffL

    and-long v12, v8, v10

    long-to-int v6, v12

    invoke-interface {v5, v6}, Lg2/s;->b(I)I

    move-result v5

    invoke-static {v4, v5}, Lo1/s;->g(II)J

    move-result-wide v4

    const/4 v6, 0x0

    move-wide/from16 v12, p2

    invoke-virtual {v3, v12, v13, v6}, Lf0/d2;->b(JZ)I

    move-result v12

    if-nez v2, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    shr-long v13, v4, v7

    long-to-int v13, v13

    goto :goto_1

    :cond_2
    :goto_0
    move v13, v12

    :goto_1
    if-eqz v2, :cond_4

    if-eqz p4, :cond_3

    goto :goto_2

    :cond_3
    and-long v14, v4, v10

    long-to-int v14, v14

    goto :goto_3

    :cond_4
    :goto_2
    move v14, v12

    :goto_3
    iget-object v15, v0, Lh0/v0;->s:Lh0/q0;

    const/4 v6, -0x1

    if-nez p4, :cond_6

    if-eqz v15, :cond_6

    iget v10, v0, Lh0/v0;->q:I

    if-ne v10, v6, :cond_5

    goto :goto_4

    :cond_5
    move v6, v10

    :cond_6
    :goto_4
    new-instance v10, Lh0/q0;

    iget-object v3, v3, Lf0/d2;->a:La2/a0;

    if-eqz p4, :cond_7

    const/4 v4, 0x0

    move/from16 p2, v6

    move-wide/from16 v18, v8

    move-object/from16 v20, v10

    goto :goto_5

    :cond_7
    new-instance v11, Lh0/p;

    new-instance v1, Lh0/o;

    move-wide/from16 v18, v8

    shr-long v8, v4, v7

    long-to-int v8, v8

    invoke-static {v3, v8}, Lm9/e0;->A(La2/a0;I)Ll2/h;

    move-result-object v9

    move/from16 p2, v6

    const-wide/16 v6, 0x1

    invoke-direct {v1, v9, v8, v6, v7}, Lh0/o;-><init>(Ll2/h;IJ)V

    new-instance v8, Lh0/o;

    const-wide v16, 0xffffffffL

    and-long v6, v4, v16

    long-to-int v6, v6

    invoke-static {v3, v6}, Lm9/e0;->A(La2/a0;I)Ll2/h;

    move-result-object v7

    move-object/from16 v20, v10

    const-wide/16 v9, 0x1

    invoke-direct {v8, v7, v6, v9, v10}, Lh0/o;-><init>(Ll2/h;IJ)V

    invoke-static {v4, v5}, La2/b0;->f(J)Z

    move-result v4

    invoke-direct {v11, v1, v8, v4}, Lh0/p;-><init>(Lh0/o;Lh0/o;Z)V

    move-object v4, v11

    :goto_5
    new-instance v1, Lh0/n;

    move/from16 v10, p2

    invoke-direct {v1, v13, v14, v10, v3}, Lh0/n;-><init>(IIILa2/a0;)V

    move-object/from16 v3, v20

    invoke-direct {v3, v2, v4, v1}, Lh0/q0;-><init>(ZLh0/p;Lh0/n;)V

    if-eqz v4, :cond_9

    if-eqz v15, :cond_9

    iget-boolean v1, v15, Lh0/q0;->a:Z

    if-ne v2, v1, :cond_9

    iget-object v1, v15, Lh0/q0;->c:Lh0/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v1, Lh0/n;->a:I

    if-ne v13, v2, :cond_9

    iget v1, v1, Lh0/n;->b:I

    if-eq v14, v1, :cond_8

    goto :goto_6

    :cond_8
    move-wide/from16 v8, v18

    goto/16 :goto_e

    :cond_9
    :goto_6
    iput-object v3, v0, Lh0/v0;->s:Lh0/q0;

    iput v12, v0, Lh0/v0;->q:I

    move-object/from16 v1, p6

    check-cast v1, Lb0/l0;

    invoke-virtual {v1, v3}, Lb0/l0;->c(Lh0/q0;)Lh0/p;

    move-result-object v1

    iget-object v2, v0, Lh0/v0;->b:Lg2/s;

    iget-object v3, v1, Lh0/p;->a:Lh0/o;

    iget v3, v3, Lh0/o;->b:I

    invoke-interface {v2, v3}, Lg2/s;->a(I)I

    move-result v2

    iget-object v3, v0, Lh0/v0;->b:Lg2/s;

    iget-object v1, v1, Lh0/p;->b:Lh0/o;

    iget v1, v1, Lh0/o;->b:I

    invoke-interface {v3, v1}, Lg2/s;->a(I)I

    move-result v1

    invoke-static {v2, v1}, Lo1/s;->g(II)J

    move-result-wide v1

    move-wide/from16 v3, v18

    invoke-static {v1, v2, v3, v4}, La2/b0;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_a

    move-wide v8, v3

    goto/16 :goto_e

    :cond_a
    invoke-static {v1, v2}, La2/b0;->f(J)Z

    move-result v5

    invoke-static {v3, v4}, La2/b0;->f(J)Z

    move-result v6

    const/4 v7, 0x1

    if-eq v5, v6, :cond_b

    const-wide v5, 0xffffffffL

    and-long/2addr v5, v1

    long-to-int v5, v5

    const/16 v6, 0x20

    shr-long v8, v1, v6

    long-to-int v6, v8

    invoke-static {v5, v6}, Lo1/s;->g(II)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, La2/b0;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_b

    move v5, v7

    goto :goto_7

    :cond_b
    const/4 v5, 0x0

    :goto_7
    invoke-static {v1, v2}, La2/b0;->b(J)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-static {v3, v4}, La2/b0;->b(J)Z

    move-result v3

    if-eqz v3, :cond_c

    move-object/from16 v3, p1

    move v4, v7

    goto :goto_8

    :cond_c
    move-object/from16 v3, p1

    const/4 v4, 0x0

    :goto_8
    iget-object v3, v3, Lg2/a0;->a:La2/e;

    if-eqz p7, :cond_d

    iget-object v6, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_d

    if-nez v5, :cond_d

    if-nez v4, :cond_d

    iget-object v4, v0, Lh0/v0;->i:Lk1/a;

    if-eqz v4, :cond_d

    check-cast v4, Lk1/c;

    sget v5, Lf6/a;->x:I

    invoke-virtual {v4, v5}, Lk1/c;->a(I)V

    :cond_d
    invoke-static {v3, v1, v2}, Lh0/v0;->e(La2/e;J)Lg2/a0;

    move-result-object v3

    iget-object v4, v0, Lh0/v0;->c:Lc9/c;

    invoke-interface {v4, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, v3, Lg2/a0;->b:J

    invoke-static {v3, v4}, La2/b0;->b(J)Z

    move-result v3

    if-eqz v3, :cond_e

    sget-object v3, Lf0/o0;->c:Lf0/o0;

    goto :goto_9

    :cond_e
    sget-object v3, Lf0/o0;->b:Lf0/o0;

    :goto_9
    invoke-virtual {v0, v3}, Lh0/v0;->n(Lf0/o0;)V

    iget-object v3, v0, Lh0/v0;->d:Lf0/c2;

    if-nez v3, :cond_f

    goto :goto_a

    :cond_f
    iget-object v3, v3, Lf0/c2;->q:Lm0/n1;

    invoke-static/range {p7 .. p7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_a
    iget-object v3, v0, Lh0/v0;->d:Lf0/c2;

    if-nez v3, :cond_10

    goto :goto_b

    :cond_10
    invoke-static {v0, v7}, Ld7/t;->c0(Lh0/v0;Z)Z

    move-result v4

    iget-object v3, v3, Lf0/c2;->m:Lm0/n1;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_b
    iget-object v3, v0, Lh0/v0;->d:Lf0/c2;

    if-nez v3, :cond_11

    goto :goto_c

    :cond_11
    const/4 v4, 0x0

    invoke-static {v0, v4}, Ld7/t;->c0(Lh0/v0;Z)Z

    move-result v0

    iget-object v3, v3, Lf0/c2;->n:Lm0/n1;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_c
    move-wide v8, v1

    goto :goto_e

    :cond_12
    :goto_d
    sget-wide v8, La2/b0;->b:J

    :goto_e
    return-wide v8
.end method

.method public static e(La2/e;J)Lg2/a0;
    .locals 2

    new-instance v0, Lg2/a0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lg2/a0;-><init>(La2/e;JLa2/b0;)V

    return-object v0
.end method


# virtual methods
.method public final d(Z)V
    .locals 3

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-wide v0, v0, Lg2/a0;->b:J

    invoke-static {v0, v1}, La2/b0;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh0/v0;->g:Lu1/p1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    invoke-static {v1}, Lo1/s;->L(Lg2/a0;)La2/e;

    move-result-object v1

    check-cast v0, Lu1/l;

    invoke-virtual {v0, v1}, Lu1/l;->a(La2/e;)V

    :cond_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object p1

    iget-wide v0, p1, Lg2/a0;->b:J

    invoke-static {v0, v1}, La2/b0;->d(J)I

    move-result p1

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-object v0, v0, Lg2/a0;->a:La2/e;

    invoke-static {p1, p1}, Lo1/s;->g(II)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lh0/v0;->e(La2/e;J)Lg2/a0;

    move-result-object p1

    iget-object v0, p0, Lh0/v0;->c:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lf0/o0;->a:Lf0/o0;

    invoke-virtual {p0, p1}, Lh0/v0;->n(Lf0/o0;)V

    return-void
.end method

.method public final f()V
    .locals 3

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-wide v0, v0, Lg2/a0;->b:J

    invoke-static {v0, v1}, La2/b0;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh0/v0;->g:Lu1/p1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    invoke-static {v1}, Lo1/s;->L(Lg2/a0;)La2/e;

    move-result-object v1

    check-cast v0, Lu1/l;

    invoke-virtual {v0, v1}, Lu1/l;->a(La2/e;)V

    :cond_1
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Lo1/s;->Q(Lg2/a0;I)La2/e;

    move-result-object v0

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v2

    iget-object v2, v2, Lg2/a0;->a:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v2}, Lo1/s;->P(Lg2/a0;I)La2/e;

    move-result-object v1

    new-instance v2, La2/c;

    invoke-direct {v2, v0}, La2/c;-><init>(La2/e;)V

    invoke-virtual {v2, v1}, La2/c;->b(La2/e;)V

    invoke-virtual {v2}, La2/c;->c()La2/e;

    move-result-object v0

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-wide v1, v1, Lg2/a0;->b:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result v1

    invoke-static {v1, v1}, Lo1/s;->g(II)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lh0/v0;->e(La2/e;J)Lg2/a0;

    move-result-object v0

    iget-object v1, p0, Lh0/v0;->c:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lf0/o0;->a:Lf0/o0;

    invoke-virtual {p0, v0}, Lh0/v0;->n(Lf0/o0;)V

    iget-object v0, p0, Lh0/v0;->a:Lf0/e2;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v0, Lf0/e2;->f:Z

    :cond_2
    return-void
.end method

.method public final g(Ld1/c;)V
    .locals 6

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-wide v0, v0, Lg2/a0;->b:J

    invoke-static {v0, v1}, La2/b0;->b(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lh0/v0;->b:Lg2/s;

    const/4 v3, 0x1

    iget-wide v4, p1, Ld1/c;->a:J

    invoke-virtual {v0, v4, v5, v3}, Lf0/d2;->b(JZ)I

    move-result v0

    invoke-interface {v2, v0}, Lg2/s;->a(I)I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-wide v2, v0, Lg2/a0;->b:J

    invoke-static {v2, v3}, La2/b0;->d(J)I

    move-result v0

    :goto_1
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v2

    invoke-static {v0, v0}, Lo1/s;->g(II)J

    move-result-wide v3

    const/4 v0, 0x5

    invoke-static {v2, v1, v3, v4, v0}, Lg2/a0;->a(Lg2/a0;La2/e;JI)Lg2/a0;

    move-result-object v0

    iget-object v1, p0, Lh0/v0;->c:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object p1

    iget-object p1, p1, Lg2/a0;->a:La2/e;

    iget-object p1, p1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    sget-object p1, Lf0/o0;->c:Lf0/o0;

    goto :goto_2

    :cond_3
    sget-object p1, Lf0/o0;->a:Lf0/o0;

    :goto_2
    invoke-virtual {p0, p1}, Lh0/v0;->n(Lf0/o0;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lh0/v0;->p(Z)V

    return-void
.end method

.method public final h(Z)V
    .locals 1

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf0/c2;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh0/v0;->j:Lc1/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc1/k;->a()Z

    :cond_0
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iput-object v0, p0, Lh0/v0;->r:Lg2/a0;

    invoke-virtual {p0, p1}, Lh0/v0;->p(Z)V

    sget-object p1, Lf0/o0;->b:Lf0/o0;

    invoke-virtual {p0, p1}, Lh0/v0;->n(Lf0/o0;)V

    return-void
.end method

.method public final i()Ld1/c;
    .locals 1

    iget-object v0, p0, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/c;

    return-object v0
.end method

.method public final j(Z)J
    .locals 6

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v0, v0, Lf0/d2;->a:La2/a0;

    if-nez v0, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v1, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lf0/c2;->a:Lf0/j1;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lf0/j1;->a:La2/e;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    sget-wide v0, Ld1/c;->d:J

    return-wide v0

    :cond_2
    iget-object v2, v0, La2/a0;->a:La2/z;

    iget-object v2, v2, La2/z;->a:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-wide v0, Ld1/c;->d:J

    return-wide v0

    :cond_3
    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    if-eqz p1, :cond_4

    iget-wide v1, v1, Lg2/a0;->b:J

    sget v3, La2/b0;->c:I

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    :goto_1
    long-to-int v1, v1

    goto :goto_2

    :cond_4
    iget-wide v1, v1, Lg2/a0;->b:J

    sget v3, La2/b0;->c:I

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    goto :goto_1

    :goto_2
    iget-object v2, p0, Lh0/v0;->b:Lg2/s;

    invoke-interface {v2, v1}, Lg2/s;->b(I)I

    move-result v1

    invoke-virtual {p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v2

    iget-wide v2, v2, Lg2/a0;->b:J

    invoke-static {v2, v3}, La2/b0;->f(J)Z

    move-result v2

    invoke-virtual {v0, v1}, La2/a0;->f(I)I

    move-result v3

    iget-object v4, v0, La2/a0;->b:La2/i;

    iget v5, v4, La2/i;->f:I

    if-lt v3, v5, :cond_5

    sget-wide v0, Ld1/c;->d:J

    goto :goto_7

    :cond_5
    const/4 v5, 0x0

    if-eqz p1, :cond_6

    if-eqz v2, :cond_7

    :cond_6
    if-nez p1, :cond_8

    if-eqz v2, :cond_8

    :cond_7
    move p1, v1

    goto :goto_3

    :cond_8
    add-int/lit8 p1, v1, -0x1

    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_3
    invoke-virtual {v0, p1}, La2/a0;->a(I)Ll2/h;

    move-result-object p1

    invoke-virtual {v0, v1}, La2/a0;->m(I)Ll2/h;

    move-result-object v2

    if-ne p1, v2, :cond_9

    const/4 p1, 0x1

    goto :goto_4

    :cond_9
    move p1, v5

    :goto_4
    invoke-virtual {v4, v1}, La2/i;->d(I)V

    iget-object v2, v4, La2/i;->a:La2/k;

    iget-object v2, v2, La2/k;->a:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v4, v4, La2/i;->h:Ljava/util/ArrayList;

    if-ne v1, v2, :cond_a

    invoke-static {v4}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v2

    goto :goto_5

    :cond_a
    invoke-static {v1, v4}, Lo1/s;->w(ILjava/util/ArrayList;)I

    move-result v2

    :goto_5
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La2/m;

    iget-object v4, v2, La2/m;->a:La2/l;

    invoke-virtual {v2, v1}, La2/m;->a(I)I

    move-result v1

    check-cast v4, La2/a;

    iget-object v2, v4, La2/a;->d:Lb2/v;

    if-eqz p1, :cond_b

    invoke-virtual {v2, v1, v5}, Lb2/v;->g(IZ)F

    move-result p1

    goto :goto_6

    :cond_b
    invoke-virtual {v2, v1, v5}, Lb2/v;->h(IZ)F

    move-result p1

    :goto_6
    invoke-virtual {v0, v3}, La2/a0;->d(I)F

    move-result v0

    invoke-static {p1, v0}, Ld9/i;->f(FF)J

    move-result-wide v0

    :goto_7
    return-wide v0

    :cond_c
    :goto_8
    sget-wide v0, Ld1/c;->d:J

    return-wide v0
.end method

.method public final k()Lg2/a0;
    .locals 1

    iget-object v0, p0, Lh0/v0;->e:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/a0;

    return-object v0
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Lh0/v0;->h:Lu1/u2;

    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lu1/a1;

    iget v1, v1, Lu1/a1;->d:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    if-eqz v0, :cond_1

    check-cast v0, Lu1/a1;

    const/4 v1, 0x2

    iput v1, v0, Lu1/a1;->d:I

    iget-object v1, v0, Lu1/a1;->b:Landroid/view/ActionMode;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/ActionMode;->finish()V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Lu1/a1;->b:Landroid/view/ActionMode;

    :cond_1
    return-void
.end method

.method public final m()V
    .locals 46

    move-object/from16 v0, p0

    iget-object v1, v0, Lh0/v0;->g:Lu1/p1;

    if-eqz v1, :cond_22

    check-cast v1, Lu1/l;

    iget-object v1, v1, Lu1/l;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    move-result v4

    if-lez v4, :cond_20

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_1

    goto/16 :goto_e

    :cond_1
    instance-of v5, v1, Landroid/text/Spanned;

    const/4 v6, 0x6

    if-nez v5, :cond_2

    new-instance v4, La2/e;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1, v2, v6}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    move-object v2, v4

    goto/16 :goto_e

    :cond_2
    move-object v5, v1

    check-cast v5, Landroid/text/Spanned;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const-class v8, Landroid/text/Annotation;

    invoke-interface {v5, v4, v7, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Landroid/text/Annotation;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const-string v9, "<this>"

    invoke-static {v7, v9}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v7

    sub-int/2addr v9, v3

    const/4 v10, 0x4

    if-ltz v9, :cond_1f

    move v11, v4

    :goto_1
    aget-object v12, v7, v11

    invoke-virtual {v12}, Landroid/text/Annotation;->getKey()Ljava/lang/String;

    move-result-object v13

    const-string v14, "androidx.compose.text.SpanStyle"

    invoke-static {v13, v14}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    move/from16 v17, v4

    goto/16 :goto_d

    :cond_3
    invoke-interface {v5, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v13

    invoke-interface {v5, v12}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v14

    new-instance v15, Lu1/t1;

    invoke-virtual {v12}, Landroid/text/Annotation;->getValue()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v15, v12}, Lu1/t1;-><init>(Ljava/lang/String;)V

    sget-wide v16, Le1/r;->g:J

    sget-wide v18, Lm2/n;->c:J

    const/16 v28, 0x0

    const/16 v34, 0x0

    move-object/from16 v25, v2

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v29, v27

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v37, v33

    move-object/from16 v38, v37

    move-wide/from16 v21, v16

    move-wide/from16 v35, v21

    move-wide/from16 v23, v18

    move-wide/from16 v30, v23

    :goto_2
    iget-object v12, v15, Lu1/t1;->a:Landroid/os/Parcel;

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-le v2, v3, :cond_1d

    invoke-virtual {v12}, Landroid/os/Parcel;->readByte()B

    move-result v2

    const/16 v4, 0x8

    if-ne v2, v3, :cond_5

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v4, :cond_4

    invoke-virtual {v12}, Landroid/os/Parcel;->readLong()J

    move-result-wide v21

    sget v2, Le1/r;->h:I

    :goto_3
    const/4 v2, 0x0

    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    const/16 v17, 0x0

    goto/16 :goto_c

    :cond_5
    const/4 v4, 0x2

    const/4 v6, 0x5

    if-ne v2, v4, :cond_6

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v6, :cond_4

    invoke-virtual {v15}, Lu1/t1;->a()J

    move-result-wide v23

    :goto_4
    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_5
    const/4 v6, 0x6

    goto :goto_2

    :cond_6
    const/4 v4, 0x3

    if-ne v2, v4, :cond_7

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v10, :cond_4

    new-instance v2, Lf2/l;

    invoke-virtual {v12}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-direct {v2, v4}, Lf2/l;-><init>(I)V

    move-object/from16 v25, v2

    goto :goto_4

    :cond_7
    if-ne v2, v10, :cond_a

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v3, :cond_4

    invoke-virtual {v12}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    const/4 v2, 0x0

    goto :goto_6

    :cond_9
    if-ne v2, v3, :cond_8

    move v2, v3

    :goto_6
    new-instance v4, Lf2/j;

    invoke-direct {v4, v2}, Lf2/j;-><init>(I)V

    move-object/from16 v26, v4

    goto :goto_4

    :cond_a
    if-ne v2, v6, :cond_f

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v3, :cond_4

    invoke-virtual {v12}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    const/4 v4, 0x0

    goto :goto_7

    :cond_c
    if-ne v2, v3, :cond_d

    move v4, v3

    goto :goto_7

    :cond_d
    if-ne v2, v4, :cond_e

    goto :goto_7

    :cond_e
    const/4 v4, 0x2

    if-ne v2, v4, :cond_b

    :goto_7
    new-instance v2, Lf2/k;

    invoke-direct {v2, v4}, Lf2/k;-><init>(I)V

    move-object/from16 v27, v2

    goto :goto_4

    :cond_f
    const/4 v4, 0x6

    if-ne v2, v4, :cond_10

    invoke-virtual {v12}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v29

    move v6, v4

    goto :goto_3

    :cond_10
    const/4 v4, 0x7

    if-ne v2, v4, :cond_11

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v6, :cond_4

    invoke-virtual {v15}, Lu1/t1;->a()J

    move-result-wide v30

    goto :goto_4

    :cond_11
    const/16 v4, 0x8

    if-ne v2, v4, :cond_12

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v10, :cond_4

    invoke-virtual {v12}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    new-instance v4, Ll2/a;

    invoke-direct {v4, v2}, Ll2/a;-><init>(F)V

    move-object/from16 v32, v4

    goto/16 :goto_4

    :cond_12
    const/16 v4, 0x9

    if-ne v2, v4, :cond_13

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/16 v4, 0x8

    if-lt v2, v4, :cond_4

    new-instance v2, Ll2/p;

    invoke-virtual {v12}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    invoke-virtual {v12}, Landroid/os/Parcel;->readFloat()F

    move-result v6

    invoke-direct {v2, v4, v6}, Ll2/p;-><init>(FF)V

    move-object/from16 v33, v2

    goto/16 :goto_4

    :cond_13
    const/16 v4, 0xa

    if-ne v2, v4, :cond_14

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/16 v4, 0x8

    if-lt v2, v4, :cond_4

    invoke-virtual {v12}, Landroid/os/Parcel;->readLong()J

    move-result-wide v35

    sget v2, Le1/r;->h:I

    goto/16 :goto_4

    :cond_14
    const/16 v4, 0xb

    if-ne v2, v4, :cond_1c

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    if-lt v2, v10, :cond_4

    invoke-virtual {v12}, Landroid/os/Parcel;->readInt()I

    move-result v2

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_15

    move v4, v3

    goto :goto_8

    :cond_15
    const/4 v4, 0x0

    :goto_8
    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_16

    move v2, v3

    goto :goto_9

    :cond_16
    const/4 v2, 0x0

    :goto_9
    sget-object v6, Ll2/j;->d:Ll2/j;

    sget-object v12, Ll2/j;->c:Ll2/j;

    if-eqz v4, :cond_18

    if-eqz v2, :cond_18

    filled-new-array {v6, v12}, [Ll2/j;

    move-result-object v2

    invoke-static {v2}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    move/from16 v12, v17

    :goto_a
    if-ge v12, v6, :cond_17

    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v3, v18

    check-cast v3, Ll2/j;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget v3, v3, Ll2/j;->a:I

    or-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    add-int/lit8 v12, v12, 0x1

    const/4 v3, 0x1

    goto :goto_a

    :cond_17
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v3, Ll2/j;

    invoke-direct {v3, v2}, Ll2/j;-><init>(I)V

    move-object/from16 v37, v3

    goto :goto_b

    :cond_18
    const/16 v17, 0x0

    if-eqz v4, :cond_19

    move-object/from16 v37, v6

    goto :goto_b

    :cond_19
    if-eqz v2, :cond_1a

    move-object/from16 v37, v12

    goto :goto_b

    :cond_1a
    sget-object v2, Ll2/j;->b:Ll2/j;

    move-object/from16 v37, v2

    :cond_1b
    :goto_b
    move/from16 v4, v17

    const/4 v2, 0x0

    const/4 v3, 0x1

    goto/16 :goto_5

    :cond_1c
    const/16 v17, 0x0

    const/16 v3, 0xc

    if-ne v2, v3, :cond_1b

    invoke-virtual {v12}, Landroid/os/Parcel;->dataAvail()I

    move-result v2

    const/16 v3, 0x14

    if-lt v2, v3, :cond_1e

    new-instance v38, Le1/k0;

    invoke-virtual {v12}, Landroid/os/Parcel;->readLong()J

    move-result-wide v41

    sget v2, Le1/r;->h:I

    invoke-virtual {v12}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    invoke-virtual {v12}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-static {v2, v3}, Ld9/i;->f(FF)J

    move-result-wide v43

    invoke-virtual {v12}, Landroid/os/Parcel;->readFloat()F

    move-result v45

    move-object/from16 v40, v38

    invoke-direct/range {v40 .. v45}, Le1/k0;-><init>(JJF)V

    goto :goto_b

    :cond_1d
    move/from16 v17, v4

    :cond_1e
    :goto_c
    new-instance v2, La2/x;

    move-object/from16 v20, v2

    const v39, 0xc000

    invoke-direct/range {v20 .. v39}, La2/x;-><init>(JJLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;I)V

    new-instance v3, La2/d;

    invoke-direct {v3, v2, v13, v14}, La2/d;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_d
    if-eq v11, v9, :cond_1f

    add-int/lit8 v11, v11, 0x1

    move/from16 v4, v17

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v6, 0x6

    goto/16 :goto_1

    :cond_1f
    new-instance v2, La2/e;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v8, v10}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    goto :goto_e

    :cond_20
    const/4 v2, 0x0

    :goto_e
    if-nez v2, :cond_21

    goto :goto_f

    :cond_21
    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v3

    iget-object v3, v3, Lg2/a0;->a:La2/e;

    iget-object v3, v3, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v3}, Lo1/s;->Q(Lg2/a0;I)La2/e;

    move-result-object v1

    new-instance v3, La2/c;

    invoke-direct {v3, v1}, La2/c;-><init>(La2/e;)V

    invoke-virtual {v3, v2}, La2/c;->b(La2/e;)V

    invoke-virtual {v3}, La2/c;->c()La2/e;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v4

    iget-object v4, v4, Lg2/a0;->a:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v3, v4}, Lo1/s;->P(Lg2/a0;I)La2/e;

    move-result-object v3

    new-instance v4, La2/c;

    invoke-direct {v4, v1}, La2/c;-><init>(La2/e;)V

    invoke-virtual {v4, v3}, La2/c;->b(La2/e;)V

    invoke-virtual {v4}, La2/c;->c()La2/e;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v3

    iget-wide v3, v3, Lg2/a0;->b:J

    invoke-static {v3, v4}, La2/b0;->e(J)I

    move-result v3

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v3

    invoke-static {v2, v2}, Lo1/s;->g(II)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lh0/v0;->e(La2/e;J)Lg2/a0;

    move-result-object v1

    iget-object v2, v0, Lh0/v0;->c:Lc9/c;

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf0/o0;->a:Lf0/o0;

    invoke-virtual {v0, v1}, Lh0/v0;->n(Lf0/o0;)V

    iget-object v1, v0, Lh0/v0;->a:Lf0/e2;

    if-eqz v1, :cond_22

    const/4 v2, 0x1

    iput-boolean v2, v1, Lf0/e2;->f:Z

    :cond_22
    :goto_f
    return-void
.end method

.method public final n(Lf0/o0;)V
    .locals 2

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lf0/c2;->a()Lf0/o0;

    move-result-object v1

    if-ne v1, p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lf0/c2;->k:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final o()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lf0/c2;->q:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lh0/v0;->f:Lg2/l0;

    instance-of v1, v1, Lg2/u;

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v2

    iget-wide v2, v2, Lg2/a0;->b:J

    invoke-static {v2, v3}, La2/b0;->b(J)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    if-nez v1, :cond_1

    new-instance v2, Lf0/z;

    const/4 v4, 0x4

    invoke-direct {v2, v0, v4}, Lf0/z;-><init>(Lh0/v0;I)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v4

    iget-wide v4, v4, Lg2/a0;->b:J

    invoke-static {v4, v5}, La2/b0;->b(J)Z

    move-result v4

    iget-object v5, v0, Lh0/v0;->k:Lm0/n1;

    if-nez v4, :cond_2

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v1, :cond_2

    new-instance v1, Lf0/z;

    const/4 v4, 0x5

    invoke-direct {v1, v0, v4}, Lf0/z;-><init>(Lh0/v0;I)V

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    iget-object v4, v0, Lh0/v0;->g:Lu1/p1;

    if-eqz v4, :cond_3

    check-cast v4, Lu1/l;

    iget-object v4, v4, Lu1/l;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v4}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v4

    if-eqz v4, :cond_3

    const-string v6, "text/*"

    invoke-virtual {v4, v6}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v4

    if-ne v4, v5, :cond_3

    new-instance v4, Lf0/z;

    const/4 v6, 0x6

    invoke-direct {v4, v0, v6}, Lf0/z;-><init>(Lh0/v0;I)V

    goto :goto_2

    :cond_3
    move-object v4, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v6

    iget-wide v6, v6, Lg2/a0;->b:J

    invoke-static {v6, v7}, La2/b0;->c(J)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v7

    iget-object v7, v7, Lg2/a0;->a:La2/e;

    iget-object v7, v7, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-eq v6, v7, :cond_4

    new-instance v6, Lf0/z;

    const/4 v7, 0x7

    invoke-direct {v6, v0, v7}, Lf0/z;-><init>(Lh0/v0;I)V

    goto :goto_3

    :cond_4
    move-object v6, v3

    :goto_3
    iget-object v7, v0, Lh0/v0;->h:Lu1/u2;

    if-eqz v7, :cond_e

    iget-object v8, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v8, :cond_c

    iget-boolean v9, v8, Lf0/c2;->p:Z

    xor-int/2addr v9, v5

    if-eqz v9, :cond_5

    move-object v3, v8

    :cond_5
    if-eqz v3, :cond_c

    iget-object v8, v0, Lh0/v0;->b:Lg2/s;

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v9

    iget-wide v9, v9, Lg2/a0;->b:J

    const/16 v11, 0x20

    shr-long/2addr v9, v11

    long-to-int v9, v9

    invoke-interface {v8, v9}, Lg2/s;->b(I)I

    move-result v8

    iget-object v9, v0, Lh0/v0;->b:Lg2/s;

    invoke-virtual/range {p0 .. p0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v10

    iget-wide v10, v10, Lg2/a0;->b:J

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    long-to-int v10, v10

    invoke-interface {v9, v10}, Lg2/s;->b(I)I

    move-result v9

    iget-object v10, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Lf0/c2;->c()Lr1/s;

    move-result-object v10

    if-eqz v10, :cond_6

    invoke-virtual {v0, v5}, Lh0/v0;->j(Z)J

    move-result-wide v11

    invoke-interface {v10, v11, v12}, Lr1/s;->P(J)J

    move-result-wide v10

    goto :goto_4

    :cond_6
    sget-wide v10, Ld1/c;->b:J

    :goto_4
    iget-object v12, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Lf0/c2;->c()Lr1/s;

    move-result-object v12

    if-eqz v12, :cond_7

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Lh0/v0;->j(Z)J

    move-result-wide v13

    invoke-interface {v12, v13, v14}, Lr1/s;->P(J)J

    move-result-wide v12

    goto :goto_5

    :cond_7
    sget-wide v12, Ld1/c;->b:J

    :goto_5
    iget-object v14, v0, Lh0/v0;->d:Lf0/c2;

    const/4 v15, 0x0

    if-eqz v14, :cond_9

    invoke-virtual {v14}, Lf0/c2;->c()Lr1/s;

    move-result-object v14

    if-eqz v14, :cond_9

    invoke-virtual {v3}, Lf0/c2;->d()Lf0/d2;

    move-result-object v5

    if-eqz v5, :cond_8

    iget-object v5, v5, Lf0/d2;->a:La2/a0;

    if-eqz v5, :cond_8

    invoke-virtual {v5, v8}, La2/a0;->c(I)Ld1/d;

    move-result-object v5

    iget v5, v5, Ld1/d;->b:F

    move-object v8, v6

    goto :goto_6

    :cond_8
    move-object v8, v6

    move v5, v15

    :goto_6
    invoke-static {v15, v5}, Ld9/i;->f(FF)J

    move-result-wide v5

    invoke-interface {v14, v5, v6}, Lr1/s;->P(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ld1/c;->e(J)F

    move-result v5

    goto :goto_7

    :cond_9
    move-object v8, v6

    move v5, v15

    :goto_7
    iget-object v6, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lf0/c2;->c()Lr1/s;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v3}, Lf0/c2;->d()Lf0/d2;

    move-result-object v14

    if-eqz v14, :cond_a

    iget-object v14, v14, Lf0/d2;->a:La2/a0;

    if-eqz v14, :cond_a

    invoke-virtual {v14, v9}, La2/a0;->c(I)Ld1/d;

    move-result-object v9

    iget v9, v9, Ld1/d;->b:F

    goto :goto_8

    :cond_a
    move v9, v15

    :goto_8
    invoke-static {v15, v9}, Ld9/i;->f(FF)J

    move-result-wide v14

    invoke-interface {v6, v14, v15}, Lr1/s;->P(J)J

    move-result-wide v14

    invoke-static {v14, v15}, Ld1/c;->e(J)F

    move-result v15

    :cond_b
    invoke-static {v10, v11}, Ld1/c;->d(J)F

    move-result v6

    invoke-static {v12, v13}, Ld1/c;->d(J)F

    move-result v9

    invoke-static {v6, v9}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-static {v10, v11}, Ld1/c;->d(J)F

    move-result v9

    invoke-static {v12, v13}, Ld1/c;->d(J)F

    move-result v14

    invoke-static {v9, v14}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-static {v5, v15}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v10, v11}, Ld1/c;->e(J)F

    move-result v10

    invoke-static {v12, v13}, Ld1/c;->e(J)F

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v10

    const/16 v11, 0x19

    int-to-float v11, v11

    iget-object v3, v3, Lf0/c2;->a:Lf0/j1;

    iget-object v3, v3, Lf0/j1;->g:Lm2/b;

    invoke-interface {v3}, Lm2/b;->c()F

    move-result v3

    mul-float/2addr v3, v11

    add-float/2addr v3, v10

    new-instance v10, Ld1/d;

    invoke-direct {v10, v6, v5, v9, v3}, Ld1/d;-><init>(FFFF)V

    goto :goto_9

    :cond_c
    move-object v8, v6

    sget-object v10, Ld1/d;->e:Ld1/d;

    :goto_9
    check-cast v7, Lu1/a1;

    iget-object v3, v7, Lu1/a1;->c:Lv1/b;

    iput-object v10, v3, Lv1/b;->b:Ld1/d;

    iput-object v2, v3, Lv1/b;->c:Lc9/a;

    iput-object v1, v3, Lv1/b;->e:Lc9/a;

    iput-object v4, v3, Lv1/b;->d:Lc9/a;

    iput-object v8, v3, Lv1/b;->f:Lc9/a;

    iget-object v1, v7, Lu1/a1;->b:Landroid/view/ActionMode;

    if-nez v1, :cond_d

    const/4 v2, 0x1

    iput v2, v7, Lu1/a1;->d:I

    sget-object v1, Lu1/v2;->a:Lu1/v2;

    new-instance v4, Lv1/a;

    invoke-direct {v4, v3}, Lv1/a;-><init>(Lv1/b;)V

    iget-object v3, v7, Lu1/a1;->a:Landroid/view/View;

    invoke-virtual {v1, v3, v4, v2}, Lu1/v2;->b(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object v1

    iput-object v1, v7, Lu1/a1;->b:Landroid/view/ActionMode;

    goto :goto_a

    :cond_d
    invoke-virtual {v1}, Landroid/view/ActionMode;->invalidate()V

    :cond_e
    :goto_a
    return-void
.end method

.method public final p(Z)V
    .locals 2

    iget-object v0, p0, Lh0/v0;->d:Lf0/c2;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lf0/c2;->l:Lm0/n1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lh0/v0;->o()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lh0/v0;->l()V

    :goto_1
    return-void
.end method
