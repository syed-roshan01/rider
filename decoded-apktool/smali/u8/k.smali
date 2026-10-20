.class public final Lu8/k;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/j;
.implements Ljava/io/Serializable;


# static fields
.field public static final a:Lu8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu8/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu8/k;->a:Lu8/k;

    return-void
.end method


# virtual methods
.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
