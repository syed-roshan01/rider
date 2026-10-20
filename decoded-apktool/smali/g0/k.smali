.class public final Lg0/k;
.super Ly0/n;

# interfaces
.implements Lt1/b0;
.implements Lt1/s;
.implements Lt1/r1;


# instance fields
.field public A:I

.field public B:Ljava/util/Map;

.field public C:Lg0/e;

.field public D:Lg0/j;

.field public final E:Lm0/n1;

.field public u:Ljava/lang/String;

.field public v:La2/c0;

.field public w:Lf2/d;

.field public x:I

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;La2/c0;Lf2/d;IZII)V
    .locals 0

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lg0/k;->u:Ljava/lang/String;

    iput-object p2, p0, Lg0/k;->v:La2/c0;

    iput-object p3, p0, Lg0/k;->w:Lf2/d;

    iput p4, p0, Lg0/k;->x:I

    iput-boolean p5, p0, Lg0/k;->y:Z

    iput p6, p0, Lg0/k;->z:I

    iput p7, p0, Lg0/k;->A:I

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lg0/k;->E:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final G0()Lg0/e;
    .locals 9

    iget-object v0, p0, Lg0/k;->C:Lg0/e;

    if-nez v0, :cond_0

    new-instance v0, Lg0/e;

    iget-object v2, p0, Lg0/k;->u:Ljava/lang/String;

    iget-object v3, p0, Lg0/k;->v:La2/c0;

    iget-object v4, p0, Lg0/k;->w:Lf2/d;

    iget v5, p0, Lg0/k;->x:I

    iget-boolean v6, p0, Lg0/k;->y:Z

    iget v7, p0, Lg0/k;->z:I

    iget v8, p0, Lg0/k;->A:I

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lg0/e;-><init>(Ljava/lang/String;La2/c0;Lf2/d;IZII)V

    iput-object v0, p0, Lg0/k;->C:Lg0/e;

    :cond_0
    iget-object v0, p0, Lg0/k;->C:Lg0/e;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final H0(Lm2/b;)Lg0/e;
    .locals 2

    invoke-virtual {p0}, Lg0/k;->I0()Lg0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lg0/i;->c:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lg0/i;->d:Lg0/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg0/e;->c(Lm2/b;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lg0/k;->G0()Lg0/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg0/e;->c(Lm2/b;)V

    return-object v0
.end method

.method public final I0()Lg0/i;
    .locals 1

    iget-object v0, p0, Lg0/k;->E:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/i;

    return-object v0
.end method

.method public final Q(Ly1/j;)V
    .locals 9

    iget-object v0, p0, Lg0/k;->D:Lg0/j;

    if-nez v0, :cond_0

    new-instance v0, Lg0/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg0/j;-><init>(Lg0/k;I)V

    iput-object v0, p0, Lg0/k;->D:Lg0/j;

    :cond_0
    new-instance v1, La2/e;

    iget-object v2, p0, Lg0/k;->u:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-direct {v1, v2, v3, v4}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    sget-object v2, Ly1/t;->a:[Lj9/f;

    sget-object v2, Ly1/r;->u:Ly1/u;

    invoke-static {v1}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lg0/k;->I0()Lg0/i;

    move-result-object v1

    const/16 v2, 0xc

    if-eqz v1, :cond_1

    iget-boolean v5, v1, Lg0/i;->c:Z

    sget-object v6, Ly1/r;->w:Ly1/u;

    sget-object v7, Ly1/t;->a:[Lj9/f;

    const/16 v8, 0xd

    aget-object v8, v7, v8

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v6, p1, v5}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    new-instance v5, La2/e;

    iget-object v1, v1, Lg0/i;->b:Ljava/lang/String;

    invoke-direct {v5, v1, v3, v4}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    sget-object v1, Ly1/r;->v:Ly1/u;

    aget-object v4, v7, v2

    invoke-virtual {v1, p1, v5}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    :cond_1
    new-instance v1, Lg0/j;

    const/4 v4, 0x1

    invoke-direct {v1, p0, v4}, Lg0/j;-><init>(Lg0/k;I)V

    sget-object v4, Ly1/i;->i:Ly1/u;

    new-instance v5, Ly1/a;

    invoke-direct {v5, v3, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v4, v5}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    new-instance v1, Lg0/j;

    const/4 v4, 0x2

    invoke-direct {v1, p0, v4}, Lg0/j;-><init>(Lg0/k;I)V

    sget-object v4, Ly1/i;->j:Ly1/u;

    new-instance v5, Ly1/a;

    invoke-direct {v5, v3, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v4, v5}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    new-instance v1, Lt/l0;

    invoke-direct {v1, p0, v2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    sget-object v2, Ly1/i;->k:Ly1/u;

    new-instance v4, Ly1/a;

    invoke-direct {v4, v3, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v2, v4}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ly1/t;->c(Ly1/v;Lc9/c;)V

    return-void
.end method

.method public final a(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/k;->H0(Lm2/b;)Lg0/e;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lg0/e;->a(ILm2/l;)I

    move-result p1

    return p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/k;->H0(Lm2/b;)Lg0/e;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Lg0/e;->d(Lm2/l;)La2/o;

    move-result-object p1

    invoke-interface {p1}, La2/o;->c()F

    move-result p1

    invoke-static {p1}, Ld9/i;->n(F)I

    move-result p1

    return p1
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/k;->H0(Lm2/b;)Lg0/e;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p1}, Lg0/e;->d(Lm2/l;)La2/o;

    move-result-object p1

    invoke-interface {p1}, La2/o;->a()F

    move-result p1

    invoke-static {p1}, Ld9/i;->n(F)I

    move-result p1

    return p1
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p1}, Lg0/k;->H0(Lm2/b;)Lg0/e;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v2

    iget v3, v1, Lg0/e;->g:I

    const/4 v4, 0x1

    if-le v3, v4, :cond_0

    iget-object v3, v1, Lg0/e;->m:Lg0/b;

    iget-object v5, v1, Lg0/e;->b:La2/c0;

    iget-object v6, v1, Lg0/e;->i:Lm2/b;

    invoke-static {v6}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v7, v1, Lg0/e;->c:Lf2/d;

    invoke-static {v3, v2, v5, v6, v7}, La/a;->a(Lg0/b;Lm2/l;La2/c0;Lm2/b;Lf2/d;)Lg0/b;

    move-result-object v3

    iput-object v3, v1, Lg0/e;->m:Lg0/b;

    iget v5, v1, Lg0/e;->g:I

    move-wide/from16 v6, p3

    invoke-virtual {v3, v5, v6, v7}, Lg0/b;->a(IJ)J

    move-result-wide v5

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p3

    move-wide v5, v6

    :goto_0
    iget-object v3, v1, Lg0/e;->j:La2/a;

    const/4 v7, 0x0

    const/16 v8, 0x20

    const-wide v9, 0xffffffffL

    const/4 v11, 0x3

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v12, v1, Lg0/e;->n:La2/o;

    if-nez v12, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-interface {v12}, La2/o;->b()Z

    move-result v12

    if-eqz v12, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v12, v1, Lg0/e;->o:Lm2/l;

    if-eq v2, v12, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-wide v12, v1, Lg0/e;->p:J

    invoke-static {v5, v6, v12, v13}, Lm2/a;->c(JJ)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {v5, v6}, Lm2/a;->i(J)I

    move-result v12

    iget-wide v13, v1, Lg0/e;->p:J

    invoke-static {v13, v14}, Lm2/a;->i(J)I

    move-result v13

    if-eq v12, v13, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-static {v5, v6}, Lm2/a;->h(J)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v3}, La2/a;->b()F

    move-result v13

    cmpg-float v12, v12, v13

    if-ltz v12, :cond_b

    iget-object v3, v3, La2/a;->d:Lb2/v;

    iget-boolean v3, v3, Lb2/v;->c:Z

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    iget-wide v2, v1, Lg0/e;->p:J

    invoke-static {v5, v6, v2, v3}, Lm2/a;->c(JJ)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, v1, Lg0/e;->j:La2/a;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v3, v2, La2/a;->a:Li2/d;

    iget-object v3, v3, Li2/d;->i:Lb2/h;

    invoke-virtual {v3}, Lb2/h;->b()F

    move-result v3

    invoke-virtual {v2}, La2/a;->c()F

    move-result v12

    invoke-static {v3, v12}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v3}, Ld9/i;->n(F)I

    move-result v3

    invoke-virtual {v2}, La2/a;->b()F

    move-result v12

    invoke-static {v12}, Ld9/i;->n(F)I

    move-result v12

    invoke-static {v3, v12}, Lo1/s;->e(II)J

    move-result-wide v12

    invoke-static {v5, v6, v12, v13}, Lo1/s;->o(JJ)J

    move-result-wide v12

    iput-wide v12, v1, Lg0/e;->l:J

    iget v3, v1, Lg0/e;->d:I

    invoke-static {v3, v11}, Lh6/g;->T(II)Z

    move-result v3

    if-nez v3, :cond_9

    shr-long v14, v12, v8

    long-to-int v3, v14

    int-to-float v3, v3

    invoke-virtual {v2}, La2/a;->c()F

    move-result v11

    cmpg-float v3, v3, v11

    if-ltz v3, :cond_8

    and-long v11, v12, v9

    long-to-int v3, v11

    int-to-float v3, v3

    invoke-virtual {v2}, La2/a;->b()F

    move-result v2

    cmpg-float v2, v3, v2

    if-gez v2, :cond_9

    :cond_8
    move v2, v4

    goto :goto_2

    :cond_9
    move v2, v7

    :goto_2
    iput-boolean v2, v1, Lg0/e;->k:Z

    iput-wide v5, v1, Lg0/e;->p:J

    :cond_a
    move v2, v7

    goto :goto_5

    :cond_b
    :goto_3
    invoke-virtual {v1, v5, v6, v2}, Lg0/e;->b(JLm2/l;)La2/a;

    move-result-object v2

    iput-wide v5, v1, Lg0/e;->p:J

    invoke-virtual {v2}, La2/a;->c()F

    move-result v3

    invoke-static {v3}, Ld9/i;->n(F)I

    move-result v3

    invoke-virtual {v2}, La2/a;->b()F

    move-result v12

    invoke-static {v12}, Ld9/i;->n(F)I

    move-result v12

    invoke-static {v3, v12}, Lo1/s;->e(II)J

    move-result-wide v12

    invoke-static {v5, v6, v12, v13}, Lo1/s;->o(JJ)J

    move-result-wide v5

    iput-wide v5, v1, Lg0/e;->l:J

    iget v3, v1, Lg0/e;->d:I

    invoke-static {v3, v11}, Lh6/g;->T(II)Z

    move-result v3

    if-nez v3, :cond_d

    shr-long v11, v5, v8

    long-to-int v3, v11

    int-to-float v3, v3

    invoke-virtual {v2}, La2/a;->c()F

    move-result v11

    cmpg-float v3, v3, v11

    if-ltz v3, :cond_c

    and-long/2addr v5, v9

    long-to-int v3, v5

    int-to-float v3, v3

    invoke-virtual {v2}, La2/a;->b()F

    move-result v5

    cmpg-float v3, v3, v5

    if-gez v3, :cond_d

    :cond_c
    move v3, v4

    goto :goto_4

    :cond_d
    move v3, v7

    :goto_4
    iput-boolean v3, v1, Lg0/e;->k:Z

    iput-object v2, v1, Lg0/e;->j:La2/a;

    move v2, v4

    :goto_5
    iget-object v3, v1, Lg0/e;->n:La2/o;

    if-eqz v3, :cond_e

    invoke-interface {v3}, La2/o;->b()Z

    :cond_e
    iget-object v3, v1, Lg0/e;->j:La2/a;

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v5, v1, Lg0/e;->l:J

    if-eqz v2, :cond_10

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v2

    invoke-virtual {v2}, Lt1/c1;->P0()V

    iget-object v2, v0, Lg0/k;->B:Ljava/util/Map;

    if-nez v2, :cond_f

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    :cond_f
    sget-object v1, Lr1/d;->a:Lr1/o;

    iget-object v3, v3, La2/a;->d:Lb2/v;

    invoke-virtual {v3, v7}, Lb2/v;->c(I)F

    move-result v7

    invoke-static {v7}, Ld7/t;->p0(F)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lr1/d;->b:Lr1/o;

    iget v7, v3, Lb2/v;->e:I

    sub-int/2addr v7, v4

    invoke-virtual {v3, v7}, Lb2/v;->c(I)F

    move-result v3

    invoke-static {v3}, Ld7/t;->p0(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v2, v0, Lg0/k;->B:Ljava/util/Map;

    :cond_10
    shr-long v1, v5, v8

    long-to-int v1, v1

    and-long v2, v5, v9

    long-to-int v2, v2

    invoke-static {v1, v2}, Lm9/e0;->x(II)J

    move-result-wide v3

    move-object/from16 v5, p2

    invoke-interface {v5, v3, v4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object v3

    iget-object v4, v0, Lg0/k;->B:Ljava/util/Map;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    new-instance v5, Ls/z;

    const/4 v6, 0x7

    invoke-direct {v5, v3, v6}, Ls/z;-><init>(Lr1/x0;I)V

    move-object/from16 v3, p1

    invoke-interface {v3, v1, v2, v4, v5}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object v1

    return-object v1
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lg0/k;->H0(Lm2/b;)Lg0/e;

    move-result-object p2

    invoke-interface {p1}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lg0/e;->a(ILm2/l;)I

    move-result p1

    return p1
.end method

.method public final i(Lg1/e;)V
    .locals 10

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lg0/k;->G0()Lg0/e;

    move-result-object v0

    iget-object v1, v0, Lg0/e;->j:La2/a;

    if-eqz v1, :cond_a

    check-cast p1, Lt1/i0;

    iget-object p1, p1, Lt1/i0;->a:Lg1/c;

    iget-object p1, p1, Lg1/c;->b:Lg1/b;

    invoke-virtual {p1}, Lg1/b;->a()Le1/p;

    move-result-object p1

    invoke-virtual {p0}, Lg0/k;->G0()Lg0/e;

    move-result-object v0

    iget-boolean v0, v0, Lg0/e;->k:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lg0/k;->G0()Lg0/e;

    move-result-object v2

    iget-wide v2, v2, Lg0/e;->l:J

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lg0/k;->G0()Lg0/e;

    move-result-object v3

    iget-wide v3, v3, Lg0/e;->l:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-float v3, v3

    sget-wide v4, Ld1/c;->b:J

    invoke-static {v2, v3}, Ld7/t;->j(FF)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Lm9/e0;->h(JJ)Ld1/d;

    move-result-object v2

    invoke-interface {p1}, Le1/p;->j()V

    invoke-static {p1, v2}, Le1/p;->o(Le1/p;Ld1/d;)V

    :cond_1
    :try_start_0
    iget-object v2, p0, Lg0/k;->v:La2/c0;

    iget-object v2, v2, La2/c0;->a:La2/x;

    iget-object v3, v2, La2/x;->m:Ll2/j;

    if-nez v3, :cond_2

    sget-object v3, Ll2/j;->b:Ll2/j;

    :cond_2
    move-object v6, v3

    iget-object v3, v2, La2/x;->n:Le1/k0;

    if-nez v3, :cond_3

    sget-object v3, Le1/k0;->d:Le1/k0;

    :cond_3
    move-object v5, v3

    iget-object v3, v2, La2/x;->p:Lg1/h;

    if-nez v3, :cond_4

    sget-object v3, Lg1/j;->a:Lg1/j;

    :cond_4
    move-object v7, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_4

    :goto_0
    iget-object v2, v2, La2/x;->a:Ll2/o;

    invoke-interface {v2}, Ll2/o;->e()Le1/n;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v2, p0, Lg0/k;->v:La2/c0;

    iget-object v2, v2, La2/c0;->a:La2/x;

    iget-object v2, v2, La2/x;->a:Ll2/o;

    invoke-interface {v2}, Ll2/o;->c()F

    move-result v4

    const/4 v8, 0x3

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, La2/a;->f(Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;I)V

    goto :goto_3

    :cond_5
    sget-wide v2, Le1/r;->g:J

    cmp-long v4, v2, v2

    if-eqz v4, :cond_6

    :goto_1
    move-wide v3, v2

    goto :goto_2

    :cond_6
    iget-object v4, p0, Lg0/k;->v:La2/c0;

    invoke-virtual {v4}, La2/c0;->b()J

    move-result-wide v8

    cmp-long v2, v8, v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lg0/k;->v:La2/c0;

    invoke-virtual {v2}, La2/c0;->b()J

    move-result-wide v2

    goto :goto_1

    :cond_7
    sget-wide v2, Le1/r;->b:J

    goto :goto_1

    :goto_2
    const/4 v8, 0x3

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, La2/a;->e(Le1/p;JLe1/k0;Ll2/j;Lg1/h;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    if-eqz v0, :cond_8

    invoke-interface {p1}, Le1/p;->h()V

    :cond_8
    return-void

    :goto_4
    if-eqz v0, :cond_9

    invoke-interface {p1}, Le1/p;->h()V

    :cond_9
    throw v1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no paragraph"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
