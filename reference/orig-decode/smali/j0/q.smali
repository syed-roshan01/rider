.class public abstract Lj0/q;
.super Ljava/lang/Object;


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    int-to-float v0, v0

    sput v0, Lj0/q;->a:F

    return-void
.end method

.method public static final a(Lm2/b;ZJ)F
    .locals 1

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result v0

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result p2

    invoke-static {v0, p2}, Ld9/i;->f(FF)J

    move-result-wide p2

    invoke-static {p2, p3}, Ld1/c;->c(J)F

    move-result p2

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    if-eqz p1, :cond_0

    sget p1, Lj0/q;->a:F

    invoke-interface {p0, p1}, Lm2/b;->v(F)F

    move-result p0

    add-float/2addr p2, p0

    :cond_0
    return p2
.end method
