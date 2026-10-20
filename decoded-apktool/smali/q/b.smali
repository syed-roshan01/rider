.class public final Lq/b;
.super Lq/h;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq/f;I)V
    .locals 1

    iput p2, p0, Lq/b;->d:I

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    iput-object p1, p0, Lq/b;->e:Ljava/lang/Object;

    .line 3
    iget p1, p1, Lq/z;->c:I

    .line 4
    invoke-direct {p0, p1}, Lq/h;-><init>(I)V

    return-void

    :cond_0
    iput-object p1, p0, Lq/b;->e:Ljava/lang/Object;

    .line 5
    iget p1, p1, Lq/z;->c:I

    .line 6
    invoke-direct {p0, p1}, Lq/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lq/g;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lq/b;->d:I

    iput-object p1, p0, Lq/b;->e:Ljava/lang/Object;

    .line 1
    iget p1, p1, Lq/g;->c:I

    .line 2
    invoke-direct {p0, p1}, Lq/h;-><init>(I)V

    return-void
.end method
