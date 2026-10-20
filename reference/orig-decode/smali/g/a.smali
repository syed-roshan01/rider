.class public abstract Lg/a;
.super Landroid/view/ViewGroup$MarginLayoutParams;


# instance fields
.field public a:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    iput p1, p0, Lg/a;->a:I

    return-void
.end method

.method public constructor <init>(Lg/a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 v0, 0x0

    iput v0, p0, Lg/a;->a:I

    .line 2
    iget p1, p1, Lg/a;->a:I

    iput p1, p0, Lg/a;->a:I

    return-void
.end method
