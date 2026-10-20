.class public final Lr4/a;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr4/b;


# direct methods
.method public synthetic constructor <init>(Lr4/b;I)V
    .locals 0

    iput p2, p0, Lr4/a;->a:I

    iput-object p1, p0, Lr4/a;->b:Lr4/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lr4/a;->a:I

    iget-object v1, p0, Lr4/a;->b:Lr4/b;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lr4/b;->f:Lx9/q;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lx9/u;->b:Ljava/util/regex/Pattern;

    :try_start_0
    invoke-static {v0}, Lq8/k;->i(Ljava/lang/String;)Lx9/u;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v1

    :pswitch_0
    sget-object v0, Lx9/c;->n:Lx9/c;

    iget-object v0, v1, Lr4/b;->f:Lx9/q;

    invoke-static {v0}, Lq8/k;->l(Lx9/q;)Lx9/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
