.class public final Lb0/l;
.super Ljava/lang/Object;

# interfaces
.implements Lv/o;


# instance fields
.field public final b:Lb0/h0;

.field public final c:Lt/d1;


# direct methods
.method public constructor <init>(Lb0/h0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/l;->b:Lb0/h0;

    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p1

    iput-object p1, p0, Lb0/l;->c:Lt/d1;

    return-void
.end method


# virtual methods
.method public final a(FFF)F
    .locals 2

    cmpl-float v0, p1, p3

    if-gez v0, :cond_2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, p2, p3

    if-gtz v1, :cond_1

    add-float/2addr p2, p1

    cmpl-float p2, p2, p3

    if-lez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lb0/l;->b:Lb0/h0;

    iget-object p2, p2, Lb0/h0;->e:Lb0/a0;

    iget-object p2, p2, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {p2}, Lm0/s2;->d()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float p2, p2, v0

    if-nez p2, :cond_2

    move p1, v0

    :cond_2
    :goto_0
    return p1
.end method

.method public final b()Lt/n;
    .locals 1

    iget-object v0, p0, Lb0/l;->c:Lt/d1;

    return-object v0
.end method
