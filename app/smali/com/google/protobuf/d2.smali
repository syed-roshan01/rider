.class public final Lcom/google/protobuf/d2;
.super Ljava/lang/Object;


# static fields
.field public static final c:Lcom/google/protobuf/d2;


# instance fields
.field public final a:Lcom/google/protobuf/l1;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/protobuf/d2;

    invoke-direct {v0}, Lcom/google/protobuf/d2;-><init>()V

    sput-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/d2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/d2;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Lcom/google/protobuf/l1;

    invoke-direct {v0}, Lcom/google/protobuf/l1;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/d2;->a:Lcom/google/protobuf/l1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/protobuf/i2;
    .locals 9

    sget-object v0, Lcom/google/protobuf/y0;->a:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_a

    iget-object v0, p0, Lcom/google/protobuf/d2;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/i2;

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/google/protobuf/d2;->a:Lcom/google/protobuf/l1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/google/protobuf/j2;->a:Ljava/lang/Class;

    const-class v2, Lcom/google/protobuf/l0;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Lcom/google/protobuf/j2;->a:Ljava/lang/Class;

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
    iget-object v1, v1, Lcom/google/protobuf/l1;->a:Lcom/google/protobuf/r1;

    invoke-interface {v1, p1}, Lcom/google/protobuf/r1;->a(Ljava/lang/Class;)Lcom/google/protobuf/q1;

    move-result-object v3

    move-object v1, v3

    check-cast v1, Lcom/google/protobuf/f2;

    iget v4, v1, Lcom/google/protobuf/f2;->d:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    const-string v6, "Protobuf runtime is not correctly loaded."

    if-ne v4, v5, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    iget-object v1, v1, Lcom/google/protobuf/f2;->a:Lcom/google/protobuf/t1;

    if-eqz v2, :cond_2

    sget-object v2, Lcom/google/protobuf/j2;->d:Lcom/google/protobuf/t2;

    sget-object v3, Lcom/google/protobuf/b0;->a:Lcom/google/protobuf/a0;

    new-instance v4, Lcom/google/protobuf/x1;

    invoke-direct {v4, v2, v3, v1}, Lcom/google/protobuf/x1;-><init>(Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/t1;)V

    :goto_1
    move-object v1, v4

    goto :goto_2

    :cond_2
    sget-object v2, Lcom/google/protobuf/j2;->b:Lcom/google/protobuf/t2;

    sget-object v3, Lcom/google/protobuf/b0;->b:Lcom/google/protobuf/a0;

    if-eqz v3, :cond_3

    new-instance v4, Lcom/google/protobuf/x1;

    invoke-direct {v4, v2, v3, v1}, Lcom/google/protobuf/x1;-><init>(Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/t1;)V

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

    invoke-virtual {v1}, Lcom/google/protobuf/f2;->d()I

    move-result v1

    if-ne v1, v4, :cond_5

    sget-object v4, Lcom/google/protobuf/z1;->b:Lcom/google/protobuf/y1;

    sget-object v5, Lcom/google/protobuf/h1;->b:Lcom/google/protobuf/g1;

    sget-object v6, Lcom/google/protobuf/j2;->d:Lcom/google/protobuf/t2;

    sget-object v7, Lcom/google/protobuf/b0;->a:Lcom/google/protobuf/a0;

    sget-object v8, Lcom/google/protobuf/p1;->b:Lcom/google/protobuf/o1;

    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/w1;->D(Lcom/google/protobuf/q1;Lcom/google/protobuf/y1;Lcom/google/protobuf/h1;Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/o1;)Lcom/google/protobuf/w1;

    move-result-object v1

    goto :goto_2

    :cond_5
    sget-object v4, Lcom/google/protobuf/z1;->b:Lcom/google/protobuf/y1;

    sget-object v5, Lcom/google/protobuf/h1;->b:Lcom/google/protobuf/g1;

    sget-object v6, Lcom/google/protobuf/j2;->d:Lcom/google/protobuf/t2;

    const/4 v7, 0x0

    sget-object v8, Lcom/google/protobuf/p1;->b:Lcom/google/protobuf/o1;

    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/w1;->D(Lcom/google/protobuf/q1;Lcom/google/protobuf/y1;Lcom/google/protobuf/h1;Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/o1;)Lcom/google/protobuf/w1;

    move-result-object v1

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Lcom/google/protobuf/f2;->d()I

    move-result v1

    if-ne v1, v4, :cond_8

    sget-object v4, Lcom/google/protobuf/z1;->a:Lcom/google/protobuf/y1;

    sget-object v5, Lcom/google/protobuf/h1;->a:Lcom/google/protobuf/f1;

    sget-object v1, Lcom/google/protobuf/j2;->b:Lcom/google/protobuf/t2;

    sget-object v7, Lcom/google/protobuf/b0;->b:Lcom/google/protobuf/a0;

    if-eqz v7, :cond_7

    sget-object v8, Lcom/google/protobuf/p1;->a:Lcom/google/protobuf/o1;

    move-object v6, v1

    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/w1;->D(Lcom/google/protobuf/q1;Lcom/google/protobuf/y1;Lcom/google/protobuf/h1;Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/o1;)Lcom/google/protobuf/w1;

    move-result-object v1

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    sget-object v4, Lcom/google/protobuf/z1;->a:Lcom/google/protobuf/y1;

    sget-object v5, Lcom/google/protobuf/h1;->a:Lcom/google/protobuf/f1;

    sget-object v6, Lcom/google/protobuf/j2;->c:Lcom/google/protobuf/t2;

    const/4 v7, 0x0

    sget-object v8, Lcom/google/protobuf/p1;->a:Lcom/google/protobuf/o1;

    invoke-static/range {v3 .. v8}, Lcom/google/protobuf/w1;->D(Lcom/google/protobuf/q1;Lcom/google/protobuf/y1;Lcom/google/protobuf/h1;Lcom/google/protobuf/t2;Lcom/google/protobuf/a0;Lcom/google/protobuf/o1;)Lcom/google/protobuf/w1;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/i2;

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

.method public final b(Ljava/lang/Object;)Lcom/google/protobuf/i2;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/d2;->a(Ljava/lang/Class;)Lcom/google/protobuf/i2;

    move-result-object p1

    return-object p1
.end method
