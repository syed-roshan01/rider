.class public final Lj7/i;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public final b:Lj7/k;


# direct methods
.method public synthetic constructor <init>(Lx9/v;I)V
    .locals 2

    iput p2, p0, Lj7/i;->a:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lj7/i;-><init>(Lx9/v;II)V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1, v1, v0}, Lj7/i;-><init>(Lx9/v;II)V

    return-void

    .line 4
    :cond_1
    invoke-direct {p0, p1, v1, v0}, Lj7/i;-><init>(Lx9/v;II)V

    return-void
.end method

.method public synthetic constructor <init>(Lx9/v;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lj7/i;->a:I

    iput-object p1, p0, Lj7/i;->b:Lj7/k;

    return-void
.end method
