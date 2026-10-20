.class public final La4/k;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:[I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0xa

    new-array p1, p1, [I

    iput-object p1, p0, La4/k;->d:[I

    return-void
.end method

.method public constructor <init>(III[I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La4/k;->a:I

    const/4 p1, 0x0

    iput p1, p0, La4/k;->b:I

    iput p3, p0, La4/k;->c:I

    iput-object p4, p0, La4/k;->d:[I

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 2

    const/4 v0, 0x1

    shl-int p1, v0, p1

    iget v1, p0, La4/k;->a:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(II)V
    .locals 4

    iget-object v0, p0, La4/k;->d:[I

    array-length v1, v0

    if-lt p1, v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    shl-int/2addr v1, p1

    iget v2, p0, La4/k;->a:I

    or-int/2addr v2, v1

    iput v2, p0, La4/k;->a:I

    iget v2, p0, La4/k;->b:I

    not-int v3, v1

    and-int/2addr v2, v3

    iput v2, p0, La4/k;->b:I

    iget v2, p0, La4/k;->c:I

    not-int v1, v1

    and-int/2addr v1, v2

    iput v1, p0, La4/k;->c:I

    aput p2, v0, p1

    return-void
.end method
