.class public interface abstract Lt/z1;
.super Ljava/lang/Object;


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b(Lt/t;Lt/t;Lt/t;)J
.end method

.method public abstract c(JLt/t;Lt/t;Lt/t;)Lt/t;
.end method

.method public abstract d(JLt/t;Lt/t;Lt/t;)Lt/t;
.end method

.method public g(Lt/t;Lt/t;Lt/t;)Lt/t;
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lt/z1;->b(Lt/t;Lt/t;Lt/t;)J

    move-result-wide v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lt/z1;->c(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1
.end method
