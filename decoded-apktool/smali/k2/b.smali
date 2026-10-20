.class public final Lk2/b;
.super Landroid/text/style/CharacterStyle;

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final a:Le1/j0;

.field public final b:F

.field public final c:Lm0/n1;

.field public final d:Lm0/j0;


# direct methods
.method public constructor <init>(Le1/j0;F)V
    .locals 1

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, Lk2/b;->a:Le1/j0;

    iput p2, p0, Lk2/b;->b:F

    sget-wide p1, Ld1/f;->c:J

    new-instance v0, Ld1/f;

    invoke-direct {v0, p1, p2}, Ld1/f;-><init>(J)V

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    invoke-static {v0, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lk2/b;->c:Lm0/n1;

    new-instance p1, Lu1/z0;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Ld7/t;->R(Lc9/a;)Lm0/j0;

    move-result-object p1

    iput-object p1, p0, Lk2/b;->d:Lm0/j0;

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 3

    iget v0, p0, Lk2/b;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Lz6/a;->q(FFF)F

    move-result v0

    const/16 v1, 0xff

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    :cond_0
    iget-object v0, p0, Lk2/b;->d:Lm0/j0;

    invoke-virtual {v0}, Lm0/j0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Shader;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method
