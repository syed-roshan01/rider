.class public final Le1/k0;
.super Ljava/lang/Object;


# static fields
.field public static final d:Le1/k0;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Le1/k0;

    const/4 v1, 0x0

    const/4 v2, 0x7

    const-wide/16 v3, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Le1/k0;-><init>(JFI)V

    sput-object v0, Le1/k0;->d:Le1/k0;

    return-void
.end method

.method public constructor <init>(JFI)V
    .locals 6

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const-wide p1, 0xff000000L

    .line 2
    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/a;->c(J)J

    move-result-wide p1

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p4, 0x2

    if-eqz p1, :cond_1

    .line 3
    sget-wide p1, Ld1/c;->b:J

    :goto_0
    move-wide v3, p1

    goto :goto_1

    :cond_1
    const-wide/16 p1, 0x0

    goto :goto_0

    :goto_1
    and-int/lit8 p1, p4, 0x4

    if-eqz p1, :cond_2

    const/4 p3, 0x0

    :cond_2
    move v5, p3

    move-object v0, p0

    .line 4
    invoke-direct/range {v0 .. v5}, Le1/k0;-><init>(JJF)V

    return-void
.end method

.method public constructor <init>(JJF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le1/k0;->a:J

    iput-wide p3, p0, Le1/k0;->b:J

    iput p5, p0, Le1/k0;->c:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le1/k0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le1/k0;

    iget-wide v3, p1, Le1/k0;->a:J

    iget-wide v5, p0, Le1/k0;->a:J

    invoke-static {v5, v6, v3, v4}, Le1/r;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Le1/k0;->b:J

    iget-wide v5, p1, Le1/k0;->b:J

    invoke-static {v3, v4, v5, v6}, Ld1/c;->b(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Le1/k0;->c:F

    iget p1, p1, Le1/k0;->c:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_4

    return v0

    :cond_4
    return v2
.end method

.method public final hashCode()I
    .locals 4

    sget v0, Le1/r;->h:I

    iget-wide v0, p0, Le1/k0;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    sget v2, Ld1/c;->e:I

    iget-wide v2, p0, Le1/k0;->b:J

    invoke-static {v2, v3, v0, v1}, Ll/q;->b(JII)I

    move-result v0

    iget v1, p0, Le1/k0;->c:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Shadow(color="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Le1/k0;->a:J

    const-string v3, ", offset="

    invoke-static {v1, v2, v0, v3}, Lu/k1;->d(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    iget-wide v1, p0, Le1/k0;->b:J

    invoke-static {v1, v2}, Ld1/c;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blurRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le1/k0;->c:F

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ll/q;->l(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
