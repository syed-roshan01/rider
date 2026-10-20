.class public abstract Ld9/o;
.super Ld9/p;

# interfaces
.implements Lc9/c;


# virtual methods
.method public final a()Lj9/a;
    .locals 1

    sget-object v0, Ld9/v;->a:Ld9/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm1/b;

    iget-object p1, p1, Lm1/b;->a:Landroid/view/KeyEvent;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
