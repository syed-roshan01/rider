.class public final Landroidx/fragment/app/s;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/d0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/d0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/fragment/app/s;->a:I

    iput-object p1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/d0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/s;->a:I

    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/d0;

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroidx/fragment/app/d0;->callStartTransitionListener(Z)V

    return-void

    :pswitch_0
    invoke-virtual {v1}, Landroidx/fragment/app/d0;->startPostponedEnterTransition()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
