.class public final Lu1/w0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/g1;


# direct methods
.method public synthetic constructor <init>(ILm0/g1;)V
    .locals 0

    iput p1, p0, Lu1/w0;->a:I

    iput-object p2, p0, Lu1/w0;->b:Lm0/g1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Lu1/w0;->a:I

    iget-object v1, p0, Lu1/w0;->b:Lm0/g1;

    const-string v2, "it"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_3
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_4
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_5
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_6
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_7
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_8
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_9
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_a
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_b
    invoke-static {p1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu1/w0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_7
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_8
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_9
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_a
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_b
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lu1/w0;->a(Ljava/lang/String;)V

    return-object v0

    :pswitch_c
    check-cast p1, Landroid/content/res/Configuration;

    new-instance v1, Landroid/content/res/Configuration;

    invoke-direct {v1, p1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iget-object p1, p0, Lu1/w0;->b:Lm0/g1;

    invoke-interface {p1, v1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
