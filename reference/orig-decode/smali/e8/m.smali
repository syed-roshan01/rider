.class public final Le8/m;
.super Le8/j0;


# instance fields
.field public final a:Le8/j0;


# direct methods
.method public constructor <init>(Le8/j0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/m;->a:Le8/j0;

    const-string p1, "interceptor"

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le8/m;->a:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m(Le8/p1;Le8/h;)Le8/k;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
