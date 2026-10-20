.class public final synthetic Landroidx/activity/h0;
.super Ld9/h;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic p:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 13

    iput p2, p0, Landroidx/activity/h0;->p:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v2, 0x0

    const-class v4, Landroidx/activity/i0;

    const-string v5, "updateEnabledCallbacks"

    const-string v6, "updateEnabledCallbacks()V"

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Ld9/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v8, 0x0

    const-class v10, Landroidx/activity/i0;

    const-string v11, "updateEnabledCallbacks"

    const-string v12, "updateEnabledCallbacks()V"

    move-object v7, p0

    move-object v9, p1

    invoke-direct/range {v7 .. v12}, Ld9/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget-object v1, p0, Ld9/c;->b:Ljava/lang/Object;

    iget v2, p0, Landroidx/activity/h0;->p:I

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    check-cast v1, Landroidx/activity/i0;

    invoke-virtual {v1}, Landroidx/activity/i0;->d()V

    goto :goto_0

    :pswitch_0
    check-cast v1, Landroidx/activity/i0;

    invoke-virtual {v1}, Landroidx/activity/i0;->d()V

    :goto_0
    return-object v0

    :pswitch_1
    packed-switch v2, :pswitch_data_2

    check-cast v1, Landroidx/activity/i0;

    invoke-virtual {v1}, Landroidx/activity/i0;->d()V

    goto :goto_1

    :pswitch_2
    check-cast v1, Landroidx/activity/i0;

    invoke-virtual {v1}, Landroidx/activity/i0;->d()V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
