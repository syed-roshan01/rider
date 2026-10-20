.class public final Li1/d0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li1/e0;


# direct methods
.method public synthetic constructor <init>(Li1/e0;I)V
    .locals 0

    iput p2, p0, Li1/d0;->a:I

    iput-object p1, p0, Li1/d0;->b:Li1/e0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Li1/d0;->a:I

    iget-object v2, p0, Li1/d0;->b:Li1/e0;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lg1/g;

    iget-object v1, v2, Li1/e0;->b:Li1/c;

    iget v3, v2, Li1/e0;->k:F

    iget v2, v2, Li1/e0;->l:F

    sget-wide v4, Ld1/c;->b:J

    invoke-interface {p1}, Lg1/g;->A()Lg1/b;

    move-result-object v6

    invoke-virtual {v6}, Lg1/b;->b()J

    move-result-wide v7

    invoke-virtual {v6}, Lg1/b;->a()Le1/p;

    move-result-object v9

    invoke-interface {v9}, Le1/p;->j()V

    iget-object v9, v6, Lg1/b;->a:Lg1/d;

    invoke-virtual {v9, v3, v2, v4, v5}, Lg1/d;->b(FFJ)V

    invoke-virtual {v1, p1}, Li1/c;->a(Lg1/g;)V

    invoke-virtual {v6}, Lg1/b;->a()Le1/p;

    move-result-object p1

    invoke-interface {p1}, Le1/p;->h()V

    invoke-virtual {v6, v7, v8}, Lg1/b;->c(J)V

    return-object v0

    :pswitch_0
    check-cast p1, Li1/c0;

    const/4 p1, 0x1

    iput-boolean p1, v2, Li1/e0;->d:Z

    iget-object p1, v2, Li1/e0;->f:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
