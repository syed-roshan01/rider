.class public final Ll4/i;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:Ll4/j;


# direct methods
.method public constructor <init>(Ll4/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ll4/i;->a:Ll4/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Ll4/i;

    iget-object v0, p0, Ll4/i;->a:Ll4/j;

    invoke-direct {p1, v0, p2}, Ll4/i;-><init>(Ll4/j;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ll4/i;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Ll4/i;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Ll4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Ll4/i;->a:Ll4/j;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p1, Ll4/j;->s:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Ll4/j;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {p1}, Ll4/j;->Q()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-boolean v0, p1, Ll4/j;->u:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    iget v1, p1, Ll4/j;->p:I

    const/16 v2, 0x7d0

    if-lt v1, v2, :cond_1

    invoke-virtual {p1}, Ll4/j;->c0()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_4
    iput-boolean v0, p1, Ll4/j;->v:Z

    new-instance v0, Lja/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lr9/a;->b(Lja/e0;)Lja/z;

    move-result-object v0

    iput-object v0, p1, Ll4/j;->q:Lja/h;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_1
    :goto_1
    monitor-exit p1

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    :try_start_5
    sget-object v0, Lq8/l;->a:Lq8/l;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p1

    return-object v0

    :goto_3
    monitor-exit p1

    throw v0
.end method
