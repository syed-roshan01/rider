.class public final Lz/x;
.super Ljava/lang/Object;

# interfaces
.implements Lz/k;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Z

.field public final d:Ly0/b;

.field public final e:Ly0/c;

.field public final f:Lm2/l;

.field public final g:Z

.field public final h:I

.field public final i:J

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Lz/j;

.field public m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public q:Z

.field public r:I

.field public final s:[I


# direct methods
.method public constructor <init>(ILjava/util/List;ZLy0/b;Ly0/c;Lm2/l;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lz/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz/x;->a:I

    iput-object p2, p0, Lz/x;->b:Ljava/util/List;

    iput-boolean p3, p0, Lz/x;->c:Z

    iput-object p4, p0, Lz/x;->d:Ly0/b;

    iput-object p5, p0, Lz/x;->e:Ly0/c;

    iput-object p6, p0, Lz/x;->f:Lm2/l;

    iput-boolean p7, p0, Lz/x;->g:Z

    iput p10, p0, Lz/x;->h:I

    iput-wide p11, p0, Lz/x;->i:J

    iput-object p13, p0, Lz/x;->j:Ljava/lang/Object;

    iput-object p14, p0, Lz/x;->k:Ljava/lang/Object;

    iput-object p15, p0, Lz/x;->l:Lz/j;

    const/high16 p1, -0x80000000

    iput p1, p0, Lz/x;->r:I

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 p3, 0x0

    move p4, p3

    move p5, p4

    move p6, p5

    :goto_0
    if-ge p4, p1, :cond_2

    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lr1/x0;

    iget-boolean p8, p0, Lz/x;->c:Z

    if-eqz p8, :cond_0

    iget p9, p7, Lr1/x0;->b:I

    goto :goto_1

    :cond_0
    iget p9, p7, Lr1/x0;->a:I

    :goto_1
    add-int/2addr p5, p9

    if-nez p8, :cond_1

    iget p7, p7, Lr1/x0;->b:I

    goto :goto_2

    :cond_1
    iget p7, p7, Lr1/x0;->a:I

    :goto_2
    invoke-static {p6, p7}, Ljava/lang/Math;->max(II)I

    move-result p6

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    iput p5, p0, Lz/x;->n:I

    iget p1, p0, Lz/x;->h:I

    add-int/2addr p5, p1

    if-gez p5, :cond_3

    goto :goto_3

    :cond_3
    move p3, p5

    :goto_3
    iput p3, p0, Lz/x;->o:I

    iput p6, p0, Lz/x;->p:I

    iget-object p1, p0, Lz/x;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Lz/x;->s:[I

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 2

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lz/x;->s:[I

    aget v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    invoke-static {v1, p1}, Li1/b;->c(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(Lr1/w0;)V
    .locals 15

    move-object v0, p0

    iget v1, v0, Lz/x;->r:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_8

    iget-object v1, v0, Lz/x;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_7

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lr1/x0;

    iget-boolean v4, v0, Lz/x;->c:Z

    if-eqz v4, :cond_0

    iget v5, v6, Lr1/x0;->b:I

    goto :goto_1

    :cond_0
    iget v5, v6, Lr1/x0;->a:I

    :goto_1
    invoke-virtual {p0, v3}, Lz/x;->a(I)J

    move-result-wide v7

    iget-object v5, v0, Lz/x;->l:Lz/j;

    iget-object v5, v5, Lz/j;->a:Ljava/util/LinkedHashMap;

    iget-object v9, v0, Lz/x;->j:Ljava/lang/Object;

    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz/h;

    sget-object v9, La0/h;->a:La0/g;

    iget-boolean v5, v0, Lz/x;->g:Z

    const-wide v10, 0xffffffffL

    const/16 v12, 0x20

    if-eqz v5, :cond_5

    sget v5, Lm2/i;->c:I

    if-eqz v4, :cond_1

    shr-long v13, v7, v12

    long-to-int v5, v13

    goto :goto_3

    :cond_1
    shr-long v13, v7, v12

    long-to-int v5, v13

    iget v13, v0, Lz/x;->r:I

    sub-int/2addr v13, v5

    if-eqz v4, :cond_2

    iget v5, v6, Lr1/x0;->b:I

    goto :goto_2

    :cond_2
    iget v5, v6, Lr1/x0;->a:I

    :goto_2
    sub-int v5, v13, v5

    :goto_3
    if-eqz v4, :cond_4

    and-long/2addr v7, v10

    long-to-int v7, v7

    iget v8, v0, Lz/x;->r:I

    sub-int/2addr v8, v7

    if-eqz v4, :cond_3

    iget v7, v6, Lr1/x0;->b:I

    goto :goto_4

    :cond_3
    iget v7, v6, Lr1/x0;->a:I

    :goto_4
    sub-int/2addr v8, v7

    goto :goto_5

    :cond_4
    and-long/2addr v7, v10

    long-to-int v8, v7

    :goto_5
    invoke-static {v5, v8}, Li1/b;->c(II)J

    move-result-wide v7

    :cond_5
    sget v5, Lm2/i;->c:I

    shr-long v13, v7, v12

    long-to-int v5, v13

    iget-wide v13, v0, Lz/x;->i:J

    shr-long v10, v13, v12

    long-to-int v10, v10

    add-int/2addr v5, v10

    const-wide v10, 0xffffffffL

    and-long/2addr v7, v10

    long-to-int v7, v7

    and-long/2addr v10, v13

    long-to-int v8, v10

    add-int/2addr v7, v8

    invoke-static {v5, v7}, Li1/b;->c(II)J

    move-result-wide v7

    if-eqz v4, :cond_6

    const/4 v10, 0x2

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v10}, Lr1/w0;->m(Lr1/w0;Lr1/x0;JLa0/g;I)V

    goto :goto_6

    :cond_6
    const/4 v10, 0x2

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v10}, Lr1/w0;->i(Lr1/w0;Lr1/x0;JLa0/g;I)V

    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_7
    return-void

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "position() should be called first"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c(III)V
    .locals 10

    iput p1, p0, Lz/x;->m:I

    iget-boolean v0, p0, Lz/x;->c:Z

    if-eqz v0, :cond_0

    move v1, p3

    goto :goto_0

    :cond_0
    move v1, p2

    :goto_0
    iput v1, p0, Lz/x;->r:I

    iget-object v1, p0, Lz/x;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/x0;

    mul-int/lit8 v5, v3, 0x2

    iget-object v6, p0, Lz/x;->s:[I

    if-eqz v0, :cond_2

    iget-object v7, p0, Lz/x;->d:Ly0/b;

    if-eqz v7, :cond_1

    iget v8, v4, Lr1/x0;->a:I

    iget-object v9, p0, Lz/x;->f:Lm2/l;

    check-cast v7, Ly0/e;

    invoke-virtual {v7, v8, p2, v9}, Ly0/e;->a(IILm2/l;)I

    move-result v7

    aput v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    aput p1, v6, v5

    iget v4, v4, Lr1/x0;->b:I

    :goto_2
    add-int/2addr p1, v4

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null horizontalAlignment when isVertical == true"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    aput p1, v6, v5

    add-int/lit8 v5, v5, 0x1

    iget-object v7, p0, Lz/x;->e:Ly0/c;

    if-eqz v7, :cond_3

    iget v8, v4, Lr1/x0;->b:I

    check-cast v7, Ly0/f;

    invoke-virtual {v7, v8, p3}, Ly0/f;->a(II)I

    move-result v7

    aput v7, v6, v5

    iget v4, v4, Lr1/x0;->a:I

    goto :goto_2

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null verticalAlignment when isVertical == false"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method
