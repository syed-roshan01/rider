.class public final Lg8/v4;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/y4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg8/v4;->a:I

    iput-boolean p2, p0, Lg8/v4;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Lg8/g5;)V
    .locals 2

    iget v0, p0, Lg8/v4;->a:I

    iget-boolean v1, p0, Lg8/v4;->b:Z

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {p1, v1}, Lg8/z5;->c(Z)V

    return-void

    :pswitch_0
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {p1, v1}, Lg8/h0;->q(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
