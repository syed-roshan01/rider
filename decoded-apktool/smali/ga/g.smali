.class public final Lga/g;
.super Ljava/lang/Object;

# interfaces
.implements Lga/l;


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 1

    sget-object v0, Lfa/d;->d:Lx9/v;

    invoke-virtual {v0}, Lx9/v;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of p1, p1, Lorg/bouncycastle/jsse/BCSSLSocket;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Lga/n;
    .locals 0

    new-instance p1, Lga/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
