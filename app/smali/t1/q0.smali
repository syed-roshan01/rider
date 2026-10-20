.class public abstract Lt1/q0;
.super Lr1/x0;

# interfaces
.implements Lr1/l0;


# instance fields
.field public f:Z

.field public n:Z

.field public final o:Lr1/g0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lr1/x0;-><init>()V

    new-instance v0, Lr1/g0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr1/g0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lt1/q0;->o:Lr1/g0;

    return-void
.end method

.method public static w0(Lt1/c1;)V
    .locals 1

    iget-object v0, p0, Lt1/c1;->q:Lt1/c1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p0, p0, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    invoke-static {v0, p0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p0, p0, Lt1/n0;->o:Lt1/l0;

    iget-object p0, p0, Lt1/l0;->A:Lt1/h0;

    invoke-virtual {p0}, Lt1/a;->g()V

    goto :goto_1

    :cond_1
    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p0, p0, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {p0}, Lt1/l0;->y()Lt1/b;

    move-result-object p0

    if-eqz p0, :cond_2

    check-cast p0, Lt1/l0;

    iget-object p0, p0, Lt1/l0;->A:Lt1/h0;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lt1/a;->g()V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final N(IILjava/util/Map;Lc9/c;)Lr1/k0;
    .locals 7

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    new-instance v0, Lt1/p0;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lt1/p0;-><init>(IILjava/util/Map;Lc9/c;Lt1/q0;)V

    return-object v0

    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Size("

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " x "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public abstract j0(Lr1/a;)I
.end method

.method public abstract m0()Lt1/q0;
.end method

.method public final p(Lr1/a;)I
    .locals 4

    invoke-virtual {p0}, Lt1/q0;->r0()Z

    move-result v0

    const/high16 v1, -0x80000000

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lt1/q0;->j0(Lr1/a;)I

    move-result p1

    if-ne p1, v1, :cond_1

    return v1

    :cond_1
    iget-wide v0, p0, Lr1/x0;->e:J

    sget v2, Lm2/i;->c:I

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    add-int/2addr p1, v0

    return p1
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract r0()Z
.end method

.method public abstract s0()Lr1/k0;
.end method

.method public abstract v0()J
.end method

.method public abstract x0()V
.end method
