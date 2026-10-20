.class public abstract Le8/z0;
.super Ljava/lang/Object;


# static fields
.field public static final b:Le8/b;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le8/b;

    const-string v1, "internal:health-checking-config"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Le8/z0;->b:Le8/b;

    return-void
.end method


# virtual methods
.method public a(Le8/w0;)Z
    .locals 5

    iget-object v0, p1, Le8/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Le8/z0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Le8/c2;->m:Le8/c2;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NameResolver returned no usable address. addrs="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", attrs="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Le8/w0;->b:Le8/c;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Le8/z0;->c(Le8/c2;)V

    return v2

    :cond_0
    iget v0, p0, Le8/z0;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Le8/z0;->a:I

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Le8/z0;->d(Le8/w0;)V

    :cond_1
    iput v2, p0, Le8/z0;->a:I

    const/4 p1, 0x1

    return p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract c(Le8/c2;)V
.end method

.method public d(Le8/w0;)V
    .locals 2

    iget v0, p0, Le8/z0;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Le8/z0;->a:I

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Le8/z0;->a(Le8/w0;)Z

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Le8/z0;->a:I

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public abstract f()V
.end method
