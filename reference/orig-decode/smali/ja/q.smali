.class public final Lja/q;
.super Ljava/lang/Object;

# interfaces
.implements Lja/g0;


# instance fields
.field public a:B

.field public final b:Lja/a0;

.field public final c:Ljava/util/zip/Inflater;

.field public final d:Lja/r;

.field public final e:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lja/g0;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lja/a0;

    invoke-direct {v0, p1}, Lja/a0;-><init>(Lja/g0;)V

    iput-object v0, p0, Lja/q;->b:Lja/a0;

    new-instance p1, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object p1, p0, Lja/q;->c:Ljava/util/zip/Inflater;

    new-instance v1, Lja/r;

    invoke-direct {v1, v0, p1}, Lja/r;-><init>(Lja/a0;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Lja/q;->d:Lja/r;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lja/q;->e:Ljava/util/zip/CRC32;

    return-void
.end method

.method public static a(IILjava/lang/String;)V
    .locals 1

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x3

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s: actual 0x%08x != expected 0x%08x"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(this, *args)"

    invoke-static {p0, p1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final I(Lja/g;J)J
    .locals 24

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-wide/from16 v8, p2

    const-string v0, "sink"

    invoke-static {v7, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, v8, v0

    if-ltz v2, :cond_12

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    iget-byte v0, v6, Lja/q;->a:B

    iget-object v10, v6, Lja/q;->e:Ljava/util/zip/CRC32;

    const/4 v11, 0x1

    const-wide/16 v12, -0x1

    iget-object v15, v6, Lja/q;->b:Lja/a0;

    if-nez v0, :cond_d

    const-wide/16 v0, 0xa

    invoke-virtual {v15, v0, v1}, Lja/a0;->S(J)V

    iget-object v14, v15, Lja/a0;->b:Lja/g;

    const-wide/16 v0, 0x3

    invoke-virtual {v14, v0, v1}, Lja/g;->f(J)B

    move-result v20

    shr-int/lit8 v0, v20, 0x1

    and-int/2addr v0, v11

    if-ne v0, v11, :cond_1

    move/from16 v21, v11

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    move/from16 v21, v0

    :goto_0
    if-eqz v21, :cond_2

    iget-object v5, v15, Lja/a0;->b:Lja/g;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0xa

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lja/q;->b(JJLja/g;)V

    :cond_2
    invoke-virtual {v15}, Lja/a0;->readShort()S

    move-result v0

    const-string v1, "ID1ID2"

    const/16 v2, 0x1f8b

    invoke-static {v2, v0, v1}, Lja/q;->a(IILjava/lang/String;)V

    const-wide/16 v0, 0x8

    invoke-virtual {v15, v0, v1}, Lja/a0;->l(J)V

    shr-int/lit8 v0, v20, 0x2

    and-int/2addr v0, v11

    if-ne v0, v11, :cond_5

    const-wide/16 v0, 0x2

    invoke-virtual {v15, v0, v1}, Lja/a0;->S(J)V

    if-eqz v21, :cond_3

    iget-object v5, v15, Lja/a0;->b:Lja/g;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x2

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lja/q;->b(JJLja/g;)V

    :cond_3
    invoke-virtual {v14}, Lja/g;->O()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    int-to-long v3, v0

    invoke-virtual {v15, v3, v4}, Lja/a0;->S(J)V

    if-eqz v21, :cond_4

    iget-object v5, v15, Lja/a0;->b:Lja/g;

    const-wide/16 v1, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v16, v3

    invoke-virtual/range {v0 .. v5}, Lja/q;->b(JJLja/g;)V

    move-wide/from16 v0, v16

    goto :goto_1

    :cond_4
    move-wide v0, v3

    :goto_1
    invoke-virtual {v15, v0, v1}, Lja/a0;->l(J)V

    :cond_5
    shr-int/lit8 v0, v20, 0x3

    and-int/2addr v0, v11

    const-wide/16 v22, 0x1

    if-ne v0, v11, :cond_8

    const/4 v0, 0x0

    const-wide/16 v16, 0x0

    const-wide v18, 0x7fffffffffffffffL

    move-object v14, v15

    move-object v5, v15

    move v15, v0

    invoke-virtual/range {v14 .. v19}, Lja/a0;->a(BJJ)J

    move-result-wide v14

    cmp-long v0, v14, v12

    if-eqz v0, :cond_7

    if-eqz v21, :cond_6

    iget-object v3, v5, Lja/a0;->b:Lja/g;

    const-wide/16 v1, 0x0

    add-long v16, v14, v22

    move-object/from16 v0, p0

    move-object/from16 v18, v3

    move-wide/from16 v3, v16

    move-object v12, v5

    move-object/from16 v5, v18

    invoke-virtual/range {v0 .. v5}, Lja/q;->b(JJLja/g;)V

    goto :goto_2

    :cond_6
    move-object v12, v5

    :goto_2
    add-long v14, v14, v22

    invoke-virtual {v12, v14, v15}, Lja/a0;->l(J)V

    goto :goto_3

    :cond_7
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_8
    move-object v12, v15

    :goto_3
    shr-int/lit8 v0, v20, 0x4

    and-int/2addr v0, v11

    if-ne v0, v11, :cond_b

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide v18, 0x7fffffffffffffffL

    move-object v14, v12

    invoke-virtual/range {v14 .. v19}, Lja/a0;->a(BJJ)J

    move-result-wide v13

    const-wide/16 v0, -0x1

    cmp-long v2, v13, v0

    if-eqz v2, :cond_a

    if-eqz v21, :cond_9

    iget-object v5, v12, Lja/a0;->b:Lja/g;

    const-wide/16 v1, 0x0

    add-long v3, v13, v22

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lja/q;->b(JJLja/g;)V

    :cond_9
    add-long v13, v13, v22

    invoke-virtual {v12, v13, v14}, Lja/a0;->l(J)V

    goto :goto_4

    :cond_a
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_b
    :goto_4
    if-eqz v21, :cond_c

    invoke-virtual {v12}, Lja/a0;->b()S

    move-result v0

    invoke-virtual {v10}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    int-to-short v1, v1

    const-string v2, "FHCRC"

    invoke-static {v0, v1, v2}, Lja/q;->a(IILjava/lang/String;)V

    invoke-virtual {v10}, Ljava/util/zip/CRC32;->reset()V

    :cond_c
    iput-byte v11, v6, Lja/q;->a:B

    goto :goto_5

    :cond_d
    move-object v12, v15

    :goto_5
    iget-byte v0, v6, Lja/q;->a:B

    const/4 v1, 0x2

    if-ne v0, v11, :cond_f

    iget-wide v2, v7, Lja/g;->b:J

    iget-object v0, v6, Lja/q;->d:Lja/r;

    invoke-virtual {v0, v7, v8, v9}, Lja/r;->I(Lja/g;J)J

    move-result-wide v8

    const-wide/16 v4, -0x1

    cmp-long v0, v8, v4

    if-eqz v0, :cond_e

    move-object/from16 v0, p0

    move-wide v1, v2

    move-wide v3, v8

    move-object/from16 v5, p1

    invoke-virtual/range {v0 .. v5}, Lja/q;->b(JJLja/g;)V

    return-wide v8

    :cond_e
    iput-byte v1, v6, Lja/q;->a:B

    :cond_f
    iget-byte v0, v6, Lja/q;->a:B

    if-ne v0, v1, :cond_10

    invoke-virtual {v12}, Lja/a0;->y()I

    move-result v0

    invoke-virtual {v10}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "CRC"

    invoke-static {v0, v1, v2}, Lja/q;->a(IILjava/lang/String;)V

    invoke-virtual {v12}, Lja/a0;->y()I

    move-result v0

    iget-object v1, v6, Lja/q;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "ISIZE"

    invoke-static {v0, v1, v2}, Lja/q;->a(IILjava/lang/String;)V

    const/4 v0, 0x3

    iput-byte v0, v6, Lja/q;->a:B

    invoke-virtual {v12}, Lja/a0;->B()Z

    move-result v0

    if-eqz v0, :cond_11

    :cond_10
    const-wide/16 v0, -0x1

    goto :goto_6

    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "gzip finished without exhausting source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_6
    return-wide v0

    :cond_12
    const-string v0, "byteCount < 0: "

    invoke-static {v0, v8, v9}, La7/a;->l(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(JJLja/g;)V
    .locals 4

    iget-object p5, p5, Lja/g;->a:Lja/b0;

    invoke-static {p5}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_0
    iget v0, p5, Lja/b0;->c:I

    iget v1, p5, Lja/b0;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p1, v2

    if-ltz v2, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p1, v0

    iget-object p5, p5, Lja/b0;->f:Lja/b0;

    invoke-static {p5}, Ld7/a;->j(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-lez v2, :cond_1

    iget v2, p5, Lja/b0;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p1

    long-to-int p1, v2

    iget p2, p5, Lja/b0;->c:I

    sub-int/2addr p2, p1

    int-to-long v2, p2

    invoke-static {v2, v3, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p2, v2

    iget-object v2, p0, Lja/q;->e:Ljava/util/zip/CRC32;

    iget-object v3, p5, Lja/b0;->a:[B

    invoke-virtual {v2, v3, p1, p2}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p1, p2

    sub-long/2addr p3, p1

    iget-object p5, p5, Lja/b0;->f:Lja/b0;

    invoke-static {p5}, Ld7/a;->j(Ljava/lang/Object;)V

    move-wide p1, v0

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final c()Lja/i0;
    .locals 1

    iget-object v0, p0, Lja/q;->b:Lja/a0;

    iget-object v0, v0, Lja/a0;->a:Lja/g0;

    invoke-interface {v0}, Lja/g0;->c()Lja/i0;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lja/q;->d:Lja/r;

    invoke-virtual {v0}, Lja/r;->close()V

    return-void
.end method
