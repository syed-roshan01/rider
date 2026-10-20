.class public final Lm9/h2;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/h;
.implements Lu8/i;


# static fields
.field public static final a:Lm9/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/h2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm9/h2;->a:Lm9/h2;

    return-void
.end method


# virtual methods
.method public final O(Lu8/j;)Lu8/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ld7/a;->A(Lu8/j;Lu8/j;)Lu8/j;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;Lc9/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lu8/i;)Lu8/h;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->D(Lu8/h;Lu8/i;)Lu8/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lu8/i;
    .locals 0

    return-object p0
.end method

.method public final u(Lu8/i;)Lu8/j;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->V(Lu8/h;Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method
