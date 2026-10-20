.class public final synthetic Lj4/h;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:Lj4/l;


# direct methods
.method public constructor <init>(Lj4/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/h;->a:Lj4/l;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj4/f;

    iget-object p2, p0, Lj4/h;->a:Lj4/l;

    invoke-virtual {p2, p1}, Lj4/l;->k(Lj4/f;)V

    sget-object p1, Lv8/a;->a:Lv8/a;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lp9/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lj4/h;

    if-eqz v0, :cond_0

    new-instance v0, Ld9/a;

    iget-object v1, p0, Lj4/h;->a:Lj4/l;

    invoke-direct {v0, v1}, Ld9/a;-><init>(Lj4/l;)V

    check-cast p1, Lj4/h;

    new-instance v1, Ld9/a;

    iget-object p1, p1, Lj4/h;->a:Lj4/l;

    invoke-direct {v1, p1}, Ld9/a;-><init>(Lj4/l;)V

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lj4/h;->a:Lj4/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    const-class v1, Lj4/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    const v0, -0x22d74eb8

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    const v0, 0x5caaaa60

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    add-int/lit16 v1, v1, 0x4d5

    mul-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x2

    mul-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x2

    return v1
.end method
