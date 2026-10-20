.class public final Lu/i2;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu/i2;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lu/p2;

    iget v1, p0, Lu/i2;->a:I

    invoke-direct {v0, v1}, Lu/p2;-><init>(I)V

    return-object v0
.end method
