.class public final Lg8/u;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/a6;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lg8/u;->a:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lg8/g0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg8/u;->a:I

    .line 5
    invoke-direct {p0, p1, v0}, Lg8/u;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic constructor <init>(Lg8/t1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg8/u;->a:I

    .line 4
    invoke-direct {p0, p1, v0}, Lg8/u;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lg8/u;->a:I

    .line 6
    invoke-direct {p0, p1, v0}, Lg8/u;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/u;->a:I

    iput-object p1, p0, Lg8/u;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lg8/u;I)V
    .locals 7

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Lg8/t1;

    iget v1, v0, Lg8/t1;->f:I

    iget v0, v0, Lg8/t1;->e:I

    sub-int/2addr v1, v0

    if-lez v1, :cond_0

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v1, Lg8/t1;

    iget-object v2, v1, Lg8/t1;->b:Ljava/util/zip/CRC32;

    iget v3, v1, Lg8/t1;->e:I

    iget-object v1, v1, Lg8/t1;->d:[B

    invoke-virtual {v2, v1, v3, v0}, Ljava/util/zip/CRC32;->update([BII)V

    iget-object v1, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v1, Lg8/t1;

    iget v2, v1, Lg8/t1;->e:I

    add-int/2addr v2, v0

    iput v2, v1, Lg8/t1;->e:I

    sub-int v0, p1, v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    if-lez v0, :cond_1

    const/16 v1, 0x200

    new-array v2, v1, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v0, :cond_1

    sub-int v5, v0, v4

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget-object v6, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v6, Lg8/t1;

    iget-object v6, v6, Lg8/t1;->a:Lg8/n0;

    invoke-virtual {v6, v2, v3, v5}, Lg8/n0;->Z([BII)V

    iget-object v6, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v6, Lg8/t1;

    iget-object v6, v6, Lg8/t1;->b:Ljava/util/zip/CRC32;

    invoke-virtual {v6, v2, v3, v5}, Ljava/util/zip/CRC32;->update([BII)V

    add-int/2addr v4, v5

    goto :goto_1

    :cond_1
    iget-object p0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast p0, Lg8/t1;

    iget v0, p0, Lg8/t1;->t:I

    add-int/2addr v0, p1

    iput v0, p0, Lg8/t1;->t:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "="

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Lg8/w;

    iget-object v0, v0, Lg8/w;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Lg8/w;

    invoke-static {v0}, Lg8/w;->h(Lg8/w;)V

    :cond_0
    return-void
.end method

.method public final e()I
    .locals 3

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Lg8/t1;

    iget v1, v0, Lg8/t1;->f:I

    iget v2, v0, Lg8/t1;->e:I

    sub-int/2addr v1, v2

    if-lez v1, :cond_0

    iget-object v1, v0, Lg8/t1;->d:[B

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lg8/t1;->e:I

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lg8/t1;->a:Lg8/n0;

    invoke-virtual {v0}, Lg8/n0;->readUnsignedByte()I

    move-result v1

    :goto_0
    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Lg8/t1;

    iget-object v0, v0, Lg8/t1;->b:Ljava/util/zip/CRC32;

    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update(I)V

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Lg8/t1;

    iget v2, v0, Lg8/t1;->t:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lg8/t1;->t:I

    return v1
.end method

.method public final f()I
    .locals 2

    invoke-virtual {p0}, Lg8/u;->e()I

    move-result v0

    invoke-virtual {p0}, Lg8/u;->e()I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    return v0
.end method

.method public final g()I
    .locals 3

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg8/t1;

    iget v1, v1, Lg8/t1;->f:I

    move-object v2, v0

    check-cast v2, Lg8/t1;

    iget v2, v2, Lg8/t1;->e:I

    sub-int/2addr v1, v2

    check-cast v0, Lg8/t1;

    iget-object v0, v0, Lg8/t1;->a:Lg8/n0;

    iget v0, v0, Lg8/n0;->c:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final next()Ljava/io/InputStream;
    .locals 2

    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    const/4 v1, 0x0

    iput-object v1, p0, Lg8/u;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lg8/u;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg8/u;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
