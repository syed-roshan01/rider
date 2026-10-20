.class public final Lh0/t;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lh0/n;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lh0/e0;

.field public final synthetic e:Lq8/c;


# direct methods
.method public constructor <init>(Lh0/n;IILh0/q0;Lq8/c;)V
    .locals 0

    iput-object p1, p0, Lh0/t;->a:Lh0/n;

    iput p2, p0, Lh0/t;->b:I

    iput p3, p0, Lh0/t;->c:I

    iput-object p4, p0, Lh0/t;->d:Lh0/e0;

    iput-object p5, p0, Lh0/t;->e:Lq8/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    iget-object v0, p0, Lh0/t;->e:Lq8/c;

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lh0/t;->d:Lh0/e0;

    check-cast v1, Lh0/q0;

    iget-boolean v2, v1, Lh0/q0;->a:Z

    iget-object v1, v1, Lh0/q0;->c:Lh0/n;

    invoke-virtual {v1}, Lh0/n;->b()I

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iget-object v5, p0, Lh0/t;->a:Lh0/n;

    iget-object v6, v5, Lh0/n;->d:La2/a0;

    iget v7, p0, Lh0/t;->b:I

    invoke-virtual {v6, v7}, La2/a0;->n(I)J

    move-result-wide v8

    sget v6, La2/b0;->c:I

    const/16 v6, 0x20

    shr-long v10, v8, v6

    long-to-int v6, v10

    iget-object v10, v5, Lh0/n;->d:La2/a0;

    invoke-virtual {v10, v6}, La2/a0;->f(I)I

    move-result v11

    iget-object v12, v10, La2/a0;->b:La2/i;

    if-ne v11, v0, :cond_1

    goto :goto_1

    :cond_1
    iget v6, v12, La2/i;->f:I

    if-lt v0, v6, :cond_2

    sub-int/2addr v6, v3

    invoke-virtual {v10, v6}, La2/a0;->j(I)I

    move-result v6

    goto :goto_1

    :cond_2
    invoke-virtual {v10, v0}, La2/a0;->j(I)I

    move-result v6

    :goto_1
    const-wide v13, 0xffffffffL

    and-long/2addr v8, v13

    long-to-int v8, v8

    invoke-virtual {v10, v8}, La2/a0;->f(I)I

    move-result v9

    if-ne v9, v0, :cond_3

    goto :goto_2

    :cond_3
    iget v8, v12, La2/i;->f:I

    if-lt v0, v8, :cond_4

    sub-int/2addr v8, v3

    invoke-virtual {v10, v8, v4}, La2/a0;->e(IZ)I

    move-result v8

    goto :goto_2

    :cond_4
    invoke-virtual {v10, v0, v4}, La2/a0;->e(IZ)I

    move-result v8

    :goto_2
    iget v0, p0, Lh0/t;->c:I

    if-ne v6, v0, :cond_5

    invoke-virtual {v5, v8}, Lh0/n;->a(I)Lh0/o;

    move-result-object v0

    goto :goto_4

    :cond_5
    if-ne v8, v0, :cond_6

    invoke-virtual {v5, v6}, Lh0/n;->a(I)Lh0/o;

    move-result-object v0

    goto :goto_4

    :cond_6
    xor-int v0, v2, v1

    if-eqz v0, :cond_7

    if-gt v7, v8, :cond_8

    goto :goto_3

    :cond_7
    if-lt v7, v6, :cond_9

    :cond_8
    move v6, v8

    :cond_9
    :goto_3
    invoke-virtual {v5, v6}, Lh0/n;->a(I)Lh0/o;

    move-result-object v0

    :goto_4
    return-object v0
.end method
