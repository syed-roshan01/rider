.class public final Lw0/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Le9/a;


# static fields
.field public static final e:Lw0/n;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I

.field public final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lw0/n;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lw0/n;-><init>(JJI[I)V

    sput-object v7, Lw0/n;->e:Lw0/n;

    return-void
.end method

.method public constructor <init>(JJI[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lw0/n;->a:J

    iput-wide p3, p0, Lw0/n;->b:J

    iput p5, p0, Lw0/n;->c:I

    iput-object p6, p0, Lw0/n;->d:[I

    return-void
.end method


# virtual methods
.method public final e(Lw0/n;)Lw0/n;
    .locals 10

    sget-object v0, Lw0/n;->e:Lw0/n;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    if-ne p0, v0, :cond_1

    return-object v0

    :cond_1
    iget v0, p1, Lw0/n;->c:I

    iget v6, p0, Lw0/n;->c:I

    if-ne v0, v6, :cond_2

    iget-object v7, p0, Lw0/n;->d:[I

    iget-object v0, p1, Lw0/n;->d:[I

    if-ne v0, v7, :cond_2

    new-instance v0, Lw0/n;

    iget-wide v1, p1, Lw0/n;->a:J

    not-long v1, v1

    iget-wide v3, p0, Lw0/n;->a:J

    and-long v2, v3, v1

    iget-wide v4, p1, Lw0/n;->b:J

    not-long v4, v4

    iget-wide v8, p0, Lw0/n;->b:J

    and-long/2addr v4, v8

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v0, p0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lw0/n;->i(I)Lw0/n;

    move-result-object v0

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public final i(I)Lw0/n;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v6, v0, Lw0/n;->c:I

    sub-int v2, v1, v6

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x1

    const/16 v5, 0x40

    if-ltz v2, :cond_0

    if-ge v2, v5, :cond_0

    shl-long v1, v7, v2

    iget-wide v7, v0, Lw0/n;->b:J

    and-long v9, v7, v1

    cmp-long v3, v9, v3

    if-eqz v3, :cond_5

    new-instance v9, Lw0/n;

    iget-wide v3, v0, Lw0/n;->a:J

    not-long v1, v1

    and-long/2addr v7, v1

    iget-object v10, v0, Lw0/n;->d:[I

    move-object v1, v9

    move-wide v2, v3

    move-wide v4, v7

    move-object v7, v10

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    return-object v9

    :cond_0
    if-lt v2, v5, :cond_1

    const/16 v9, 0x80

    if-ge v2, v9, :cond_1

    sub-int/2addr v2, v5

    shl-long v1, v7, v2

    iget-wide v7, v0, Lw0/n;->a:J

    and-long v9, v7, v1

    cmp-long v3, v9, v3

    if-eqz v3, :cond_5

    new-instance v9, Lw0/n;

    not-long v1, v1

    and-long v2, v7, v1

    iget-wide v4, v0, Lw0/n;->b:J

    iget-object v7, v0, Lw0/n;->d:[I

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    return-object v9

    :cond_1
    if-gez v2, :cond_5

    iget-object v2, v0, Lw0/n;->d:[I

    if-eqz v2, :cond_5

    invoke-static {v2, v1}, Lo7/d0;->k([II)I

    move-result v1

    if-ltz v1, :cond_5

    array-length v3, v2

    add-int/lit8 v4, v3, -0x1

    if-nez v4, :cond_2

    new-instance v1, Lw0/n;

    iget-wide v6, v0, Lw0/n;->a:J

    iget-wide v8, v0, Lw0/n;->b:J

    iget v10, v0, Lw0/n;->c:I

    const/4 v11, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, Lw0/n;-><init>(JJI[I)V

    return-object v1

    :cond_2
    new-array v5, v4, [I

    if-lez v1, :cond_3

    const/4 v6, 0x0

    invoke-static {v6, v6, v1, v2, v5}, Lb9/b;->G(III[I[I)V

    :cond_3
    if-ge v1, v4, :cond_4

    add-int/lit8 v4, v1, 0x1

    invoke-static {v1, v4, v3, v2, v5}, Lb9/b;->G(III[I[I)V

    :cond_4
    new-instance v1, Lw0/n;

    iget-wide v13, v0, Lw0/n;->a:J

    iget-wide v2, v0, Lw0/n;->b:J

    iget v4, v0, Lw0/n;->c:I

    move-object v12, v1

    move-wide v15, v2

    move/from16 v17, v4

    move-object/from16 v18, v5

    invoke-direct/range {v12 .. v18}, Lw0/n;-><init>(JJI[I)V

    return-object v1

    :cond_5
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lw0/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw0/m;-><init>(Lw0/n;Lu8/e;)V

    new-instance v1, Lk9/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v1, v0}, Ld7/t;->M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;

    move-result-object v0

    iput-object v0, v1, Lk9/j;->c:Lu8/e;

    return-object v1
.end method

.method public final k(I)Z
    .locals 10

    iget v0, p0, Lw0/n;->c:I

    sub-int v0, p1, v0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x1

    const/4 v5, 0x1

    const/16 v6, 0x40

    const/4 v7, 0x0

    if-ltz v0, :cond_1

    if-ge v0, v6, :cond_1

    shl-long/2addr v3, v0

    iget-wide v8, p0, Lw0/n;->b:J

    and-long/2addr v3, v8

    cmp-long p1, v3, v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v5, v7

    :goto_0
    return v5

    :cond_1
    if-lt v0, v6, :cond_3

    const/16 v8, 0x80

    if-ge v0, v8, :cond_3

    sub-int/2addr v0, v6

    shl-long/2addr v3, v0

    iget-wide v8, p0, Lw0/n;->a:J

    and-long/2addr v3, v8

    cmp-long p1, v3, v1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v5, v7

    :goto_1
    return v5

    :cond_3
    if-lez v0, :cond_4

    return v7

    :cond_4
    iget-object v0, p0, Lw0/n;->d:[I

    if-eqz v0, :cond_6

    invoke-static {v0, p1}, Lo7/d0;->k([II)I

    move-result p1

    if-ltz p1, :cond_5

    goto :goto_2

    :cond_5
    move v5, v7

    :goto_2
    move v7, v5

    :cond_6
    return v7
.end method

.method public final n(Lw0/n;)Lw0/n;
    .locals 10

    sget-object v0, Lw0/n;->e:Lw0/n;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    if-ne p0, v0, :cond_1

    return-object p1

    :cond_1
    iget v0, p1, Lw0/n;->c:I

    iget v6, p0, Lw0/n;->c:I

    if-ne v0, v6, :cond_2

    iget-object v7, p0, Lw0/n;->d:[I

    iget-object v0, p1, Lw0/n;->d:[I

    if-ne v0, v7, :cond_2

    new-instance v0, Lw0/n;

    iget-wide v1, p0, Lw0/n;->a:J

    iget-wide v3, p1, Lw0/n;->a:J

    or-long v2, v1, v3

    iget-wide v4, p0, Lw0/n;->b:J

    iget-wide v8, p1, Lw0/n;->b:J

    or-long/2addr v4, v8

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lw0/n;->d:[I

    if-nez v0, :cond_4

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lw0/n;->o(I)Lw0/n;

    move-result-object p1

    goto :goto_0

    :cond_3
    move-object v0, p1

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v0, p0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lw0/n;->o(I)Lw0/n;

    move-result-object v0

    goto :goto_1

    :cond_5
    :goto_2
    return-object v0
.end method

.method public final o(I)Lw0/n;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v6, v0, Lw0/n;->c:I

    sub-int v2, v1, v6

    iget-wide v4, v0, Lw0/n;->b:J

    const-wide/16 v7, 0x1

    const-wide/16 v9, 0x0

    const/16 v3, 0x40

    if-ltz v2, :cond_0

    if-ge v2, v3, :cond_0

    shl-long v1, v7, v2

    and-long v7, v4, v1

    cmp-long v3, v7, v9

    if-nez v3, :cond_a

    new-instance v8, Lw0/n;

    iget-wide v9, v0, Lw0/n;->a:J

    or-long/2addr v4, v1

    iget-object v7, v0, Lw0/n;->d:[I

    move-object v1, v8

    move-wide v2, v9

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    return-object v8

    :cond_0
    iget-wide v11, v0, Lw0/n;->a:J

    const/16 v13, 0x80

    if-lt v2, v3, :cond_1

    if-ge v2, v13, :cond_1

    sub-int/2addr v2, v3

    shl-long v1, v7, v2

    and-long v7, v11, v1

    cmp-long v3, v7, v9

    if-nez v3, :cond_a

    new-instance v8, Lw0/n;

    or-long v2, v11, v1

    iget-object v7, v0, Lw0/n;->d:[I

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    return-object v8

    :cond_1
    iget-object v14, v0, Lw0/n;->d:[I

    if-lt v2, v13, :cond_8

    invoke-virtual/range {p0 .. p1}, Lw0/n;->k(I)Z

    move-result v2

    if-nez v2, :cond_a

    add-int/lit8 v2, v1, 0x1

    div-int/2addr v2, v3

    mul-int/2addr v2, v3

    iget v6, v0, Lw0/n;->c:I

    const/4 v13, 0x0

    move-wide/from16 v17, v11

    :goto_0
    if-ge v6, v2, :cond_6

    cmp-long v11, v4, v9

    if-eqz v11, :cond_4

    if-nez v13, :cond_2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-eqz v14, :cond_2

    array-length v11, v14

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_2

    aget v16, v14, v12

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    :goto_2
    if-ge v11, v3, :cond_4

    shl-long v15, v7, v11

    and-long/2addr v15, v4

    cmp-long v12, v15, v9

    if-eqz v12, :cond_3

    add-int v12, v11, v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    cmp-long v4, v17, v9

    if-nez v4, :cond_5

    move/from16 v21, v2

    move-wide/from16 v19, v9

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x40

    move-wide/from16 v4, v17

    move-wide/from16 v17, v9

    goto :goto_0

    :cond_6
    move-wide/from16 v19, v4

    move/from16 v21, v6

    :goto_3
    new-instance v2, Lw0/n;

    if-eqz v13, :cond_7

    invoke-static {v13}, Lr8/p;->V0(Ljava/util/ArrayList;)[I

    move-result-object v14

    :cond_7
    move-object/from16 v22, v14

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v22}, Lw0/n;-><init>(JJI[I)V

    invoke-virtual {v2, v1}, Lw0/n;->o(I)Lw0/n;

    move-result-object v1

    return-object v1

    :cond_8
    if-nez v14, :cond_9

    new-instance v8, Lw0/n;

    filled-new-array/range {p1 .. p1}, [I

    move-result-object v7

    move-object v1, v8

    move-wide v2, v11

    invoke-direct/range {v1 .. v7}, Lw0/n;-><init>(JJI[I)V

    return-object v8

    :cond_9
    invoke-static {v14, v1}, Lo7/d0;->k([II)I

    move-result v2

    if-gez v2, :cond_a

    add-int/lit8 v2, v2, 0x1

    neg-int v2, v2

    array-length v3, v14

    add-int/lit8 v4, v3, 0x1

    new-array v11, v4, [I

    const/4 v4, 0x0

    invoke-static {v4, v4, v2, v14, v11}, Lb9/b;->G(III[I[I)V

    add-int/lit8 v4, v2, 0x1

    invoke-static {v4, v2, v3, v14, v11}, Lb9/b;->G(III[I[I)V

    aput v1, v11, v2

    new-instance v1, Lw0/n;

    iget-wide v6, v0, Lw0/n;->a:J

    iget-wide v8, v0, Lw0/n;->b:J

    iget v10, v0, Lw0/n;->c:I

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, Lw0/n;-><init>(JJI[I)V

    return-object v1

    :cond_a
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lw0/n;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    add-int/2addr v6, v8

    if-le v6, v8, :cond_1

    const-string v8, ", "

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    instance-of v8, v7, Ljava/lang/CharSequence;

    if-eqz v8, :cond_3

    :goto_2
    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_3

    :cond_3
    instance-of v8, v7, Ljava/lang/Character;

    if-eqz v8, :cond_4

    check-cast v7, Ljava/lang/Character;

    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_3

    :cond_4
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
