.class public final Le8/m1;
.super Ljava/lang/Object;


# instance fields
.field public a:Le8/n1;

.field public b:Le8/n1;

.field public c:Le8/o1;

.field public d:Ljava/lang/String;

.field public e:Z


# virtual methods
.method public final a()Le8/p1;
    .locals 7

    new-instance v6, Le8/p1;

    iget-object v1, p0, Le8/m1;->c:Le8/o1;

    iget-object v2, p0, Le8/m1;->d:Ljava/lang/String;

    iget-object v3, p0, Le8/m1;->a:Le8/n1;

    iget-object v4, p0, Le8/m1;->b:Le8/n1;

    iget-boolean v5, p0, Le8/m1;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le8/p1;-><init>(Le8/o1;Ljava/lang/String;Le8/n1;Le8/n1;Z)V

    return-object v6
.end method
