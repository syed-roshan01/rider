.class public final Lg8/g2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/h2;


# direct methods
.method public synthetic constructor <init>(Lg8/h2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/g2;->a:I

    iput-object p1, p0, Lg8/g2;->b:Lg8/h2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lg8/g2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v1, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v1, v1, Lg8/j2;->s:Ljava/util/ArrayList;

    iget-object v0, v0, Lg8/h2;->a:Lg8/o0;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->w:Le8/y;

    iget-object v0, v0, Le8/y;->a:Le8/x;

    sget-object v1, Le8/x;->e:Le8/x;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->s:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lg8/a2;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lg8/a2;-><init>(Lg8/j2;I)V

    iget-object v0, v0, Lg8/j2;->k:Le8/h2;

    invoke-virtual {v0, v1}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v1, v0, Lg8/h2;->c:Lg8/j2;

    const/4 v2, 0x0

    iput-object v2, v1, Lg8/j2;->n:Lg8/i1;

    iget-object v3, v1, Lg8/j2;->x:Le8/c2;

    if-eqz v3, :cond_2

    iget-object v0, v1, Lg8/j2;->v:Lg8/u3;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Unexpected non-null activeTransport"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v1, v0, Lg8/h2;->a:Lg8/o0;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iget-object v0, v0, Lg8/j2;->x:Le8/c2;

    invoke-interface {v1, v0}, Lg8/u3;->f(Le8/c2;)V

    goto :goto_1

    :cond_2
    iget-object v3, v1, Lg8/j2;->u:Lg8/o0;

    iget-object v0, v0, Lg8/h2;->a:Lg8/o0;

    if-ne v3, v0, :cond_3

    iput-object v0, v1, Lg8/j2;->v:Lg8/u3;

    iget-object v0, p0, Lg8/g2;->b:Lg8/h2;

    iget-object v0, v0, Lg8/h2;->c:Lg8/j2;

    iput-object v2, v0, Lg8/j2;->u:Lg8/o0;

    sget-object v1, Le8/x;->b:Le8/x;

    invoke-static {v0, v1}, Lg8/j2;->g(Lg8/j2;Le8/x;)V

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
