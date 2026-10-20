.class public final La0/j0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc9/a;


# direct methods
.method public synthetic constructor <init>(Lc9/a;I)V
    .locals 0

    iput p2, p0, La0/j0;->a:I

    iput-object p1, p0, La0/j0;->b:Lc9/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La0/j0;->a:I

    iget-object v1, p0, La0/j0;->b:Lc9/a;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm2/b;

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide v0, p1, Ld1/c;->a:J

    new-instance p1, Ld1/c;

    invoke-direct {p1, v0, v1}, Ld1/c;-><init>(J)V

    return-object p1

    :pswitch_0
    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/s;

    invoke-interface {v0}, La0/s;->c()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, La0/s;->a(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
