.class public final Li8/g;
.super Li8/k;


# instance fields
.field public final e:Ll/z2;

.field public final f:Ll/z2;

.field public final g:Ll/z2;

.field public final h:Ll/z2;

.field public final i:I


# direct methods
.method public constructor <init>(Ll/z2;Ll/z2;Ll/z2;Ll/z2;Ljava/security/Provider;I)V
    .locals 0

    invoke-direct {p0, p5}, Li8/k;-><init>(Ljava/security/Provider;)V

    iput-object p1, p0, Li8/g;->e:Ll/z2;

    iput-object p2, p0, Li8/g;->f:Ll/z2;

    iput-object p3, p0, Li8/g;->g:Ll/z2;

    iput-object p4, p0, Li8/g;->h:Ll/z2;

    iput p6, p0, Li8/g;->i:I

    return-void
.end method


# virtual methods
.method public final c(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    if-eqz p2, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Li8/g;->e:Ll/z2;

    invoke-virtual {v1, p1, v0}, Ll/z2;->F(Ljava/lang/Object;[Ljava/lang/Object;)V

    iget-object v0, p0, Li8/g;->f:Ll/z2;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/z2;->F(Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    iget-object p2, p0, Li8/g;->h:Ll/z2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/z2;->w(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p3}, Li8/k;->b(Ljava/util/List;)[B

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ll/z2;->G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final d(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Li8/g;->g:Ll/z2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/z2;->w(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v3, 0x0

    if-nez v1, :cond_1

    return-object v3

    :cond_1
    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ll/z2;->G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_2

    new-instance v3, Ljava/lang/String;

    sget-object v0, Li8/n;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_2
    return-object v3
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Li8/g;->i:I

    return v0
.end method
