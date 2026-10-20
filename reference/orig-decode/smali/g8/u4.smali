.class public final Lg8/u4;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/y4;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg8/u4;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lg8/g5;)V
    .locals 1

    iget v0, p0, Lg8/u4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {p1}, Lg8/z5;->n()V

    return-void

    :pswitch_0
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {p1}, Lg8/h0;->o()V

    return-void

    :pswitch_1
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {p1}, Lg8/z5;->flush()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
