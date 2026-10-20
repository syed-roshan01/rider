.class public final Lz/l;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:La0/s;


# direct methods
.method public synthetic constructor <init>(La0/s;ILjava/lang/Object;II)V
    .locals 0

    iput p5, p0, Lz/l;->a:I

    iput-object p1, p0, Lz/l;->e:La0/s;

    iput p2, p0, Lz/l;->b:I

    iput-object p3, p0, Lz/l;->c:Ljava/lang/Object;

    iput p4, p0, Lz/l;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 4

    iget p2, p0, Lz/l;->a:I

    iget-object v0, p0, Lz/l;->c:Ljava/lang/Object;

    iget v1, p0, Lz/l;->b:I

    iget v2, p0, Lz/l;->d:I

    iget-object v3, p0, Lz/l;->e:La0/s;

    packed-switch p2, :pswitch_data_0

    check-cast v3, Lb0/t;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v3, v1, v0, p1, p2}, Lb0/t;->e(ILjava/lang/Object;Lm0/m;I)V

    return-void

    :pswitch_0
    check-cast v3, Lz/m;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v3, v1, v0, p1, p2}, Lz/m;->e(ILjava/lang/Object;Lm0/m;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lz/l;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz/l;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz/l;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
