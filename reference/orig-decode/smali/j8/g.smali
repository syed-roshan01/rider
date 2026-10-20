.class public final Lj8/g;
.super Ljava/lang/Object;

# interfaces
.implements Lja/g0;


# instance fields
.field public final a:Lja/i;

.field public b:I

.field public c:B

.field public d:I

.field public e:I

.field public f:S


# direct methods
.method public constructor <init>(Lja/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/g;->a:Lja/i;

    return-void
.end method


# virtual methods
.method public final I(Lja/g;J)J
    .locals 9

    :goto_0
    iget v0, p0, Lj8/g;->e:I

    const-wide/16 v1, -0x1

    iget-object v3, p0, Lj8/g;->a:Lja/i;

    if-nez v0, :cond_4

    iget-short v0, p0, Lj8/g;->f:S

    int-to-long v4, v0

    invoke-interface {v3, v4, v5}, Lja/i;->l(J)V

    const/4 v0, 0x0

    iput-short v0, p0, Lj8/g;->f:S

    iget-byte v4, p0, Lj8/g;->c:B

    and-int/lit8 v4, v4, 0x4

    if-eqz v4, :cond_0

    return-wide v1

    :cond_0
    iget v1, p0, Lj8/g;->d:I

    invoke-static {v3}, Lj8/k;->a(Lja/i;)I

    move-result v2

    iput v2, p0, Lj8/g;->e:I

    iput v2, p0, Lj8/g;->b:I

    invoke-interface {v3}, Lja/i;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    invoke-interface {v3}, Lja/i;->readByte()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    iput-byte v4, p0, Lj8/g;->c:B

    sget-object v4, Lj8/k;->a:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget v5, p0, Lj8/g;->d:I

    iget v6, p0, Lj8/g;->b:I

    iget-byte v7, p0, Lj8/g;->c:B

    const/4 v8, 0x1

    invoke-static {v8, v5, v6, v2, v7}, Lj8/h;->a(ZIIBB)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v3}, Lja/i;->readInt()I

    move-result v3

    const v4, 0x7fffffff

    and-int/2addr v3, v4

    iput v3, p0, Lj8/g;->d:I

    const/16 v4, 0x9

    const/4 v5, 0x0

    if-ne v2, v4, :cond_3

    if-ne v3, v1, :cond_2

    goto :goto_0

    :cond_2
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "TYPE_CONTINUATION streamId changed"

    invoke-static {p2, p1}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v5

    :cond_3
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s != TYPE_CONTINUATION"

    invoke-static {p2, p1}, Lj8/k;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v5

    :cond_4
    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Lja/g0;->I(Lja/g;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_5

    return-wide v1

    :cond_5
    iget p3, p0, Lj8/g;->e:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Lj8/g;->e:I

    return-wide p1
.end method

.method public final c()Lja/i0;
    .locals 1

    iget-object v0, p0, Lj8/g;->a:Lja/i;

    invoke-interface {v0}, Lja/g0;->c()Lja/i0;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method
