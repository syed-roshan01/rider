.class public final Lm9/s;
.super Lm9/p1;

# interfaces
.implements Lm9/r;


# virtual methods
.method public final i0(Ljava/lang/Throwable;)Z
    .locals 2

    new-instance v0, Lm9/u;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lm9/u;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0}, Lm9/p1;->X(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
