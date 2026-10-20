.class public final Lg8/s;
.super Ljava/lang/Object;


# instance fields
.field public final a:Le8/b1;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Le8/b1;->a()Le8/b1;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "registry"

    invoke-static {v0, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lg8/s;->a:Le8/b1;

    const-string v0, "defaultPolicy"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lg8/s;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Lg8/s;Ljava/lang/String;)Le8/a1;
    .locals 2

    iget-object p0, p0, Lg8/s;->a:Le8/b1;

    invoke-virtual {p0, p1}, Le8/b1;->b(Ljava/lang/String;)Le8/a1;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lg8/r;

    const-string v0, "Trying to load \'"

    const-string v1, "\' because using default policy, but it\'s unavailable"

    invoke-static {v0, p1, v1}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
.end method
