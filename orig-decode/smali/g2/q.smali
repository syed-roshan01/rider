.class public final Lg2/q;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/p;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lq8/c;

.field public final c:Lk/f;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/q;->a:Landroid/view/View;

    sget-object v0, Lq8/d;->a:[Lq8/d;

    new-instance v0, Lu1/z0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lz6/a;->R(Lc9/a;)Lq8/c;

    move-result-object v0

    iput-object v0, p0, Lg2/q;->b:Lq8/c;

    new-instance v0, Lk/f;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lk/f;-><init>(Landroid/view/View;I)V

    iput-object v0, p0, Lg2/q;->c:Lk/f;

    return-void
.end method
