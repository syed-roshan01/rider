.class public final Ly/e;
.super Ljava/lang/Object;

# interfaces
.implements Ly/i;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly/e;->a:I

    return-void
.end method


# virtual methods
.method public final c(Lm2/b;I[I[I)V
    .locals 1

    iget p1, p0, Ly/e;->a:I

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    invoke-static {p3, p4, v0}, Ly/k;->e([I[IZ)V

    return-void

    :pswitch_0
    invoke-static {p2, p3, p4, v0}, Ly/k;->f(I[I[IZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ly/e;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Arrangement#Top"

    return-object v0

    :pswitch_0
    const-string v0, "Arrangement#Bottom"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
