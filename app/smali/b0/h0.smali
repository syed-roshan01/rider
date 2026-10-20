.class public abstract Lb0/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lv/f2;


# instance fields
.field public final A:La0/a0;

.field public final B:Lm0/g1;

.field public final C:Lm0/n1;

.field public final D:Lm0/n1;

.field public final a:Lm0/n1;

.field public final b:Lm0/k1;

.field public final c:Lb0/s;

.field public final d:Lm0/n1;

.field public final e:Lb0/a0;

.field public f:I

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public final k:Lv/y;

.field public final l:Z

.field public m:I

.field public n:La0/b0;

.field public o:Z

.field public final p:Lm0/n1;

.field public q:Lm2/b;

.field public final r:Lx/m;

.field public final s:Lm0/l1;

.field public final t:Lm0/l1;

.field public final u:La0/d0;

.field public final v:La0/j;

.field public final w:La0/b;

.field public final x:Lm0/n1;

.field public final y:Lz/b0;

.field public z:J


# direct methods
.method public constructor <init>(IF)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    float-to-double v0, p2

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    cmpg-double v2, v2, v0

    if-gtz v2, :cond_0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    sget-wide v0, Ld1/c;->b:J

    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {v2, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Lb0/h0;->a:Lm0/n1;

    const/4 v1, 0x0

    invoke-static {v1}, Lm9/e0;->H(F)Lm0/k1;

    move-result-object v1

    iput-object v1, p0, Lb0/h0;->b:Lm0/k1;

    new-instance v1, Lb0/s;

    invoke-direct {v1, p0}, Lb0/s;-><init>(Lb0/h0;)V

    iput-object v1, p0, Lb0/h0;->c:Lb0/s;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v2

    iput-object v2, p0, Lb0/h0;->d:Lm0/n1;

    new-instance v2, Lb0/a0;

    invoke-direct {v2, p1, p2, p0}, Lb0/a0;-><init>(IFLb0/h0;)V

    iput-object v2, p0, Lb0/h0;->e:Lb0/a0;

    iput p1, p0, Lb0/h0;->f:I

    const p2, 0x7fffffff

    iput p2, p0, Lb0/h0;->h:I

    new-instance p2, Lq/w;

    const/16 v2, 0x11

    invoke-direct {p2, p0, v2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lv/y;

    invoke-direct {v2, p2}, Lv/y;-><init>(Lc9/c;)V

    iput-object v2, p0, Lb0/h0;->k:Lv/y;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lb0/h0;->l:Z

    const/4 v2, -0x1

    iput v2, p0, Lb0/h0;->m:I

    sget-object v3, Lb0/o0;->b:Lb0/x;

    sget-object v4, Lm0/h1;->a:Lm0/h1;

    invoke-static {v3, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v3

    iput-object v3, p0, Lb0/h0;->p:Lm0/n1;

    sget-object v3, Lb0/o0;->c:Lb0/m0;

    iput-object v3, p0, Lb0/h0;->q:Lm2/b;

    new-instance v3, Lx/m;

    invoke-direct {v3}, Lx/m;-><init>()V

    iput-object v3, p0, Lb0/h0;->r:Lx/m;

    invoke-static {v2}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object v2

    iput-object v2, p0, Lb0/h0;->s:Lm0/l1;

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p1

    iput-object p1, p0, Lb0/h0;->t:Lm0/l1;

    new-instance p1, Lb0/c;

    const/4 v2, 0x2

    invoke-direct {p1, v2, p0}, Lb0/c;-><init>(ILb0/h0;)V

    invoke-static {v0, p1}, Ld7/t;->S(Lm0/z2;Lc9/a;)Lm0/j0;

    new-instance p1, Lb0/c;

    const/4 v2, 0x3

    invoke-direct {p1, v2, p0}, Lb0/c;-><init>(ILb0/h0;)V

    invoke-static {v0, p1}, Ld7/t;->S(Lm0/z2;Lc9/a;)Lm0/j0;

    new-instance p1, La0/d0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/h0;->u:La0/d0;

    new-instance p1, La0/j;

    invoke-direct {p1}, La0/j;-><init>()V

    iput-object p1, p0, Lb0/h0;->v:La0/j;

    new-instance p1, La0/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/h0;->w:La0/b;

    const/4 p1, 0x0

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lb0/h0;->x:Lm0/n1;

    new-instance p1, Lz/b0;

    invoke-direct {p1, p0, p2}, Lz/b0;-><init>(Lv/f2;I)V

    iput-object p1, p0, Lb0/h0;->y:Lz/b0;

    const/16 p1, 0xf

    const/4 p2, 0x0

    invoke-static {p2, p2, p1}, Lo1/s;->b(III)J

    move-result-wide p1

    iput-wide p1, p0, Lb0/h0;->z:J

    new-instance p1, La0/a0;

    invoke-direct {p1}, La0/a0;-><init>()V

    iput-object p1, p0, Lb0/h0;->A:La0/a0;

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-static {p1, v4}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lb0/h0;->B:Lm0/g1;

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lb0/h0;->C:Lm0/n1;

    invoke-static {v1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lb0/h0;->D:Lm0/n1;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "initialPageOffsetFraction "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is not within the range -0.5 to 0.5"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static synthetic g(Lb0/h0;ILu8/e;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v1, v0}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v0

    invoke-virtual {p0, p1, v2, v0, p2}, Lb0/h0;->f(IFLt/n;Lu8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lb0/h0;Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lb0/f0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lb0/f0;

    iget v1, v0, Lb0/f0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb0/f0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb0/f0;

    invoke-direct {v0, p0, p3}, Lb0/f0;-><init>(Lb0/h0;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lb0/f0;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lb0/f0;->f:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lb0/f0;->a:Lb0/h0;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p2, v0, Lb0/f0;->c:Lc9/e;

    iget-object p1, v0, Lb0/f0;->b:Lu/s1;

    iget-object p0, v0, Lb0/f0;->a:Lb0/h0;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput-object p0, v0, Lb0/f0;->a:Lb0/h0;

    iput-object p1, v0, Lb0/f0;->b:Lu/s1;

    iput-object p2, v0, Lb0/f0;->c:Lc9/e;

    iput v5, v0, Lb0/f0;->f:I

    iget-object p3, p0, Lb0/h0;->w:La0/b;

    invoke-virtual {p3, v0}, La0/b;->l(Lu8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p3, v3

    :goto_1
    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    iget-object p3, p0, Lb0/h0;->k:Lv/y;

    invoke-virtual {p3}, Lv/y;->b()Z

    move-result p3

    if-nez p3, :cond_6

    iget-object p3, p0, Lb0/h0;->e:Lb0/a0;

    iget-object p3, p3, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {p3}, Lm0/u2;->d()I

    move-result p3

    iget-object v2, p0, Lb0/h0;->t:Lm0/l1;

    invoke-virtual {v2, p3}, Lm0/u2;->f(I)V

    :cond_6
    iput-object p0, v0, Lb0/f0;->a:Lb0/h0;

    const/4 p3, 0x0

    iput-object p3, v0, Lb0/f0;->b:Lu/s1;

    iput-object p3, v0, Lb0/f0;->c:Lc9/e;

    iput v4, v0, Lb0/f0;->f:I

    iget-object p3, p0, Lb0/h0;->k:Lv/y;

    invoke-virtual {p3, p1, p2, v0}, Lv/y;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    iget-object p0, p0, Lb0/h0;->s:Lm0/l1;

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lm0/u2;->f(I)V

    return-object v3
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lb0/h0;->D:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lb0/h0;->k:Lv/y;

    invoke-virtual {v0}, Lv/y;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lb0/h0;->r(Lb0/h0;Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lb0/h0;->C:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lb0/h0;->k:Lv/y;

    invoke-virtual {v0, p1}, Lv/y;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(IFLt/n;Lu8/e;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    instance-of v4, v3, Lb0/d0;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lb0/d0;

    iget v5, v4, Lb0/d0;->n:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lb0/d0;->n:I

    goto :goto_0

    :cond_0
    new-instance v4, Lb0/d0;

    invoke-direct {v4, v0, v3}, Lb0/d0;-><init>(Lb0/h0;Lu8/e;)V

    :goto_0
    iget-object v3, v4, Lb0/d0;->e:Ljava/lang/Object;

    sget-object v5, Lv8/a;->a:Lv8/a;

    iget v6, v4, Lb0/d0;->n:I

    sget-object v7, Lq8/l;->a:Lq8/l;

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v9, :cond_2

    if-ne v6, v8, :cond_1

    invoke-static {v3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v4, Lb0/d0;->d:F

    iget v2, v4, Lb0/d0;->c:I

    iget-object v6, v4, Lb0/d0;->b:Lt/n;

    iget-object v9, v4, Lb0/d0;->a:Lb0/h0;

    invoke-static {v3}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v14, v6

    move-object v10, v9

    move/from16 v17, v2

    move v2, v1

    move/from16 v1, v17

    goto :goto_3

    :cond_3
    invoke-static {v3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object v3, v0, Lb0/h0;->e:Lb0/a0;

    iget-object v6, v3, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v6}, Lm0/u2;->d()I

    move-result v6

    if-ne v1, v6, :cond_4

    iget-object v3, v3, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v3}, Lm0/s2;->d()F

    move-result v3

    cmpg-float v3, v3, v2

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lb0/h0;->k()I

    move-result v3

    if-nez v3, :cond_5

    :goto_1
    return-object v7

    :cond_5
    iput-object v0, v4, Lb0/d0;->a:Lb0/h0;

    move-object/from16 v3, p3

    iput-object v3, v4, Lb0/d0;->b:Lt/n;

    iput v1, v4, Lb0/d0;->c:I

    iput v2, v4, Lb0/d0;->d:F

    iput v9, v4, Lb0/d0;->n:I

    iget-object v6, v0, Lb0/h0;->w:La0/b;

    invoke-virtual {v6, v4}, La0/b;->l(Lu8/e;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_6

    goto :goto_2

    :cond_6
    move-object v6, v7

    :goto_2
    if-ne v6, v5, :cond_7

    return-object v5

    :cond_7
    move-object v10, v0

    move-object v14, v3

    :goto_3
    float-to-double v11, v2

    const-wide/high16 v15, -0x4020000000000000L    # -0.5

    cmpg-double v3, v15, v11

    if-gtz v3, :cond_a

    const-wide/high16 v15, 0x3fe0000000000000L    # 0.5

    cmpg-double v3, v11, v15

    if-gtz v3, :cond_a

    invoke-virtual {v10, v1}, Lb0/h0;->i(I)I

    move-result v11

    invoke-virtual {v10}, Lb0/h0;->m()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v2, v1

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v13

    iget-object v1, v10, Lb0/h0;->c:Lb0/s;

    new-instance v2, Lb0/e0;

    const/4 v15, 0x0

    move-object v9, v2

    move-object v12, v1

    invoke-direct/range {v9 .. v15}, Lb0/e0;-><init>(Lb0/h0;ILa0/f;ILt/n;Lu8/e;)V

    const/4 v3, 0x0

    iput-object v3, v4, Lb0/d0;->a:Lb0/h0;

    iput-object v3, v4, Lb0/d0;->b:Lt/n;

    iput v8, v4, Lb0/d0;->n:I

    iget-object v1, v1, Lb0/s;->a:Lb0/h0;

    sget-object v3, Lu/s1;->a:Lu/s1;

    invoke-virtual {v1, v3, v2, v4}, Lb0/h0;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_8

    goto :goto_4

    :cond_8
    move-object v1, v7

    :goto_4
    if-ne v1, v5, :cond_9

    return-object v5

    :cond_9
    :goto_5
    return-object v7

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "pageOffsetFraction "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " is not within the range -0.5 to 0.5"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final h(Lb0/x;Z)V
    .locals 7

    iget-object v0, p0, Lb0/h0;->e:Lb0/a0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_0

    iget p2, p1, Lb0/x;->k:F

    iget-object v0, v0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v0, p2}, Lm0/s2;->f(F)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, Lb0/x;->j:Lb0/g;

    const/4 v3, 0x0

    if-eqz p2, :cond_1

    iget-object v4, p2, Lb0/g;->e:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    iput-object v4, v0, Lb0/a0;->e:Ljava/lang/Object;

    iget-boolean v4, v0, Lb0/a0;->d:Z

    iget-object v5, p1, Lb0/x;->a:Ljava/util/List;

    if-nez v4, :cond_2

    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v2

    if-eqz v4, :cond_5

    :cond_2
    iput-boolean v2, v0, Lb0/a0;->d:Z

    if-eqz p2, :cond_3

    iget p2, p2, Lb0/g;->a:I

    goto :goto_1

    :cond_3
    move p2, v1

    :goto_1
    iget v4, p1, Lb0/x;->k:F

    iget-object v6, v0, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v6, p2}, Lm0/u2;->f(I)V

    iget-object v6, v0, Lb0/a0;->f:La0/y;

    invoke-virtual {v6, p2}, La0/y;->b(I)V

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result p2

    const/4 v6, 0x0

    cmpg-float p2, p2, v6

    if-nez p2, :cond_4

    move v4, v6

    :cond_4
    iget-object p2, v0, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {p2, v4}, Lm0/s2;->f(F)V

    :cond_5
    iget p2, p0, Lb0/h0;->m:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_8

    move-object p2, v5

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v2

    if-eqz p2, :cond_8

    iget-boolean p2, p0, Lb0/h0;->o:Z

    iget v4, p1, Lb0/x;->h:I

    if-eqz p2, :cond_6

    invoke-static {v5}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb0/h;

    check-cast p2, Lb0/g;

    iget p2, p2, Lb0/g;->a:I

    add-int/2addr p2, v4

    add-int/2addr p2, v2

    goto :goto_2

    :cond_6
    invoke-static {v5}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb0/h;

    check-cast p2, Lb0/g;

    iget p2, p2, Lb0/g;->a:I

    sub-int/2addr p2, v4

    sub-int/2addr p2, v2

    :goto_2
    iget v4, p0, Lb0/h0;->m:I

    if-eq v4, p2, :cond_8

    iput v0, p0, Lb0/h0;->m:I

    iget-object p2, p0, Lb0/h0;->n:La0/b0;

    if-eqz p2, :cond_7

    invoke-interface {p2}, La0/b0;->cancel()V

    :cond_7
    iput-object v3, p0, Lb0/h0;->n:La0/b0;

    :cond_8
    :goto_3
    iget-object p2, p0, Lb0/h0;->p:Lm0/n1;

    invoke-virtual {p2, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-boolean p2, p1, Lb0/x;->m:Z

    iget-object v0, p0, Lb0/h0;->C:Lm0/n1;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p2, p1, Lb0/x;->i:Lb0/g;

    if-eqz p2, :cond_9

    iget v0, p2, Lb0/g;->a:I

    if-nez v0, :cond_b

    :cond_9
    iget v0, p1, Lb0/x;->l:I

    if-eqz v0, :cond_a

    goto :goto_4

    :cond_a
    move v2, v1

    :cond_b
    :goto_4
    iget-object v0, p0, Lb0/h0;->D:Lm0/n1;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    if-eqz p2, :cond_c

    iget p2, p2, Lb0/g;->a:I

    iput p2, p0, Lb0/h0;->f:I

    :cond_c
    iget p2, p1, Lb0/x;->l:I

    iput p2, p0, Lb0/h0;->g:I

    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2}, Lw0/i;->j()Lw0/i;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v2, p0, Lb0/h0;->j:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_d

    iget-boolean v2, p0, Lb0/h0;->l:Z

    if-eqz v2, :cond_d

    iget v2, p0, Lb0/h0;->j:F

    invoke-virtual {p0, v2}, Lb0/h0;->p(F)Z

    move-result v2

    if-eqz v2, :cond_d

    iget v2, p0, Lb0/h0;->j:F

    invoke-virtual {p0, v2, p1}, Lb0/h0;->q(FLb0/q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_9

    :cond_d
    :goto_5
    :try_start_2
    invoke-static {v0}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p2}, Lw0/i;->c()V

    invoke-virtual {p0}, Lb0/h0;->k()I

    move-result p2

    sget v0, Lb0/o0;->a:F

    iget v0, p1, Lb0/x;->f:I

    neg-int v0, v0

    iget v2, p1, Lb0/x;->b:I

    iget v3, p1, Lb0/x;->c:I

    add-int/2addr v2, v3

    mul-int/2addr v2, p2

    add-int/2addr v2, v0

    iget p2, p1, Lb0/x;->d:I

    add-int/2addr v2, p2

    sub-int/2addr v2, v3

    sget-object p2, Lv/h1;->a:Lv/h1;

    iget-object v0, p1, Lb0/x;->e:Lv/h1;

    iget-object p1, p1, Lb0/x;->o:Lr1/k0;

    if-ne v0, p2, :cond_e

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p2

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    invoke-static {p2, p1}, Lo1/s;->e(II)J

    move-result-wide p1

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    :goto_6
    long-to-int p1, p1

    goto :goto_7

    :cond_e
    invoke-interface {p1}, Lr1/k0;->b()I

    move-result p2

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result p1

    invoke-static {p2, p1}, Lo1/s;->e(II)J

    move-result-wide p1

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    goto :goto_6

    :goto_7
    sub-int/2addr v2, p1

    if-gez v2, :cond_f

    goto :goto_8

    :cond_f
    move v1, v2

    :goto_8
    iput v1, p0, Lb0/h0;->h:I

    return-void

    :goto_9
    :try_start_3
    invoke-static {v0}, Lw0/i;->p(Lw0/i;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, Lw0/i;->c()V

    throw p1
.end method

.method public final i(I)I
    .locals 2

    invoke-virtual {p0}, Lb0/h0;->k()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lb0/h0;->k()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v1, v0}, Lz6/a;->r(III)I

    move-result v1

    :cond_0
    return v1
.end method

.method public final j()Lb0/q;
    .locals 1

    iget-object v0, p0, Lb0/h0;->p:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/q;

    return-object v0
.end method

.method public abstract k()I
.end method

.method public final l()I
    .locals 1

    iget-object v0, p0, Lb0/h0;->p:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/x;

    iget v0, v0, Lb0/x;->b:I

    return v0
.end method

.method public final m()I
    .locals 2

    invoke-virtual {p0}, Lb0/h0;->l()I

    move-result v0

    invoke-virtual {p0}, Lb0/h0;->n()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, Lb0/h0;->p:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/x;

    iget v0, v0, Lb0/x;->c:I

    return v0
.end method

.method public final o()J
    .locals 2

    iget-object v0, p0, Lb0/h0;->a:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/c;

    iget-wide v0, v0, Ld1/c;->a:J

    return-wide v0
.end method

.method public final p(F)Z
    .locals 2

    invoke-virtual {p0}, Lb0/h0;->j()Lb0/q;

    move-result-object v0

    check-cast v0, Lb0/x;

    iget-object v0, v0, Lb0/x;->e:Lv/h1;

    sget-object v1, Lv/h1;->a:Lv/h1;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    invoke-virtual {p0}, Lb0/h0;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    invoke-virtual {p0}, Lb0/h0;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v0

    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lb0/h0;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result p1

    float-to-int p1, p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lb0/h0;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result p1

    float-to-int p1, p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final q(FLb0/q;)V
    .locals 3

    iget-boolean v0, p0, Lb0/h0;->l:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p2, Lb0/x;

    iget-object v0, p2, Lb0/x;->a:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget p2, p2, Lb0/x;->h:I

    if-eqz p1, :cond_2

    invoke-static {v0}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/h;

    check-cast v0, Lb0/g;

    iget v0, v0, Lb0/g;->a:I

    add-int/2addr v0, p2

    add-int/2addr v0, v2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb0/h;

    check-cast v0, Lb0/g;

    iget v0, v0, Lb0/g;->a:I

    sub-int/2addr v0, p2

    sub-int/2addr v0, v2

    :goto_1
    iget p2, p0, Lb0/h0;->m:I

    if-eq v0, p2, :cond_4

    if-ltz v0, :cond_4

    invoke-virtual {p0}, Lb0/h0;->k()I

    move-result p2

    if-ge v0, p2, :cond_4

    iget-boolean p2, p0, Lb0/h0;->o:Z

    if-eq p2, p1, :cond_3

    iget-object p2, p0, Lb0/h0;->n:La0/b0;

    if-eqz p2, :cond_3

    invoke-interface {p2}, La0/b0;->cancel()V

    :cond_3
    iput-boolean p1, p0, Lb0/h0;->o:Z

    iput v0, p0, Lb0/h0;->m:I

    iget-object p1, p0, Lb0/h0;->u:La0/d0;

    iget-wide v1, p0, Lb0/h0;->z:J

    invoke-virtual {p1, v0, v1, v2}, La0/d0;->a(IJ)La0/b0;

    move-result-object p1

    iput-object p1, p0, Lb0/h0;->n:La0/b0;

    :cond_4
    return-void
.end method
