.class public final Lz/i0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    iput p1, p0, Lz/i0;->a:I

    iput p2, p0, Lz/i0;->b:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lz/g0;

    iget v1, p0, Lz/i0;->a:I

    iget v2, p0, Lz/i0;->b:I

    invoke-direct {v0, v1, v2}, Lz/g0;-><init>(II)V

    return-object v0
.end method
