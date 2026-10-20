.class public final Le8/v;
.super Le8/f;


# instance fields
.field public final a:Le8/f;

.field public final b:Le8/f;


# direct methods
.method public constructor <init>(Le8/f;Le8/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "creds1"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Le8/v;->a:Le8/f;

    iput-object p2, p0, Le8/v;->b:Le8/f;

    return-void
.end method


# virtual methods
.method public final applyRequestMetadata(Le8/e;Ljava/util/concurrent/Executor;Le8/d;)V
    .locals 7

    new-instance v6, Le8/u;

    invoke-static {}, Le8/b0;->b()Le8/b0;

    move-result-object v5

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Le8/u;-><init>(Le8/v;Le8/e;Ljava/util/concurrent/Executor;Le8/d;Le8/b0;)V

    iget-object p3, p0, Le8/v;->a:Le8/f;

    invoke-virtual {p3, p1, p2, v6}, Le8/f;->applyRequestMetadata(Le8/e;Ljava/util/concurrent/Executor;Le8/d;)V

    return-void
.end method
