.class public final Lg8/u2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/l3;


# direct methods
.method public synthetic constructor <init>(Lg8/l3;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lg8/u2;->a:I

    .line 2
    invoke-direct {p0, p1, v0}, Lg8/u2;-><init>(Lg8/l3;I)V

    return-void
.end method

.method public synthetic constructor <init>(Lg8/l3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/u2;->a:I

    iput-object p1, p0, Lg8/u2;->b:Lg8/l3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lg8/u2;->a:I

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->w:Lg8/c3;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lg8/l3;->y(Lg8/l3;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-boolean v2, v0, Lg8/l3;->G:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v1, v0, Lg8/l3;->G:Z

    invoke-static {v0}, Lg8/l3;->z(Lg8/l3;)V

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->N:Lg8/z;

    const/4 v2, 0x2

    const-string v3, "Entering SHUTDOWN state"

    invoke-virtual {v1, v2, v3}, Lg8/z;->a(ILjava/lang/String;)V

    iget-object v0, v0, Lg8/l3;->r:Lz5/k;

    sget-object v1, Le8/x;->e:Le8/x;

    invoke-virtual {v0, v1}, Lz5/k;->c(Le8/x;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    invoke-virtual {v0}, Lg8/l3;->C()V

    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->x:Lz6/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->x:Lz6/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->w:Lg8/c3;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lg8/c3;->a:Li3/a0;

    iget-object v0, v0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Le8/z0;

    invoke-virtual {v0}, Le8/z0;->e()V

    :cond_3
    return-void

    :pswitch_3
    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, v0, Lg8/l3;->w:Lg8/c3;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg8/l3;->B(Z)V

    invoke-static {v0}, Lg8/l3;->y(Lg8/l3;)V

    :cond_5
    :goto_2
    return-void

    :pswitch_4
    iget-object v0, p0, Lg8/u2;->b:Lg8/l3;

    invoke-virtual {v0, v1}, Lg8/l3;->B(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
