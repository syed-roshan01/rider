.class public final Lg1/d;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:Lg1/b;


# direct methods
.method public constructor <init>(Lg1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/d;->a:Lg1/b;

    return-void
.end method


# virtual methods
.method public final a(FFFF)V
    .locals 5

    iget-object v0, p0, Lg1/d;->a:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->a()Le1/p;

    move-result-object v1

    invoke-virtual {v0}, Lg1/b;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ld1/f;->d(J)F

    move-result v2

    add-float/2addr p3, p1

    sub-float/2addr v2, p3

    invoke-virtual {v0}, Lg1/b;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, Ld1/f;->b(J)F

    move-result p3

    add-float/2addr p4, p2

    sub-float/2addr p3, p4

    invoke-static {v2, p3}, Ld7/t;->j(FF)J

    move-result-wide p3

    invoke-static {p3, p4}, Ld1/f;->d(J)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    invoke-static {p3, p4}, Ld1/f;->b(J)F

    move-result v2

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    invoke-virtual {v0, p3, p4}, Lg1/b;->c(J)V

    invoke-interface {v1, p1, p2}, Le1/p;->e(FF)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Width and height must be greater than or equal to zero"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(FFJ)V
    .locals 3

    iget-object v0, p0, Lg1/d;->a:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->a()Le1/p;

    move-result-object v0

    invoke-static {p3, p4}, Ld1/c;->d(J)F

    move-result v1

    invoke-static {p3, p4}, Ld1/c;->e(J)F

    move-result v2

    invoke-interface {v0, v1, v2}, Le1/p;->e(FF)V

    invoke-interface {v0, p1, p2}, Le1/p;->b(FF)V

    invoke-static {p3, p4}, Ld1/c;->d(J)F

    move-result p1

    neg-float p1, p1

    invoke-static {p3, p4}, Ld1/c;->e(J)F

    move-result p2

    neg-float p2, p2

    invoke-interface {v0, p1, p2}, Le1/p;->e(FF)V

    return-void
.end method
