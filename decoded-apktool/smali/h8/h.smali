.class public final Lh8/h;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/m0;


# instance fields
.field public final a:Lg8/e4;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lg8/e4;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lg8/k4;

.field public final f:Ljavax/net/SocketFactory;

.field public final n:Ljavax/net/ssl/SSLSocketFactory;

.field public final o:Ljavax/net/ssl/HostnameVerifier;

.field public final p:Li8/b;

.field public final q:I

.field public final r:Z

.field public final s:Lg8/n;

.field public final t:J

.field public final u:I

.field public final v:Z

.field public final w:I

.field public final x:Z

.field public y:Z


# direct methods
.method public constructor <init>(Lg8/l1;Lg8/l1;Ljavax/net/ssl/SSLSocketFactory;Li8/b;ZJJIILg8/k4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/h;->a:Lg8/e4;

    iget v0, p1, Lg8/l1;->a:I

    iget-object p1, p1, Lg8/l1;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg8/v5;

    invoke-static {p1}, Lg8/w5;->a(Lg8/v5;)Ljava/lang/Object;

    move-result-object p1

    :pswitch_0
    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lh8/h;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lh8/h;->c:Lg8/e4;

    iget p1, p2, Lg8/l1;->a:I

    iget-object p2, p2, Lg8/l1;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_1

    check-cast p2, Lg8/v5;

    invoke-static {p2}, Lg8/w5;->a(Lg8/v5;)Ljava/lang/Object;

    move-result-object p2

    :pswitch_1
    check-cast p2, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lh8/h;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p1, 0x0

    iput-object p1, p0, Lh8/h;->f:Ljavax/net/SocketFactory;

    iput-object p3, p0, Lh8/h;->n:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p1, p0, Lh8/h;->o:Ljavax/net/ssl/HostnameVerifier;

    iput-object p4, p0, Lh8/h;->p:Li8/b;

    const/high16 p1, 0x400000

    iput p1, p0, Lh8/h;->q:I

    iput-boolean p5, p0, Lh8/h;->r:Z

    new-instance p1, Lg8/n;

    invoke-direct {p1, p6, p7}, Lg8/n;-><init>(J)V

    iput-object p1, p0, Lh8/h;->s:Lg8/n;

    iput-wide p8, p0, Lh8/h;->t:J

    iput p10, p0, Lh8/h;->u:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh8/h;->v:Z

    iput p11, p0, Lh8/h;->w:I

    iput-boolean p1, p0, Lh8/h;->x:Z

    const-string p1, "transportTracerFactory"

    invoke-static {p12, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p12, p0, Lh8/h;->e:Lg8/k4;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final L()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lh8/h;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public final a0(Ljava/net/SocketAddress;Lg8/l0;Lg8/i2;)Lg8/o0;
    .locals 11

    iget-boolean p3, p0, Lh8/h;->y:Z

    if-nez p3, :cond_1

    new-instance p3, Lg8/m;

    iget-object v0, p0, Lh8/h;->s:Lg8/n;

    iget-object v1, v0, Lg8/n;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-direct {p3, v0, v1, v2}, Lg8/m;-><init>(Lg8/n;J)V

    new-instance v10, Ll/h;

    const/16 v0, 0x13

    invoke-direct {v10, v0, p0, p3}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v5, p1

    check-cast v5, Ljava/net/InetSocketAddress;

    new-instance p1, Lh8/n;

    iget-object v6, p2, Lg8/l0;->a:Ljava/lang/String;

    iget-object v7, p2, Lg8/l0;->c:Ljava/lang/String;

    iget-object v8, p2, Lg8/l0;->b:Le8/c;

    iget-object v9, p2, Lg8/l0;->d:Le8/k0;

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v3 .. v10}, Lh8/n;-><init>(Lh8/h;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Le8/c;Le8/k0;Ll/h;)V

    iget-boolean p2, p0, Lh8/h;->r:Z

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lh8/n;->H:Z

    iput-wide v1, p1, Lh8/n;->I:J

    iget-wide p2, p0, Lh8/h;->t:J

    iput-wide p2, p1, Lh8/n;->J:J

    iget-boolean p2, p0, Lh8/h;->v:Z

    iput-boolean p2, p1, Lh8/n;->K:Z

    :cond_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The transport factory is closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lh8/h;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh8/h;->y:Z

    iget-object v0, p0, Lh8/h;->a:Lg8/e4;

    check-cast v0, Lg8/l1;

    iget v1, v0, Lg8/l1;->a:I

    packed-switch v1, :pswitch_data_0

    iget-object v0, v0, Lg8/l1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v5;

    iget-object v1, p0, Lh8/h;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lg8/w5;->b(Lg8/v5;Ljava/util/concurrent/Executor;)V

    :pswitch_0
    iget-object v0, p0, Lh8/h;->c:Lg8/e4;

    check-cast v0, Lg8/l1;

    iget v1, v0, Lg8/l1;->a:I

    packed-switch v1, :pswitch_data_1

    iget-object v0, v0, Lg8/l1;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v5;

    iget-object v1, p0, Lh8/h;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Lg8/w5;->b(Lg8/v5;Ljava/util/concurrent/Executor;)V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
