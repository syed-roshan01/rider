.class public Lo1/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lo0/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/i;

    const/16 v1, 0x10

    new-array v1, v1, [Lo1/i;

    invoke-direct {v0, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v0, p0, Lo1/j;->a:Lo0/i;

    return-void
.end method


# virtual methods
.method public a(Lq/l;Lr1/s;Lo1/f;Z)Z
    .locals 6

    iget-object v0, p0, Lo1/j;->a:Lo0/i;

    iget v1, v0, Lo0/i;->c:I

    const/4 v2, 0x0

    if-lez v1, :cond_3

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    move v3, v2

    move v4, v3

    :cond_0
    aget-object v5, v0, v3

    check-cast v5, Lo1/i;

    invoke-virtual {v5, p1, p2, p3, p4}, Lo1/i;->a(Lq/l;Lr1/s;Lo1/f;Z)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :goto_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v1, :cond_0

    move v2, v4

    :cond_3
    return v2
.end method

.method public b(Lo1/f;)V
    .locals 2

    iget-object p1, p0, Lo1/j;->a:Lo0/i;

    iget v0, p1, Lo0/i;->c:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    iget-object v1, p1, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v1, v1, v0

    check-cast v1, Lo1/i;

    iget-object v1, v1, Lo1/i;->c:Lp1/b;

    iget v1, v1, Lp1/b;->a:I

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo1/j;->a:Lo0/i;

    iget v2, v1, Lo0/i;->c:I

    if-ge v0, v2, :cond_1

    iget-object v2, v1, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v2, v2, v0

    check-cast v2, Lo1/i;

    iget-object v3, v2, Lo1/i;->b:Ly0/n;

    iget-boolean v3, v3, Ly0/n;->t:Z

    if-nez v3, :cond_0

    invoke-virtual {v1, v0}, Lo0/i;->n(I)Ljava/lang/Object;

    invoke-virtual {v2}, Lo1/i;->d()V

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2}, Lo1/j;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method
