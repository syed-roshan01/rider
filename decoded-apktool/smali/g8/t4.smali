.class public final Lg8/t4;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/y4;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/y2;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg8/y2;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lg8/t4;->a:I

    iput-object p1, p0, Lg8/t4;->b:Lg8/y2;

    iput-object p2, p0, Lg8/t4;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lg8/g5;)V
    .locals 3

    iget v0, p0, Lg8/t4;->a:I

    iget-object v1, p0, Lg8/t4;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lg8/g5;->a:Lg8/h0;

    iget-object v2, p0, Lg8/t4;->b:Lg8/y2;

    iget-object v2, v2, Lg8/y2;->a:Le8/p1;

    invoke-virtual {v2, v1}, Le8/p1;->d(Ljava/lang/Object;)Ll8/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lg8/z5;->l(Ljava/io/InputStream;)V

    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    invoke-interface {p1}, Lg8/z5;->flush()V

    return-void

    :pswitch_0
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    check-cast v1, Le8/e0;

    invoke-interface {p1, v1}, Lg8/h0;->h(Le8/e0;)V

    return-void

    :pswitch_1
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    check-cast v1, Le8/c0;

    invoke-interface {p1, v1}, Lg8/h0;->g(Le8/c0;)V

    return-void

    :pswitch_2
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    check-cast v1, Le8/s;

    invoke-interface {p1, v1}, Lg8/z5;->d(Le8/s;)V

    return-void

    :pswitch_3
    iget-object p1, p1, Lg8/g5;->a:Lg8/h0;

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Lg8/h0;->m(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
