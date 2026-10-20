.class public final Ln8/k;
.super Le8/p;


# instance fields
.field public final synthetic y:Le8/p;

.field public final synthetic z:Ln8/m;


# direct methods
.method public constructor <init>(Ln8/m;Le8/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/k;->z:Ln8/m;

    iput-object p2, p0, Ln8/k;->y:Le8/p;

    return-void
.end method


# virtual methods
.method public final I(I)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1}, Lo7/d0;->I(I)V

    return-void
.end method

.method public final J(JI)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1, p2, p3}, Lo7/d0;->J(JI)V

    return-void
.end method

.method public final K(J)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1, p2}, Lo7/d0;->K(J)V

    return-void
.end method

.method public final L(J)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1, p2}, Lo7/d0;->L(J)V

    return-void
.end method

.method public final c0(I)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1}, Lo7/d0;->c0(I)V

    return-void
.end method

.method public final d0(JJI)V
    .locals 6

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo7/d0;->d0(JJI)V

    return-void
.end method

.method public final e0(J)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1, p2}, Lo7/d0;->e0(J)V

    return-void
.end method

.method public final f0(J)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1, p2}, Lo7/d0;->f0(J)V

    return-void
.end method

.method public final j0(Le8/c2;)V
    .locals 2

    iget-object v0, p0, Ln8/k;->z:Ln8/m;

    iget-object v0, v0, Ln8/m;->a:Ln8/g;

    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result v1

    invoke-virtual {v0, v1}, Ln8/g;->d(Z)V

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1}, Lo7/d0;->j0(Le8/c2;)V

    return-void
.end method

.method public final o0()V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0}, Le8/p;->o0()V

    return-void
.end method

.method public final p0()V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0}, Le8/p;->p0()V

    return-void
.end method

.method public final q0(Le8/l1;)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1}, Le8/p;->q0(Le8/l1;)V

    return-void
.end method

.method public final r0()V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0}, Le8/p;->r0()V

    return-void
.end method

.method public final s0(Le8/c;Le8/l1;)V
    .locals 1

    iget-object v0, p0, Ln8/k;->y:Le8/p;

    invoke-virtual {v0, p1, p2}, Le8/p;->s0(Le8/c;Le8/l1;)V

    return-void
.end method

.method public final t0()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget-object v1, p0, Ln8/k;->y:Le8/p;

    const-string v2, "delegate"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ln8/k;->t0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
