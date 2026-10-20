.class public final Le8/v0;
.super Ljava/lang/Object;


# static fields
.field public static final e:Le8/v0;


# instance fields
.field public final a:Le8/x0;

.field public final b:Le8/n;

.field public final c:Le8/c2;

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Le8/v0;

    sget-object v1, Le8/c2;->e:Le8/c2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Le8/v0;-><init>(Le8/x0;Ln8/m;Le8/c2;Z)V

    sput-object v0, Le8/v0;->e:Le8/v0;

    return-void
.end method

.method public constructor <init>(Le8/x0;Ln8/m;Le8/c2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/v0;->a:Le8/x0;

    iput-object p2, p0, Le8/v0;->b:Le8/n;

    const-string p1, "status"

    invoke-static {p3, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Le8/v0;->c:Le8/c2;

    iput-boolean p4, p0, Le8/v0;->d:Z

    return-void
.end method

.method public static a(Le8/c2;)Le8/v0;
    .locals 3

    invoke-virtual {p0}, Le8/c2;->e()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error status shouldn\'t be OK"

    invoke-static {v1, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    new-instance v0, Le8/v0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, p0, v1}, Le8/v0;-><init>(Le8/x0;Ln8/m;Le8/c2;Z)V

    return-object v0
.end method

.method public static b(Le8/x0;Ln8/m;)Le8/v0;
    .locals 3

    new-instance v0, Le8/v0;

    const-string v1, "subchannel"

    invoke-static {p0, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Le8/c2;->e:Le8/c2;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Le8/v0;-><init>(Le8/x0;Ln8/m;Le8/c2;Z)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Le8/v0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Le8/v0;

    iget-object v0, p1, Le8/v0;->a:Le8/x0;

    iget-object v2, p0, Le8/v0;->a:Le8/x0;

    invoke-static {v2, v0}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le8/v0;->c:Le8/c2;

    iget-object v2, p1, Le8/v0;->c:Le8/c2;

    invoke-static {v0, v2}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le8/v0;->b:Le8/n;

    iget-object v2, p1, Le8/v0;->b:Le8/n;

    invoke-static {v0, v2}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Le8/v0;->d:Z

    iget-boolean p1, p1, Le8/v0;->d:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Le8/v0;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Le8/v0;->a:Le8/x0;

    iget-object v2, p0, Le8/v0;->c:Le8/c2;

    iget-object v3, p0, Le8/v0;->b:Le8/n;

    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "subchannel"

    iget-object v2, p0, Le8/v0;->a:Le8/x0;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "streamTracerFactory"

    iget-object v2, p0, Le8/v0;->b:Le8/n;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "status"

    iget-object v2, p0, Le8/v0;->c:Le8/c2;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "drop"

    iget-boolean v2, p0, Le8/v0;->d:Z

    invoke-virtual {v0, v1, v2}, Lq6/g;->c(Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
