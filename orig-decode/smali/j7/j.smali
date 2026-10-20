.class public final Lj7/j;
.super Ljava/lang/Object;


# static fields
.field public static final b:Lj7/j;

.field public static final c:Lj7/j;


# instance fields
.field public final a:Lj7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    sput-object v0, Lj7/j;->b:Lj7/j;

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    sput-object v0, Lj7/j;->c:Lj7/j;

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    new-instance v0, Lj7/j;

    new-instance v1, Lx9/v;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lx9/v;-><init>(I)V

    invoke-direct {v0, v1}, Lj7/j;-><init>(Lx9/v;)V

    return-void
.end method

.method public constructor <init>(Lx9/v;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La7/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lj7/i;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lj7/i;-><init>(Lx9/v;I)V

    iput-object v0, p0, Lj7/j;->a:Lj7/i;

    goto :goto_0

    :cond_0
    const-string v0, "java.vendor"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "The Android Project"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lj7/i;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj7/i;-><init>(Lx9/v;I)V

    iput-object v0, p0, Lj7/j;->a:Lj7/i;

    goto :goto_0

    :cond_1
    new-instance v0, Lj7/i;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj7/i;-><init>(Lx9/v;I)V

    iput-object v0, p0, Lj7/j;->a:Lj7/i;

    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lj7/j;->a:Lj7/i;

    iget v1, v0, Lj7/i;->a:I

    const/4 v2, 0x0

    const-string v3, "GmsCore_OpenSSL"

    const-string v4, "AndroidOpenSSL"

    iget-object v0, v0, Lj7/i;->b:Lj7/k;

    const/4 v5, 0x0

    packed-switch v1, :pswitch_data_0

    const-string v1, "Conscrypt"

    filled-new-array {v3, v4, v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const/4 v4, 0x3

    if-ge v2, v4, :cond_1

    aget-object v4, v1, v2

    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/Provider;

    :try_start_0
    move-object v3, v0

    check-cast v3, Lx9/v;

    invoke-virtual {v3, p1, v2}, Lx9/v;->t(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v2

    if-nez v5, :cond_2

    move-object v5, v2

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No good Provider found."

    invoke-direct {p1, v0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :pswitch_0
    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1, v5}, Lx9/v;->t(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :pswitch_1
    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    const/4 v4, 0x2

    if-ge v2, v4, :cond_5

    aget-object v4, v1, v2

    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v5

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/Provider;

    :try_start_1
    move-object v4, v0

    check-cast v4, Lx9/v;

    invoke-virtual {v4, p1, v3}, Lx9/v;->t(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v3

    if-nez v2, :cond_6

    move-object v2, v3

    goto :goto_3

    :cond_7
    check-cast v0, Lx9/v;

    invoke-virtual {v0, p1, v5}, Lx9/v;->t(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
