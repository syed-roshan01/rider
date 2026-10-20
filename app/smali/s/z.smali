.class public final Ls/z;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr1/x0;


# direct methods
.method public synthetic constructor <init>(Lr1/x0;I)V
    .locals 0

    iput p2, p0, Ls/z;->a:I

    iput-object p1, p0, Ls/z;->b:Lr1/x0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr1/w0;)V
    .locals 4

    iget v0, p0, Ls/z;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Ls/z;->b:Lr1/x0;

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v2, v3, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_0
    invoke-static {p1, v2, v3, v3}, Lr1/w0;->h(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_1
    invoke-static {p1, v2, v3, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v3, v1}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v3, v1}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_4
    invoke-static {p1, v2, v3, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_5
    invoke-static {p1, v2, v3, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_6
    invoke-static {p1, v2, v3, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_7
    invoke-static {p1, v2, v3, v3}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    return-void

    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v3, v1}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3, v3, v1}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/z;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_2
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_3
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_4
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_5
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_6
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_7
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_8
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    :pswitch_9
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/z;->a(Lr1/w0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
