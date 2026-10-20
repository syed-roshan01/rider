.class public final Lx9/w;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lx9/d;


# static fields
.field public static final G:Ljava/util/List;

.field public static final H:Ljava/util/List;


# instance fields
.field public final A:Lx9/f;

.field public final B:Lf6/a;

.field public final C:I

.field public final D:I

.field public final E:I

.field public final F:Lk6/w4;

.field public final a:Lx9/l;

.field public final b:Lk6/w4;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Lb/b;

.field public final f:Z

.field public final n:Lx9/n;

.field public final o:Z

.field public final p:Z

.field public final q:Lx9/n;

.field public final r:Lx9/n;

.field public final s:Ljava/net/ProxySelector;

.field public final t:Lx9/n;

.field public final u:Ljavax/net/SocketFactory;

.field public final v:Ljavax/net/ssl/SSLSocketFactory;

.field public final w:Ljavax/net/ssl/X509TrustManager;

.field public final x:Ljava/util/List;

.field public final y:Ljava/util/List;

.field public final z:Lia/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lx9/x;->e:Lx9/x;

    sget-object v1, Lx9/x;->c:Lx9/x;

    filled-new-array {v0, v1}, [Lx9/x;

    move-result-object v0

    invoke-static {v0}, Ly9/b;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lx9/w;->G:Ljava/util/List;

    sget-object v0, Lx9/i;->e:Lx9/i;

    sget-object v1, Lx9/i;->f:Lx9/i;

    filled-new-array {v0, v1}, [Lx9/i;

    move-result-object v0

    invoke-static {v0}, Ly9/b;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lx9/w;->H:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    new-instance v0, Lx9/l;

    invoke-direct {v0}, Lx9/l;-><init>()V

    new-instance v1, Lk6/w4;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lk6/w4;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget-object v4, Lx9/n;->d:Lx9/n;

    sget-object v5, Ly9/b;->a:[B

    new-instance v5, Lb/b;

    const/16 v6, 0xf

    invoke-direct {v5, v4, v6}, Lb/b;-><init>(Ljava/lang/Object;I)V

    sget-object v4, Lx9/b;->a:Lx9/n;

    sget-object v6, Lx9/k;->b:Lx9/n;

    sget-object v7, Lx9/m;->c:Lx9/n;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v8

    const-string v9, "getDefault()"

    invoke-static {v8, v9}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lx9/w;->H:Ljava/util/List;

    sget-object v10, Lx9/w;->G:Ljava/util/List;

    sget-object v11, Lia/c;->a:Lia/c;

    sget-object v12, Lx9/f;->c:Lx9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lx9/w;->a:Lx9/l;

    iput-object v1, p0, Lx9/w;->b:Lk6/w4;

    invoke-static {v2}, Ly9/b;->u(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lx9/w;->c:Ljava/util/List;

    invoke-static {v3}, Ly9/b;->u(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lx9/w;->d:Ljava/util/List;

    iput-object v5, p0, Lx9/w;->e:Lb/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx9/w;->f:Z

    iput-object v4, p0, Lx9/w;->n:Lx9/n;

    iput-boolean v0, p0, Lx9/w;->o:Z

    iput-boolean v0, p0, Lx9/w;->p:Z

    iput-object v6, p0, Lx9/w;->q:Lx9/n;

    iput-object v7, p0, Lx9/w;->r:Lx9/n;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lha/a;->a:Lha/a;

    :cond_0
    iput-object v1, p0, Lx9/w;->s:Ljava/net/ProxySelector;

    iput-object v4, p0, Lx9/w;->t:Lx9/n;

    iput-object v8, p0, Lx9/w;->u:Ljavax/net/SocketFactory;

    iput-object v9, p0, Lx9/w;->x:Ljava/util/List;

    iput-object v10, p0, Lx9/w;->y:Ljava/util/List;

    iput-object v11, p0, Lx9/w;->z:Lia/c;

    const/16 v1, 0x2710

    iput v1, p0, Lx9/w;->C:I

    iput v1, p0, Lx9/w;->D:I

    iput v1, p0, Lx9/w;->E:I

    new-instance v1, Lk6/w4;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lk6/w4;-><init>(I)V

    iput-object v1, p0, Lx9/w;->F:Lk6/w4;

    check-cast v9, Ljava/lang/Iterable;

    instance-of v1, v9, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v9

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx9/i;

    iget-boolean v3, v3, Lx9/i;->a:Z

    if-eqz v3, :cond_2

    sget-object v1, Lfa/m;->a:Lfa/m;

    sget-object v1, Lfa/m;->a:Lfa/m;

    invoke-virtual {v1}, Lfa/m;->m()Ljavax/net/ssl/X509TrustManager;

    move-result-object v1

    iput-object v1, p0, Lx9/w;->w:Ljavax/net/ssl/X509TrustManager;

    sget-object v3, Lfa/m;->a:Lfa/m;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Lfa/m;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iput-object v3, p0, Lx9/w;->v:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v3, Lfa/m;->a:Lfa/m;

    invoke-virtual {v3, v1}, Lfa/m;->b(Ljavax/net/ssl/X509TrustManager;)Lf6/a;

    move-result-object v1

    iput-object v1, p0, Lx9/w;->B:Lf6/a;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v3, v12, Lx9/f;->b:Lf6/a;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lx9/f;

    iget-object v4, v12, Lx9/f;->a:Ljava/util/Set;

    invoke-direct {v3, v4, v1}, Lx9/f;-><init>(Ljava/util/Set;Lf6/a;)V

    move-object v12, v3

    :goto_0
    iput-object v12, p0, Lx9/w;->A:Lx9/f;

    goto :goto_2

    :cond_4
    :goto_1
    iput-object v2, p0, Lx9/w;->v:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v2, p0, Lx9/w;->B:Lf6/a;

    iput-object v2, p0, Lx9/w;->w:Ljavax/net/ssl/X509TrustManager;

    sget-object v1, Lx9/f;->c:Lx9/f;

    iput-object v1, p0, Lx9/w;->A:Lx9/f;

    :goto_2
    iget-object v1, p0, Lx9/w;->c:Ljava/util/List;

    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v1, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v0

    if-eqz v4, :cond_10

    iget-object v1, p0, Lx9/w;->d:Ljava/util/List;

    invoke-static {v1, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v0, v2

    if-eqz v0, :cond_f

    iget-object v0, p0, Lx9/w;->x:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    iget-object v2, p0, Lx9/w;->w:Ljavax/net/ssl/X509TrustManager;

    iget-object v3, p0, Lx9/w;->B:Lf6/a;

    iget-object v4, p0, Lx9/w;->v:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx9/i;

    iget-boolean v1, v1, Lx9/i;->a:Z

    if-eqz v1, :cond_6

    if-eqz v4, :cond_9

    if-eqz v3, :cond_8

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "x509TrustManager == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "certificateChainCleaner == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sslSocketFactory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_3
    const-string v0, "Check failed."

    if-nez v4, :cond_e

    if-nez v3, :cond_d

    if-nez v2, :cond_c

    iget-object v1, p0, Lx9/w;->A:Lx9/f;

    sget-object v2, Lx9/f;->c:Lx9/f;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_4
    return-void

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Null network interceptor: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Null interceptor: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
