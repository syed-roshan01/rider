.class public final Ly/d;
.super Ljava/lang/Object;

# interfaces
.implements Ly/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly/d;->a:I

    return-void
.end method


# virtual methods
.method public final b(Lm2/b;I[ILm2/l;[I)V
    .locals 3

    sget-object p1, Lm2/l;->a:Lm2/l;

    iget v0, p0, Ly/d;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    if-ne p4, p1, :cond_0

    invoke-static {p3, p5, v2}, Ly/k;->e([I[IZ)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p3, p5, v1}, Ly/k;->f(I[I[IZ)V

    :goto_0
    return-void

    :pswitch_0
    if-ne p4, p1, :cond_1

    invoke-static {p2, p3, p5, v2}, Ly/k;->f(I[I[IZ)V

    goto :goto_1

    :cond_1
    invoke-static {p3, p5, v1}, Ly/k;->e([I[IZ)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ly/d;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Arrangement#Start"

    return-object v0

    :pswitch_0
    const-string v0, "Arrangement#End"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
