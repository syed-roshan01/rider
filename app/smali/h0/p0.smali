.class public final Lh0/p0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly0/o;

.field public final synthetic c:Lc9/e;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lc9/e;III)V
    .locals 0

    iput p5, p0, Lh0/p0;->a:I

    iput-object p1, p0, Lh0/p0;->b:Ly0/o;

    iput-object p2, p0, Lh0/p0;->c:Lc9/e;

    iput p3, p0, Lh0/p0;->d:I

    iput p4, p0, Lh0/p0;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 4

    iget p2, p0, Lh0/p0;->a:I

    iget-object v0, p0, Lh0/p0;->c:Lc9/e;

    iget-object v1, p0, Lh0/p0;->b:Ly0/o;

    iget v2, p0, Lh0/p0;->e:I

    iget v3, p0, Lh0/p0;->d:I

    packed-switch p2, :pswitch_data_0

    or-int/lit8 p2, v3, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v1, v0, p1, p2, v2}, Lo1/s;->h(Ly0/o;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_0
    or-int/lit8 p2, v3, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v1, v0, p1, p2, v2}, Lr1/e1;->b(Ly0/o;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_1
    or-int/lit8 p2, v3, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v1, v0, p1, p2, v2}, Lf6/a;->j(Ly0/o;Lc9/e;Lm0/m;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lh0/p0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/p0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/p0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/p0;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
