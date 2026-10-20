.class public final synthetic Landroidx/activity/g;
.super Ljava/lang/Object;

# interfaces
.implements Lc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/activity/g;->a:I

    iput-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/p;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    iget p1, p0, Landroidx/activity/g;->a:I

    iget-object v0, p0, Landroidx/activity/g;->b:Landroidx/activity/p;

    packed-switch p1, :pswitch_data_0

    check-cast v0, Landroidx/fragment/app/g0;

    invoke-static {v0}, Landroidx/fragment/app/g0;->c(Landroidx/fragment/app/g0;)V

    return-void

    :pswitch_0
    invoke-static {v0}, Landroidx/activity/p;->b(Landroidx/activity/p;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
