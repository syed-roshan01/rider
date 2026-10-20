.class public final Ly1/p;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/compose/ui/node/a;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/p;->a:Landroidx/compose/ui/node/a;

    return-void
.end method


# virtual methods
.method public final a()Ly1/o;
    .locals 10

    iget-object v0, p0, Ly1/p;->a:Landroidx/compose/ui/node/a;

    iget-object v1, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v1, Lt1/x0;->e:Ly0/n;

    iget v2, v1, Ly0/n;->d:I

    and-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_8

    :goto_0
    if-eqz v1, :cond_8

    iget v2, v1, Ly0/n;->c:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_7

    move-object v2, v1

    move-object v5, v4

    :goto_1
    if-eqz v2, :cond_7

    instance-of v6, v2, Lt1/r1;

    if-eqz v6, :cond_0

    move-object v4, v2

    goto :goto_4

    :cond_0
    iget v6, v2, Ly0/n;->c:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_6

    instance-of v6, v2, Lt1/o;

    if-eqz v6, :cond_6

    move-object v6, v2

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    move v7, v3

    :goto_2
    const/4 v8, 0x1

    if-eqz v6, :cond_5

    iget v9, v6, Ly0/n;->c:I

    and-int/lit8 v9, v9, 0x8

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v2, v6

    goto :goto_3

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, Lo0/i;

    const/16 v8, 0x10

    new-array v8, v8, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v5, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v4

    :cond_3
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_1

    :cond_7
    iget v2, v1, Ly0/n;->d:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_8

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_8
    :goto_4
    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v4, Lt1/r1;

    check-cast v4, Ly0/n;

    iget-object v1, v4, Ly0/n;->a:Ly0/n;

    new-instance v2, Ly1/j;

    invoke-direct {v2}, Ly1/j;-><init>()V

    new-instance v4, Ly1/o;

    invoke-direct {v4, v1, v3, v0, v2}, Ly1/o;-><init>(Ly0/n;ZLandroidx/compose/ui/node/a;Ly1/j;)V

    return-object v4
.end method
