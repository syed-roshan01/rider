.class public final Lg8/x2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/x2;->a:I

    iput-object p1, p0, Lg8/x2;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 4

    iget p1, p0, Lg8/x2;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-static {p2}, Le8/c2;->d(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    const-string p2, "Uncaught exception in the SynchronizationContext. Re-thrown."

    invoke-virtual {p1, p2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    new-instance p2, Le8/e2;

    invoke-direct {p2, p1}, Le8/e2;-><init>(Le8/c2;)V

    throw p2

    :pswitch_0
    sget-object p1, Lg8/l3;->b0:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lg8/x2;->b:Ljava/lang/Object;

    check-cast v2, Lg8/l3;

    iget-object v3, v2, Lg8/l3;->a:Le8/q0;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "] Uncaught exception in the SynchronizationContext. Panic!"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-boolean p1, v2, Lg8/l3;->y:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, v2, Lg8/l3;->y:Z

    invoke-virtual {v2, p1}, Lg8/l3;->B(Z)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lg8/l3;->G(Z)V

    new-instance p1, Lg8/w2;

    invoke-direct {p1, v2, p2}, Lg8/w2;-><init>(Lg8/l3;Ljava/lang/Throwable;)V

    iput-object p1, v2, Lg8/l3;->x:Lz6/a;

    iget-object p2, v2, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {p2, p1}, Lg8/y0;->i(Lz6/a;)V

    iget-object p1, v2, Lg8/l3;->P:Lg8/i3;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lg8/i3;->t(Le8/o0;)V

    iget-object p1, v2, Lg8/l3;->N:Lg8/z;

    const/4 p2, 0x4

    const-string v0, "PANIC! Entering TRANSIENT_FAILURE"

    invoke-virtual {p1, p2, v0}, Lg8/z;->a(ILjava/lang/String;)V

    sget-object p1, Le8/x;->c:Le8/x;

    iget-object p2, v2, Lg8/l3;->r:Lz5/k;

    invoke-virtual {p2, p1}, Lz5/k;->c(Le8/x;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
