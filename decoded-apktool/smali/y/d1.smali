.class public final Ly/d1;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# static fields
.field public static final a:Ly/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly/d1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly/d1;->a:Ly/d1;

    return-void
.end method


# virtual methods
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 2

    invoke-static {p3, p4}, Lm2/a;->g(J)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-static {p3, p4}, Lm2/a;->i(J)I

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    invoke-static {p3, p4}, Lm2/a;->f(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p3, p4}, Lm2/a;->h(J)I

    move-result v0

    :cond_1
    sget-object p3, Ly/n;->d:Ly/n;

    sget-object p4, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p2, v0, p4, p3}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method
