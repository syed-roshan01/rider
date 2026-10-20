.class public final Lg8/w2;
.super Lz6/a;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/lang/Object;

.field public final u:Ljava/io/Serializable;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg8/h4;Le8/x0;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lg8/w2;->s:I

    iput-object p1, p0, Lg8/w2;->v:Ljava/lang/Object;

    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lg8/w2;->u:Ljava/io/Serializable;

    const-string p1, "subchannel"

    .line 9
    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lg8/w2;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg8/l3;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg8/w2;->s:I

    iput-object p1, p0, Lg8/w2;->v:Ljava/lang/Object;

    iput-object p2, p0, Lg8/w2;->u:Ljava/io/Serializable;

    .line 2
    sget-object p1, Le8/c2;->l:Le8/c2;

    const-string v0, "Panic! This is a bug!"

    .line 3
    invoke-virtual {p1, v0}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    invoke-virtual {p1, p2}, Le8/c2;->f(Ljava/lang/Throwable;)Le8/c2;

    move-result-object p1

    .line 4
    sget-object p2, Le8/v0;->e:Le8/v0;

    .line 5
    invoke-virtual {p1}, Le8/c2;->e()Z

    move-result p2

    const/4 v0, 0x1

    xor-int/2addr p2, v0

    const-string v1, "drop status shouldn\'t be OK"

    invoke-static {v1, p2}, Ly3/e;->G(Ljava/lang/String;Z)V

    .line 6
    new-instance p2, Le8/v0;

    const/4 v1, 0x0

    invoke-direct {p2, v1, v1, p1, v0}, Le8/v0;-><init>(Le8/x0;Ln8/m;Le8/c2;Z)V

    iput-object p2, p0, Lg8/w2;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final Y(Lg8/j4;)Le8/v0;
    .locals 2

    iget p1, p0, Lg8/w2;->s:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lg8/w2;->u:Ljava/io/Serializable;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg8/w2;->v:Ljava/lang/Object;

    check-cast p1, Lg8/h4;

    iget-object p1, p1, Lg8/h4;->c:Le8/j0;

    invoke-virtual {p1}, Le8/j0;->l()Le8/h2;

    move-result-object p1

    new-instance v0, Lg8/t0;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lg8/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_0
    sget-object p1, Le8/v0;->e:Le8/v0;

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lg8/w2;->t:Ljava/lang/Object;

    check-cast p1, Le8/v0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lg8/w2;->s:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lq6/g;

    const-class v1, Lg8/w2;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq6/g;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg8/w2;->t:Ljava/lang/Object;

    check-cast v1, Le8/v0;

    const-string v2, "panicPickResult"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
