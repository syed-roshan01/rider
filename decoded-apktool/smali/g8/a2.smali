.class public final Lg8/a2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/j2;


# direct methods
.method public synthetic constructor <init>(Lg8/j2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/a2;->a:I

    iput-object p1, p0, Lg8/a2;->b:Lg8/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lg8/a2;->a:I

    sget-object v1, Le8/x;->a:Le8/x;

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/a2;->b:Lg8/j2;

    iget-object v1, v0, Lg8/j2;->j:Le8/i;

    const-string v3, "Terminated"

    invoke-virtual {v1, v2, v3}, Le8/i;->a(ILjava/lang/String;)V

    iget-object v1, v0, Lg8/j2;->e:Lg8/v2;

    iget-object v1, v1, Lg8/v2;->b:Ljava/lang/Object;

    check-cast v1, Lg8/k3;

    iget-object v2, v1, Lg8/k3;->j:Lg8/l3;

    iget-object v2, v2, Lg8/l3;->z:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v2, v1, Lg8/k3;->j:Lg8/l3;

    iget-object v2, v2, Lg8/l3;->O:Le8/n0;

    iget-object v2, v2, Le8/n0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lg8/j2;->b()Le8/q0;

    move-result-object v0

    iget-wide v3, v0, Le8/q0;->c:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/p0;

    iget-object v0, v1, Lg8/k3;->j:Lg8/l3;

    invoke-static {v0}, Lg8/l3;->A(Lg8/l3;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lg8/a2;->b:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    sget-object v3, Le8/x;->d:Le8/x;

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lg8/a2;->b:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->j:Le8/i;

    const-string v3, "CONNECTING as requested"

    invoke-virtual {v0, v2, v3}, Le8/i;->a(ILjava/lang/String;)V

    iget-object v0, p0, Lg8/a2;->b:Lg8/j2;

    invoke-static {v0, v1}, Lg8/j2;->g(Lg8/j2;Le8/x;)V

    iget-object v0, p0, Lg8/a2;->b:Lg8/j2;

    invoke-static {v0}, Lg8/j2;->h(Lg8/j2;)V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lg8/a2;->b:Lg8/j2;

    const/4 v3, 0x0

    iput-object v3, v0, Lg8/j2;->p:Lv6/d;

    iget-object v3, v0, Lg8/j2;->j:Le8/i;

    const-string v4, "CONNECTING after backoff"

    invoke-virtual {v3, v2, v4}, Le8/i;->a(ILjava/lang/String;)V

    invoke-static {v0, v1}, Lg8/j2;->g(Lg8/j2;Le8/x;)V

    invoke-static {v0}, Lg8/j2;->h(Lg8/j2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
