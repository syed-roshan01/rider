.class public final Landroidx/fragment/app/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/fragment/app/j;->a:I

    iput-object p2, p0, Landroidx/fragment/app/j;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/j;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/j;->a:I

    iget-object v1, p0, Landroidx/fragment/app/j;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Landroidx/fragment/app/t1;

    invoke-virtual {v1}, Landroidx/fragment/app/t1;->c()V

    return-void

    :pswitch_0
    check-cast v1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-static {v1, v0}, Landroidx/fragment/app/h1;->a(Ljava/util/ArrayList;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
