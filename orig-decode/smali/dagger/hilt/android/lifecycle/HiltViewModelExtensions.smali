.class public final Ldagger/hilt/android/lifecycle/HiltViewModelExtensions;
.super Ljava/lang/Object;


# direct methods
.method public static final addCreationCallback(Lq3/d;Lc9/c;)Lq3/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VMF:",
            "Ljava/lang/Object;",
            ">(",
            "Lq3/d;",
            "Lc9/c;",
            ")",
            "Lq3/c;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->CREATION_CALLBACK_KEY:Lq3/b;

    const-string v1, "CREATION_CALLBACK_KEY"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions$addCreationCallback$1$1;

    invoke-direct {v1, p1}, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions$addCreationCallback$1$1;-><init>(Lc9/c;)V

    invoke-virtual {p0, v0, v1}, Lq3/d;->b(Lq3/b;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final withCreationCallback(Lq3/c;Lc9/c;)Lq3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<VMF:",
            "Ljava/lang/Object;",
            ">(",
            "Lq3/c;",
            "Lc9/c;",
            ")",
            "Lq3/c;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq3/d;

    invoke-direct {v0, p0}, Lq3/d;-><init>(Lq3/c;)V

    invoke-static {v0, p1}, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions;->addCreationCallback(Lq3/d;Lc9/c;)Lq3/c;

    move-result-object p0

    return-object p0
.end method
