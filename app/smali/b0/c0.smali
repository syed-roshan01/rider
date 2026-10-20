.class public final Lb0/c0;
.super Ljava/lang/Object;

# interfaces
.implements Lb0/b0;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lb0/c0;->a:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lb0/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lb0/c0;

    iget p1, p1, Lb0/c0;->a:I

    iget v0, p0, Lb0/c0;->a:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lb0/c0;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method
