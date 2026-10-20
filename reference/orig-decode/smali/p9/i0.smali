.class public final Lp9/i0;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/h0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp9/i0;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lq9/z;)Lp9/f;
    .locals 2

    iget v0, p0, Lp9/i0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lp9/k0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lp9/k0;-><init>(Lp9/o0;Lu8/e;)V

    new-instance p1, La4/c0;

    invoke-direct {p1, v0}, La4/c0;-><init>(Ljava/lang/Object;)V

    return-object p1

    :pswitch_0
    sget-object p1, Lp9/f0;->a:Lp9/f0;

    new-instance v0, La4/c0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La4/c0;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lp9/i0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "SharingStarted.Lazily"

    return-object v0

    :pswitch_0
    const-string v0, "SharingStarted.Eagerly"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
