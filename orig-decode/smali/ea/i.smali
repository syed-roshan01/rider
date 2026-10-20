.class public final Lea/i;
.super Laa/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lea/r;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lea/r;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lea/i;->e:I

    iput-object p2, p0, Lea/i;->f:Lea/r;

    iput-object p3, p0, Lea/i;->g:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Laa/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    iget v0, p0, Lea/i;->e:I

    const-wide/16 v1, -0x1

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Lea/i;->f:Lea/r;

    iget-object v0, v0, Lea/r;->b:Lea/h;

    iget-object v3, p0, Lea/i;->g:Ljava/lang/Object;

    check-cast v3, Lea/y;

    invoke-virtual {v0, v3}, Lea/h;->b(Lea/y;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v3, Lfa/m;->a:Lfa/m;

    sget-object v3, Lfa/m;->a:Lfa/m;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Http2Connection.Listener failure for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lea/i;->f:Lea/r;

    iget-object v5, v5, Lea/r;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x4

    invoke-static {v3, v4, v0}, Lfa/m;->i(ILjava/lang/String;Ljava/lang/Throwable;)V

    :try_start_1
    iget-object v3, p0, Lea/i;->g:Ljava/lang/Object;

    check-cast v3, Lea/y;

    sget-object v4, Lea/b;->c:Lea/b;

    invoke-virtual {v3, v4, v0}, Lea/y;->c(Lea/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-wide v1

    :pswitch_0
    iget-object v0, p0, Lea/i;->f:Lea/r;

    iget-object v3, v0, Lea/r;->b:Lea/h;

    iget-object v4, p0, Lea/i;->g:Ljava/lang/Object;

    check-cast v4, Ld9/u;

    iget-object v4, v4, Ld9/u;->a:Ljava/lang/Object;

    check-cast v4, Lea/c0;

    invoke-virtual {v3, v0, v4}, Lea/h;->a(Lea/r;Lea/c0;)V

    return-wide v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
