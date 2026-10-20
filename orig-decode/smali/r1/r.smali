.class public final Lr1/r;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/l0;
.implements Lr1/q;


# instance fields
.field public final a:Lm2/l;

.field public final synthetic b:Lr1/q;


# direct methods
.method public constructor <init>(Lr1/q;Lm2/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr1/r;->a:Lm2/l;

    iput-object p1, p0, Lr1/r;->b:Lr1/q;

    return-void
.end method


# virtual methods
.method public final E(J)I
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1, p2}, Lm2/b;->E(J)I

    move-result p1

    return p1
.end method

.method public final F(J)F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1, p2}, Lm2/b;->F(J)F

    move-result p1

    return p1
.end method

.method public final J(F)I
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1}, Lm2/b;->J(F)I

    move-result p1

    return p1
.end method

.method public final N(IILjava/util/Map;Lc9/c;)Lr1/k0;
    .locals 1

    const/4 p4, 0x0

    if-gez p1, :cond_0

    move p1, p4

    :cond_0
    if-gez p2, :cond_1

    move p2, p4

    :cond_1
    const/high16 p4, -0x1000000

    and-int v0, p1, p4

    if-nez v0, :cond_2

    and-int/2addr p4, p2

    if-nez p4, :cond_2

    new-instance p4, Lz/h0;

    invoke-direct {p4, p1, p2, p3}, Lz/h0;-><init>(IILjava/util/Map;)V

    return-object p4

    :cond_2
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

.method public final S(J)J
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1, p2}, Lm2/b;->S(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final Z(J)F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    return p1
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final e0(F)J
    .locals 2

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1}, Lm2/b;->e0(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lr1/r;->a:Lm2/l;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method

.method public final o0(I)F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1}, Lm2/b;->o0(I)F

    move-result p1

    return p1
.end method

.method public final q()Z
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0}, Lr1/q;->q()Z

    move-result v0

    return v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1}, Lm2/b;->q0(F)F

    move-result p1

    return p1
.end method

.method public final t(F)J
    .locals 2

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1}, Lm2/b;->t(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(J)J
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1, p2}, Lm2/b;->u(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final v(F)F
    .locals 1

    iget-object v0, p0, Lr1/r;->b:Lr1/q;

    invoke-interface {v0, p1}, Lm2/b;->v(F)F

    move-result p1

    return p1
.end method
