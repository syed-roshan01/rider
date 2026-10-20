.class public final Lh0/f;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lc9/a;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(JLc9/a;Z)V
    .locals 0

    iput-wide p1, p0, Lh0/f;->a:J

    iput-object p3, p0, Lh0/f;->b:Lc9/a;

    iput-boolean p4, p0, Lh0/f;->c:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Lb1/d;

    iget-object v0, p1, Lb1/d;->a:Lb1/a;

    invoke-interface {v0}, Lb1/a;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, Ld7/t;->O(Lb1/d;F)Le1/y;

    move-result-object v0

    new-instance v1, Le1/l;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    iget-wide v4, p0, Lh0/f;->a:J

    const/4 v6, 0x5

    if-lt v2, v3, :cond_0

    sget-object v2, Le1/m;->a:Le1/m;

    invoke-virtual {v2, v4, v5, v6}, Le1/m;->a(JI)Landroid/graphics/BlendModeColorFilter;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v3

    invoke-static {v6}, Landroidx/compose/ui/graphics/a;->u(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object v7

    invoke-direct {v2, v3, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    invoke-direct {v1, v4, v5, v6, v2}, Le1/l;-><init>(JILandroid/graphics/ColorFilter;)V

    new-instance v2, Lu/z;

    iget-object v3, p0, Lh0/f;->b:Lc9/a;

    iget-boolean v4, p0, Lh0/f;->c:Z

    invoke-direct {v2, v3, v4, v0, v1}, Lu/z;-><init>(Lc9/a;ZLe1/y;Le1/l;)V

    invoke-virtual {p1, v2}, Lb1/d;->a(Lc9/c;)Lb1/g;

    move-result-object p1

    return-object p1
.end method
