.class public final Ly/m;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly0/o;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;II)V
    .locals 0

    iput p3, p0, Ly/m;->a:I

    iput-object p1, p0, Ly/m;->b:Ly0/o;

    iput p2, p0, Ly/m;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ly/m;->c:I

    iget-object v2, p0, Ly/m;->b:Ly0/o;

    iget v3, p0, Ly/m;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v3, :pswitch_data_1

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v2, p1, p2}, Lf0/f;->b(Ly0/o;Lm0/m;I)V

    goto :goto_0

    :pswitch_0
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v2, p1, p2}, Ly/p;->a(Ly0/o;Lm0/m;I)V

    :goto_0
    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v3, :pswitch_data_2

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v2, p1, p2}, Lf0/f;->b(Ly0/o;Lm0/m;I)V

    goto :goto_1

    :pswitch_2
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v2, p1, p2}, Ly/p;->a(Ly0/o;Lm0/m;I)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
