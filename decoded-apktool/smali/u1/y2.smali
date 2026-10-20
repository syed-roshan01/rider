.class public interface abstract Lu1/y2;
.super Ljava/lang/Object;


# virtual methods
.method public a()F
    .locals 1

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0
.end method

.method public abstract b()J
.end method

.method public abstract c()V
.end method

.method public abstract d()J
.end method

.method public abstract e()F
.end method

.method public f()J
    .locals 2

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0, v0}, Li1/b;->b(FF)J

    move-result-wide v0

    return-wide v0
.end method
