.class public interface abstract Lt/a2;
.super Ljava/lang/Object;

# interfaces
.implements Lt/b2;


# virtual methods
.method public b(Lt/t;Lt/t;Lt/t;)J
    .locals 2

    invoke-interface {p0}, Lt/a2;->e()I

    move-result p1

    invoke-interface {p0}, Lt/a2;->f()I

    move-result p2

    add-int/2addr p2, p1

    int-to-long p1, p2

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method
