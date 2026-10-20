.class public final Lo2/a;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo2/p;


# direct methods
.method public synthetic constructor <init>(Lo2/p;I)V
    .locals 0

    iput p2, p0, Lo2/a;->a:I

    iput-object p1, p0, Lo2/a;->b:Lo2/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo2/a;->a:I

    iget-object v1, p0, Lo2/a;->b:Lo2/p;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/activity/y;

    iget-object p1, v1, Lo2/p;->e:Lo2/o;

    iget-boolean p1, p1, Lo2/o;->a:Z

    if-eqz p1, :cond_0

    iget-object p1, v1, Lo2/p;->d:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_0
    check-cast p1, Lm0/o0;

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    new-instance p1, Lb/c;

    const/4 v0, 0x7

    invoke-direct {p1, v1, v0}, Lb/c;-><init>(Ljava/lang/Object;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
