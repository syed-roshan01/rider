.class public final Lja/y;
.super Ljava/lang/Object;

# interfaces
.implements Lja/g0;


# instance fields
.field public final a:Lja/i;

.field public final b:Lja/g;

.field public c:Lja/b0;

.field public d:I

.field public e:Z

.field public f:J


# direct methods
.method public constructor <init>(Lja/i;)V
    .locals 1

    const-string v0, "upstream"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/y;->a:Lja/i;

    invoke-interface {p1}, Lja/i;->A()Lja/g;

    move-result-object p1

    iput-object p1, p0, Lja/y;->b:Lja/g;

    iget-object p1, p1, Lja/g;->a:Lja/b0;

    iput-object p1, p0, Lja/y;->c:Lja/b0;

    if-eqz p1, :cond_0

    iget p1, p1, Lja/b0;->b:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lja/y;->d:I

    return-void
.end method


# virtual methods
.method public final I(Lja/g;J)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_6

    iget-boolean v3, p0, Lja/y;->e:Z

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_5

    iget-object v3, p0, Lja/y;->c:Lja/b0;

    iget-object v4, p0, Lja/y;->b:Lja/g;

    if-eqz v3, :cond_1

    iget-object v5, v4, Lja/g;->a:Lja/b0;

    if-ne v3, v5, :cond_0

    iget v3, p0, Lja/y;->d:I

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v5, v5, Lja/b0;->b:I

    if-ne v3, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Peek source is invalid because upstream source was used"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez v2, :cond_2

    return-wide v0

    :cond_2
    iget-wide v0, p0, Lja/y;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iget-object v2, p0, Lja/y;->a:Lja/i;

    invoke-interface {v2, v0, v1}, Lja/i;->n(J)Z

    move-result v0

    if-nez v0, :cond_3

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_3
    iget-object v0, p0, Lja/y;->c:Lja/b0;

    if-nez v0, :cond_4

    iget-object v0, v4, Lja/g;->a:Lja/b0;

    if-eqz v0, :cond_4

    iput-object v0, p0, Lja/y;->c:Lja/b0;

    iget v0, v0, Lja/b0;->b:I

    iput v0, p0, Lja/y;->d:I

    :cond_4
    iget-wide v0, v4, Lja/g;->b:J

    iget-wide v2, p0, Lja/y;->f:J

    sub-long/2addr v0, v2

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v2, p0, Lja/y;->b:Lja/g;

    iget-wide v3, p0, Lja/y;->f:J

    move-wide v5, p2

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, Lja/g;->e(JJLja/g;)V

    iget-wide v0, p0, Lja/y;->f:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lja/y;->f:J

    return-wide p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const-string p1, "byteCount < 0: "

    invoke-static {p1, p2, p3}, La7/a;->l(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final c()Lja/i0;
    .locals 1

    iget-object v0, p0, Lja/y;->a:Lja/i;

    invoke-interface {v0}, Lja/g0;->c()Lja/i0;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lja/y;->e:Z

    return-void
.end method
