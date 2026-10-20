.class public final Lt/r0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/n0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt/r0;->a:I

    iput-object p2, p0, Lt/r0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lt/r0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget v0, p0, Lt/r0;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lt/r0;->c:Ljava/lang/Object;

    iget-object v3, p0, Lt/r0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :try_start_0
    check-cast v3, Landroid/content/Context;

    check-cast v2, Ld5/w;

    invoke-virtual {v3, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :pswitch_0
    check-cast v3, Landroid/net/ConnectivityManager;

    check-cast v2, Lr4/h;

    invoke-virtual {v3, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void

    :pswitch_1
    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v2, Lu1/x0;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void

    :pswitch_2
    check-cast v3, Lm0/g1;

    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/o;

    if-eqz v0, :cond_1

    new-instance v4, Lx/n;

    invoke-direct {v4, v0}, Lx/n;-><init>(Lx/o;)V

    check-cast v2, Lx/m;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v4}, Lx/m;->b(Lx/k;)V

    :cond_0
    invoke-interface {v3, v1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void

    :pswitch_3
    check-cast v3, La0/o0;

    iget-object v0, v3, La0/o0;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_4
    check-cast v3, Ly/j1;

    check-cast v2, Landroid/view/View;

    iget v0, v3, Ly/j1;->s:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v3, Ly/j1;->s:I

    if-nez v0, :cond_2

    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v2, v1}, Lb3/h0;->u(Landroid/view/View;Lb3/t;)V

    invoke-static {v2, v1}, Lb3/q0;->f(Landroid/view/View;Ly/g0;)V

    iget-object v0, v3, Ly/j1;->t:Ly/g0;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_2
    return-void

    :pswitch_5
    check-cast v3, Lt/u1;

    check-cast v2, Lt/q1;

    iget-object v0, v3, Lt/u1;->h:Lw0/u;

    invoke-virtual {v0, v2}, Lw0/u;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_6
    check-cast v3, Lt/u1;

    check-cast v2, Lt/n1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Lt/n1;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/m1;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lt/m1;->a:Lt/q1;

    if-eqz v0, :cond_3

    iget-object v1, v3, Lt/u1;->h:Lw0/u;

    invoke-virtual {v1, v0}, Lw0/u;->remove(Ljava/lang/Object;)Z

    :cond_3
    return-void

    :pswitch_7
    check-cast v3, Lt/u1;

    check-cast v2, Lt/u1;

    iget-object v0, v3, Lt/u1;->i:Lw0/u;

    invoke-virtual {v0, v2}, Lw0/u;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_8
    check-cast v3, Lt/p0;

    check-cast v2, Lt/k0;

    iget-object v0, v3, Lt/p0;->a:Lo0/i;

    invoke-virtual {v0, v2}, Lo0/i;->m(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
