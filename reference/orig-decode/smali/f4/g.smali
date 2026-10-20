.class public final Lf4/g;
.super Lf4/r;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf4/g;->a:I

    iput-object p2, p0, Lf4/g;->c:Ljava/lang/Object;

    iput-object p3, p0, Lf4/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lf4/q;)V
    .locals 3

    iget v0, p0, Lf4/g;->a:I

    iget-object v1, p0, Lf4/g;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lf4/q;

    invoke-virtual {v1}, Lf4/q;->z()V

    invoke-virtual {p1, p0}, Lf4/q;->w(Lf4/p;)V

    return-void

    :pswitch_0
    check-cast v1, Lq/f;

    iget-object v0, p0, Lf4/g;->c:Ljava/lang/Object;

    check-cast v0, Lf4/s;

    iget-object v0, v0, Lf4/s;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lf4/q;->w(Lf4/p;)V

    return-void

    :pswitch_1
    check-cast v1, Landroid/view/View;

    sget-object v0, Lf4/z;->a:Lf4/d0;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lf4/a0;->M(Landroid/view/View;F)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p0}, Lf4/q;->w(Lf4/p;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
