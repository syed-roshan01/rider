.class public final Lj7/n;
.super Ljava/lang/ThreadLocal;


# instance fields
.field public final synthetic a:Lj7/o;


# direct methods
.method public constructor <init>(Lj7/o;)V
    .locals 0

    iput-object p1, p0, Lj7/n;->a:Lj7/o;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj7/n;->a:Lj7/o;

    :try_start_0
    sget-object v1, Lj7/j;->c:Lj7/j;

    iget-object v2, v0, Lj7/o;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lj7/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/crypto/Mac;

    iget-object v0, v0, Lj7/o;->c:Ljava/security/Key;

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
