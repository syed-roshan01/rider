.class public final Lg8/g3;
.super Le8/k;


# virtual methods
.method public final cancel(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final halfClose()V
    .locals 0

    return-void
.end method

.method public final request(I)V
    .locals 0

    return-void
.end method

.method public final sendMessage(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final start(Le8/j;Le8/l1;)V
    .locals 1

    sget-object p2, Lg8/l3;->e0:Le8/c2;

    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p2, v0}, Le8/j;->onClose(Le8/c2;Le8/l1;)V

    return-void
.end method
