.class public interface abstract Ly0/o;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:I


# virtual methods
.method public abstract c(Lc9/c;)Z
.end method

.method public abstract e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
.end method

.method public j(Ly0/o;)Ly0/o;
    .locals 1

    sget-object v0, Ly0/l;->b:Ly0/l;

    if-ne p1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Ly0/i;

    invoke-direct {v0, p0, p1}, Ly0/i;-><init>(Ly0/o;Ly0/o;)V

    :goto_0
    return-object v0
.end method
