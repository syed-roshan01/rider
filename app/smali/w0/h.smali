.class public final synthetic Lw0/h;
.super Ljava/lang/Object;

# interfaces
.implements Lw0/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq8/a;


# direct methods
.method public synthetic constructor <init>(Ls/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lw0/h;->a:I

    iput-object p1, p0, Lw0/h;->b:Lq8/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lw0/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw0/h;->b:Lq8/a;

    check-cast v0, Lc9/c;

    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lw0/p;->h:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lr8/p;->O0(Ljava/lang/Iterable;Lq8/a;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lw0/p;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object v0, Lw0/o;->b:Lw0/o;

    invoke-static {v0}, Lw0/p;->e(Lc9/c;)Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :pswitch_0
    iget-object v0, p0, Lw0/h;->b:Lq8/a;

    check-cast v0, Lc9/e;

    sget-object v1, Lw0/p;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    sget-object v2, Lw0/p;->g:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lr8/p;->O0(Ljava/lang/Iterable;Lq8/a;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lw0/p;->g:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
