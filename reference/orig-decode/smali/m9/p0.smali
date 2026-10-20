.class public final Lm9/p0;
.super Lm9/j1;


# instance fields
.field public final synthetic e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lm9/p0;->e:I

    invoke-direct {p0}, Lr9/j;-><init>()V

    iput-object p1, p0, Lm9/p0;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lm9/p0;->e:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/p0;->n(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/p0;->n(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/p0;->n(Ljava/lang/Throwable;)V

    return-object v0

    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm9/p0;->n(Ljava/lang/Throwable;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 2

    iget v0, p0, Lm9/p0;->e:I

    iget-object v1, p0, Lm9/p0;->f:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lu8/e;

    sget-object p1, Lq8/l;->a:Lq8/l;

    invoke-interface {v1, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lm9/j1;->m()Lm9/p1;

    move-result-object p1

    invoke-virtual {p1}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lm9/u;

    if-eqz v0, :cond_0

    check-cast v1, Lm9/l;

    check-cast p1, Lm9/u;

    iget-object p1, p1, Lm9/u;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    check-cast v1, Lm9/l;

    invoke-static {p1}, Lm9/e0;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm9/l;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void

    :pswitch_1
    check-cast v1, Lc9/c;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_2
    check-cast v1, Lm9/o0;

    invoke-interface {v1}, Lm9/o0;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
