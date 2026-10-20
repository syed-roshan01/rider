.class public abstract Le1/j0;
.super Le1/n;


# instance fields
.field public a:Landroid/graphics/Shader;

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Le1/n;-><init>()V

    sget-wide v0, Ld1/f;->c:J

    iput-wide v0, p0, Le1/j0;->b:J

    return-void
.end method


# virtual methods
.method public final a(FJLe1/g;)V
    .locals 3

    iget-object v0, p0, Le1/j0;->a:Landroid/graphics/Shader;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Le1/j0;->b:J

    invoke-static {v1, v2, p2, p3}, Ld1/f;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-static {p2, p3}, Ld1/f;->e(J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Le1/j0;->a:Landroid/graphics/Shader;

    sget-wide p2, Ld1/f;->c:J

    iput-wide p2, p0, Le1/j0;->b:J

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2, p3}, Le1/j0;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    iput-object v0, p0, Le1/j0;->a:Landroid/graphics/Shader;

    iput-wide p2, p0, Le1/j0;->b:J

    :cond_2
    :goto_0
    iget-object p2, p4, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result p2

    invoke-static {p2}, Landroidx/compose/ui/graphics/a;->b(I)J

    move-result-wide p2

    sget-wide v1, Le1/r;->b:J

    invoke-static {p2, p3, v1, v2}, Le1/r;->c(JJ)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p4, v1, v2}, Le1/g;->e(J)V

    :cond_3
    iget-object p2, p4, Le1/g;->c:Landroid/graphics/Shader;

    invoke-static {p2, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p4, v0}, Le1/g;->h(Landroid/graphics/Shader;)V

    :cond_4
    iget-object p2, p4, Le1/g;->a:Landroid/graphics/Paint;

    invoke-virtual {p2}, Landroid/graphics/Paint;->getAlpha()I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x437f0000    # 255.0f

    div-float/2addr p2, p3

    cmpg-float p2, p2, p1

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p4, p1}, Le1/g;->c(F)V

    :goto_1
    return-void
.end method

.method public abstract b(J)Landroid/graphics/Shader;
.end method
