.class public final Ly/o;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# static fields
.field public static final a:Ly/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly/o;->a:Ly/o;

    return-void
.end method


# virtual methods
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 1

    invoke-static {p3, p4}, Lm2/a;->k(J)I

    move-result p2

    invoke-static {p3, p4}, Lm2/a;->j(J)I

    move-result p3

    sget-object p4, Ly/n;->b:Ly/n;

    sget-object v0, Lr8/s;->a:Lr8/s;

    invoke-interface {p1, p2, p3, v0, p4}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1
.end method
