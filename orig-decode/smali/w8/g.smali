.class public abstract Lw8/g;
.super Lw8/a;


# direct methods
.method public constructor <init>(Lu8/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lw8/a;-><init>(Lu8/e;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object p1

    sget-object v0, Lu8/k;->a:Lu8/k;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final getContext()Lu8/j;
    .locals 1

    sget-object v0, Lu8/k;->a:Lu8/k;

    return-object v0
.end method
