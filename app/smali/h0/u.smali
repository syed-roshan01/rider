.class public final Lh0/u;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILm0/g1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/u;->a:I

    iput p1, p0, Lh0/u;->b:I

    iput-object p2, p0, Lh0/u;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lh0/n;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/u;->a:I

    iput-object p1, p0, Lh0/u;->c:Ljava/lang/Object;

    iput p2, p0, Lh0/u;->b:I

    .line 2
    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lh0/u;->a:I

    iget v1, p0, Lh0/u;->b:I

    iget-object v2, p0, Lh0/u;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lm0/g1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_0
    check-cast v2, Lh0/n;

    iget-object v0, v2, Lh0/n;->d:La2/a0;

    invoke-virtual {v0, v1}, La2/a0;->f(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
