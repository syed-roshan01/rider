.class public final Lg8/w0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/t3;


# direct methods
.method public synthetic constructor <init>(Lg8/a3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/w0;->a:I

    iput-object p1, p0, Lg8/w0;->b:Lg8/t3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lg8/w0;->a:I

    iget-object v1, p0, Lg8/w0;->b:Lg8/t3;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lg8/t3;->a()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Lg8/t3;->b(Z)V

    return-void

    :pswitch_1
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Lg8/t3;->b(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
