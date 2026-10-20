.class public final Landroidx/activity/a0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/i0;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/i0;I)V
    .locals 0

    iput p2, p0, Landroidx/activity/a0;->a:I

    iput-object p1, p0, Landroidx/activity/a0;->b:Landroidx/activity/i0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Landroidx/activity/a0;->a:I

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Landroidx/activity/a0;->invoke()V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Landroidx/activity/a0;->invoke()V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Landroidx/activity/a0;->invoke()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 5

    iget v0, p0, Landroidx/activity/a0;->a:I

    iget-object v1, p0, Landroidx/activity/a0;->b:Landroidx/activity/i0;

    packed-switch v0, :pswitch_data_0

    .line 4
    invoke-virtual {v1}, Landroidx/activity/i0;->b()V

    return-void

    .line 5
    :pswitch_0
    iget-object v0, v1, Landroidx/activity/i0;->c:Landroidx/activity/y;

    const/4 v2, 0x0

    if-nez v0, :cond_2

    .line 6
    iget-object v0, v1, Landroidx/activity/i0;->b:Lr8/l;

    invoke-virtual {v0}, Lr8/l;->e()I

    move-result v3

    .line 7
    invoke-virtual {v0, v3}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 9
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    .line 10
    move-object v4, v3

    check-cast v4, Landroidx/activity/y;

    .line 11
    iget-boolean v4, v4, Landroidx/activity/y;->a:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 12
    :goto_0
    check-cast v3, Landroidx/activity/y;

    .line 13
    :cond_2
    iput-object v2, v1, Landroidx/activity/i0;->c:Landroidx/activity/y;

    return-void

    .line 14
    :pswitch_1
    invoke-virtual {v1}, Landroidx/activity/i0;->b()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
