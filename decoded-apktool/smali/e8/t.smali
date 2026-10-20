.class public final Le8/t;
.super Le8/d;


# instance fields
.field public final a:Le8/d;

.field public final b:Le8/l1;


# direct methods
.method public constructor <init>(Le8/d;Le8/l1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/t;->a:Le8/d;

    iput-object p2, p0, Le8/t;->b:Le8/l1;

    return-void
.end method


# virtual methods
.method public final a(Le8/l1;)V
    .locals 2

    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Le8/t;->b:Le8/l1;

    invoke-virtual {v0, v1}, Le8/l1;->d(Le8/l1;)V

    invoke-virtual {v0, p1}, Le8/l1;->d(Le8/l1;)V

    iget-object p1, p0, Le8/t;->a:Le8/d;

    invoke-virtual {p1, v0}, Le8/d;->a(Le8/l1;)V

    return-void
.end method

.method public final b(Le8/c2;)V
    .locals 1

    iget-object v0, p0, Le8/t;->a:Le8/d;

    invoke-virtual {v0, p1}, Le8/d;->b(Le8/c2;)V

    return-void
.end method
