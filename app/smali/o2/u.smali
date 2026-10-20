.class public final Lo2/u;
.super Ljava/lang/Object;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Lo2/v;

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(ZI)V
    .locals 6

    and-int/lit8 v0, p2, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v3, p2, 0x4

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, p2, 0x8

    if-eqz v4, :cond_2

    sget-object v4, Lo2/v;->a:Lo2/v;

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/lit8 v5, p2, 0x10

    if-eqz v5, :cond_3

    move p1, v2

    :cond_3
    and-int/lit8 p2, p2, 0x20

    if-eqz p2, :cond_4

    goto :goto_3

    :cond_4
    move v2, v1

    :goto_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lo2/u;->a:Z

    iput-boolean v0, p0, Lo2/u;->b:Z

    iput-boolean v3, p0, Lo2/u;->c:Z

    iput-object v4, p0, Lo2/u;->d:Lo2/v;

    iput-boolean p1, p0, Lo2/u;->e:Z

    iput-boolean v2, p0, Lo2/u;->f:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo2/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lo2/u;

    iget-boolean v1, p1, Lo2/u;->a:Z

    iget-boolean v3, p0, Lo2/u;->a:Z

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lo2/u;->b:Z

    iget-boolean v3, p1, Lo2/u;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lo2/u;->c:Z

    iget-boolean v3, p1, Lo2/u;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lo2/u;->d:Lo2/v;

    iget-object v3, p1, Lo2/u;->d:Lo2/v;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lo2/u;->e:Z

    iget-boolean v3, p1, Lo2/u;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lo2/u;->f:Z

    iget-boolean p1, p1, Lo2/u;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lo2/u;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lo2/u;->a:Z

    invoke-static {v3, v1, v2}, Ll/q;->c(ZII)I

    move-result v1

    invoke-static {v0, v1, v2}, Ll/q;->c(ZII)I

    move-result v0

    iget-boolean v1, p0, Lo2/u;->c:Z

    invoke-static {v1, v0, v2}, Ll/q;->c(ZII)I

    move-result v0

    iget-object v1, p0, Lo2/u;->d:Lo2/v;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lo2/u;->e:Z

    invoke-static {v0, v1, v2}, Ll/q;->c(ZII)I

    move-result v0

    iget-boolean v1, p0, Lo2/u;->f:Z

    invoke-static {v1, v0, v2}, Ll/q;->c(ZII)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
