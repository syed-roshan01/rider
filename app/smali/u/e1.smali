.class public final Lu/e1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc9/a;


# direct methods
.method public synthetic constructor <init>(Lc9/a;I)V
    .locals 0

    iput p2, p0, Lu/e1;->a:I

    iput-object p1, p0, Lu/e1;->b:Lc9/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu/e1;->a:I

    iget-object v2, p0, Lu/e1;->b:Lc9/a;

    packed-switch v1, :pswitch_data_0

    .line 1
    :try_start_0
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lr8/r;->a:Lr8/r;

    :goto_0
    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lu/e1;->invoke()V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lu/e1;->invoke()V

    return-object v0

    .line 4
    :pswitch_2
    invoke-virtual {p0}, Lu/e1;->invoke()V

    return-object v0

    .line 5
    :pswitch_3
    invoke-virtual {p0}, Lu/e1;->invoke()V

    return-object v0

    .line 6
    :pswitch_4
    invoke-virtual {p0}, Lu/e1;->invoke()V

    return-object v0

    .line 7
    :pswitch_5
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 8
    :pswitch_6
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 9
    :pswitch_7
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 10
    :pswitch_8
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 11
    :pswitch_9
    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke()V
    .locals 2

    iget v0, p0, Lu/e1;->a:I

    iget-object v1, p0, Lu/e1;->b:Lc9/a;

    packed-switch v0, :pswitch_data_0

    .line 12
    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void

    .line 13
    :pswitch_0
    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void

    .line 14
    :pswitch_1
    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_2
    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void

    .line 16
    :pswitch_3
    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
