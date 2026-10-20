.class public final Lg0/b;
.super Ljava/lang/Object;


# static fields
.field public static h:Lg0/b;


# instance fields
.field public final a:Lm2/l;

.field public final b:La2/c0;

.field public final c:Lm2/b;

.field public final d:Lf2/d;

.field public final e:La2/c0;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Lm2/l;La2/c0;Lm2/b;Lf2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/b;->a:Lm2/l;

    iput-object p2, p0, Lg0/b;->b:La2/c0;

    iput-object p3, p0, Lg0/b;->c:Lm2/b;

    iput-object p4, p0, Lg0/b;->d:Lf2/d;

    invoke-static {p2, p1}, Lo1/s;->g0(La2/c0;Lm2/l;)La2/c0;

    move-result-object p1

    iput-object p1, p0, Lg0/b;->e:La2/c0;

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lg0/b;->f:F

    iput p1, p0, Lg0/b;->g:F

    return-void
.end method


# virtual methods
.method public final a(IJ)J
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v2, v0, Lg0/b;->g:F

    iget v3, v0, Lg0/b;->f:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    sget-object v6, Lg0/c;->a:Ljava/lang/String;

    iget-object v7, v0, Lg0/b;->e:La2/c0;

    const/16 v2, 0xf

    invoke-static {v5, v5, v2}, Lo1/s;->b(III)J

    move-result-wide v8

    iget-object v10, v0, Lg0/b;->c:Lm2/b;

    iget-object v11, v0, Lg0/b;->d:Lf2/d;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/16 v14, 0x60

    invoke-static/range {v6 .. v14}, Li1/b;->d(Ljava/lang/String;La2/c0;JLm2/b;Lf2/d;Lr8/r;II)La2/a;

    move-result-object v3

    invoke-virtual {v3}, La2/a;->b()F

    move-result v3

    sget-object v6, Lg0/c;->b:Ljava/lang/String;

    iget-object v7, v0, Lg0/b;->e:La2/c0;

    invoke-static {v5, v5, v2}, Lo1/s;->b(III)J

    move-result-wide v8

    iget-object v10, v0, Lg0/b;->c:Lm2/b;

    iget-object v11, v0, Lg0/b;->d:Lf2/d;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/16 v14, 0x60

    invoke-static/range {v6 .. v14}, Li1/b;->d(Ljava/lang/String;La2/c0;JLm2/b;Lf2/d;Lr8/r;II)La2/a;

    move-result-object v2

    invoke-virtual {v2}, La2/a;->b()F

    move-result v2

    sub-float/2addr v2, v3

    iput v3, v0, Lg0/b;->g:F

    iput v2, v0, Lg0/b;->f:F

    move v15, v3

    move v3, v2

    move v2, v15

    :cond_1
    const/4 v4, 0x1

    if-eq v1, v4, :cond_3

    sub-int/2addr v1, v4

    int-to-float v1, v1

    mul-float/2addr v3, v1

    add-float/2addr v3, v2

    invoke-static {v3}, Ld7/t;->p0(F)I

    move-result v1

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    move v5, v1

    :goto_0
    invoke-static/range {p2 .. p3}, Lm2/a;->h(J)I

    move-result v1

    if-le v5, v1, :cond_4

    move v5, v1

    goto :goto_1

    :cond_3
    invoke-static/range {p2 .. p3}, Lm2/a;->j(J)I

    move-result v5

    :cond_4
    :goto_1
    invoke-static/range {p2 .. p3}, Lm2/a;->h(J)I

    move-result v1

    invoke-static/range {p2 .. p3}, Lm2/a;->k(J)I

    move-result v2

    invoke-static/range {p2 .. p3}, Lm2/a;->i(J)I

    move-result v3

    invoke-static {v2, v3, v5, v1}, Lo1/s;->a(IIII)J

    move-result-wide v1

    return-wide v1
.end method
