.class public final Lu1/a1;
.super Ljava/lang/Object;

# interfaces
.implements Lu1/u2;


# instance fields
.field public final a:Landroid/view/View;

.field public b:Landroid/view/ActionMode;

.field public final c:Lv1/b;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/a1;->a:Landroid/view/View;

    new-instance p1, Lv1/b;

    new-instance v0, Lu1/z0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0}, Lv1/b;-><init>(Lu1/z0;)V

    iput-object p1, p0, Lu1/a1;->c:Lv1/b;

    const/4 p1, 0x2

    iput p1, p0, Lu1/a1;->d:I

    return-void
.end method
