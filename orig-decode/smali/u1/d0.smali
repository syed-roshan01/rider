.class public final Lu1/d0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final a:Lu1/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu1/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu1/d0;->a:Lu1/d0;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Ly1/o;

    check-cast p2, Ly1/o;

    invoke-virtual {p1}, Ly1/o;->f()Ld1/d;

    move-result-object p1

    invoke-virtual {p2}, Ly1/o;->f()Ld1/d;

    move-result-object p2

    iget v0, p1, Ld1/d;->a:F

    iget v1, p2, Ld1/d;->a:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, Ld1/d;->b:F

    iget v1, p2, Ld1/d;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p1, Ld1/d;->d:F

    iget v1, p2, Ld1/d;->d:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget p1, p1, Ld1/d;->c:F

    iget p2, p2, Ld1/d;->c:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    :goto_0
    return v0
.end method
