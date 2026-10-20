.class public final Lc5/i;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    iput p2, p0, Lc5/i;->a:I

    iput-object p1, p0, Lc5/i;->b:Landroid/app/Activity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget-object v1, p0, Lc5/i;->b:Landroid/app/Activity;

    iget v2, p0, Lc5/i;->a:I

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_0

    :pswitch_0
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->finishAffinity()V

    :cond_0
    :goto_0
    return-object v0

    :pswitch_1
    packed-switch v2, :pswitch_data_2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->finishAffinity()V

    goto :goto_1

    :pswitch_2
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->finishAffinity()V

    :cond_1
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
