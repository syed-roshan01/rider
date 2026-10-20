.class public final Lc0/m;
.super Lc0/a;

# interfaces
.implements Lc0/d;


# instance fields
.field public final w:Lc0/h;

.field public final x:Ls1/j;


# direct methods
.method public constructor <init>(Lv/s;)V
    .locals 1

    invoke-direct {p0}, Lc0/a;-><init>()V

    iput-object p1, p0, Lc0/m;->w:Lc0/h;

    sget-object p1, Lc0/c;->a:Ls1/i;

    new-instance v0, Ls1/j;

    invoke-direct {v0, p1}, Ls1/j;-><init>(Ls1/c;)V

    iget-object p1, v0, Ls1/j;->A:Lm0/n1;

    invoke-virtual {p1, p0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iput-object v0, p0, Lc0/m;->x:Ls1/j;

    return-void
.end method

.method public static final H0(Lc0/m;Lr1/s;Lc9/a;)Ld1/d;
    .locals 2

    invoke-virtual {p0}, Lc0/a;->G0()Lr1/s;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lr1/s;->L()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld1/d;

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lr1/s;->b(Lr1/s;Z)Ld1/d;

    move-result-object p0

    iget p1, p0, Ld1/d;->a:F

    iget p0, p0, Ld1/d;->b:F

    invoke-static {p1, p0}, Ld9/i;->f(FF)J

    move-result-wide p0

    invoke-virtual {p2, p0, p1}, Ld1/d;->g(J)Ld1/d;

    move-result-object v0

    :goto_1
    return-object v0
.end method


# virtual methods
.method public final j()Lf6/a;
    .locals 1

    iget-object v0, p0, Lc0/m;->x:Ls1/j;

    return-object v0
.end method

.method public final x(Lr1/s;Lc9/a;Lu8/e;)Ljava/lang/Object;
    .locals 7

    new-instance v4, Lz/p;

    const/4 v0, 0x2

    invoke-direct {v4, p0, p1, p2, v0}, Lz/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v6, Lc0/l;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lc0/l;-><init>(Lc0/m;Lr1/s;Lc9/a;Lc9/a;Lu8/e;)V

    invoke-static {v6, p3}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
