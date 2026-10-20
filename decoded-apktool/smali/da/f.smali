.class public final Lda/f;
.super Ljava/lang/Object;

# interfaces
.implements Lja/e0;


# instance fields
.field public final a:Lja/p;

.field public b:Z

.field public final synthetic c:Lda/h;


# direct methods
.method public constructor <init>(Lda/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/f;->c:Lda/h;

    new-instance v0, Lja/p;

    iget-object p1, p1, Lda/h;->d:Lja/h;

    invoke-interface {p1}, Lja/e0;->c()Lja/i0;

    move-result-object p1

    invoke-direct {v0, p1}, Lja/p;-><init>(Lja/i0;)V

    iput-object v0, p0, Lda/f;->a:Lja/p;

    return-void
.end method


# virtual methods
.method public final b0(Lja/g;J)V
    .locals 5

    const-string v0, "source"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lda/f;->b:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lja/g;->b:J

    sget-object v2, Ly9/b;->a:[B

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-ltz v4, :cond_0

    cmp-long v2, v2, v0

    if-gtz v2, :cond_0

    cmp-long v0, v0, p2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lda/f;->c:Lda/h;

    iget-object v0, v0, Lda/h;->d:Lja/h;

    invoke-interface {v0, p1, p2, p3}, Lja/e0;->b0(Lja/g;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lja/i0;
    .locals 1

    iget-object v0, p0, Lda/f;->a:Lja/p;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lda/f;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lda/f;->b:Z

    iget-object v0, p0, Lda/f;->c:Lda/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lda/f;->a:Lja/p;

    iget-object v2, v1, Lja/p;->e:Lja/i0;

    sget-object v3, Lja/i0;->d:Lja/h0;

    iput-object v3, v1, Lja/p;->e:Lja/i0;

    invoke-virtual {v2}, Lja/i0;->a()Lja/i0;

    invoke-virtual {v2}, Lja/i0;->b()Lja/i0;

    const/4 v1, 0x3

    iput v1, v0, Lda/h;->e:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Lda/f;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lda/f;->c:Lda/h;

    iget-object v0, v0, Lda/h;->d:Lja/h;

    invoke-interface {v0}, Lja/h;->flush()V

    return-void
.end method
