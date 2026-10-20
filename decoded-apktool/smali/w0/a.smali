.class public final Lw0/a;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc9/c;

.field public final synthetic c:Lc9/c;


# direct methods
.method public synthetic constructor <init>(Lc9/c;Lc9/c;I)V
    .locals 0

    iput p3, p0, Lw0/a;->a:I

    iput-object p1, p0, Lw0/a;->b:Lc9/c;

    iput-object p2, p0, Lw0/a;->c:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lw0/a;->a:I

    iget-object v1, p0, Lw0/a;->c:Lc9/c;

    iget-object v2, p0, Lw0/a;->b:Lc9/c;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-interface {v2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    invoke-interface {v2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lw0/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lw0/a;->a(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lw0/a;->a(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1}, Lw0/a;->a(Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_2
    check-cast p1, Lw0/n;

    sget-object v0, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Lw0/p;->d:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lw0/p;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lw0/a;->b:Lc9/c;

    iget-object v2, p0, Lw0/a;->c:Lc9/c;

    new-instance v3, Lw0/c;

    invoke-direct {v3, v1, p1, v0, v2}, Lw0/c;-><init>(ILw0/n;Lc9/c;Lc9/c;)V

    return-object v3

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
