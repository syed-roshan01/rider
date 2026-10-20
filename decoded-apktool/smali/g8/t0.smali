.class public final Lg8/t0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/t0;->a:I

    iput-object p1, p0, Lg8/t0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v0, 0x0

    iget v1, p0, Lg8/t0;->a:I

    const/4 v2, 0x0

    iget-object v3, p0, Lg8/t0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v3, Lg8/m5;

    invoke-virtual {v3}, Lg8/o1;->n()V

    return-void

    :pswitch_0
    check-cast v3, Lg8/d5;

    iget-object v0, v3, Lg8/d5;->c:Lg8/f5;

    iget-object v0, v0, Lg8/f5;->b:Lg8/y2;

    sget-object v1, Lg8/y2;->E:Le8/g1;

    iget-object v1, v3, Lg8/d5;->b:Lg8/g5;

    invoke-virtual {v0, v1}, Lg8/y2;->v(Lg8/g5;)V

    return-void

    :pswitch_1
    check-cast v3, Lg8/y2;

    iget-boolean v0, v3, Lg8/y2;->z:Z

    if-nez v0, :cond_0

    iget-object v0, v3, Lg8/y2;->u:Lg8/j0;

    invoke-interface {v0}, Lg8/b6;->b()V

    :cond_0
    return-void

    :pswitch_2
    check-cast v3, Lg8/w2;

    iget-object v0, v3, Lg8/w2;->t:Ljava/lang/Object;

    check-cast v0, Le8/x0;

    invoke-virtual {v0}, Le8/x0;->f()V

    return-void

    :pswitch_3
    check-cast v3, Lg8/k3;

    iget-object v1, v3, Lg8/k3;->f:Lg8/j2;

    sget-object v2, Lg8/l3;->f0:Le8/c2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lg8/b2;

    invoke-direct {v3, v1, v2, v0}, Lg8/b2;-><init>(Lg8/j2;Le8/c2;I)V

    iget-object v0, v1, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0, v3}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_4
    check-cast v3, Lg8/h3;

    iget-object v1, v3, Lg8/h3;->n:Lg8/i3;

    iget-object v1, v1, Lg8/i3;->d:Lg8/l3;

    iget-object v1, v1, Lg8/l3;->A:Ljava/util/Collection;

    if-eqz v1, :cond_1

    invoke-interface {v1, v3}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v1, v3, Lg8/h3;->n:Lg8/i3;

    iget-object v3, v1, Lg8/i3;->d:Lg8/l3;

    iget-object v3, v3, Lg8/l3;->A:Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v1, Lg8/i3;->d:Lg8/l3;

    iget-object v4, v3, Lg8/l3;->X:Lg8/z1;

    iget-object v3, v3, Lg8/l3;->B:Ljava/lang/Object;

    invoke-virtual {v4, v3, v0}, Lf4/y;->f(Ljava/lang/Object;Z)V

    iget-object v0, v1, Lg8/i3;->d:Lg8/l3;

    iput-object v2, v0, Lg8/l3;->A:Ljava/util/Collection;

    iget-object v0, v0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lg8/i3;->d:Lg8/l3;

    iget-object v0, v0, Lg8/l3;->E:Li3/a0;

    sget-object v1, Lg8/l3;->e0:Le8/c2;

    invoke-virtual {v0, v1}, Li3/a0;->c(Le8/c2;)V

    :cond_1
    return-void

    :pswitch_5
    check-cast v3, Lg8/c3;

    iget-object v0, v3, Lg8/c3;->b:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->m:Le8/h2;

    invoke-virtual {v1}, Le8/h2;->d()V

    iget-boolean v1, v0, Lg8/l3;->v:Z

    if-eqz v1, :cond_2

    iget-object v0, v0, Lg8/l3;->u:Lg8/o1;

    invoke-virtual {v0}, Lg8/o1;->n()V

    :cond_2
    return-void

    :pswitch_6
    check-cast v3, Lz5/k;

    iget-object v0, v3, Lz5/k;->a:Ljava/lang/Object;

    check-cast v0, Lg8/l3;

    invoke-virtual {v0}, Lg8/l3;->C()V

    return-void

    :pswitch_7
    check-cast v3, Lg8/x1;

    iget-object v0, v3, Lg8/x1;->c:Ljava/lang/Object;

    check-cast v0, Lg8/j2;

    iget-object v1, v0, Lg8/j2;->r:Lg8/u3;

    iput-object v2, v0, Lg8/j2;->q:Lv6/d;

    iput-object v2, v0, Lg8/j2;->r:Lg8/u3;

    sget-object v0, Le8/c2;->m:Le8/c2;

    const-string v2, "InternalSubchannel closed transport due to address change"

    invoke-virtual {v0, v2}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    invoke-interface {v1, v0}, Lg8/u3;->f(Le8/c2;)V

    return-void

    :pswitch_8
    check-cast v3, Lg8/c1;

    iget-object v0, v3, Lg8/c1;->a:Lg8/j0;

    invoke-interface {v0}, Lg8/b6;->b()V

    return-void

    :pswitch_9
    check-cast v3, Lg8/u0;

    iget-object v0, v3, Lg8/u0;->a:Le8/j;

    invoke-virtual {v0}, Le8/j;->onReady()V

    return-void

    :pswitch_a
    check-cast v3, Lg8/v0;

    iget-object v0, v3, Lg8/v0;->f:Le8/k;

    invoke-virtual {v0}, Le8/k;->halfClose()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
