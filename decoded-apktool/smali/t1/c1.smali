.class public abstract Lt1/c1;
.super Lt1/q0;

# interfaces
.implements Lr1/i0;
.implements Lr1/s;
.implements Lt1/m1;


# static fields
.field public static final I:Le1/i0;

.field public static final J:Lt1/z;

.field public static final K:[F

.field public static final L:Lx9/v;

.field public static final M:Lx9/v;


# instance fields
.field public A:J

.field public B:F

.field public C:Ld1/b;

.field public D:Lt1/z;

.field public final E:Lh1/b;

.field public final F:Lt/l0;

.field public G:Z

.field public H:Lt1/j1;

.field public final p:Landroidx/compose/ui/node/a;

.field public q:Lt1/c1;

.field public r:Lt1/c1;

.field public s:Z

.field public t:Z

.field public u:Lc9/c;

.field public v:Lm2/b;

.field public w:Lm2/l;

.field public x:F

.field public y:Lr1/k0;

.field public z:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Le1/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Le1/i0;->b:F

    iput v1, v0, Le1/i0;->c:F

    iput v1, v0, Le1/i0;->d:F

    sget-wide v2, Le1/x;->a:J

    iput-wide v2, v0, Le1/i0;->o:J

    iput-wide v2, v0, Le1/i0;->p:J

    const/high16 v2, 0x41000000    # 8.0f

    iput v2, v0, Le1/i0;->t:F

    sget-wide v2, Le1/p0;->b:J

    iput-wide v2, v0, Le1/i0;->u:J

    sget-object v2, Le1/g0;->a:Le1/f0;

    iput-object v2, v0, Le1/i0;->v:Le1/l0;

    const/4 v2, 0x0

    iput v2, v0, Le1/i0;->x:I

    sget v3, Ld1/f;->d:I

    new-instance v3, Lm2/c;

    invoke-direct {v3, v1, v1}, Lm2/c;-><init>(FF)V

    iput-object v3, v0, Le1/i0;->y:Lm2/b;

    sput-object v0, Lt1/c1;->I:Le1/i0;

    new-instance v0, Lt1/z;

    invoke-direct {v0}, Lt1/z;-><init>()V

    sput-object v0, Lt1/c1;->J:Lt1/z;

    const/16 v0, 0x10

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lt1/c1;->K:[F

    new-instance v0, Lx9/v;

    invoke-direct {v0, v2}, Lx9/v;-><init>(I)V

    sput-object v0, Lt1/c1;->L:Lx9/v;

    new-instance v0, Lx9/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    sput-object v0, Lt1/c1;->M:Lx9/v;

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 2

    invoke-direct {p0}, Lt1/q0;-><init>()V

    iput-object p1, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, p1, Landroidx/compose/ui/node/a;->x:Lm2/b;

    iput-object v0, p0, Lt1/c1;->v:Lm2/b;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->y:Lm2/l;

    iput-object p1, p0, Lt1/c1;->w:Lm2/l;

    const p1, 0x3f4ccccd    # 0.8f

    iput p1, p0, Lt1/c1;->x:F

    sget-wide v0, Lm2/i;->b:J

    iput-wide v0, p0, Lt1/c1;->A:J

    new-instance p1, Lh1/b;

    const/4 v0, 0x6

    invoke-direct {p1, p0, v0}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lt1/c1;->E:Lh1/b;

    new-instance p1, Lt/l0;

    const/16 v0, 0x1c

    invoke-direct {p1, p0, v0}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lt1/c1;->F:Lt/l0;

    return-void
.end method

.method public static Z0(Lr1/s;)Lt1/c1;
    .locals 1

    instance-of v0, p0, Lr1/h0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lr1/h0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lr1/h0;->a:Lt1/r0;

    iget-object v0, v0, Lt1/r0;->p:Lt1/c1;

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    invoke-static {p0, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Lt1/c1;

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final A0(J)J
    .locals 2

    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v0

    invoke-virtual {p0}, Lr1/x0;->b0()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result p1

    invoke-virtual {p0}, Lr1/x0;->a0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    div-float/2addr p1, p2

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {v0, p1}, Ld7/t;->j(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final B0(JJ)F
    .locals 4

    invoke-virtual {p0}, Lr1/x0;->b0()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, Ld1/f;->d(J)F

    move-result v1

    cmpl-float v0, v0, v1

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lr1/x0;->a0()I

    move-result v0

    int-to-float v0, v0

    invoke-static {p3, p4}, Ld1/f;->b(J)F

    move-result v2

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p3, p4}, Lt1/c1;->A0(J)J

    move-result-wide p3

    invoke-static {p3, p4}, Ld1/f;->d(J)F

    move-result v0

    invoke-static {p3, p4}, Ld1/f;->b(J)F

    move-result p3

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p4

    const/4 v2, 0x0

    cmpg-float v3, p4, v2

    if-gez v3, :cond_1

    neg-float p4, p4

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lr1/x0;->b0()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr p4, v3

    :goto_0
    invoke-static {v2, p4}, Ljava/lang/Math;->max(FF)F

    move-result p4

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    cmpg-float p2, p1, v2

    if-gez p2, :cond_2

    neg-float p1, p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lr1/x0;->a0()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    :goto_1
    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p4, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    cmpl-float p4, v0, v2

    if-gtz p4, :cond_3

    cmpl-float p4, p3, v2

    if-lez p4, :cond_4

    :cond_3
    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p4

    cmpg-float p4, p4, v0

    if-gtz p4, :cond_4

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p4

    cmpg-float p3, p4, p3

    if-gtz p3, :cond_4

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p3

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p4

    mul-float/2addr p4, p3

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p3

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    mul-float/2addr p1, p3

    add-float v1, p1, p4

    :cond_4
    return v1
.end method

.method public final C0(Le1/p;)V
    .locals 5

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lt1/j1;->l(Le1/p;)V

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lt1/c1;->A:J

    sget v2, Lm2/i;->c:I

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-interface {p1, v2, v0}, Le1/p;->e(FF)V

    invoke-virtual {p0, p1}, Lt1/c1;->E0(Le1/p;)V

    neg-float v1, v2

    neg-float v0, v0

    invoke-interface {p1, v1, v0}, Le1/p;->e(FF)V

    :goto_0
    return-void
.end method

.method public final D0(Le1/p;Le1/g;)V
    .locals 9

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    iget-wide v3, p0, Lr1/x0;->c:J

    const/16 v0, 0x20

    shr-long v5, v3, v0

    long-to-int v0, v5

    int-to-float v0, v0

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v6, v0, v5

    const-wide v7, 0xffffffffL

    and-long/2addr v3, v7

    long-to-int v0, v3

    int-to-float v0, v0

    sub-float v4, v0, v5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p1

    move v3, v6

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Le1/p;->s(FFFFLe1/g;)V

    return-void
.end method

.method public final E0(Le1/p;)V
    .locals 13

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lt1/c1;->L0(I)Ly0/n;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lt1/c1;->U0(Le1/p;)V

    goto/16 :goto_4

    :cond_0
    iget-object v2, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v2

    check-cast v2, Lu1/w;

    invoke-virtual {v2}, Lu1/w;->getSharedDrawScope()Lt1/i0;

    move-result-object v2

    iget-wide v3, p0, Lr1/x0;->c:J

    invoke-static {v3, v4}, Lo1/s;->m0(J)J

    move-result-wide v9

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    move-object v12, v11

    :goto_0
    if-eqz v1, :cond_8

    instance-of v3, v1, Lt1/s;

    if-eqz v3, :cond_1

    move-object v8, v1

    check-cast v8, Lt1/s;

    move-object v3, v2

    move-object v4, p1

    move-wide v5, v9

    move-object v7, p0

    invoke-virtual/range {v3 .. v8}, Lt1/i0;->b(Le1/p;JLt1/c1;Lt1/s;)V

    goto :goto_3

    :cond_1
    iget v3, v1, Ly0/n;->c:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_7

    instance-of v3, v1, Lt1/o;

    if-eqz v3, :cond_7

    move-object v3, v1

    check-cast v3, Lt1/o;

    iget-object v3, v3, Lt1/o;->v:Ly0/n;

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x1

    if-eqz v3, :cond_6

    iget v6, v3, Ly0/n;->c:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_5

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v5, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    if-nez v12, :cond_3

    new-instance v12, Lo0/i;

    const/16 v5, 0x10

    new-array v5, v5, [Ly0/n;

    invoke-direct {v12, v5}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v12, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v1, v11

    :cond_4
    invoke-virtual {v12, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    iget-object v3, v3, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_6
    if-ne v4, v5, :cond_7

    goto :goto_0

    :cond_7
    :goto_3
    invoke-static {v12}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v1

    goto :goto_0

    :cond_8
    :goto_4
    return-void
.end method

.method public abstract F0()V
.end method

.method public final G0(Lt1/c1;)Lt1/c1;
    .locals 5

    iget-object v0, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v1, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v1

    iget-object v1, v1, Ly0/n;->a:Ly0/n;

    iget-boolean v2, v1, Ly0/n;->t:Z

    if-eqz v2, :cond_2

    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    :goto_0
    if-eqz v1, :cond_1

    iget v2, v1, Ly0/n;->c:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_0

    if-ne v1, v0, :cond_0

    return-object p1

    :cond_0
    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    goto :goto_0

    :cond_1
    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitLocalAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget v2, v0, Landroidx/compose/ui/node/a;->q:I

    iget v3, v1, Landroidx/compose/ui/node/a;->q:I

    if-le v2, v3, :cond_4

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_2
    iget v3, v2, Landroidx/compose/ui/node/a;->q:I

    iget v4, v0, Landroidx/compose/ui/node/a;->q:I

    if-le v3, v4, :cond_5

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    :goto_3
    if-eq v0, v2, :cond_7

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v2

    if-eqz v0, :cond_6

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "layouts are not part of the same hierarchy"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-ne v2, v1, :cond_8

    move-object p1, p0

    goto :goto_4

    :cond_8
    iget-object v1, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    if-ne v0, v1, :cond_9

    goto :goto_4

    :cond_9
    iget-object p1, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p1, p1, Lt1/x0;->b:Lt1/x;

    :goto_4
    return-object p1
.end method

.method public final H0(J)J
    .locals 5

    iget-wide v0, p0, Lt1/c1;->A:J

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v2

    sget v3, Lm2/i;->c:I

    const/16 v3, 0x20

    shr-long v3, v0, v3

    long-to-int v3, v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int p2, v0

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-static {v2, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, p1, p2, v1}, Lt1/j1;->a(JZ)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public abstract I0()Lt1/r0;
.end method

.method public final J0()J
    .locals 3

    iget-object v0, p0, Lt1/c1;->v:Lm2/b;

    iget-object v1, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    invoke-interface {v1}, Lu1/y2;->f()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lm2/b;->S(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public abstract K0()Ly0/n;
.end method

.method public final L()Z
    .locals 1

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    iget-boolean v0, v0, Ly0/n;->t:Z

    return v0
.end method

.method public final L0(I)Ly0/n;
    .locals 3

    invoke-static {p1}, Lt1/g;->r(I)Z

    move-result v0

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_3

    iget v2, v0, Ly0/n;->d:I

    and-int/2addr v2, p1

    if-eqz v2, :cond_3

    iget v2, v0, Ly0/n;->c:I

    and-int/2addr v2, p1

    if-eqz v2, :cond_2

    return-object v0

    :cond_2
    if-eq v0, v1, :cond_3

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final M()J
    .locals 2

    iget-wide v0, p0, Lr1/x0;->c:J

    return-wide v0
.end method

.method public final M0(Z)Ly0/n;
    .locals 2

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->c:Lt1/c1;

    if-ne v1, p0, :cond_0

    iget-object p1, v0, Lt1/x0;->e:Ly0/n;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lt1/c1;->K0()Ly0/n;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lt1/c1;->K0()Ly0/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final N0(Lt1/z0;JLt1/v;ZZ)V
    .locals 17

    move-object/from16 v11, p0

    move-wide/from16 v4, p2

    move-object/from16 v12, p4

    move/from16 v13, p6

    move-object/from16 v3, p1

    check-cast v3, Lx9/v;

    iget v0, v3, Lx9/v;->a:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x8

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x10

    :goto_0
    invoke-virtual {v11, v0}, Lt1/c1;->L0(I)Ly0/n;

    move-result-object v14

    invoke-static/range {p2 .. p3}, Ld9/i;->s(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v11, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_4

    iget-boolean v1, v11, Lt1/c1;->t:Z

    if-eqz v1, :cond_4

    invoke-interface {v0, v4, v5}, Lt1/j1;->k(J)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    :goto_1
    if-eqz p5, :cond_a

    invoke-virtual/range {p0 .. p0}, Lt1/c1;->J0()J

    move-result-wide v0

    invoke-virtual {v11, v4, v5, v0, v1}, Lt1/c1;->B0(JJ)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_a

    iget v0, v12, Lt1/v;->c:I

    invoke-static/range {p4 .. p4}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    invoke-static {v13, v0}, Lt1/g;->a(FZ)J

    move-result-wide v0

    invoke-virtual/range {p4 .. p4}, Lt1/v;->e()J

    move-result-wide v6

    invoke-static {v6, v7, v0, v1}, Lt1/g;->o(JJ)I

    move-result v0

    if-lez v0, :cond_a

    :goto_2
    const/4 v15, 0x0

    if-nez v14, :cond_3

    move-object/from16 v0, p0

    move-object v1, v3

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move v6, v15

    invoke-virtual/range {v0 .. v6}, Lt1/c1;->O0(Lt1/z0;JLt1/v;ZZ)V

    goto/16 :goto_7

    :cond_3
    new-instance v10, Lt1/b1;

    const/16 v16, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v14

    move-wide/from16 v4, p2

    move-object/from16 v6, p4

    move/from16 v7, p5

    move v8, v15

    move v9, v13

    move-object v11, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Lt1/b1;-><init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZFI)V

    invoke-virtual {v12, v14, v13, v15, v11}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    goto/16 :goto_7

    :cond_4
    :goto_3
    if-nez v14, :cond_5

    move-object/from16 v0, p0

    move-object v1, v3

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lt1/c1;->O0(Lt1/z0;JLt1/v;ZZ)V

    goto/16 :goto_7

    :cond_5
    invoke-static/range {p2 .. p3}, Ld1/c;->d(J)F

    move-result v0

    invoke-static/range {p2 .. p3}, Ld1/c;->e(J)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v6, v0, v2

    if-ltz v6, :cond_6

    cmpl-float v2, v1, v2

    if-ltz v2, :cond_6

    invoke-virtual/range {p0 .. p0}, Lr1/x0;->b0()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_6

    invoke-virtual/range {p0 .. p0}, Lr1/x0;->a0()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v1, v0

    if-gez v0, :cond_6

    new-instance v9, Lt1/a1;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v2, v14

    move-wide/from16 v4, p2

    move-object/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lt1/a1;-><init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZ)V

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {v12, v14, v0, v13, v9}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    goto/16 :goto_7

    :cond_6
    if-nez p5, :cond_7

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    move-object/from16 v11, p0

    :goto_4
    move v15, v0

    goto :goto_5

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lt1/c1;->J0()J

    move-result-wide v0

    move-object/from16 v11, p0

    invoke-virtual {v11, v4, v5, v0, v1}, Lt1/c1;->B0(JJ)F

    move-result v0

    goto :goto_4

    :goto_5
    invoke-static {v15}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_9

    iget v0, v12, Lt1/v;->c:I

    invoke-static/range {p4 .. p4}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v15, v13}, Lt1/g;->a(FZ)J

    move-result-wide v0

    invoke-virtual/range {p4 .. p4}, Lt1/v;->e()J

    move-result-wide v6

    invoke-static {v6, v7, v0, v1}, Lt1/g;->o(JJ)I

    move-result v0

    if-lez v0, :cond_9

    :goto_6
    new-instance v10, Lt1/b1;

    const/16 v16, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v14

    move-wide/from16 v4, p2

    move-object/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move v9, v15

    move-object v11, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Lt1/b1;-><init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZFI)V

    invoke-virtual {v12, v14, v15, v13, v11}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    goto :goto_7

    :cond_9
    move-object/from16 v0, p0

    move-object v1, v14

    move-object v2, v3

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move v8, v15

    invoke-virtual/range {v0 .. v8}, Lt1/c1;->Y0(Ly0/n;Lt1/z0;JLt1/v;ZZF)V

    :cond_a
    :goto_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public O0(Lt1/z0;JLt1/v;ZZ)V
    .locals 7

    iget-object v0, p0, Lt1/c1;->q:Lt1/c1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, p3}, Lt1/c1;->H0(J)J

    move-result-wide v2

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lt1/c1;->N0(Lt1/z0;JLt1/v;ZZ)V

    :cond_0
    return-void
.end method

.method public final P(J)J
    .locals 1

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lt1/c1;->R0()V

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lt1/c1;->a1(J)J

    move-result-wide p1

    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    goto :goto_0

    :cond_0
    return-wide p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final P0()V
    .locals 1

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt1/j1;->invalidate()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt1/c1;->P0()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final Q0()Z
    .locals 2

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    iget v0, p0, Lt1/c1;->x:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt1/c1;->Q0()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final R0()V
    .locals 5

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v1, Lt1/n0;->c:I

    const/4 v2, 0x3

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    if-ne v1, v3, :cond_2

    :cond_0
    iget-object v2, v0, Lt1/n0;->o:Lt1/l0;

    iget-boolean v2, v2, Lt1/l0;->D:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0, v4}, Lt1/n0;->d(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v4}, Lt1/n0;->c(Z)V

    :cond_2
    :goto_0
    if-ne v1, v3, :cond_4

    iget-object v1, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz v1, :cond_3

    iget-boolean v1, v1, Lt1/k0;->z:Z

    if-ne v1, v4, :cond_3

    invoke-virtual {v0, v4}, Lt1/n0;->d(Z)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v4}, Lt1/n0;->c(Z)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final S0()V
    .locals 12

    const/16 v0, 0x80

    invoke-static {v0}, Lt1/g;->r(I)Z

    move-result v1

    invoke-virtual {p0, v1}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v1, v1, Ly0/n;->a:Ly0/n;

    iget v1, v1, Ly0/n;->d:I

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    invoke-static {}, Lk0/y0;->c()Lw0/i;

    move-result-object v1

    :try_start_0
    invoke-virtual {v1}, Lw0/i;->j()Lw0/i;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v0}, Lt1/g;->r(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v4

    iget-object v4, v4, Ly0/n;->e:Ly0/n;

    if-nez v4, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-virtual {p0, v3}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_a

    iget v5, v3, Ly0/n;->d:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_a

    iget v5, v3, Ly0/n;->c:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_9

    const/4 v5, 0x0

    move-object v6, v3

    move-object v7, v5

    :goto_2
    if-eqz v6, :cond_9

    instance-of v8, v6, Lt1/a0;

    if-eqz v8, :cond_2

    check-cast v6, Lt1/a0;

    iget-wide v8, p0, Lr1/x0;->c:J

    invoke-interface {v6, v8, v9}, Lt1/a0;->p(J)V

    goto :goto_5

    :cond_2
    iget v8, v6, Ly0/n;->c:I

    and-int/2addr v8, v0

    if-eqz v8, :cond_8

    instance-of v8, v6, Lt1/o;

    if-eqz v8, :cond_8

    move-object v8, v6

    check-cast v8, Lt1/o;

    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    const/4 v9, 0x0

    :goto_3
    const/4 v10, 0x1

    if-eqz v8, :cond_7

    iget v11, v8, Ly0/n;->c:I

    and-int/2addr v11, v0

    if-eqz v11, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_3

    move-object v6, v8

    goto :goto_4

    :cond_3
    if-nez v7, :cond_4

    new-instance v7, Lo0/i;

    const/16 v10, 0x10

    new-array v10, v10, [Ly0/n;

    invoke-direct {v7, v10}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v6, :cond_5

    invoke-virtual {v7, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_5
    invoke-virtual {v7, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_7
    if-ne v9, v10, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v7}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v6

    goto :goto_2

    :cond_9
    if-eq v3, v4, :cond_a

    iget-object v3, v3, Ly0/n;->f:Ly0/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_a
    :goto_6
    :try_start_2
    invoke-static {v2}, Lw0/i;->p(Lw0/i;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v1}, Lw0/i;->c()V

    goto :goto_8

    :goto_7
    :try_start_3
    invoke-static {v2}, Lw0/i;->p(Lw0/i;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1}, Lw0/i;->c()V

    throw v0

    :cond_b
    :goto_8
    return-void
.end method

.method public final T0()V
    .locals 10

    const/16 v0, 0x80

    invoke-static {v0}, Lt1/g;->r(I)Z

    move-result v1

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v2

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Ly0/n;->e:Ly0/n;

    if-nez v2, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_a

    iget v3, v1, Ly0/n;->d:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_a

    iget v3, v1, Ly0/n;->c:I

    and-int/2addr v3, v0

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v1

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, Lt1/a0;

    if-eqz v6, :cond_2

    check-cast v4, Lt1/a0;

    invoke-interface {v4, p0}, Lt1/a0;->R(Lt1/c1;)V

    goto :goto_5

    :cond_2
    iget v6, v4, Ly0/n;->c:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_8

    instance-of v6, v4, Lt1/o;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_7

    iget v9, v6, Ly0/n;->c:I

    and-int/2addr v9, v0

    if-eqz v9, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, Lo0/i;

    const/16 v8, 0x10

    new-array v8, v8, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_7
    if-ne v7, v8, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v1, v2, :cond_a

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public abstract U0(Le1/p;)V
.end method

.method public final V0(JFLc9/c;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Lt1/c1;->c1(Lc9/c;Z)V

    iget-wide v0, p0, Lt1/c1;->A:J

    invoke-static {v0, v1, p1, p2}, Lm2/i;->a(JJ)Z

    move-result p4

    if-nez p4, :cond_2

    iput-wide p1, p0, Lt1/c1;->A:J

    iget-object p4, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, p4, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v0}, Lt1/l0;->s0()V

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lt1/j1;->g(J)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lt1/c1;->P0()V

    :cond_1
    :goto_0
    invoke-static {p0}, Lt1/q0;->w0(Lt1/c1;)V

    iget-object p1, p4, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz p1, :cond_2

    check-cast p1, Lu1/w;

    invoke-virtual {p1, p4}, Lu1/w;->v(Landroidx/compose/ui/node/a;)V

    :cond_2
    iput p3, p0, Lt1/c1;->B:F

    return-void
.end method

.method public final W0(Ld1/b;ZZ)V
    .locals 10

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    const-wide v1, 0xffffffffL

    const/16 v3, 0x20

    if-eqz v0, :cond_3

    iget-boolean v4, p0, Lt1/c1;->t:Z

    if-eqz v4, :cond_2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lt1/c1;->J0()J

    move-result-wide p2

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result p2

    div-float/2addr p2, v5

    neg-float p3, v4

    neg-float v5, p2

    iget-wide v6, p0, Lr1/x0;->c:J

    shr-long v8, v6, v3

    long-to-int v8, v8

    int-to-float v8, v8

    add-float/2addr v8, v4

    and-long/2addr v6, v1

    long-to-int v4, v6

    int-to-float v4, v4

    add-float/2addr v4, p2

    invoke-virtual {p1, p3, v5, v8, v4}, Ld1/b;->a(FFFF)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-wide p2, p0, Lr1/x0;->c:J

    shr-long v4, p2, v3

    long-to-int v4, v4

    int-to-float v4, v4

    and-long/2addr p2, v1

    long-to-int p2, p2

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3, v4, p2}, Ld1/b;->a(FFFF)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Ld1/b;->b()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    const/4 p2, 0x0

    invoke-interface {v0, p1, p2}, Lt1/j1;->j(Ld1/b;Z)V

    :cond_3
    iget-wide p2, p0, Lt1/c1;->A:J

    sget v0, Lm2/i;->c:I

    shr-long v3, p2, v3

    long-to-int v0, v3

    iget v3, p1, Ld1/b;->a:F

    int-to-float v0, v0

    add-float/2addr v3, v0

    iput v3, p1, Ld1/b;->a:F

    iget v3, p1, Ld1/b;->c:F

    add-float/2addr v3, v0

    iput v3, p1, Ld1/b;->c:F

    and-long/2addr p2, v1

    long-to-int p2, p2

    iget p3, p1, Ld1/b;->b:F

    int-to-float p2, p2

    add-float/2addr p3, p2

    iput p3, p1, Ld1/b;->b:F

    iget p3, p1, Ld1/b;->d:F

    add-float/2addr p3, p2

    iput p3, p1, Ld1/b;->d:F

    return-void
.end method

.method public final X0(Lr1/k0;)V
    .locals 12

    iget-object v0, p0, Lt1/c1;->y:Lr1/k0;

    if-eq p1, v0, :cond_12

    iput-object p1, p0, Lt1/c1;->y:Lr1/k0;

    iget-object v1, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lr1/k0;->b()I

    move-result v3

    invoke-interface {v0}, Lr1/k0;->b()I

    move-result v4

    if-ne v3, v4, :cond_0

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result v3

    invoke-interface {v0}, Lr1/k0;->a()I

    move-result v0

    if-eq v3, v0, :cond_e

    :cond_0
    invoke-interface {p1}, Lr1/k0;->b()I

    move-result v0

    invoke-interface {p1}, Lr1/k0;->a()I

    move-result v3

    iget-object v4, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v4, :cond_1

    invoke-static {v0, v3}, Lo1/s;->e(II)J

    move-result-wide v5

    invoke-interface {v4, v5, v6}, Lt1/j1;->b(J)V

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lt1/c1;->P0()V

    :cond_2
    :goto_0
    invoke-static {v0, v3}, Lo1/s;->e(II)J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Lr1/x0;->g0(J)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt1/c1;->d1(Z)V

    const/4 v3, 0x4

    invoke-static {v3}, Lt1/g;->r(I)Z

    move-result v4

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v5

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    iget-object v5, v5, Ly0/n;->e:Ly0/n;

    if-nez v5, :cond_4

    goto/16 :goto_7

    :cond_4
    :goto_1
    invoke-virtual {p0, v4}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v4

    :goto_2
    if-eqz v4, :cond_d

    iget v6, v4, Ly0/n;->d:I

    and-int/2addr v6, v3

    if-eqz v6, :cond_d

    iget v6, v4, Ly0/n;->c:I

    and-int/2addr v6, v3

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    move-object v7, v4

    move-object v8, v6

    :goto_3
    if-eqz v7, :cond_c

    instance-of v9, v7, Lt1/s;

    if-eqz v9, :cond_5

    check-cast v7, Lt1/s;

    invoke-interface {v7}, Lt1/s;->j0()V

    goto :goto_6

    :cond_5
    iget v9, v7, Ly0/n;->c:I

    and-int/2addr v9, v3

    if-eqz v9, :cond_b

    instance-of v9, v7, Lt1/o;

    if-eqz v9, :cond_b

    move-object v9, v7

    check-cast v9, Lt1/o;

    iget-object v9, v9, Lt1/o;->v:Ly0/n;

    move v10, v0

    :goto_4
    if-eqz v9, :cond_a

    iget v11, v9, Ly0/n;->c:I

    and-int/2addr v11, v3

    if-eqz v11, :cond_9

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v2, :cond_6

    move-object v7, v9

    goto :goto_5

    :cond_6
    if-nez v8, :cond_7

    new-instance v8, Lo0/i;

    const/16 v11, 0x10

    new-array v11, v11, [Ly0/n;

    invoke-direct {v8, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v7, :cond_8

    invoke-virtual {v8, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v7, v6

    :cond_8
    invoke-virtual {v8, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v9, v9, Ly0/n;->f:Ly0/n;

    goto :goto_4

    :cond_a
    if-ne v10, v2, :cond_b

    goto :goto_3

    :cond_b
    :goto_6
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v7

    goto :goto_3

    :cond_c
    if-eq v4, v5, :cond_d

    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_d
    :goto_7
    iget-object v0, v1, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_e

    check-cast v0, Lu1/w;

    invoke-virtual {v0, v1}, Lu1/w;->v(Landroidx/compose/ui/node/a;)V

    :cond_e
    iget-object v0, p0, Lt1/c1;->z:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_f

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_f
    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_12

    :cond_10
    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lt1/c1;->z:Ljava/util/LinkedHashMap;

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget-object v0, v0, Lt1/l0;->A:Lt1/h0;

    invoke-virtual {v0}, Lt1/a;->g()V

    iget-object v0, p0, Lt1/c1;->z:Ljava/util/LinkedHashMap;

    if-nez v0, :cond_11

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lt1/c1;->z:Ljava/util/LinkedHashMap;

    :cond_11
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-interface {p1}, Lr1/k0;->d()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_12
    return-void
.end method

.method public final Y0(Ly0/n;Lt1/z0;JLt1/v;ZZF)V
    .locals 17

    move-object/from16 v11, p1

    move-object/from16 v12, p5

    move/from16 v13, p7

    move/from16 v14, p8

    if-nez v11, :cond_0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    move-object/from16 v4, p5

    move/from16 v5, p6

    move/from16 v6, p7

    invoke-virtual/range {v0 .. v6}, Lt1/c1;->O0(Lt1/z0;JLt1/v;ZZ)V

    goto/16 :goto_4

    :cond_0
    move-object/from16 v0, p2

    check-cast v0, Lx9/v;

    iget v1, v0, Lx9/v;->a:I

    const/16 v2, 0x10

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const/4 v1, 0x0

    move-object v4, v1

    move-object v3, v11

    :goto_0
    if-eqz v3, :cond_a

    instance-of v5, v3, Lt1/p1;

    if-eqz v5, :cond_3

    check-cast v3, Lt1/p1;

    invoke-interface {v3}, Lt1/p1;->m0()Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v10, Lt1/b1;

    const/16 v16, 0x1

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object v15, v10

    move/from16 v10, v16

    invoke-direct/range {v0 .. v10}, Lt1/b1;-><init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZFI)V

    iget v0, v12, Lt1/v;->c:I

    invoke-static/range {p5 .. p5}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {v12, v11, v14, v13, v15}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    iget v0, v12, Lt1/v;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-static/range {p5 .. p5}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_b

    invoke-virtual/range {p5 .. p5}, Lt1/v;->k()V

    goto/16 :goto_4

    :cond_1
    invoke-virtual/range {p5 .. p5}, Lt1/v;->e()J

    move-result-wide v0

    iget v2, v12, Lt1/v;->c:I

    invoke-static/range {p5 .. p5}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v3

    iput v3, v12, Lt1/v;->c:I

    invoke-virtual {v12, v11, v14, v13, v15}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    iget v3, v12, Lt1/v;->c:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-static/range {p5 .. p5}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v5

    if-ge v3, v5, :cond_2

    invoke-virtual/range {p5 .. p5}, Lt1/v;->e()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Lt1/g;->o(JJ)I

    move-result v0

    if-lez v0, :cond_2

    iget v0, v12, Lt1/v;->c:I

    add-int/2addr v0, v4

    add-int/lit8 v1, v2, 0x1

    iget-object v3, v12, Lt1/v;->a:[Ljava/lang/Object;

    iget v4, v12, Lt1/v;->d:I

    invoke-static {v1, v0, v4, v3, v3}, Lb9/b;->H(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iget-object v3, v12, Lt1/v;->b:[J

    iget v4, v12, Lt1/v;->d:I

    const-string v5, "<this>"

    invoke-static {v3, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sub-int/2addr v4, v0

    invoke-static {v3, v0, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, v12, Lt1/v;->d:I

    add-int/2addr v0, v2

    iget v1, v12, Lt1/v;->c:I

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, v12, Lt1/v;->c:I

    :cond_2
    invoke-virtual/range {p5 .. p5}, Lt1/v;->k()V

    iput v2, v12, Lt1/v;->c:I

    goto :goto_4

    :cond_3
    iget v5, v3, Ly0/n;->c:I

    and-int/2addr v5, v2

    if-eqz v5, :cond_9

    instance-of v5, v3, Lt1/o;

    if-eqz v5, :cond_9

    move-object v5, v3

    check-cast v5, Lt1/o;

    iget-object v5, v5, Lt1/o;->v:Ly0/n;

    const/4 v6, 0x0

    :goto_1
    if-eqz v5, :cond_8

    iget v7, v5, Ly0/n;->c:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_7

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x1

    if-ne v6, v7, :cond_4

    move-object v3, v5

    goto :goto_2

    :cond_4
    if-nez v4, :cond_5

    new-instance v4, Lo0/i;

    new-array v7, v2, [Ly0/n;

    invoke-direct {v4, v7}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v3, :cond_6

    invoke-virtual {v4, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v3, v1

    :cond_6
    invoke-virtual {v4, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_2
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_8
    const/4 v5, 0x1

    if-ne v6, v5, :cond_9

    goto/16 :goto_0

    :cond_9
    invoke-static {v4}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v3

    goto/16 :goto_0

    :cond_a
    :goto_3
    iget v0, v0, Lx9/v;->a:I

    packed-switch v0, :pswitch_data_1

    const/16 v2, 0x8

    :pswitch_1
    invoke-static {v11, v2}, Lt1/g;->e(Lt1/n;I)Ly0/n;

    move-result-object v1

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lt1/c1;->Y0(Ly0/n;Lt1/z0;JLt1/v;ZZF)V

    :cond_b
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final a()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v1, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Lt1/x0;->d(I)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    move-object v1, v3

    :goto_0
    if-eqz v0, :cond_8

    iget v4, v0, Ly0/n;->c:I

    and-int/2addr v4, v2

    if-eqz v4, :cond_7

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_7

    instance-of v6, v4, Lt1/o1;

    if-eqz v6, :cond_0

    check-cast v4, Lt1/o1;

    invoke-interface {v4, v1}, Lt1/o1;->h0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_4

    :cond_0
    iget v6, v4, Ly0/n;->c:I

    and-int/2addr v6, v2

    if-eqz v6, :cond_6

    instance-of v6, v4, Lt1/o;

    if-eqz v6, :cond_6

    move-object v6, v4

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x1

    if-eqz v6, :cond_5

    iget v9, v6, Ly0/n;->c:I

    and-int/2addr v9, v2

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v4, v6

    goto :goto_3

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, Lo0/i;

    const/16 v8, 0x10

    new-array v8, v8, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v5, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_3
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v4

    goto :goto_1

    :cond_7
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_0

    :cond_8
    return-object v1

    :cond_9
    return-object v3
.end method

.method public final a1(J)J
    .locals 5

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lt1/j1;->a(JZ)J

    move-result-wide p1

    :cond_0
    iget-wide v0, p0, Lt1/c1;->A:J

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v2

    sget v3, Lm2/i;->c:I

    const/16 v3, 0x20

    shr-long v3, v0, v3

    long-to-int v3, v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int p2, v0

    int-to-float p2, p2

    add-float/2addr p1, p2

    invoke-static {v2, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final b(Lr1/s;Z)Ld1/d;
    .locals 7

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lr1/s;->L()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lt1/c1;->Z0(Lr1/s;)Lt1/c1;

    move-result-object v0

    invoke-virtual {v0}, Lt1/c1;->R0()V

    invoke-virtual {p0, v0}, Lt1/c1;->G0(Lt1/c1;)Lt1/c1;

    move-result-object v1

    iget-object v2, p0, Lt1/c1;->C:Ld1/b;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance v2, Ld1/b;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput v3, v2, Ld1/b;->a:F

    iput v3, v2, Ld1/b;->b:F

    iput v3, v2, Ld1/b;->c:F

    iput v3, v2, Ld1/b;->d:F

    iput-object v2, p0, Lt1/c1;->C:Ld1/b;

    :cond_0
    iput v3, v2, Ld1/b;->a:F

    iput v3, v2, Ld1/b;->b:F

    invoke-interface {p1}, Lr1/s;->M()J

    move-result-wide v3

    const/16 v5, 0x20

    shr-long/2addr v3, v5

    long-to-int v3, v3

    int-to-float v3, v3

    iput v3, v2, Ld1/b;->c:F

    invoke-interface {p1}, Lr1/s;->M()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p1, v3

    int-to-float p1, p1

    iput p1, v2, Ld1/b;->d:F

    :goto_0
    if-eq v0, v1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {v0, v2, p2, p1}, Lt1/c1;->W0(Ld1/b;ZZ)V

    invoke-virtual {v2}, Ld1/b;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ld1/d;->e:Ld1/d;

    return-object p1

    :cond_1
    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1, v2, p2}, Lt1/c1;->y0(Lt1/c1;Ld1/b;Z)V

    new-instance p1, Ld1/d;

    iget p2, v2, Ld1/b;->a:F

    iget v0, v2, Ld1/b;->b:F

    iget v1, v2, Ld1/b;->c:F

    iget v2, v2, Ld1/b;->d:F

    invoke-direct {p1, p2, v0, v1, v2}, Ld1/d;-><init>(FFFF)V

    return-object p1

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "LayoutCoordinates "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not attached!"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b1(Lt1/c1;[F)V
    .locals 5

    invoke-static {p1, p0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt1/c1;->r:Lt1/c1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lt1/c1;->b1(Lt1/c1;[F)V

    iget-wide v0, p0, Lt1/c1;->A:J

    sget-wide v2, Lm2/i;->b:J

    invoke-static {v0, v1, v2, v3}, Lm2/i;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lt1/c1;->K:[F

    invoke-static {p1}, Le1/a0;->c([F)V

    iget-wide v0, p0, Lt1/c1;->A:J

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-float v2, v2

    neg-float v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    neg-float v0, v0

    invoke-static {p1, v2, v0}, Le1/a0;->e([FFF)V

    invoke-static {p2, p1}, Le1/a0;->d([F[F)V

    :cond_0
    iget-object p1, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Lt1/j1;->d([F)V

    :cond_1
    return-void
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final c1(Lc9/c;Z)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    if-nez p2, :cond_1

    iget-object p2, p0, Lt1/c1;->u:Lc9/c;

    if-ne p2, p1, :cond_1

    iget-object p2, p0, Lt1/c1;->v:Lm2/b;

    iget-object v3, v2, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-static {p2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lt1/c1;->w:Lm2/l;

    iget-object v3, v2, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-eq p2, v3, :cond_0

    goto :goto_0

    :cond_0
    move p2, v1

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v0

    :goto_1
    iput-object p1, p0, Lt1/c1;->u:Lc9/c;

    iget-object v3, v2, Landroidx/compose/ui/node/a;->x:Lm2/b;

    iput-object v3, p0, Lt1/c1;->v:Lm2/b;

    iget-object v3, v2, Landroidx/compose/ui/node/a;->y:Lm2/l;

    iput-object v3, p0, Lt1/c1;->w:Lm2/l;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->C()Z

    move-result v3

    iget-object v4, p0, Lt1/c1;->F:Lt/l0;

    const/4 v5, 0x0

    if-eqz v3, :cond_c

    if-eqz p1, :cond_c

    iget-object p1, p0, Lt1/c1;->H:Lt1/j1;

    if-nez p1, :cond_b

    invoke-static {v2}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object p1

    check-cast p1, Lu1/w;

    :cond_2
    iget-object p2, p1, Lu1/w;->t0:Lu1/f3;

    iget-object v3, p2, Lu1/f3;->b:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v3}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v3

    iget-object p2, p2, Lu1/f3;->a:Lo0/i;

    if-eqz v3, :cond_3

    invoke-virtual {p2, v3}, Lo0/i;->m(Ljava/lang/Object;)Z

    :cond_3
    if-nez v3, :cond_2

    :cond_4
    invoke-virtual {p2}, Lo0/i;->l()Z

    move-result v3

    if-eqz v3, :cond_5

    iget v3, p2, Lo0/i;->c:I

    sub-int/2addr v3, v0

    invoke-virtual {p2, v3}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    move-object v5, v3

    :cond_5
    check-cast v5, Lt1/j1;

    iget-object p2, p0, Lt1/c1;->E:Lh1/b;

    if-eqz v5, :cond_6

    invoke-interface {v5, v4, p2}, Lt1/j1;->i(Lt/l0;Lh1/b;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-boolean v3, p1, Lu1/w;->V:Z

    if-eqz v3, :cond_7

    :try_start_0
    new-instance v5, Lu1/o2;

    invoke-direct {v5, p1, p2, v4}, Lu1/o2;-><init>(Lu1/w;Lh1/b;Lt/l0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    iput-boolean v1, p1, Lu1/w;->V:Z

    :cond_7
    iget-object v1, p1, Lu1/w;->I:Lu1/z1;

    if-nez v1, :cond_a

    sget-boolean v1, Lu1/b3;->z:Z

    if-nez v1, :cond_8

    new-instance v1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lk1/b;->b(Landroid/view/View;)V

    :cond_8
    sget-boolean v1, Lu1/b3;->A:Z

    if-eqz v1, :cond_9

    new-instance v1, Lu1/z1;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Lu1/z1;-><init>(Landroid/content/Context;)V

    goto :goto_2

    :cond_9
    new-instance v1, Lu1/c3;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Lu1/z1;-><init>(Landroid/content/Context;)V

    :goto_2
    iput-object v1, p1, Lu1/w;->I:Lu1/z1;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_a
    new-instance v5, Lu1/b3;

    iget-object v1, p1, Lu1/w;->I:Lu1/z1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-direct {v5, p1, v1, p2, v4}, Lu1/b3;-><init>(Lu1/w;Lu1/z1;Lh1/b;Lt/l0;)V

    :goto_3
    iget-wide p1, p0, Lr1/x0;->c:J

    invoke-interface {v5, p1, p2}, Lt1/j1;->b(J)V

    iget-wide p1, p0, Lt1/c1;->A:J

    invoke-interface {v5, p1, p2}, Lt1/j1;->g(J)V

    iput-object v5, p0, Lt1/c1;->H:Lt1/j1;

    invoke-virtual {p0, v0}, Lt1/c1;->d1(Z)V

    iput-boolean v0, v2, Landroidx/compose/ui/node/a;->G:Z

    invoke-virtual {v4}, Lt/l0;->invoke()Ljava/lang/Object;

    goto :goto_4

    :cond_b
    if-eqz p2, :cond_e

    invoke-virtual {p0, v0}, Lt1/c1;->d1(Z)V

    goto :goto_4

    :cond_c
    iget-object p1, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz p1, :cond_d

    invoke-interface {p1}, Lt1/j1;->f()V

    iput-boolean v0, v2, Landroidx/compose/ui/node/a;->G:Z

    invoke-virtual {v4}, Lt/l0;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object p1

    iget-boolean p1, p1, Ly0/n;->t:Z

    if-eqz p1, :cond_d

    iget-object p1, v2, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz p1, :cond_d

    check-cast p1, Lu1/w;

    invoke-virtual {p1, v2}, Lu1/w;->v(Landroidx/compose/ui/node/a;)V

    :cond_d
    iput-object v5, p0, Lt1/c1;->H:Lt1/j1;

    iput-boolean v1, p0, Lt1/c1;->G:Z

    :cond_e
    :goto_4
    return-void
.end method

.method public final d1(Z)V
    .locals 9

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_f

    iget-object v1, p0, Lt1/c1;->u:Lc9/c;

    if-eqz v1, :cond_e

    sget-object v2, Lt1/c1;->I:Le1/i0;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Le1/i0;->b(F)V

    invoke-virtual {v2, v3}, Le1/i0;->d(F)V

    invoke-virtual {v2, v3}, Le1/i0;->a(F)V

    iget v3, v2, Le1/i0;->e:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    iget v3, v2, Le1/i0;->a:I

    or-int/lit8 v3, v3, 0x8

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->e:F

    :goto_0
    iget v3, v2, Le1/i0;->f:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    iget v3, v2, Le1/i0;->a:I

    or-int/lit8 v3, v3, 0x10

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->f:F

    :goto_1
    iget v3, v2, Le1/i0;->n:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    iget v3, v2, Le1/i0;->a:I

    or-int/lit8 v3, v3, 0x20

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->n:F

    :goto_2
    sget-wide v5, Le1/x;->a:J

    iget-wide v7, v2, Le1/i0;->o:J

    invoke-static {v7, v8, v5, v6}, Le1/r;->c(JJ)Z

    move-result v3

    if-nez v3, :cond_3

    iget v3, v2, Le1/i0;->a:I

    or-int/lit8 v3, v3, 0x40

    iput v3, v2, Le1/i0;->a:I

    iput-wide v5, v2, Le1/i0;->o:J

    :cond_3
    iget-wide v7, v2, Le1/i0;->p:J

    invoke-static {v7, v8, v5, v6}, Le1/r;->c(JJ)Z

    move-result v3

    if-nez v3, :cond_4

    iget v3, v2, Le1/i0;->a:I

    or-int/lit16 v3, v3, 0x80

    iput v3, v2, Le1/i0;->a:I

    iput-wide v5, v2, Le1/i0;->p:J

    :cond_4
    iget v3, v2, Le1/i0;->q:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    iget v3, v2, Le1/i0;->a:I

    or-int/lit16 v3, v3, 0x100

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->q:F

    :goto_3
    iget v3, v2, Le1/i0;->r:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    iget v3, v2, Le1/i0;->a:I

    or-int/lit16 v3, v3, 0x200

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->r:F

    :goto_4
    iget v3, v2, Le1/i0;->s:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    iget v3, v2, Le1/i0;->a:I

    or-int/lit16 v3, v3, 0x400

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->s:F

    :goto_5
    iget v3, v2, Le1/i0;->t:F

    const/high16 v4, 0x41000000    # 8.0f

    cmpg-float v3, v3, v4

    if-nez v3, :cond_8

    goto :goto_6

    :cond_8
    iget v3, v2, Le1/i0;->a:I

    or-int/lit16 v3, v3, 0x800

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->t:F

    :goto_6
    sget-wide v3, Le1/p0;->b:J

    invoke-virtual {v2, v3, v4}, Le1/i0;->f(J)V

    sget-object v3, Le1/g0;->a:Le1/f0;

    iget-object v4, v2, Le1/i0;->v:Le1/l0;

    invoke-static {v4, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    iget v4, v2, Le1/i0;->a:I

    or-int/lit16 v4, v4, 0x2000

    iput v4, v2, Le1/i0;->a:I

    iput-object v3, v2, Le1/i0;->v:Le1/l0;

    :cond_9
    iget-boolean v3, v2, Le1/i0;->w:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_a

    iget v3, v2, Le1/i0;->a:I

    or-int/lit16 v3, v3, 0x4000

    iput v3, v2, Le1/i0;->a:I

    iput-boolean v4, v2, Le1/i0;->w:Z

    :cond_a
    const/4 v3, 0x0

    invoke-static {v3, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    iget v3, v2, Le1/i0;->a:I

    const/high16 v5, 0x20000

    or-int/2addr v3, v5

    iput v3, v2, Le1/i0;->a:I

    :cond_b
    iget v3, v2, Le1/i0;->x:I

    invoke-static {v3, v4}, Le1/g0;->c(II)Z

    move-result v3

    if-nez v3, :cond_c

    iget v3, v2, Le1/i0;->a:I

    const v5, 0x8000

    or-int/2addr v3, v5

    iput v3, v2, Le1/i0;->a:I

    iput v4, v2, Le1/i0;->x:I

    :cond_c
    sget v3, Ld1/f;->d:I

    iput v4, v2, Le1/i0;->a:I

    iget-object v3, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v4, v3, Landroidx/compose/ui/node/a;->x:Lm2/b;

    iput-object v4, v2, Le1/i0;->y:Lm2/b;

    iget-wide v4, p0, Lr1/x0;->c:J

    invoke-static {v4, v5}, Lo1/s;->m0(J)J

    invoke-static {v3}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v4

    check-cast v4, Lu1/w;

    invoke-virtual {v4}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v4

    sget-object v5, Lt1/f;->q:Lt1/f;

    new-instance v6, Lt/l0;

    const/16 v7, 0x1d

    invoke-direct {v6, v1, v7}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p0, v5, v6}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    iget-object v1, p0, Lt1/c1;->D:Lt1/z;

    if-nez v1, :cond_d

    new-instance v1, Lt1/z;

    invoke-direct {v1}, Lt1/z;-><init>()V

    iput-object v1, p0, Lt1/c1;->D:Lt1/z;

    :cond_d
    iget v4, v2, Le1/i0;->b:F

    iput v4, v1, Lt1/z;->a:F

    iget v4, v2, Le1/i0;->c:F

    iput v4, v1, Lt1/z;->b:F

    iget v4, v2, Le1/i0;->e:F

    iput v4, v1, Lt1/z;->c:F

    iget v4, v2, Le1/i0;->f:F

    iput v4, v1, Lt1/z;->d:F

    iget v4, v2, Le1/i0;->q:F

    iput v4, v1, Lt1/z;->e:F

    iget v4, v2, Le1/i0;->r:F

    iput v4, v1, Lt1/z;->f:F

    iget v4, v2, Le1/i0;->s:F

    iput v4, v1, Lt1/z;->g:F

    iget v4, v2, Le1/i0;->t:F

    iput v4, v1, Lt1/z;->h:F

    iget-wide v4, v2, Le1/i0;->u:J

    iput-wide v4, v1, Lt1/z;->i:J

    iget-object v1, v3, Landroidx/compose/ui/node/a;->y:Lm2/l;

    iget-object v4, v3, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-interface {v0, v2, v1, v4}, Lt1/j1;->e(Le1/i0;Lm2/l;Lm2/b;)V

    iget-boolean v0, v2, Le1/i0;->w:Z

    iput-boolean v0, p0, Lt1/c1;->t:Z

    iget v0, v2, Le1/i0;->d:F

    iput v0, p0, Lt1/c1;->x:F

    if-eqz p1, :cond_10

    iget-object p1, v3, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz p1, :cond_10

    check-cast p1, Lu1/w;

    invoke-virtual {p1, v3}, Lu1/w;->v(Landroidx/compose/ui/node/a;)V

    goto :goto_7

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "updateLayerParameters requires a non-null layerBlock"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    iget-object p1, p0, Lt1/c1;->u:Lc9/c;

    if-nez p1, :cond_11

    :cond_10
    :goto_7
    return-void

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "null layer with a non-null layerBlock"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->y:Lm2/l;

    return-object v0
.end method

.method public final h(J)J
    .locals 3

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/layout/a;->d(Lr1/s;)Lr1/s;

    move-result-object v0

    iget-object v1, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-static {v1}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->y()V

    iget-object v1, v1, Lu1/w;->R:[F

    invoke-static {v1, p1, p2}, Le1/a0;->a([FJ)J

    move-result-wide p1

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->k(Lr1/s;)J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, Ld1/c;->f(JJ)J

    move-result-wide p1

    invoke-virtual {p0, v0, p1, p2}, Lt1/c1;->o(Lr1/s;J)J

    move-result-wide p1

    return-wide p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(J)J
    .locals 1

    invoke-virtual {p0, p1, p2}, Lt1/c1;->P(J)J

    move-result-wide p1

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-static {v0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->y()V

    iget-object v0, v0, Lu1/w;->Q:[F

    invoke-static {v0, p1, p2}, Le1/a0;->a([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final j()Lr1/s;
    .locals 2

    invoke-virtual {p0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v0

    iget-boolean v0, v0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lt1/c1;->R0()V

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->c:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LayoutCoordinate operations are only valid when isAttached is true"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method

.method public final m0()Lt1/q0;
    .locals 1

    iget-object v0, p0, Lt1/c1;->q:Lt1/c1;

    return-object v0
.end method

.method public final o(Lr1/s;J)J
    .locals 1

    instance-of v0, p1, Lr1/h0;

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v0

    neg-float v0, v0

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result p2

    neg-float p2, p2

    invoke-static {v0, p2}, Ld9/i;->f(FF)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lr1/s;->o(Lr1/s;J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p3

    neg-float p3, p3

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    neg-float p1, p1

    invoke-static {p3, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-static {p1}, Lt1/c1;->Z0(Lr1/s;)Lt1/c1;

    move-result-object p1

    invoke-virtual {p1}, Lt1/c1;->R0()V

    invoke-virtual {p0, p1}, Lt1/c1;->G0(Lt1/c1;)Lt1/c1;

    move-result-object v0

    :goto_0
    if-eq p1, v0, :cond_1

    invoke-virtual {p1, p2, p3}, Lt1/c1;->a1(J)J

    move-result-wide p2

    iget-object p1, p1, Lt1/c1;->r:Lt1/c1;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0, p2, p3}, Lt1/c1;->z0(Lt1/c1;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final r0()Z
    .locals 1

    iget-object v0, p0, Lt1/c1;->y:Lr1/k0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final s0()Lr1/k0;
    .locals 2

    iget-object v0, p0, Lt1/c1;->y:Lr1/k0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v0()J
    .locals 2

    iget-wide v0, p0, Lt1/c1;->A:J

    return-wide v0
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lt1/c1;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final x(Lr1/s;[F)V
    .locals 7

    invoke-static {p1}, Lt1/c1;->Z0(Lr1/s;)Lt1/c1;

    move-result-object p1

    invoke-virtual {p1}, Lt1/c1;->R0()V

    invoke-virtual {p0, p1}, Lt1/c1;->G0(Lt1/c1;)Lt1/c1;

    move-result-object v0

    invoke-static {p2}, Le1/a0;->c([F)V

    :goto_0
    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p1, Lt1/c1;->H:Lt1/j1;

    if-eqz v1, :cond_0

    invoke-interface {v1, p2}, Lt1/j1;->c([F)V

    :cond_0
    iget-wide v1, p1, Lt1/c1;->A:J

    sget-wide v3, Lm2/i;->b:J

    invoke-static {v1, v2, v3, v4}, Lm2/i;->a(JJ)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lt1/c1;->K:[F

    invoke-static {v3}, Le1/a0;->c([F)V

    const/16 v4, 0x20

    shr-long v4, v1, v4

    long-to-int v4, v4

    int-to-float v4, v4

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    long-to-int v1, v1

    int-to-float v1, v1

    invoke-static {v3, v4, v1}, Le1/a0;->e([FFF)V

    invoke-static {p2, v3}, Le1/a0;->d([F[F)V

    :cond_1
    iget-object p1, p1, Lt1/c1;->r:Lt1/c1;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, p2}, Lt1/c1;->b1(Lt1/c1;[F)V

    return-void
.end method

.method public final x0()V
    .locals 4

    iget-wide v0, p0, Lt1/c1;->A:J

    iget v2, p0, Lt1/c1;->B:F

    iget-object v3, p0, Lt1/c1;->u:Lc9/c;

    invoke-virtual {p0, v0, v1, v2, v3}, Lr1/x0;->d0(JFLc9/c;)V

    return-void
.end method

.method public final y0(Lt1/c1;Ld1/b;Z)V
    .locals 6

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lt1/c1;->y0(Lt1/c1;Ld1/b;Z)V

    :cond_1
    iget-wide v0, p0, Lt1/c1;->A:J

    sget p1, Lm2/i;->c:I

    const/16 p1, 0x20

    shr-long v2, v0, p1

    long-to-int v2, v2

    iget v3, p2, Ld1/b;->a:F

    int-to-float v2, v2

    sub-float/2addr v3, v2

    iput v3, p2, Ld1/b;->a:F

    iget v3, p2, Ld1/b;->c:F

    sub-float/2addr v3, v2

    iput v3, p2, Ld1/b;->c:F

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    iget v1, p2, Ld1/b;->b:F

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iput v1, p2, Ld1/b;->b:F

    iget v1, p2, Ld1/b;->d:F

    sub-float/2addr v1, v0

    iput v1, p2, Ld1/b;->d:F

    iget-object v0, p0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    invoke-interface {v0, p2, v1}, Lt1/j1;->j(Ld1/b;Z)V

    iget-boolean v0, p0, Lt1/c1;->t:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_2

    iget-wide v0, p0, Lr1/x0;->c:J

    shr-long v4, v0, p1

    long-to-int p1, v4

    int-to-float p1, p1

    and-long/2addr v0, v2

    long-to-int p3, v0

    int-to-float p3, p3

    const/4 v0, 0x0

    invoke-virtual {p2, v0, v0, p1, p3}, Ld1/b;->a(FFFF)V

    :cond_2
    return-void
.end method

.method public final z0(Lt1/c1;J)J
    .locals 2

    if-ne p1, p0, :cond_0

    return-wide p2

    :cond_0
    iget-object v0, p0, Lt1/c1;->r:Lt1/c1;

    if-eqz v0, :cond_2

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lt1/c1;->z0(Lt1/c1;J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lt1/c1;->H0(J)J

    move-result-wide p1

    return-wide p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lt1/c1;->H0(J)J

    move-result-wide p1

    return-wide p1
.end method
