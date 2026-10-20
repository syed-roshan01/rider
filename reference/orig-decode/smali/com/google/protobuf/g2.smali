.class public final Lcom/google/protobuf/g2;
.super Lcom/google/protobuf/i;


# instance fields
.field public final a:Lk6/u;

.field public b:Lcom/google/protobuf/i;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/h2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk6/u;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk6/u;-><init>(Lcom/google/protobuf/n;I)V

    iput-object v0, p0, Lcom/google/protobuf/g2;->a:Lk6/u;

    invoke-virtual {p0}, Lcom/google/protobuf/g2;->b()Lcom/google/protobuf/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/g2;->b:Lcom/google/protobuf/i;

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/g2;->b:Lcom/google/protobuf/i;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/protobuf/i;->a()B

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/g2;->b:Lcom/google/protobuf/i;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/g2;->b()Lcom/google/protobuf/h;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/g2;->b:Lcom/google/protobuf/i;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final b()Lcom/google/protobuf/h;
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/g2;->a:Lk6/u;

    invoke-virtual {v0}, Lk6/u;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lk6/u;->b()Lcom/google/protobuf/l;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/google/protobuf/h;

    invoke-direct {v1, v0}, Lcom/google/protobuf/h;-><init>(Lcom/google/protobuf/n;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/g2;->b:Lcom/google/protobuf/i;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
