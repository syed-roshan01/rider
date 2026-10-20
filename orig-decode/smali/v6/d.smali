.class public final Lv6/d;
.super Ljava/lang/Object;

# interfaces
.implements Lr7/q;
.implements Le8/y0;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv6/d;->a:I

    .line 21
    invoke-direct {p0, v0}, Lv6/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lv6/d;->a:I

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    const/16 v0, 0xa

    if-eq p1, v0, :cond_2

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0xf

    if-eq p1, v0, :cond_0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lv6/d;->b:Ljava/lang/Object;

    sget-object p1, Lw6/r;->d:Lw6/r;

    iput-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void

    .line 23
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lv6/d;->b:Ljava/lang/Object;

    .line 25
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void

    .line 26
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance p1, Li8/d;

    invoke-direct {p1}, Li8/d;-><init>()V

    iput-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void

    .line 28
    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 29
    :cond_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lv6/d;->b:Ljava/lang/Object;

    iput-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    .line 30
    sget-object p1, Lc7/d;->c:Ljava/lang/Object;

    :try_start_0
    const-string p1, "AndroidKeyStore"

    .line 31
    invoke-static {p1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object p1

    iput-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    .line 32
    invoke-virtual {p1, v1}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 33
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public constructor <init>(II)V
    .locals 2

    iput p2, p0, Lv6/d;->a:I

    const/4 v0, 0x6

    if-eq p2, v0, :cond_0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-array p2, p1, [B

    iput-object p2, p0, Lv6/d;->c:Ljava/lang/Object;

    .line 42
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-direct {v0, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/p;-><init>([BI)V

    iput-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    return-void

    .line 43
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-array p2, p1, [B

    iput-object p2, p0, Lv6/d;->c:Ljava/lang/Object;

    .line 45
    sget-object v0, Lcom/google/protobuf/v;->d:Ljava/util/logging/Logger;

    .line 46
    new-instance v0, Lcom/google/protobuf/t;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1, p1}, Lcom/google/protobuf/t;-><init>([BII)V

    iput-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, Lv6/d;->a:I

    .line 39
    invoke-direct {p0, p1, p2}, Lv6/d;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/io/Serializable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv6/d;->a:I

    iput-object p2, p0, Lv6/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld7/f;Ljava/lang/Class;)V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lv6/d;->a:I

    .line 10
    iget-object v0, p1, Ld7/f;->b:Ljava/util/Map;

    .line 11
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 12
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Void;

    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Given internalKeyMananger %s does not support primitive class %s"

    .line 16
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Lv6/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le8/g2;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xb

    iput v0, p0, Lv6/d;->a:I

    iput-object p1, p0, Lv6/d;->b:Ljava/lang/Object;

    const-string p1, "future"

    .line 37
    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Le8/g2;Ljava/util/concurrent/ScheduledFuture;I)V
    .locals 0

    const/16 p3, 0xb

    iput p3, p0, Lv6/d;->a:I

    .line 35
    invoke-direct {p0, p1, p2}, Lv6/d;-><init>(Le8/g2;Ljava/util/concurrent/ScheduledFuture;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    const/16 p1, 0xa

    iput p1, p0, Lv6/d;->a:I

    .line 34
    invoke-direct {p0, p1}, Lv6/d;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lv6/d;->a:I

    iput-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lv6/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/logging/Level;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lv6/d;->a:I

    const-class v0, Lh8/n;

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lv6/d;-><init>(Ljava/util/logging/Level;Ljava/util/logging/Logger;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/logging/Level;Ljava/util/logging/Logger;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc

    iput v0, p0, Lv6/d;->a:I

    const-string v0, "level"

    .line 19
    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lv6/d;->c:Ljava/lang/Object;

    const-string p1, "logger"

    .line 20
    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lv6/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lu/k1;)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, Lv6/d;->a:I

    .line 38
    invoke-direct {p0, p1}, Lv6/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lv6/d;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xe

    iput v0, p0, Lv6/d;->a:I

    .line 5
    iget-object v0, p1, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Lk8/a;

    iput-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    .line 6
    iget-object p1, p1, Lv6/d;->c:Ljava/lang/Object;

    check-cast p1, Li8/d;

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    new-instance v0, Lk6/w4;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk6/w4;-><init>(Li8/d;I)V

    iput-object v0, p0, Lv6/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lv6/d;I)V
    .locals 0

    const/16 p2, 0xe

    iput p2, p0, Lv6/d;->a:I

    .line 3
    invoke-direct {p0, p1}, Lv6/d;-><init>(Lv6/d;)V

    return-void
.end method

.method public static o(Lja/g;)Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lja/g;->b:J

    const-wide/16 v2, 0x40

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    invoke-virtual {p0}, Lja/g;->T()Lja/j;

    move-result-object p0

    invoke-virtual {p0}, Lja/j;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Lja/g;->c0(I)Lja/j;

    move-result-object p0

    invoke-virtual {p0}, Lja/j;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "..."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Le8/y;)V
    .locals 6

    iget v0, p0, Lv6/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v0, Ln8/v;

    iget-object v1, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v1, Le8/x0;

    iget-object v2, v0, Ln8/v;->d:Ljava/util/HashMap;

    invoke-virtual {v1}, Le8/x0;->a()Le8/g0;

    move-result-object v3

    new-instance v4, Le8/g0;

    iget-object v3, v3, Le8/g0;->a:Ljava/util/List;

    sget-object v5, Le8/c;->b:Le8/c;

    invoke-direct {v4, v3, v5}, Le8/g0;-><init>(Ljava/util/List;Le8/c;)V

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p1, Le8/y;->a:Le8/x;

    sget-object v3, Le8/x;->c:Le8/x;

    sget-object v4, Le8/x;->d:Le8/x;

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_2

    :cond_1
    iget-object v2, v0, Ln8/v;->c:Le8/j0;

    invoke-virtual {v2}, Le8/j0;->o()V

    :cond_2
    iget-object v2, p1, Le8/y;->a:Le8/x;

    if-ne v2, v4, :cond_3

    invoke-virtual {v1}, Le8/x0;->f()V

    :cond_3
    invoke-static {v1}, Ln8/v;->g(Le8/x0;)Ln8/t;

    move-result-object v1

    iget-object v5, v1, Ln8/t;->a:Ljava/lang/Object;

    check-cast v5, Le8/y;

    iget-object v5, v5, Le8/y;->a:Le8/x;

    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Le8/x;->a:Le8/x;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    iput-object p1, v1, Ln8/t;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ln8/v;->h()V

    :cond_5
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v0, Ln8/n;

    iput-object p1, v0, Ln8/n;->d:Le8/y;

    iget-boolean v0, v0, Ln8/n;->c:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Le8/y0;

    invoke-interface {v0, p1}, Le8/y0;->a(Le8/y;)V

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Lw6/s;
    .locals 3

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Lw6/r;

    if-eqz v1, :cond_0

    new-instance v1, Lw6/s;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v2, Lw6/r;

    invoke-direct {v1, v0, v2}, Lw6/s;-><init>(ILw6/r;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Le8/g2;

    const/4 v1, 0x1

    iput-boolean v1, v0, Le8/g2;->b:Z

    iget-object v0, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v0, Li8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x7f

    const/16 v5, 0x1f

    if-ge v3, v1, :cond_1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-le v6, v5, :cond_0

    if-ge v6, v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Unexpected char %#04x at %d in header name: %s"

    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-le v6, v5, :cond_2

    if-ge v6, v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "Unexpected char %#04x at %d in header value: %s"

    invoke-static {v0, v1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    iget-object v1, v0, Li8/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x2

    :cond_4
    add-int/lit8 v2, v2, 0x2

    goto :goto_2

    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "name is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()Ljava/lang/Object;
    .locals 4

    :try_start_0
    sget-object v0, Lr7/z;->a:Lr7/z;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lr7/z;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to create instance of "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    return v0
.end method

.method public final g(IILja/g;IZ)V
    .locals 3

    invoke-virtual {p0}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, La7/a;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " DATA: streamId="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " endStream="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " length="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lv6/d;->o(Lja/g;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final h(IILj8/a;Lja/j;)V
    .locals 3

    invoke-virtual {p0}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, La7/a;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " GO_AWAY: lastStreamId="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " errorCode="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " length="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Lja/j;->d()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Lja/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p4}, Lja/g;->e0(Lja/j;)V

    invoke-static {p1}, Lv6/d;->o(Lja/g;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final i(IJ)V
    .locals 3

    invoke-virtual {p0}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, La7/a;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " PING: ack=false bytes="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final j(IILj8/a;)V
    .locals 3

    invoke-virtual {p0}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, La7/a;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " RST_STREAM: streamId="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " errorCode="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final k(ILa4/k;)V
    .locals 9

    invoke-virtual {p0}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, La7/a;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " SETTINGS: ack=false settings="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/util/EnumMap;

    const-class v3, Lh8/o;

    invoke-direct {p1, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-static {}, Lh8/o;->values()[Lh8/o;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    iget v7, v6, Lh8/o;->a:I

    invoke-virtual {p2, v7}, La4/k;->a(I)Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v7, p2, La4/k;->d:[I

    iget v8, v6, Lh8/o;->a:I

    aget v7, v7, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p1, v6, v7}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final l(IIJ)V
    .locals 3

    invoke-virtual {p0}, Lv6/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Logger;

    iget-object v1, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, La7/a;->H(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " WINDOW_UPDATE: streamId="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " windowSizeIncrement="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final m(Lcom/google/crypto/tink/shaded/protobuf/l;)Li7/a1;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ld7/f;

    invoke-virtual {v0}, Ld7/f;->d()Lw6/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf4/y;->e(Lcom/google/crypto/tink/shaded/protobuf/l;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf4/y;->g(Lcom/google/crypto/tink/shaded/protobuf/b;)V

    invoke-virtual {v0, p1}, Lf4/y;->b(Lcom/google/crypto/tink/shaded/protobuf/b;)Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    invoke-static {}, Li7/a1;->E()Li7/y0;

    move-result-object v0

    iget-object v1, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v1, Ld7/f;

    invoke-virtual {v1}, Ld7/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v2, Li7/a1;

    invoke-static {v2, v1}, Li7/a1;->x(Li7/a1;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/b0;->a(Lcom/google/crypto/tink/shaded/protobuf/j1;)I

    move-result v2

    new-instance v3, Lv6/d;

    invoke-direct {v3, v2, v1}, Lv6/d;-><init>(ILjava/lang/Object;)V

    iget-object v1, v3, Lv6/d;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-virtual {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/b0;->e(Lcom/google/crypto/tink/shaded/protobuf/p;)V

    iget-object v1, v3, Lv6/d;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/p;

    iget v2, v1, Lcom/google/crypto/tink/shaded/protobuf/p;->B:I

    iget v1, v1, Lcom/google/crypto/tink/shaded/protobuf/p;->C:I

    sub-int/2addr v2, v1

    if-nez v2, :cond_0

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/k;

    iget-object v2, v3, Lv6/d;->c:Ljava/lang/Object;

    check-cast v2, [B

    invoke-direct {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;-><init>([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast p1, Li7/a1;

    invoke-static {p1, v1}, Li7/a1;->y(Li7/a1;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    iget-object p1, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast p1, Ld7/f;

    invoke-virtual {p1}, Ld7/f;->e()Li7/z0;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v1, Li7/a1;

    invoke-static {v1, p1}, Li7/a1;->z(Li7/a1;Li7/z0;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    check-cast p1, Li7/a1;
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception v0

    :try_start_4
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "ByteString"

    invoke-virtual {p1, v2}, Lcom/google/crypto/tink/shaded/protobuf/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Unexpected proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final n()V
    .locals 3

    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    iget-object v0, p0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lv6/d;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Request{url="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v1, Lk8/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    iget-object v0, p0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method
