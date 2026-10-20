.class public final Lm1/d;
.super Ly0/n;

# interfaces
.implements Lm1/c;


# instance fields
.field public u:Lc9/c;

.field public v:Lc9/c;


# virtual methods
.method public final M(Landroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lm1/d;->u:Lc9/c;

    if-eqz v0, :cond_0

    new-instance v1, Lm1/b;

    invoke-direct {v1, p1}, Lm1/b;-><init>(Landroid/view/KeyEvent;)V

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lm1/d;->v:Lc9/c;

    if-eqz v0, :cond_0

    new-instance v1, Lm1/b;

    invoke-direct {v1, p1}, Lm1/b;-><init>(Landroid/view/KeyEvent;)V

    invoke-interface {v0, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
