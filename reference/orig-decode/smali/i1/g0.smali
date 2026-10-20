.class public final Li1/g0;
.super Li1/i0;

# interfaces
.implements Ljava/lang/Iterable;
.implements Le9/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final n:F

.field public final o:F

.field public final p:Ljava/util/List;

.field public final q:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/g0;->a:Ljava/lang/String;

    iput p2, p0, Li1/g0;->b:F

    iput p3, p0, Li1/g0;->c:F

    iput p4, p0, Li1/g0;->d:F

    iput p5, p0, Li1/g0;->e:F

    iput p6, p0, Li1/g0;->f:F

    iput p7, p0, Li1/g0;->n:F

    iput p8, p0, Li1/g0;->o:F

    iput-object p9, p0, Li1/g0;->p:Ljava/util/List;

    iput-object p10, p0, Li1/g0;->q:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    instance-of v2, p1, Li1/g0;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Li1/g0;

    iget-object v2, p1, Li1/g0;->a:Ljava/lang/String;

    iget-object v3, p0, Li1/g0;->a:Ljava/lang/String;

    invoke-static {v3, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, Li1/g0;->b:F

    iget v3, p1, Li1/g0;->b:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Li1/g0;->c:F

    iget v3, p1, Li1/g0;->c:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Li1/g0;->d:F

    iget v3, p1, Li1/g0;->d:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Li1/g0;->e:F

    iget v3, p1, Li1/g0;->e:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Li1/g0;->f:F

    iget v3, p1, Li1/g0;->f:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Li1/g0;->n:F

    iget v3, p1, Li1/g0;->n:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget v2, p0, Li1/g0;->o:F

    iget v3, p1, Li1/g0;->o:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_5

    iget-object v2, p0, Li1/g0;->p:Ljava/util/List;

    iget-object v3, p1, Li1/g0;->p:Ljava/util/List;

    invoke-static {v2, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Li1/g0;->q:Ljava/util/List;

    iget-object p1, p1, Li1/g0;->q:Ljava/util/List;

    invoke-static {v2, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0

    :cond_5
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Li1/g0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Li1/g0;->b:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v2, p0, Li1/g0;->c:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v2, p0, Li1/g0;->d:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v2, p0, Li1/g0;->e:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v2, p0, Li1/g0;->f:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v2, p0, Li1/g0;->n:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget v2, p0, Li1/g0;->o:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget-object v2, p0, Li1/g0;->p:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Li1/g0;->q:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Li1/f0;

    invoke-direct {v0, p0}, Li1/f0;-><init>(Li1/g0;)V

    return-object v0
.end method
