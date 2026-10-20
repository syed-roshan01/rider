.class public final Lg8/n0;
.super Lg8/d;


# static fields
.field public static final e:Lr7/e;

.field public static final f:Lr7/e;

.field public static final n:Lr7/e;

.field public static final o:Lr7/e;

.field public static final p:Lr7/e;


# instance fields
.field public final a:Ljava/util/ArrayDeque;

.field public b:Ljava/util/ArrayDeque;

.field public c:I

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr7/e;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/n0;->e:Lr7/e;

    new-instance v0, Lr7/e;

    const/16 v1, 0x10

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/n0;->f:Lr7/e;

    new-instance v0, Lr7/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/n0;->n:Lr7/e;

    new-instance v0, Lr7/e;

    const/16 v1, 0x12

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/n0;->o:Lr7/e;

    new-instance v0, Lr7/e;

    const/16 v1, 0x13

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    sput-object v0, Lg8/n0;->p:Lr7/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0, p1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    return-void
.end method


# virtual methods
.method public final H(Ljava/io/OutputStream;I)V
    .locals 2

    sget-object v0, Lg8/n0;->p:Lr7/e;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p2, p1, v1}, Lg8/n0;->f(Lr7/e;ILjava/lang/Object;I)I

    return-void
.end method

.method public final U(Ljava/nio/ByteBuffer;)V
    .locals 3

    sget-object v0, Lg8/n0;->o:Lr7/e;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, p1, v2}, Lg8/n0;->g(Lr7/e;ILjava/lang/Object;I)I

    return-void
.end method

.method public final Z([BII)V
    .locals 1

    sget-object v0, Lg8/n0;->n:Lr7/e;

    invoke-virtual {p0, v0, p3, p1, p2}, Lg8/n0;->g(Lr7/e;ILjava/lang/Object;I)I

    return-void
.end method

.method public final b(Lg8/m4;)V
    .locals 5

    iget-boolean v0, p0, Lg8/n0;->d:Z

    iget-object v1, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    instance-of v3, p1, Lg8/n0;

    if-nez v3, :cond_1

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    iget v2, p0, Lg8/n0;->c:I

    invoke-interface {p1}, Lg8/m4;->j()I

    move-result p1

    add-int/2addr p1, v2

    iput p1, p0, Lg8/n0;->c:I

    goto :goto_2

    :cond_1
    check-cast p1, Lg8/n0;

    :goto_1
    iget-object v3, p1, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p1, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg8/m4;

    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget v3, p0, Lg8/n0;->c:I

    iget v4, p1, Lg8/n0;->c:I

    add-int/2addr v3, v4

    iput v3, p0, Lg8/n0;->c:I

    iput v2, p1, Lg8/n0;->c:I

    invoke-virtual {p1}, Lg8/n0;->close()V

    :goto_2
    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg8/m4;

    invoke-interface {p1}, Lg8/m4;->k()V

    :cond_3
    return-void
.end method

.method public final close()V
    .locals 2

    :goto_0
    iget-object v0, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/m4;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    if-eqz v0, :cond_1

    :goto_1
    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/m4;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 3

    iget-boolean v0, p0, Lg8/n0;->d:Z

    iget-object v1, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg8/m4;

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/m4;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lg8/m4;->k()V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/m4;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final f(Lr7/e;ILjava/lang/Object;I)I
    .locals 6

    invoke-virtual {p0, p2}, Lg8/d;->a(I)V

    iget-object v0, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/m4;

    invoke-interface {v1}, Lg8/m4;->j()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lg8/n0;->e()V

    :cond_0
    :goto_0
    if-lez p2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/m4;

    invoke-interface {v1}, Lg8/m4;->j()I

    move-result v2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    iget v4, p1, Lr7/e;->a:I

    packed-switch v4, :pswitch_data_0

    move-object p4, p3

    check-cast p4, Ljava/io/OutputStream;

    invoke-interface {v1, p4, v2}, Lg8/m4;->H(Ljava/io/OutputStream;I)V

    :goto_1
    move p4, v3

    goto :goto_2

    :pswitch_0
    move-object p4, p3

    check-cast p4, Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/Buffer;->limit()I

    move-result v4

    invoke-virtual {p4}, Ljava/nio/Buffer;->position()I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {p4, v5}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    invoke-interface {v1, p4}, Lg8/m4;->U(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p4, v4}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    goto :goto_1

    :pswitch_1
    move-object v3, p3

    check-cast v3, [B

    invoke-interface {v1, v3, p4, v2}, Lg8/m4;->Z([BII)V

    add-int/2addr p4, v2

    goto :goto_2

    :pswitch_2
    move-object p4, p3

    check-cast p4, Ljava/lang/Void;

    packed-switch v4, :pswitch_data_1

    invoke-interface {v1, v2}, Lg8/m4;->skipBytes(I)V

    goto :goto_1

    :pswitch_3
    invoke-interface {v1}, Lg8/m4;->readUnsignedByte()I

    move-result v3

    goto :goto_1

    :pswitch_4
    move-object p4, p3

    check-cast p4, Ljava/lang/Void;

    packed-switch v4, :pswitch_data_2

    invoke-interface {v1, v2}, Lg8/m4;->skipBytes(I)V

    goto :goto_1

    :pswitch_5
    invoke-interface {v1}, Lg8/m4;->readUnsignedByte()I

    move-result v3

    goto :goto_1

    :goto_2
    sub-int/2addr p2, v2

    iget v1, p0, Lg8/n0;->c:I

    sub-int/2addr v1, v2

    iput v1, p0, Lg8/n0;->c:I

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/m4;

    invoke-interface {v1}, Lg8/m4;->j()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lg8/n0;->e()V

    goto :goto_0

    :cond_1
    if-gtz p2, :cond_2

    return p4

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Failed executing read operation"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xf
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xf
        :pswitch_5
    .end packed-switch
.end method

.method public final g(Lr7/e;ILjava/lang/Object;I)I
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lg8/n0;->f(Lr7/e;ILjava/lang/Object;I)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lg8/n0;->c:I

    return v0
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    iget-object v1, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    :cond_0
    :goto_0
    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/m4;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg8/n0;->d:Z

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg8/m4;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lg8/m4;->k()V

    :cond_2
    return-void
.end method

.method public final markSupported()Z
    .locals 2

    iget-object v0, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/m4;

    invoke-interface {v1}, Lg8/m4;->markSupported()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final readUnsignedByte()I
    .locals 4

    sget-object v0, Lg8/n0;->e:Lr7/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lg8/n0;->g(Lr7/e;ILjava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final reset()V
    .locals 4

    iget-boolean v0, p0, Lg8/n0;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/m4;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lg8/m4;->j()I

    move-result v2

    invoke-interface {v1}, Lg8/m4;->reset()V

    iget v3, p0, Lg8/n0;->c:I

    invoke-interface {v1}, Lg8/m4;->j()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v3

    iput v1, p0, Lg8/n0;->c:I

    :cond_0
    :goto_0
    iget-object v1, p0, Lg8/n0;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg8/m4;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lg8/m4;->reset()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    iget v2, p0, Lg8/n0;->c:I

    invoke-interface {v1}, Lg8/m4;->j()I

    move-result v1

    add-int/2addr v1, v2

    iput v1, p0, Lg8/n0;->c:I

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/nio/InvalidMarkException;

    invoke-direct {v0}, Ljava/nio/InvalidMarkException;-><init>()V

    throw v0
.end method

.method public final skipBytes(I)V
    .locals 3

    sget-object v0, Lg8/n0;->f:Lr7/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, p1, v1, v2}, Lg8/n0;->g(Lr7/e;ILjava/lang/Object;I)I

    return-void
.end method

.method public final t(I)Lg8/m4;
    .locals 7

    if-gtz p1, :cond_0

    sget-object p1, Lg8/p4;->a:Lg8/o4;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lg8/d;->a(I)V

    iget v0, p0, Lg8/n0;->c:I

    sub-int/2addr v0, p1

    iput v0, p0, Lg8/n0;->c:I

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lg8/n0;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg8/m4;

    invoke-interface {v3}, Lg8/m4;->j()I

    move-result v4

    if-le v4, p1, :cond_1

    invoke-interface {v3, p1}, Lg8/m4;->t(I)Lg8/m4;

    move-result-object p1

    const/4 v3, 0x0

    goto :goto_2

    :cond_1
    iget-boolean v5, p0, Lg8/n0;->d:Z

    if-eqz v5, :cond_2

    invoke-interface {v3, v4}, Lg8/m4;->t(I)Lg8/m4;

    move-result-object v3

    invoke-virtual {p0}, Lg8/n0;->e()V

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg8/m4;

    :goto_1
    sub-int/2addr p1, v4

    move-object v6, v3

    move v3, p1

    move-object p1, v6

    :goto_2
    if-nez v0, :cond_3

    move-object v0, p1

    goto :goto_4

    :cond_3
    if-nez v1, :cond_5

    new-instance v1, Lg8/n0;

    const/4 v4, 0x2

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result v2

    add-int/2addr v2, v4

    const/16 v4, 0x10

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    :goto_3
    invoke-direct {v1, v4}, Lg8/n0;-><init>(I)V

    invoke-virtual {v1, v0}, Lg8/n0;->b(Lg8/m4;)V

    move-object v0, v1

    :cond_5
    invoke-virtual {v1, p1}, Lg8/n0;->b(Lg8/m4;)V

    :goto_4
    if-gtz v3, :cond_6

    return-object v0

    :cond_6
    move p1, v3

    goto :goto_0
.end method
