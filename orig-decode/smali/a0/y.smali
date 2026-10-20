.class public final La0/y;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/l3;


# instance fields
.field public final a:Lm0/n1;

.field public b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    div-int/lit8 v0, p1, 0x1e

    mul-int/lit8 v0, v0, 0x1e

    add-int/lit8 v1, v0, -0x64

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit16 v0, v0, 0x82

    invoke-static {v1, v0}, Lz6/a;->s0(II)Li9/g;

    move-result-object v0

    sget-object v1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, La0/y;->a:Lm0/n1;

    iput p1, p0, La0/y;->b:I

    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 2

    iget v0, p0, La0/y;->b:I

    if-eq p1, v0, :cond_0

    iput p1, p0, La0/y;->b:I

    div-int/lit8 p1, p1, 0x1e

    mul-int/lit8 p1, p1, 0x1e

    add-int/lit8 v0, p1, -0x64

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit16 p1, p1, 0x82

    invoke-static {v0, p1}, Lz6/a;->s0(II)Li9/g;

    move-result-object p1

    iget-object v0, p0, La0/y;->a:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La0/y;->a:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/g;

    return-object v0
.end method
