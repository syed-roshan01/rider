.class public final Lm4/i;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/f;


# instance fields
.field public final a:Lq8/c;

.field public final b:Lq8/c;

.field public final c:Z


# direct methods
.method public constructor <init>(Lq8/i;Lq8/i;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/i;->a:Lq8/c;

    iput-object p2, p0, Lm4/i;->b:Lq8/c;

    iput-boolean p3, p0, Lm4/i;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls4/n;Li4/i;)Lm4/g;
    .locals 6

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p3

    const-string v0, "http"

    invoke-static {p3, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p3

    const-string v0, "https"

    invoke-static {p3, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p3, Lm4/l;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lm4/i;->a:Lq8/c;

    iget-object v4, p0, Lm4/i;->b:Lq8/c;

    iget-boolean v5, p0, Lm4/i;->c:Z

    move-object v0, p3

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lm4/l;-><init>(Ljava/lang/String;Ls4/n;Lq8/c;Lq8/c;Z)V

    move-object p1, p3

    :goto_1
    return-object p1
.end method
