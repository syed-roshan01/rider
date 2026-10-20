.class public final Lo1/e;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lr1/s;

.field public final b:Lo1/j;


# direct methods
.method public constructor <init>(Lt1/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/e;->a:Lr1/s;

    new-instance p1, Lo1/j;

    invoke-direct {p1}, Lo1/j;-><init>()V

    iput-object p1, p0, Lo1/e;->b:Lo1/j;

    return-void
.end method


# virtual methods
.method public final a(JLt1/v;)V
    .locals 12

    iget-object v0, p0, Lo1/e;->b:Lo1/j;

    iget v1, p3, Lt1/v;->d:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    move v5, v2

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_5

    invoke-virtual {p3, v4}, Lt1/v;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly0/n;

    if-eqz v5, :cond_4

    iget-object v7, v0, Lo1/j;->a:Lo0/i;

    iget v8, v7, Lo0/i;->c:I

    if-lez v8, :cond_2

    iget-object v7, v7, Lo0/i;->a:[Ljava/lang/Object;

    move v9, v3

    :cond_0
    aget-object v10, v7, v9

    move-object v11, v10

    check-cast v11, Lo1/i;

    iget-object v11, v11, Lo1/i;->b:Ly0/n;

    invoke-static {v11, v6}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    if-lt v9, v8, :cond_0

    :cond_2
    const/4 v10, 0x0

    :goto_1
    check-cast v10, Lo1/i;

    if-eqz v10, :cond_3

    iput-boolean v2, v10, Lo1/i;->h:Z

    iget-object v0, v10, Lo1/i;->c:Lp1/b;

    invoke-virtual {v0, p1, p2}, Lp1/b;->a(J)V

    move-object v0, v10

    goto :goto_2

    :cond_3
    move v5, v3

    :cond_4
    new-instance v7, Lo1/i;

    invoke-direct {v7, v6}, Lo1/i;-><init>(Ly0/n;)V

    iget-object v6, v7, Lo1/i;->c:Lp1/b;

    invoke-virtual {v6, p1, p2}, Lp1/b;->a(J)V

    iget-object v0, v0, Lo1/j;->a:Lo0/i;

    invoke-virtual {v0, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v7

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final b(Lo1/f;Z)Z
    .locals 9

    iget-object v0, p0, Lo1/e;->b:Lo1/j;

    iget-object v1, p0, Lo1/e;->a:Lr1/s;

    iget-object v2, p1, Lo1/f;->a:Lq/l;

    invoke-virtual {v0, v2, v1, p1, p2}, Lo1/j;->a(Lq/l;Lr1/s;Lo1/f;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, Lo1/j;->a:Lo0/i;

    iget v3, v1, Lo0/i;->c:I

    const/4 v4, 0x1

    if-lez v3, :cond_4

    iget-object v5, v1, Lo0/i;->a:[Ljava/lang/Object;

    move v6, v2

    move v7, v6

    :cond_1
    aget-object v8, v5, v6

    check-cast v8, Lo1/i;

    invoke-virtual {v8, p1, p2}, Lo1/i;->f(Lo1/f;Z)Z

    move-result v8

    if-nez v8, :cond_3

    if-eqz v7, :cond_2

    goto :goto_0

    :cond_2
    move v7, v2

    goto :goto_1

    :cond_3
    :goto_0
    move v7, v4

    :goto_1
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v3, :cond_1

    goto :goto_2

    :cond_4
    move v7, v2

    :goto_2
    iget p2, v1, Lo0/i;->c:I

    if-lez p2, :cond_8

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    move v3, v2

    move v5, v3

    :cond_5
    aget-object v6, v1, v3

    check-cast v6, Lo1/i;

    invoke-virtual {v6, p1}, Lo1/i;->e(Lo1/f;)Z

    move-result v6

    if-nez v6, :cond_7

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    move v5, v2

    goto :goto_4

    :cond_7
    :goto_3
    move v5, v4

    :goto_4
    add-int/lit8 v3, v3, 0x1

    if-lt v3, p2, :cond_5

    goto :goto_5

    :cond_8
    move v5, v2

    :goto_5
    invoke-virtual {v0, p1}, Lo1/j;->b(Lo1/f;)V

    if-nez v5, :cond_9

    if-eqz v7, :cond_a

    :cond_9
    move v2, v4

    :cond_a
    return v2
.end method
