.class public final Ls/o;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILq/r;La0/r0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls/o;->a:I

    iput p1, p0, Ls/o;->b:I

    iput p2, p0, Ls/o;->c:I

    iput-object p3, p0, Ls/o;->d:Ljava/lang/Object;

    iput-object p4, p0, Ls/o;->e:Ljava/lang/Object;

    .line 1
    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lr1/x0;Ls/p;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls/o;->a:I

    iput-object p1, p0, Ls/o;->d:Ljava/lang/Object;

    iput-object p2, p0, Ls/o;->e:Ljava/lang/Object;

    iput p3, p0, Ls/o;->b:I

    iput p4, p0, Ls/o;->c:I

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lq8/l;->a:Lq8/l;

    iget v2, v0, Ls/o;->a:I

    iget-object v3, v0, Ls/o;->e:Ljava/lang/Object;

    iget-object v4, v0, Ls/o;->d:Ljava/lang/Object;

    iget v5, v0, Ls/o;->c:I

    iget v6, v0, Ls/o;->b:I

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, La0/e;

    iget-object v7, v2, La0/e;->c:Ljava/lang/Object;

    check-cast v7, La0/o;

    invoke-interface {v7}, La0/o;->getKey()Lc9/c;

    move-result-object v7

    iget v8, v2, La0/e;->a:I

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v2, v2, La0/e;->b:I

    add-int/2addr v2, v8

    add-int/lit8 v2, v2, -0x1

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-gt v6, v2, :cond_3

    :goto_0
    if-eqz v7, :cond_0

    sub-int v5, v6, v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    :cond_0
    new-instance v5, La0/c;

    invoke-direct {v5, v6}, La0/c;-><init>(I)V

    :cond_1
    move-object v9, v4

    check-cast v9, Lq/r;

    invoke-virtual {v9, v5}, Lq/r;->c(Ljava/lang/Object;)I

    move-result v10

    if-gez v10, :cond_2

    not-int v10, v10

    :cond_2
    iget-object v11, v9, Lq/r;->b:[Ljava/lang/Object;

    aput-object v5, v11, v10

    iget-object v9, v9, Lq/r;->c:[I

    aput v6, v9, v10

    move-object v9, v3

    check-cast v9, La0/r0;

    iget-object v10, v9, La0/r0;->b:[Ljava/lang/Object;

    iget v9, v9, La0/r0;->c:I

    sub-int v9, v6, v9

    aput-object v5, v10, v9

    if-eq v6, v2, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    check-cast v4, [Lr1/x0;

    check-cast v3, Ls/p;

    array-length v7, v4

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_5

    aget-object v9, v4, v8

    if-eqz v9, :cond_4

    iget-object v10, v3, Ls/p;->a:Ls/w;

    iget-object v10, v10, Ls/w;->b:Ly0/d;

    iget v11, v9, Lr1/x0;->a:I

    iget v12, v9, Lr1/x0;->b:I

    invoke-static {v11, v12}, Lo1/s;->e(II)J

    move-result-wide v14

    invoke-static {v6, v5}, Lo1/s;->e(II)J

    move-result-wide v16

    sget-object v18, Lm2/l;->a:Lm2/l;

    move-object v13, v10

    check-cast v13, Ly0/g;

    invoke-virtual/range {v13 .. v18}, Ly0/g;->a(JJLm2/l;)J

    move-result-wide v10

    sget v12, Lm2/i;->c:I

    const/16 v12, 0x20

    shr-long v12, v10, v12

    long-to-int v12, v12

    const-wide v13, 0xffffffffL

    and-long/2addr v10, v13

    long-to-int v10, v10

    invoke-static {v2, v9, v12, v10}, Lr1/w0;->d(Lr1/w0;Lr1/x0;II)V

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
