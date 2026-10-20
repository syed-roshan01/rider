.class public final Lu/q0;
.super Lt1/o;

# interfaces
.implements Lc1/c;
.implements Lt1/a0;
.implements Lt1/r1;
.implements Lt1/t;


# instance fields
.field public final A:Lu/w0;

.field public final B:Lc0/f;

.field public final C:Lc0/g;

.field public w:Lc1/o;

.field public final x:Lu/t0;

.field public final y:Lu/o0;

.field public final z:Lu/s0;


# direct methods
.method public constructor <init>(Lx/m;)V
    .locals 2

    invoke-direct {p0}, Lt1/o;-><init>()V

    new-instance v0, Lu/t0;

    invoke-direct {v0}, Ly0/n;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0, v0}, Lt1/o;->G0(Ly0/n;)V

    iput-object v0, p0, Lu/q0;->x:Lu/t0;

    new-instance v0, Lu/o0;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iput-object p1, v0, Lu/o0;->u:Lx/m;

    invoke-virtual {p0, v0}, Lt1/o;->G0(Ly0/n;)V

    iput-object v0, p0, Lu/q0;->y:Lu/o0;

    new-instance p1, Lu/s0;

    invoke-direct {p1}, Ly0/n;-><init>()V

    invoke-virtual {p0, p1}, Lt1/o;->G0(Ly0/n;)V

    iput-object p1, p0, Lu/q0;->z:Lu/s0;

    new-instance p1, Lu/w0;

    invoke-direct {p1}, Ly0/n;-><init>()V

    invoke-virtual {p0, p1}, Lt1/o;->G0(Ly0/n;)V

    iput-object p1, p0, Lu/q0;->A:Lu/w0;

    new-instance p1, Lc0/f;

    invoke-direct {p1}, Lc0/f;-><init>()V

    iput-object p1, p0, Lu/q0;->B:Lc0/f;

    new-instance v0, Lc0/g;

    invoke-direct {v0, p1}, Lc0/g;-><init>(Lc0/f;)V

    invoke-virtual {p0, v0}, Lt1/o;->G0(Ly0/n;)V

    iput-object v0, p0, Lu/q0;->C:Lc0/g;

    return-void
.end method


# virtual methods
.method public final Q(Ly1/j;)V
    .locals 1

    iget-object v0, p0, Lu/q0;->x:Lu/t0;

    invoke-virtual {v0, p1}, Lu/t0;->Q(Ly1/j;)V

    return-void
.end method

.method public final R(Lt1/c1;)V
    .locals 1

    iget-object v0, p0, Lu/q0;->C:Lc0/g;

    iput-object p1, v0, Lc0/a;->v:Lr1/s;

    return-void
.end method

.method public final a0(Lc1/o;)V
    .locals 7

    iget-object v0, p0, Lu/q0;->w:Lc1/o;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p1}, Lc1/o;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly0/n;->v0()Lm9/d0;

    move-result-object v3

    new-instance v4, Lu/p0;

    invoke-direct {v4, p0, v2}, Lu/p0;-><init>(Lu/q0;Lu8/e;)V

    const/4 v5, 0x3

    invoke-static {v3, v2, v1, v4, v5}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :cond_0
    iget-boolean v3, p0, Ly0/n;->t:Z

    if-eqz v3, :cond_1

    invoke-static {p0}, Lt1/g;->u(Lt1/r1;)V

    :cond_1
    iget-object v3, p0, Lu/q0;->y:Lu/o0;

    iget-object v4, v3, Lu/o0;->u:Lx/m;

    if-eqz v4, :cond_4

    if-eqz v0, :cond_3

    iget-object v5, v3, Lu/o0;->v:Lx/d;

    if-eqz v5, :cond_2

    new-instance v6, Lx/e;

    invoke-direct {v6, v5}, Lx/e;-><init>(Lx/d;)V

    invoke-virtual {v3, v4, v6}, Lu/o0;->G0(Lx/m;Lx/k;)V

    iput-object v2, v3, Lu/o0;->v:Lx/d;

    :cond_2
    new-instance v5, Lx/d;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v4, v5}, Lu/o0;->G0(Lx/m;Lx/k;)V

    iput-object v5, v3, Lu/o0;->v:Lx/d;

    goto :goto_0

    :cond_3
    iget-object v5, v3, Lu/o0;->v:Lx/d;

    if-eqz v5, :cond_4

    new-instance v6, Lx/e;

    invoke-direct {v6, v5}, Lx/e;-><init>(Lx/d;)V

    invoke-virtual {v3, v4, v6}, Lu/o0;->G0(Lx/m;Lx/k;)V

    iput-object v2, v3, Lu/o0;->v:Lx/d;

    :cond_4
    :goto_0
    iget-object v3, p0, Lu/q0;->A:Lu/w0;

    iget-boolean v4, v3, Lu/w0;->u:Z

    if-ne v0, v4, :cond_5

    goto :goto_4

    :cond_5
    if-nez v0, :cond_7

    iget-boolean v4, v3, Ly0/n;->t:Z

    if-eqz v4, :cond_6

    sget-object v4, Lu/v0;->a:Ls1/i;

    invoke-interface {v3, v4}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc9/c;

    goto :goto_1

    :cond_6
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_9

    invoke-interface {v4, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    iget-object v4, v3, Lu/w0;->v:Lr1/s;

    if-eqz v4, :cond_9

    invoke-interface {v4}, Lr1/s;->L()Z

    move-result v4

    if-eqz v4, :cond_9

    iget-boolean v4, v3, Ly0/n;->t:Z

    if-eqz v4, :cond_8

    sget-object v4, Lu/v0;->a:Ls1/i;

    invoke-interface {v3, v4}, Ls1/f;->g(Ls1/i;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc9/c;

    goto :goto_2

    :cond_8
    move-object v4, v2

    :goto_2
    if-eqz v4, :cond_9

    iget-object v5, v3, Lu/w0;->v:Lr1/s;

    invoke-interface {v4, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_3
    iput-boolean v0, v3, Lu/w0;->u:Z

    :goto_4
    iget-object v3, p0, Lu/q0;->z:Lu/s0;

    if-eqz v0, :cond_b

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ld9/u;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lu/r0;

    invoke-direct {v5, v1, v4, v3}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Lt1/g;->w(Ly0/n;Lc9/a;)V

    iget-object v1, v4, Ld9/u;->a:Ljava/lang/Object;

    check-cast v1, La0/z;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, La0/z;->a()La0/z;

    move-object v2, v1

    :cond_a
    iput-object v2, v3, Lu/s0;->u:La0/z;

    goto :goto_5

    :cond_b
    iget-object v1, v3, Lu/s0;->u:La0/z;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, La0/z;->b()V

    :cond_c
    iput-object v2, v3, Lu/s0;->u:La0/z;

    :goto_5
    iput-boolean v0, v3, Lu/s0;->v:Z

    iget-object v1, p0, Lu/q0;->x:Lu/t0;

    iput-boolean v0, v1, Lu/t0;->u:Z

    iput-object p1, p0, Lu/q0;->w:Lc1/o;

    :cond_d
    return-void
.end method

.method public final r0(Lt1/c1;)V
    .locals 1

    iget-object v0, p0, Lu/q0;->A:Lu/w0;

    invoke-virtual {v0, p1}, Lu/w0;->r0(Lt1/c1;)V

    return-void
.end method
