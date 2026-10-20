.class public final Lu1/h2;
.super Ljava/lang/Object;

# interfaces
.implements Ly0/p;


# instance fields
.field public final a:Lm0/k1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Lm9/e0;->H(F)Lm0/k1;

    move-result-object v0

    iput-object v0, p0, Lu1/h2;->a:Lm0/k1;

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

.method public final P()F
    .locals 1

    iget-object v0, p0, Lu1/h2;->a:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    return v0
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

.method public final u(Lu8/i;)Lu8/j;
    .locals 0

    invoke-static {p0, p1}, Lz6/a;->V(Lu8/h;Lu8/i;)Lu8/j;

    move-result-object p1

    return-object p1
.end method
