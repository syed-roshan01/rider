.class public final Lu/f2;
.super Ljava/lang/Object;

# interfaces
.implements Lu/d2;


# static fields
.field public static final a:Lu/f2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/f2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu/f2;->a:Lu/f2;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(Landroid/view/View;ZJFFZLm2/b;F)Lu/c2;
    .locals 0

    new-instance p2, Lu/e2;

    new-instance p3, Landroid/widget/Magnifier;

    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {p2, p3}, Lu/e2;-><init>(Landroid/widget/Magnifier;)V

    return-object p2
.end method
