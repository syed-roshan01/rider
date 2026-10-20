.class public interface abstract Landroidx/lifecycle/b1;
.super Ljava/lang/Object;


# virtual methods
.method public create(Ljava/lang/Class;)Landroidx/lifecycle/x0;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public create(Ljava/lang/Class;Lq3/c;)Landroidx/lifecycle/x0;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p0, p1}, Landroidx/lifecycle/b1;->create(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object p1

    return-object p1
.end method
