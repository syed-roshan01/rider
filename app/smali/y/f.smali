.class public final Ly/f;
.super Ljava/lang/Object;

# interfaces
.implements Ly/g;
.implements Ly/i;


# instance fields
.field public final synthetic a:I

.field public final b:F


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Ly/f;->a:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-float p1, v1

    iput p1, p0, Ly/f;->b:F

    return-void

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-float p1, v1

    iput p1, p0, Ly/f;->b:F

    return-void

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-float p1, v1

    iput p1, p0, Ly/f;->b:F

    return-void

    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-float p1, v1

    iput p1, p0, Ly/f;->b:F

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Ly/f;->b:F

    return v0
.end method

.method public final b(Lm2/b;I[ILm2/l;[I)V
    .locals 3

    sget-object p1, Lm2/l;->a:Lm2/l;

    iget v0, p0, Ly/f;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    if-ne p4, p1, :cond_0

    invoke-static {p2, p3, p5, v2}, Ly/k;->i(I[I[IZ)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p3, p5, v1}, Ly/k;->i(I[I[IZ)V

    :goto_0
    return-void

    :pswitch_0
    if-ne p4, p1, :cond_1

    invoke-static {p2, p3, p5, v2}, Ly/k;->h(I[I[IZ)V

    goto :goto_1

    :cond_1
    invoke-static {p2, p3, p5, v1}, Ly/k;->h(I[I[IZ)V

    :goto_1
    return-void

    :pswitch_1
    if-ne p4, p1, :cond_2

    invoke-static {p2, p3, p5, v2}, Ly/k;->g(I[I[IZ)V

    goto :goto_2

    :cond_2
    invoke-static {p2, p3, p5, v1}, Ly/k;->g(I[I[IZ)V

    :goto_2
    return-void

    :pswitch_2
    if-ne p4, p1, :cond_3

    invoke-static {p2, p3, p5, v2}, Ly/k;->d(I[I[IZ)V

    goto :goto_3

    :cond_3
    invoke-static {p2, p3, p5, v1}, Ly/k;->d(I[I[IZ)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lm2/b;I[I[I)V
    .locals 1

    iget p1, p0, Ly/f;->a:I

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    invoke-static {p2, p3, p4, v0}, Ly/k;->i(I[I[IZ)V

    return-void

    :pswitch_0
    invoke-static {p2, p3, p4, v0}, Ly/k;->h(I[I[IZ)V

    return-void

    :pswitch_1
    invoke-static {p2, p3, p4, v0}, Ly/k;->g(I[I[IZ)V

    return-void

    :pswitch_2
    invoke-static {p2, p3, p4, v0}, Ly/k;->d(I[I[IZ)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ly/f;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Arrangement#SpaceEvenly"

    return-object v0

    :pswitch_0
    const-string v0, "Arrangement#SpaceBetween"

    return-object v0

    :pswitch_1
    const-string v0, "Arrangement#SpaceAround"

    return-object v0

    :pswitch_2
    const-string v0, "Arrangement#Center"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
