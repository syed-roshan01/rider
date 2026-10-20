.class public interface abstract Lt/f0;
.super Ljava/lang/Object;

# interfaces
.implements Lt/n;


# virtual methods
.method public a(Lt/x1;)Lt/z1;
    .locals 0

    new-instance p1, Lt/c2;

    invoke-direct {p1, p0}, Lt/c2;-><init>(Lt/f0;)V

    return-object p1
.end method

.method public abstract b(JFFF)F
.end method

.method public abstract c(JFFF)F
.end method

.method public abstract d(FFF)J
.end method

.method public e(FFF)F
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lt/f0;->d(FFF)J

    move-result-wide v1

    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v5}, Lt/f0;->c(JFFF)F

    move-result p1

    return p1
.end method
