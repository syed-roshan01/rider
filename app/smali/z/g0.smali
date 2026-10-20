.class public final Lz/g0;
.super Ljava/lang/Object;

# interfaces
.implements Lv/f2;


# static fields
.field public static final A:Lv0/p;

.field public static final z:La/a;


# instance fields
.field public a:Z

.field public b:Lz/w;

.field public final c:Lz/z;

.field public final d:Lm0/n1;

.field public final e:Lx/m;

.field public f:F

.field public g:Lm2/b;

.field public final h:Lv/y;

.field public final i:Z

.field public j:I

.field public k:La0/b0;

.field public l:Z

.field public m:Lr1/a1;

.field public final n:Lz/b0;

.field public final o:La0/b;

.field public final p:Lz/j;

.field public final q:La0/j;

.field public r:J

.field public final s:La0/a0;

.field public final t:Lm0/n1;

.field public final u:Lm0/n1;

.field public final v:Lm0/g1;

.field public final w:La0/d0;

.field public x:Lm9/d0;

.field public y:Lt/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La/a;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La/a;-><init>(II)V

    sput-object v0, Lz/g0;->z:La/a;

    sget-object v0, Lz/a0;->a:Lz/a0;

    sget-object v1, Lz/v;->c:Lz/v;

    invoke-static {v0, v1}, Lm9/e0;->F(Lc9/e;Lc9/c;)Lv0/p;

    move-result-object v0

    sput-object v0, Lz/g0;->A:Lv0/p;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz/z;

    invoke-direct {v0, p1, p2}, Lz/z;-><init>(II)V

    iput-object v0, p0, Lz/g0;->c:Lz/z;

    sget-object p1, Lz/j0;->b:Lz/w;

    sget-object p2, Lm0/h1;->a:Lm0/h1;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lz/g0;->d:Lm0/n1;

    new-instance p1, Lx/m;

    invoke-direct {p1}, Lx/m;-><init>()V

    iput-object p1, p0, Lz/g0;->e:Lx/m;

    new-instance p1, Lm2/c;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p1, v0, v0}, Lm2/c;-><init>(FF)V

    iput-object p1, p0, Lz/g0;->g:Lm2/b;

    new-instance p1, Lq/w;

    const/16 v0, 0xe

    invoke-direct {p1, p0, v0}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lv/y;

    invoke-direct {v0, p1}, Lv/y;-><init>(Lc9/c;)V

    iput-object v0, p0, Lz/g0;->h:Lv/y;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz/g0;->i:Z

    const/4 p1, -0x1

    iput p1, p0, Lz/g0;->j:I

    new-instance p1, Lz/b0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lz/b0;-><init>(Lv/f2;I)V

    iput-object p1, p0, Lz/g0;->n:Lz/b0;

    new-instance p1, La0/b;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/g0;->o:La0/b;

    new-instance p1, Lz/j;

    invoke-direct {p1}, Lz/j;-><init>()V

    iput-object p1, p0, Lz/g0;->p:Lz/j;

    new-instance p1, La0/j;

    invoke-direct {p1}, La0/j;-><init>()V

    iput-object p1, p0, Lz/g0;->q:La0/j;

    const/16 p1, 0xf

    invoke-static {v0, v0, p1}, Lo1/s;->b(III)J

    move-result-wide v0

    iput-wide v0, p0, Lz/g0;->r:J

    new-instance p1, La0/a0;

    invoke-direct {p1}, La0/a0;-><init>()V

    iput-object p1, p0, Lz/g0;->s:La0/a0;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    iput-object v1, p0, Lz/g0;->t:Lm0/n1;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lz/g0;->u:Lm0/n1;

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lz/g0;->v:Lm0/g1;

    new-instance p1, La0/d0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/g0;->w:La0/d0;

    sget-object v1, Lt/y1;->a:Lt/x1;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-wide/high16 v4, -0x8000000000000000L

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    new-instance p2, Lt/o;

    sget-object v0, Lt/g1;->n:Lt/g1;

    invoke-virtual {v0, p1}, Lt/g1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lt/t;

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;JJZ)V

    iput-object p2, p0, Lz/g0;->y:Lt/o;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lz/g0;->u:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lz/g0;->h:Lv/y;

    invoke-virtual {v0}, Lv/y;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lz/c0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lz/c0;

    iget v1, v0, Lz/c0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lz/c0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lz/c0;

    invoke-direct {v0, p0, p3}, Lz/c0;-><init>(Lz/g0;Lu8/e;)V

    :goto_0
    iget-object p3, v0, Lz/c0;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lz/c0;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v0, Lz/c0;->c:Lc9/e;

    iget-object p1, v0, Lz/c0;->b:Lu/s1;

    iget-object v2, v0, Lz/c0;->a:Lz/g0;

    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput-object p0, v0, Lz/c0;->a:Lz/g0;

    iput-object p1, v0, Lz/c0;->b:Lu/s1;

    iput-object p2, v0, Lz/c0;->c:Lc9/e;

    iput v4, v0, Lz/c0;->f:I

    iget-object p3, p0, Lz/g0;->o:La0/b;

    invoke-virtual {p3, v0}, La0/b;->l(Lu8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p3, v2, Lz/g0;->h:Lv/y;

    const/4 v2, 0x0

    iput-object v2, v0, Lz/c0;->a:Lz/g0;

    iput-object v2, v0, Lz/c0;->b:Lu/s1;

    iput-object v2, v0, Lz/c0;->c:Lc9/e;

    iput v3, v0, Lz/c0;->f:I

    invoke-virtual {p3, p1, p2, v0}, Lv/y;->c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lz/g0;->t:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lz/g0;->h:Lv/y;

    invoke-virtual {v0, p1}, Lv/y;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(Lz/w;ZZ)V
    .locals 9

    if-nez p2, :cond_0

    iget-boolean v0, p0, Lz/g0;->a:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, Lz/g0;->b:Lz/w;

    goto/16 :goto_7

    :cond_0
    const/4 v0, 0x1

    if-eqz p2, :cond_1

    iput-boolean v0, p0, Lz/g0;->a:Z

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p1, Lz/w;->a:Lz/x;

    const/16 v5, 0x29

    const-string v6, "scrollOffset should be non-negative ("

    iget-object v7, p0, Lz/g0;->c:Lz/z;

    if-eqz p3, :cond_3

    iget p3, p1, Lz/w;->b:I

    int-to-float v8, p3

    cmpl-float v8, v8, v1

    if-ltz v8, :cond_2

    iget-object v5, v7, Lz/z;->b:Lm0/l1;

    invoke-virtual {v5, p3}, Lm0/u2;->f(I)V

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v4, :cond_4

    iget-object p3, v4, Lz/x;->j:Ljava/lang/Object;

    goto :goto_0

    :cond_4
    move-object p3, v3

    :goto_0
    iput-object p3, v7, Lz/z;->d:Ljava/lang/Object;

    iget-boolean p3, v7, Lz/z;->c:Z

    if-nez p3, :cond_5

    iget p3, p1, Lz/w;->j:I

    if-lez p3, :cond_7

    :cond_5
    iput-boolean v0, v7, Lz/z;->c:Z

    iget p3, p1, Lz/w;->b:I

    int-to-float v8, p3

    cmpl-float v8, v8, v1

    if-ltz v8, :cond_12

    if-eqz v4, :cond_6

    iget v5, v4, Lz/x;->a:I

    goto :goto_1

    :cond_6
    move v5, v2

    :goto_1
    invoke-virtual {v7, v5, p3}, Lz/z;->a(II)V

    :cond_7
    iget p3, p0, Lz/g0;->j:I

    const/4 v5, -0x1

    if-eq p3, v5, :cond_a

    iget-object p3, p1, Lz/w;->g:Ljava/util/List;

    move-object v6, p3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v0

    if-eqz v6, :cond_a

    iget-boolean v6, p0, Lz/g0;->l:Z

    if-eqz v6, :cond_8

    invoke-static {p3}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz/k;

    check-cast p3, Lz/x;

    iget p3, p3, Lz/x;->a:I

    add-int/2addr p3, v0

    goto :goto_2

    :cond_8
    invoke-static {p3}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lz/k;

    check-cast p3, Lz/x;

    iget p3, p3, Lz/x;->a:I

    sub-int/2addr p3, v0

    :goto_2
    iget v6, p0, Lz/g0;->j:I

    if-eq v6, p3, :cond_a

    iput v5, p0, Lz/g0;->j:I

    iget-object p3, p0, Lz/g0;->k:La0/b0;

    if-eqz p3, :cond_9

    invoke-interface {p3}, La0/b0;->cancel()V

    :cond_9
    iput-object v3, p0, Lz/g0;->k:La0/b0;

    :cond_a
    :goto_3
    if-eqz v4, :cond_b

    iget p3, v4, Lz/x;->a:I

    if-nez p3, :cond_d

    :cond_b
    iget p3, p1, Lz/w;->b:I

    if-eqz p3, :cond_c

    goto :goto_4

    :cond_c
    move v0, v2

    :cond_d
    :goto_4
    iget-object p3, p0, Lz/g0;->u:Lm0/n1;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p3, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-boolean p3, p1, Lz/w;->c:Z

    iget-object v0, p0, Lz/g0;->t:Lm0/n1;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {v0, p3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget p3, p0, Lz/g0;->f:F

    iget v0, p1, Lz/w;->d:F

    sub-float/2addr p3, v0

    iput p3, p0, Lz/g0;->f:F

    iget-object p3, p0, Lz/g0;->d:Lm0/n1;

    invoke-virtual {p3, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    if-eqz p2, :cond_11

    iget-object p2, p0, Lz/g0;->g:Lm2/b;

    sget p3, Lz/j0;->a:F

    invoke-interface {p2, p3}, Lm2/b;->v(F)F

    move-result p2

    iget p1, p1, Lz/w;->e:F

    cmpg-float p2, p1, p2

    if-gtz p2, :cond_e

    goto :goto_7

    :cond_e
    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2}, Lw0/i;->j()Lw0/i;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lz/g0;->y:Lt/o;

    iget-object v0, v0, Lt/o;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v4, p0, Lz/g0;->y:Lt/o;

    iget-boolean v5, v4, Lt/o;->f:Z

    const/4 v6, 0x3

    if-eqz v5, :cond_f

    sub-float/2addr v0, p1

    const/16 p1, 0x1e

    invoke-static {v4, v0, v1, p1}, Lt/e;->k(Lt/o;FFI)Lt/o;

    move-result-object p1

    iput-object p1, p0, Lz/g0;->y:Lt/o;

    iget-object p1, p0, Lz/g0;->x:Lm9/d0;

    if-eqz p1, :cond_10

    new-instance v0, Lz/e0;

    invoke-direct {v0, p0, v3}, Lz/e0;-><init>(Lz/g0;Lu8/e;)V

    invoke-static {p1, v3, v2, v0, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_f
    new-instance v0, Lt/o;

    sget-object v1, Lt/y1;->a:Lt/x1;

    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/16 v4, 0x3c

    invoke-direct {v0, v1, p1, v3, v4}, Lt/o;-><init>(Lt/x1;Ljava/lang/Object;Lt/t;I)V

    iput-object v0, p0, Lz/g0;->y:Lt/o;

    iget-object p1, p0, Lz/g0;->x:Lm9/d0;

    if-eqz p1, :cond_10

    new-instance v0, Lz/f0;

    invoke-direct {v0, p0, v3}, Lz/f0;-><init>(Lz/g0;Lu8/e;)V

    invoke-static {p1, v3, v2, v0, v6}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_10
    :goto_5
    :try_start_2
    invoke-static {p3}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p2}, Lw0/i;->c()V

    goto :goto_7

    :goto_6
    :try_start_3
    invoke-static {p3}, Lw0/i;->p(Lw0/i;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, Lw0/i;->c()V

    throw p1

    :cond_11
    :goto_7
    return-void

    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final g(FLz/u;)V
    .locals 3

    iget-boolean v0, p0, Lz/g0;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v0, p2

    check-cast v0, Lz/w;

    iget-object v0, v0, Lz/w;->g:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    move-object v0, p2

    check-cast v0, Lz/w;

    iget-object v0, v0, Lz/w;->g:Ljava/util/List;

    invoke-static {v0}, Lr8/p;->L0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/k;

    check-cast v0, Lz/x;

    iget v0, v0, Lz/x;->a:I

    add-int/2addr v0, v1

    goto :goto_1

    :cond_2
    move-object v0, p2

    check-cast v0, Lz/w;

    iget-object v0, v0, Lz/w;->g:Ljava/util/List;

    invoke-static {v0}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/k;

    check-cast v0, Lz/x;

    iget v0, v0, Lz/x;->a:I

    sub-int/2addr v0, v1

    :goto_1
    iget v1, p0, Lz/g0;->j:I

    if-eq v0, v1, :cond_4

    if-ltz v0, :cond_4

    check-cast p2, Lz/w;

    iget p2, p2, Lz/w;->j:I

    if-ge v0, p2, :cond_4

    iget-boolean p2, p0, Lz/g0;->l:Z

    if-eq p2, p1, :cond_3

    iget-object p2, p0, Lz/g0;->k:La0/b0;

    if-eqz p2, :cond_3

    invoke-interface {p2}, La0/b0;->cancel()V

    :cond_3
    iput-boolean p1, p0, Lz/g0;->l:Z

    iput v0, p0, Lz/g0;->j:I

    iget-object p1, p0, Lz/g0;->w:La0/d0;

    iget-wide v1, p0, Lz/g0;->r:J

    invoke-virtual {p1, v0, v1, v2}, La0/d0;->a(IJ)La0/b0;

    move-result-object p1

    iput-object p1, p0, Lz/g0;->k:La0/b0;

    :cond_4
    return-void
.end method
