.class public final synthetic Lg2/j0;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/l0;
.implements Lq6/m;


# virtual methods
.method public a(La2/e;)Lg2/i0;
    .locals 2

    new-instance v0, Lg2/i0;

    sget-object v1, Lg2/r;->a:Lg2/k0;

    invoke-direct {v0, p1, v1}, Lg2/i0;-><init>(La2/e;Lg2/s;)V

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
