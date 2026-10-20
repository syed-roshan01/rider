.class public final Landroidx/fragment/app/r1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/s1;

.field public final synthetic c:Landroidx/fragment/app/t1;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/t1;Landroidx/fragment/app/s1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Landroidx/fragment/app/r1;->a:I

    iput-object p1, p0, Landroidx/fragment/app/r1;->c:Landroidx/fragment/app/t1;

    iput-object p2, p0, Landroidx/fragment/app/r1;->b:Landroidx/fragment/app/s1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/r1;->a:I

    iget-object v1, p0, Landroidx/fragment/app/r1;->b:Landroidx/fragment/app/s1;

    iget-object v2, p0, Landroidx/fragment/app/r1;->c:Landroidx/fragment/app/t1;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Landroidx/fragment/app/t1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, Landroidx/fragment/app/t1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, v2, Landroidx/fragment/app/t1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, v1, Landroidx/fragment/app/s1;->a:I

    iget-object v1, v1, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    iget-object v1, v1, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-static {v0, v1}, La7/a;->a(ILandroid/view/View;)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
