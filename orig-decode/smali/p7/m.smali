.class public final Lp7/m;
.super Lcom/google/gson/internal/bind/l;


# instance fields
.field public a:Lp7/a0;


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp7/m;->a:Lp7/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lp7/a0;->b(Lv7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Lv7/b;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lp7/m;->a:Lp7/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lp7/a0;->c(Lv7/b;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
