.class public final Landroidx/activity/j0;
.super Landroidx/activity/y;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/x0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/activity/j0;->d:I

    iput-object p1, p0, Landroidx/activity/j0;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Landroidx/activity/y;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lo2/a;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/activity/j0;->d:I

    iput-object p1, p0, Landroidx/activity/j0;->e:Ljava/lang/Object;

    .line 1
    invoke-direct {p0, p2}, Landroidx/activity/y;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Landroidx/activity/j0;->d:I

    iget-object v1, p0, Landroidx/activity/j0;->e:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Landroidx/fragment/app/x0;

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroidx/fragment/app/x0;->t(Z)Z

    iget-object v0, v1, Landroidx/fragment/app/x0;->h:Landroidx/activity/j0;

    iget-boolean v0, v0, Landroidx/activity/y;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/x0;->G()Z

    goto :goto_0

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/x0;->g:Landroidx/activity/i0;

    invoke-virtual {v0}, Landroidx/activity/i0;->b()V

    :goto_0
    return-void

    :pswitch_0
    check-cast v1, Lc9/c;

    invoke-interface {v1, p0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
