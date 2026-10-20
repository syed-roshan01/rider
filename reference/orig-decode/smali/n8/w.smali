.class public final Ln8/w;
.super Le8/a1;


# static fields
.field public static final synthetic d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Le8/j0;)Le8/z0;
    .locals 1

    new-instance v0, Ln8/v;

    invoke-direct {v0, p1}, Ln8/v;-><init>(Le8/j0;)V

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    const-string v0, "round_robin"

    return-object v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(Ljava/util/Map;)Le8/r1;
    .locals 1

    new-instance p1, Le8/r1;

    const-string v0, "no service config"

    invoke-direct {p1, v0}, Le8/r1;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
