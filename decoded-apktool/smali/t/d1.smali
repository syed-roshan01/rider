.class public final Lt/d1;
.super Ljava/lang/Object;

# interfaces
.implements Lt/e0;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FFLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt/d1;->a:F

    iput p2, p0, Lt/d1;->b:F

    iput-object p3, p0, Lt/d1;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const v1, 0x44bb8000    # 1500.0f

    .line 2
    invoke-direct {p0, v0, v1, p1}, Lt/d1;-><init>(FFLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lt/x1;)Lt/z1;
    .locals 3

    new-instance v0, Lt/g2;

    iget-object v1, p0, Lt/d1;->c:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lt/x1;->a:Lc9/c;

    invoke-interface {p1, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/t;

    :goto_0
    iget v1, p0, Lt/d1;->a:F

    iget v2, p0, Lt/d1;->b:F

    invoke-direct {v0, v1, v2, p1}, Lt/g2;-><init>(FFLt/t;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lt/d1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lt/d1;

    iget v0, p1, Lt/d1;->a:F

    iget v2, p0, Lt/d1;->a:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p1, Lt/d1;->b:F

    iget v2, p0, Lt/d1;->b:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p1, Lt/d1;->c:Ljava/lang/Object;

    iget-object v0, p0, Lt/d1;->c:Ljava/lang/Object;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lt/d1;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lt/d1;->a:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v1, p0, Lt/d1;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
