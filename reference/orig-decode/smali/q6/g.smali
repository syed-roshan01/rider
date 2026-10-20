.class public final Lq6/g;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ll/z2;

.field public c:Ll/z2;

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll/z2;

    invoke-direct {v0}, Ll/z2;-><init>()V

    iput-object v0, p0, Lq6/g;->b:Ll/z2;

    iput-object v0, p0, Lq6/g;->c:Ll/z2;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq6/g;->d:Z

    iput-object p1, p0, Lq6/g;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ll/z2;

    invoke-direct {v0}, Ll/z2;-><init>()V

    iget-object v1, p0, Lq6/g;->c:Ll/z2;

    iput-object v0, v1, Ll/z2;->d:Ljava/lang/Object;

    iput-object v0, p0, Lq6/g;->c:Ll/z2;

    iput-object p1, v0, Ll/z2;->c:Ljava/lang/Object;

    iput-object p2, v0, Ll/z2;->b:Ljava/lang/Object;

    return-void
.end method

.method public final b(Ljava/lang/String;J)V
    .locals 0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lq6/f;

    invoke-direct {v0}, Ll/z2;-><init>()V

    iget-object v1, p0, Lq6/g;->c:Ll/z2;

    iput-object v0, v1, Ll/z2;->d:Ljava/lang/Object;

    iput-object v0, p0, Lq6/g;->c:Ll/z2;

    iput-object p1, v0, Ll/z2;->c:Ljava/lang/Object;

    iput-object p2, v0, Ll/z2;->b:Ljava/lang/Object;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lq6/g;->d:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v2, p0, Lq6/g;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lq6/g;->b:Ll/z2;

    iget-object v2, v2, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, Ll/z2;

    const-string v3, ""

    :goto_0
    if-eqz v2, :cond_4

    iget-object v4, v2, Ll/z2;->c:Ljava/lang/Object;

    instance-of v5, v2, Lq6/f;

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    if-nez v0, :cond_3

    :cond_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v2, Ll/z2;->b:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_1

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_2

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    invoke-virtual {v1, v3, v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v3, ", "

    :cond_3
    iget-object v2, v2, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, Ll/z2;

    goto :goto_0

    :cond_4
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
