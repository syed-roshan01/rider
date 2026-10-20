.class public final Lu/h2;
.super Ljava/lang/Object;

# interfaces
.implements Lu/d2;


# static fields
.field public static final a:Lu/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu/h2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu/h2;->a:Lu/h2;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b(Landroid/view/View;ZJFFZLm2/b;F)Lu/c2;
    .locals 2

    if-eqz p2, :cond_0

    new-instance p2, Lu/g2;

    new-instance p3, Landroid/widget/Magnifier;

    invoke-direct {p3, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    invoke-direct {p2, p3}, Lu/e2;-><init>(Landroid/widget/Magnifier;)V

    goto :goto_0

    :cond_0
    invoke-interface {p8, p3, p4}, Lm2/b;->S(J)J

    move-result-wide p2

    invoke-interface {p8, p5}, Lm2/b;->v(F)F

    move-result p4

    invoke-interface {p8, p6}, Lm2/b;->v(F)F

    move-result p5

    new-instance p6, Landroid/widget/Magnifier$Builder;

    invoke-direct {p6, p1}, Landroid/widget/Magnifier$Builder;-><init>(Landroid/view/View;)V

    sget-wide v0, Ld1/f;->c:J

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    invoke-static {p2, p3}, Ld1/f;->d(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    invoke-static {p2, p3}, Ld1/f;->b(J)F

    move-result p2

    invoke-static {p2}, Ld7/t;->p0(F)I

    move-result p2

    invoke-virtual {p6, p1, p2}, Landroid/widget/Magnifier$Builder;->setSize(II)Landroid/widget/Magnifier$Builder;

    :cond_1
    invoke-static {p4}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p6, p4}, Landroid/widget/Magnifier$Builder;->setCornerRadius(F)Landroid/widget/Magnifier$Builder;

    :cond_2
    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p6, p5}, Landroid/widget/Magnifier$Builder;->setElevation(F)Landroid/widget/Magnifier$Builder;

    :cond_3
    invoke-static {p9}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p6, p9}, Landroid/widget/Magnifier$Builder;->setInitialZoom(F)Landroid/widget/Magnifier$Builder;

    :cond_4
    invoke-virtual {p6, p7}, Landroid/widget/Magnifier$Builder;->setClippingEnabled(Z)Landroid/widget/Magnifier$Builder;

    invoke-virtual {p6}, Landroid/widget/Magnifier$Builder;->build()Landroid/widget/Magnifier;

    move-result-object p1

    new-instance p2, Lu/g2;

    invoke-direct {p2, p1}, Lu/e2;-><init>(Landroid/widget/Magnifier;)V

    :goto_0
    return-object p2
.end method
