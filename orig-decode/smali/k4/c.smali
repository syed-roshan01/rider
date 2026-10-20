.class public final Lk4/c;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lk4/k;

.field public final b:Lu9/i;


# direct methods
.method public constructor <init>(ILk4/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk4/c;->a:Lk4/k;

    sget p2, Lu9/j;->a:I

    new-instance p2, Lu9/i;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lu9/i;-><init>(II)V

    iput-object p2, p0, Lk4/c;->b:Lu9/i;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lk4/c;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lk4/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
