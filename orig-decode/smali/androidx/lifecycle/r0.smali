.class public final Landroidx/lifecycle/r0;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/b1;


# virtual methods
.method public final create(Ljava/lang/Class;Lq3/c;)Landroidx/lifecycle/x0;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "extras"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/u0;-><init>()V

    return-object p1
.end method
