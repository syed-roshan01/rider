.class public abstract Lk9/l;
.super Lh6/g;


# direct methods
.method public static F0(Lc9/c;Ljava/lang/Object;)Lk9/i;
    .locals 3

    if-nez p1, :cond_0

    sget-object p0, Lk9/d;->a:Lk9/d;

    goto :goto_0

    :cond_0
    new-instance v0, Lk9/h;

    new-instance v1, Lu1/z0;

    const/16 v2, 0xe

    invoke-direct {v1, p1, v2}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1, p0}, Lk9/h;-><init>(Lu1/z0;Lc9/c;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
