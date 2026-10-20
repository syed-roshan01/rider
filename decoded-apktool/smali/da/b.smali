.class public abstract Lda/b;
.super Ljava/lang/Object;

# interfaces
.implements Lja/g0;


# instance fields
.field public final a:Lja/p;

.field public b:Z

.field public final synthetic c:Lda/h;


# direct methods
.method public constructor <init>(Lda/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/b;->c:Lda/h;

    new-instance v0, Lja/p;

    iget-object p1, p1, Lda/h;->c:Lja/i;

    invoke-interface {p1}, Lja/g0;->c()Lja/i0;

    move-result-object p1

    invoke-direct {v0, p1}, Lja/p;-><init>(Lja/i0;)V

    iput-object v0, p0, Lda/b;->a:Lja/p;

    return-void
.end method


# virtual methods
.method public I(Lja/g;J)J
    .locals 2

    iget-object v0, p0, Lda/b;->c:Lda/h;

    const-string v1, "sink"

    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v0, Lda/h;->c:Lja/i;

    invoke-interface {v1, p1, p2, p3}, Lja/g0;->I(Lja/g;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, v0, Lda/h;->b:Lba/k;

    invoke-virtual {p2}, Lba/k;->k()V

    invoke-virtual {p0}, Lda/b;->a()V

    throw p1
.end method

.method public final a()V
    .locals 5

    iget-object v0, p0, Lda/b;->c:Lda/h;

    iget v1, v0, Lda/h;->e:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lda/b;->a:Lja/p;

    iget-object v3, v1, Lja/p;->e:Lja/i0;

    sget-object v4, Lja/i0;->d:Lja/h0;

    iput-object v4, v1, Lja/p;->e:Lja/i0;

    invoke-virtual {v3}, Lja/i0;->a()Lja/i0;

    invoke-virtual {v3}, Lja/i0;->b()Lja/i0;

    iput v2, v0, Lda/h;->e:I

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lda/h;->e:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()Lja/i0;
    .locals 1

    iget-object v0, p0, Lda/b;->a:Lja/p;

    return-object v0
.end method
