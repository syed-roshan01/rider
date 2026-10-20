.class public final Lg8/a1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/d1;


# direct methods
.method public synthetic constructor <init>(Lg8/d1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/a1;->a:I

    iput-object p1, p0, Lg8/a1;->b:Lg8/d1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lg8/a1;->a:I

    iget-object v1, p0, Lg8/a1;->b:Lg8/d1;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0}, Lg8/h0;->o()V

    return-void

    :pswitch_0
    iget-object v0, v1, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->flush()V

    return-void

    :pswitch_1
    invoke-virtual {v1}, Lg8/d1;->s()V

    return-void

    :pswitch_2
    iget-object v0, v1, Lg8/d1;->c:Lg8/h0;

    invoke-interface {v0}, Lg8/z5;->n()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
