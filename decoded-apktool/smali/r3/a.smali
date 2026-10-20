.class public abstract Lr3/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroidx/lifecycle/w;)Lr3/c;
    .locals 2

    new-instance v0, Lr3/c;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/g1;

    invoke-interface {v1}, Landroidx/lifecycle/g1;->getViewModelStore()Landroidx/lifecycle/f1;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lr3/c;-><init>(Landroidx/lifecycle/w;Landroidx/lifecycle/f1;)V

    return-object v0
.end method
