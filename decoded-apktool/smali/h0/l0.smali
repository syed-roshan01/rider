.class public abstract Lh0/l0;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(Lr1/s;)Ld1/d;
    .locals 5

    invoke-static {p0}, Landroidx/compose/ui/layout/a;->c(Lr1/s;)Ld1/d;

    move-result-object v0

    iget v1, v0, Ld1/d;->a:F

    iget v2, v0, Ld1/d;->b:F

    invoke-static {v1, v2}, Ld9/i;->f(FF)J

    move-result-wide v1

    invoke-interface {p0, v1, v2}, Lr1/s;->h(J)J

    move-result-wide v1

    iget v3, v0, Ld1/d;->c:F

    iget v0, v0, Ld1/d;->d:F

    invoke-static {v3, v0}, Ld9/i;->f(FF)J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Lr1/s;->h(J)J

    move-result-wide v3

    new-instance p0, Ld1/d;

    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result v0

    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result v1

    invoke-static {v3, v4}, Ld1/c;->d(J)F

    move-result v2

    invoke-static {v3, v4}, Ld1/c;->e(J)F

    move-result v3

    invoke-direct {p0, v0, v1, v2, v3}, Ld1/d;-><init>(FFFF)V

    return-object p0
.end method
