.class public final Ly/h0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lr1/x0;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(ILr1/x0;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ly/h0;->a:I

    iput p1, p0, Ly/h0;->b:I

    iput-object p2, p0, Ly/h0;->c:Lr1/x0;

    iput p3, p0, Ly/h0;->d:I

    .line 1
    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lr1/x0;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ly/h0;->a:I

    iput-object p1, p0, Ly/h0;->c:Lr1/x0;

    iput p2, p0, Ly/h0;->b:I

    iput p3, p0, Ly/h0;->d:I

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr1/w0;)V
    .locals 6

    iget v0, p0, Ly/h0;->a:I

    const/4 v1, 0x0

    iget v2, p0, Ly/h0;->d:I

    iget v3, p0, Ly/h0;->b:I

    iget-object v4, p0, Ly/h0;->c:Lr1/x0;

    packed-switch v0, :pswitch_data_0

    iget v0, v4, Lr1/x0;->a:I

    sub-int/2addr v3, v0

    int-to-float v0, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v0, v3

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    iget v5, v4, Lr1/x0;->b:I

    sub-int/2addr v2, v5

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-static {v2}, Ld7/t;->p0(F)I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v0, v2, v1}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v3, v2, v1}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ly/h0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ly/h0;->a(Lr1/w0;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ly/h0;->a(Lr1/w0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
