.class public final Lm4/n;
.super Lm4/e;


# instance fields
.field public final a:Lk4/o;

.field public final b:Ljava/lang/String;

.field public final c:Lk4/f;


# direct methods
.method public constructor <init>(Lk4/o;Ljava/lang/String;Lk4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm4/n;->a:Lk4/o;

    iput-object p2, p0, Lm4/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lm4/n;->c:Lk4/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm4/n;

    if-eqz v1, :cond_1

    check-cast p1, Lm4/n;

    iget-object v1, p1, Lm4/n;->a:Lk4/o;

    iget-object v2, p0, Lm4/n;->a:Lk4/o;

    invoke-static {v2, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm4/n;->b:Ljava/lang/String;

    iget-object v2, p1, Lm4/n;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm4/n;->c:Lk4/f;

    iget-object p1, p1, Lm4/n;->c:Lk4/f;

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm4/n;->a:Lk4/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm4/n;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm4/n;->c:Lk4/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
