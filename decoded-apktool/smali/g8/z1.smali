.class public final Lg8/z1;
.super Lf4/y;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Le8/p0;


# direct methods
.method public constructor <init>(Le8/p0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/z1;->b:I

    iput-object p1, p0, Lg8/z1;->c:Le8/p0;

    .line 2
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lf4/y;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lg8/l3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg8/z1;->b:I

    .line 3
    invoke-direct {p0, p1, v0}, Lg8/z1;-><init>(Le8/p0;I)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget v0, p0, Lg8/z1;->b:I

    const/4 v1, 0x1

    iget-object v2, p0, Lg8/z1;->c:Le8/p0;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lh8/n;

    iget-object v0, v2, Lh8/n;->h:Lg8/t3;

    invoke-interface {v0, v1}, Lg8/t3;->b(Z)V

    return-void

    :pswitch_0
    check-cast v2, Lg8/l3;

    invoke-virtual {v2}, Lg8/l3;->C()V

    return-void

    :pswitch_1
    check-cast v2, Lg8/j2;

    iget-object v0, v2, Lg8/j2;->e:Lg8/v2;

    iget-object v0, v0, Lg8/v2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/k3;

    iget-object v0, v0, Lg8/k3;->j:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->X:Lg8/z1;

    invoke-virtual {v0, v2, v1}, Lf4/y;->f(Ljava/lang/Object;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()V
    .locals 3

    iget v0, p0, Lg8/z1;->b:I

    const/4 v1, 0x0

    iget-object v2, p0, Lg8/z1;->c:Le8/p0;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lh8/n;

    iget-object v0, v2, Lh8/n;->h:Lg8/t3;

    invoke-interface {v0, v1}, Lg8/t3;->b(Z)V

    return-void

    :pswitch_0
    check-cast v2, Lg8/l3;

    iget-object v0, v2, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lg8/l3;->E()V

    :goto_0
    return-void

    :pswitch_1
    check-cast v2, Lg8/j2;

    iget-object v0, v2, Lg8/j2;->e:Lg8/v2;

    iget-object v0, v0, Lg8/v2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/k3;

    iget-object v0, v0, Lg8/k3;->j:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->X:Lg8/z1;

    invoke-virtual {v0, v2, v1}, Lf4/y;->f(Ljava/lang/Object;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
