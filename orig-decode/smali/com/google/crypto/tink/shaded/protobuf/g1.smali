.class public final Lcom/google/crypto/tink/shaded/protobuf/g1;
.super Ljava/lang/Object;


# static fields
.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/g1;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/r0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g1;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/g1;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/g1;->c:Lcom/google/crypto/tink/shaded/protobuf/g1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/r0;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g1;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/j1;
    .locals 9

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/f0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_a

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/g1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/j1;

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/g1;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/k1;->a:Ljava/lang/Class;

    const-class v2, Lcom/google/crypto/tink/shaded/protobuf/b0;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/k1;->a:Ljava/lang/Class;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, v1, Lcom/google/crypto/tink/shaded/protobuf/r0;->a:Lcom/google/crypto/tink/shaded/protobuf/w0;

    invoke-interface {v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/w0;->a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/v0;

    move-result-object v3

    move-object v1, v3

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i1;

    iget v4, v1, Lcom/google/crypto/tink/shaded/protobuf/i1;->d:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    const-string v6, "Protobuf runtime is not correctly loaded."

    if-ne v4, v5, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    iget-object v1, v1, Lcom/google/crypto/tink/shaded/protobuf/i1;->a:Lcom/google/crypto/tink/shaded/protobuf/b;

    if-eqz v2, :cond_2

    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/k1;->d:Lcom/google/crypto/tink/shaded/protobuf/p1;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/v;->a:Lcom/google/crypto/tink/shaded/protobuf/u;

    new-instance v4, Lcom/google/crypto/tink/shaded/protobuf/b1;

    invoke-direct {v4, v2, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/b1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/b;)V

    :goto_1
    move-object v1, v4

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/google/crypto/tink/shaded/protobuf/k1;->b:Lcom/google/crypto/tink/shaded/protobuf/p1;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/v;->b:Lcom/google/crypto/tink/shaded/protobuf/u;

    if-eqz v3, :cond_3

    new-instance v4, Lcom/google/crypto/tink/shaded/protobuf/b1;

    invoke-direct {v4, v2, v3, v1}, Lcom/google/crypto/tink/shaded/protobuf/b1;-><init>(Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/b;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->d()I

    move-result v1

    if-ne v1, v4, :cond_5

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/d1;->b:Lcom/google/crypto/tink/shaded/protobuf/c1;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/n0;->b:Lcom/google/crypto/tink/shaded/protobuf/m0;

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/k1;->d:Lcom/google/crypto/tink/shaded/protobuf/p1;

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/v;->a:Lcom/google/crypto/tink/shaded/protobuf/u;

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/u0;->b:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->C(Lcom/google/crypto/tink/shaded/protobuf/v0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    goto :goto_2

    :cond_5
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/d1;->b:Lcom/google/crypto/tink/shaded/protobuf/c1;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/n0;->b:Lcom/google/crypto/tink/shaded/protobuf/m0;

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/k1;->d:Lcom/google/crypto/tink/shaded/protobuf/p1;

    const/4 v7, 0x0

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/u0;->b:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->C(Lcom/google/crypto/tink/shaded/protobuf/v0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i1;->d()I

    move-result v1

    if-ne v1, v4, :cond_8

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/d1;->a:Lcom/google/crypto/tink/shaded/protobuf/c1;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/n0;->a:Lcom/google/crypto/tink/shaded/protobuf/l0;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/k1;->b:Lcom/google/crypto/tink/shaded/protobuf/p1;

    sget-object v7, Lcom/google/crypto/tink/shaded/protobuf/v;->b:Lcom/google/crypto/tink/shaded/protobuf/u;

    if-eqz v7, :cond_7

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/u0;->a:Lcom/google/crypto/tink/shaded/protobuf/t0;

    move-object v6, v1

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->C(Lcom/google/crypto/tink/shaded/protobuf/v0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/d1;->a:Lcom/google/crypto/tink/shaded/protobuf/c1;

    sget-object v5, Lcom/google/crypto/tink/shaded/protobuf/n0;->a:Lcom/google/crypto/tink/shaded/protobuf/l0;

    sget-object v6, Lcom/google/crypto/tink/shaded/protobuf/k1;->c:Lcom/google/crypto/tink/shaded/protobuf/p1;

    const/4 v7, 0x0

    sget-object v8, Lcom/google/crypto/tink/shaded/protobuf/u0;->a:Lcom/google/crypto/tink/shaded/protobuf/t0;

    invoke-static/range {v3 .. v8}, Lcom/google/crypto/tink/shaded/protobuf/a1;->C(Lcom/google/crypto/tink/shaded/protobuf/v0;Lcom/google/crypto/tink/shaded/protobuf/c1;Lcom/google/crypto/tink/shaded/protobuf/n0;Lcom/google/crypto/tink/shaded/protobuf/p1;Lcom/google/crypto/tink/shaded/protobuf/u;Lcom/google/crypto/tink/shaded/protobuf/t0;)Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/j1;

    if-eqz p1, :cond_9

    move-object v1, p1

    :cond_9
    return-object v1

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "messageType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
