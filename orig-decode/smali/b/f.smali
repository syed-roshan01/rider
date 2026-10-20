.class public final Lb/f;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    iput p1, p0, Lb/f;->a:I

    iput-object p2, p0, Lb/f;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lb/f;->b:Z

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lu1/w;Z)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb/f;->a:I

    iput-boolean p2, p0, Lb/f;->b:Z

    iput-object p1, p0, Lb/f;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lb/f;->a:I

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Lb/f;->invoke()V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lb/f;->invoke()V

    return-object v0

    .line 3
    :pswitch_1
    invoke-virtual {p0}, Lb/f;->invoke()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 3

    iget v0, p0, Lb/f;->a:I

    iget-object v1, p0, Lb/f;->c:Ljava/lang/Object;

    iget-boolean v2, p0, Lb/f;->b:Z

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lu1/w;

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    :goto_0
    return-void

    :pswitch_0
    check-cast v1, Lc9/c;

    xor-int/lit8 v0, v2, 0x1

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast v1, Lb/h;

    .line 6
    iput-boolean v2, v1, Landroidx/activity/y;->a:Z

    .line 7
    iget-object v0, v1, Landroidx/activity/y;->c:Lc9/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
