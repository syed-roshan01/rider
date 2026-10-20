.class public final Lu/h1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lu/h1;->a:I

    iput-object p1, p0, Lu/h1;->b:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lq8/l;->a:Lq8/l;

    const/4 v1, 0x5

    iget-object v2, p0, Lu/h1;->b:Ljava/lang/String;

    iget v3, p0, Lu/h1;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "line"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly1/v;

    packed-switch v3, :pswitch_data_1

    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->a:Ly1/u;

    invoke-static {v2}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    sget-object v3, Ly1/t;->a:[Lj9/f;

    sget-object v3, Ly1/r;->a:Ly1/u;

    invoke-static {v2}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object v4, p1

    check-cast v4, Ly1/j;

    invoke-virtual {v4, v3, v2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    invoke-static {p1, v1}, Ly1/t;->d(Ly1/v;I)V

    :goto_0
    return-object v0

    :pswitch_2
    check-cast p1, Ly1/v;

    packed-switch v3, :pswitch_data_2

    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->a:Ly1/u;

    invoke-static {v2}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_3
    sget-object v3, Ly1/t;->a:[Lj9/f;

    sget-object v3, Ly1/r;->a:Ly1/u;

    invoke-static {v2}, Ld7/t;->d0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object v4, p1

    check-cast v4, Ly1/j;

    invoke-virtual {v4, v3, v2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    invoke-static {p1, v1}, Ly1/t;->d(Ly1/v;I)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method
