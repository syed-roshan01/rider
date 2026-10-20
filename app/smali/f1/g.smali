.class public final Lf1/g;
.super Lf1/h;


# instance fields
.field public final h:Lf1/q;

.field public final i:Lf1/q;

.field public final j:[F


# direct methods
.method public constructor <init>(Lf1/q;Lf1/q;I)V
    .locals 10

    const/4 v0, 0x0

    invoke-direct {p0, p2, p1, p2, v0}, Lf1/h;-><init>(Lf1/d;Lf1/d;Lf1/d;[F)V

    iput-object p1, p0, Lf1/g;->h:Lf1/q;

    iput-object p2, p0, Lf1/g;->i:Lf1/q;

    iget-object v0, p2, Lf1/q;->d:Lf1/s;

    iget-object v1, p1, Lf1/q;->d:Lf1/s;

    invoke-static {v1, v0}, Lo7/d0;->p(Lf1/s;Lf1/s;)Z

    move-result v0

    iget-object p1, p1, Lf1/q;->i:[F

    iget-object v2, p2, Lf1/q;->j:[F

    if-eqz v0, :cond_0

    invoke-static {v2, p1}, Lo7/d0;->T([F[F)[F

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lf1/s;->a()[F

    move-result-object v0

    iget-object v3, p2, Lf1/q;->d:Lf1/s;

    invoke-virtual {v3}, Lf1/s;->a()[F

    move-result-object v4

    sget-object v5, Lf1/j;->b:Lf1/s;

    invoke-static {v1, v5}, Lo7/d0;->p(Lf1/s;Lf1/s;)Z

    move-result v1

    sget-object v6, Lf1/j;->e:[F

    sget-object v7, Lf1/b;->b:Lf1/a;

    const-string v8, "copyOf(this, size)"

    iget-object v7, v7, Lf1/b;->a:[F

    const/4 v9, 0x3

    if-nez v1, :cond_1

    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    invoke-static {v1, v8}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v0, v1}, Lo7/d0;->n([F[F[F)[F

    move-result-object v1

    invoke-static {v1, p1}, Lo7/d0;->T([F[F)[F

    move-result-object p1

    :cond_1
    invoke-static {v3, v5}, Lo7/d0;->p(Lf1/s;Lf1/s;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    invoke-static {v1, v8}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v4, v1}, Lo7/d0;->n([F[F[F)[F

    move-result-object v1

    iget-object p2, p2, Lf1/q;->i:[F

    invoke-static {v1, p2}, Lo7/d0;->T([F[F)[F

    move-result-object p2

    invoke-static {p2}, Lo7/d0;->O([F)[F

    move-result-object v2

    :cond_2
    if-ne p3, v9, :cond_3

    new-array p2, v9, [F

    const/4 p3, 0x0

    aget v1, v0, p3

    aget v3, v4, p3

    div-float/2addr v1, v3

    aput v1, p2, p3

    const/4 p3, 0x1

    aget v1, v0, p3

    aget v3, v4, p3

    div-float/2addr v1, v3

    aput v1, p2, p3

    const/4 p3, 0x2

    aget v0, v0, p3

    aget v1, v4, p3

    div-float/2addr v0, v1

    aput v0, p2, p3

    invoke-static {p2, p1}, Lo7/d0;->U([F[F)[F

    move-result-object p1

    :cond_3
    invoke-static {v2, p1}, Lo7/d0;->T([F[F)[F

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lf1/g;->j:[F

    return-void
.end method


# virtual methods
.method public final a(FFFF)J
    .locals 5

    iget-object v0, p0, Lf1/g;->h:Lf1/q;

    iget-object v1, v0, Lf1/q;->p:Lf1/m;

    float-to-double v2, p1

    invoke-virtual {v1, v2, v3}, Lf1/m;->b(D)D

    move-result-wide v1

    double-to-float p1, v1

    float-to-double v1, p2

    iget-object p2, v0, Lf1/q;->p:Lf1/m;

    invoke-virtual {p2, v1, v2}, Lf1/m;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v1, p3

    invoke-virtual {p2, v1, v2}, Lf1/m;->b(D)D

    move-result-wide p2

    double-to-float p2, p2

    iget-object p3, p0, Lf1/g;->j:[F

    invoke-static {p3, p1, v0, p2}, Lo7/d0;->W([FFFF)F

    move-result v1

    invoke-static {p3, p1, v0, p2}, Lo7/d0;->X([FFFF)F

    move-result v2

    invoke-static {p3, p1, v0, p2}, Lo7/d0;->Y([FFFF)F

    move-result p1

    iget-object p2, p0, Lf1/g;->i:Lf1/q;

    iget-object p3, p2, Lf1/q;->m:Lf1/m;

    float-to-double v0, v1

    invoke-virtual {p3, v0, v1}, Lf1/m;->b(D)D

    move-result-wide v0

    double-to-float p3, v0

    float-to-double v0, v2

    iget-object v2, p2, Lf1/q;->m:Lf1/m;

    invoke-virtual {v2, v0, v1}, Lf1/m;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v3, p1

    invoke-virtual {v2, v3, v4}, Lf1/m;->b(D)D

    move-result-wide v1

    double-to-float p1, v1

    invoke-static {p3, v0, p1, p4, p2}, Landroidx/compose/ui/graphics/a;->a(FFFFLf1/d;)J

    move-result-wide p1

    return-wide p1
.end method
