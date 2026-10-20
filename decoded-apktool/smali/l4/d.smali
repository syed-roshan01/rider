.class public final Ll4/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/r;
.implements Lh6/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll4/d;->a:I

    return-void
.end method

.method public static a(Lx9/q;Lx9/q;)Lx9/q;
    .locals 10

    new-instance v0, Lx9/p;

    invoke-direct {v0}, Lx9/p;-><init>()V

    invoke-virtual {p0}, Lx9/q;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-string v4, "Content-Type"

    const-string v5, "Content-Encoding"

    const-string v6, "Content-Length"

    if-ge v3, v1, :cond_4

    invoke-virtual {p0, v3}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v3}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Warning"

    invoke-static {v9, v7}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v9, "1"

    invoke-static {v8, v9, v2}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {v6, v7}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-static {v5, v7}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v4, v7}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v7}, Ll4/d;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v7}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    :cond_2
    :goto_1
    invoke-virtual {v0, v7, v8}, Lx9/p;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lx9/q;->size()I

    move-result p0

    :goto_3
    if-ge v2, p0, :cond_7

    invoke-virtual {p1, v2}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {v5, v1}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {v4, v1}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {v1}, Ll4/d;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p1, v2}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lx9/p;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lx9/p;->c()Lx9/q;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-static {v0, p0}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    invoke-static {p1, p2}, Lh6/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;Lh6/c;)Lh6/d;
    .locals 5

    iget v0, p0, Ll4/d;->a:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh6/d;

    invoke-direct {v0}, Lh6/d;-><init>()V

    invoke-interface {p3, p1, p2}, Lh6/c;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    iput v4, v0, Lh6/d;->a:I

    if-eqz v4, :cond_0

    invoke-interface {p3, p1, p2, v1}, Lh6/c;->f(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p1

    iput p1, v0, Lh6/d;->b:I

    goto :goto_0

    :cond_0
    invoke-interface {p3, p1, p2, v3}, Lh6/c;->f(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p1

    iput p1, v0, Lh6/d;->b:I

    :goto_0
    iget p2, v0, Lh6/d;->a:I

    if-nez p2, :cond_1

    if-nez p1, :cond_2

    iput v1, v0, Lh6/d;->c:I

    goto :goto_1

    :cond_1
    move v1, p2

    :cond_2
    if-lt v1, p1, :cond_3

    iput v2, v0, Lh6/d;->c:I

    goto :goto_1

    :cond_3
    iput v3, v0, Lh6/d;->c:I

    :goto_1
    return-object v0

    :pswitch_0
    new-instance v0, Lh6/d;

    invoke-direct {v0}, Lh6/d;-><init>()V

    invoke-interface {p3, p1, p2}, Lh6/c;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    iput v4, v0, Lh6/d;->a:I

    invoke-interface {p3, p1, p2, v3}, Lh6/c;->f(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p1

    iput p1, v0, Lh6/d;->b:I

    iget p2, v0, Lh6/d;->a:I

    if-nez p2, :cond_4

    if-nez p1, :cond_5

    iput v1, v0, Lh6/d;->c:I

    goto :goto_2

    :cond_4
    move v1, p2

    :cond_5
    if-lt v1, p1, :cond_6

    iput v2, v0, Lh6/d;->c:I

    goto :goto_2

    :cond_6
    iput v3, v0, Lh6/d;->c:I

    :goto_2
    return-object v0

    :pswitch_1
    new-instance v0, Lh6/d;

    invoke-direct {v0}, Lh6/d;-><init>()V

    invoke-interface {p3, p1, p2, v1}, Lh6/c;->f(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p1

    iput p1, v0, Lh6/d;->b:I

    if-nez p1, :cond_7

    iput v1, v0, Lh6/d;->c:I

    goto :goto_3

    :cond_7
    iput v3, v0, Lh6/d;->c:I

    :goto_3
    return-object v0

    :pswitch_2
    new-instance v0, Lh6/d;

    invoke-direct {v0}, Lh6/d;-><init>()V

    invoke-interface {p3, p1, p2}, Lh6/c;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lh6/d;->a:I

    if-eqz v1, :cond_8

    iput v2, v0, Lh6/d;->c:I

    goto :goto_4

    :cond_8
    invoke-interface {p3, p1, p2, v3}, Lh6/c;->f(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p1

    iput p1, v0, Lh6/d;->b:I

    if-eqz p1, :cond_9

    iput v3, v0, Lh6/d;->c:I

    :cond_9
    :goto_4
    return-object v0

    :pswitch_3
    new-instance v0, Lh6/d;

    invoke-direct {v0}, Lh6/d;-><init>()V

    invoke-interface {p3, p1, p2, v3}, Lh6/c;->f(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result v1

    iput v1, v0, Lh6/d;->b:I

    if-eqz v1, :cond_a

    iput v3, v0, Lh6/d;->c:I

    goto :goto_5

    :cond_a
    invoke-interface {p3, p1, p2}, Lh6/c;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lh6/d;->a:I

    if-eqz p1, :cond_b

    iput v2, v0, Lh6/d;->c:I

    :cond_b
    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 0

    invoke-static {p1, p2, p3}, Lh6/e;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result p1

    return p1
.end method

.method public final getException(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->d:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/m;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-object v0
.end method
