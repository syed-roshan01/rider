.class public abstract Lj1/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lj1/b;->a:[I

    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lj1/b;->b:[I

    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lj1/b;->c:[I

    const v0, 0x1010003

    const v1, 0x1010405

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lj1/b;->d:[I

    return-void

    :array_0
    .array-data 4
        0x1010003
        0x1010121
        0x1010155
        0x1010159
        0x101031f
        0x10103ea
        0x10103fb
        0x1010402
        0x1010403
    .end array-data

    :array_1
    .array-data 4
        0x1010003
        0x10101b5
        0x10101b6
        0x1010324
        0x1010325
        0x1010326
        0x101045a
        0x101045b
    .end array-data

    :array_2
    .array-data 4
        0x1010003
        0x1010404
        0x1010405
        0x1010406
        0x1010407
        0x1010408
        0x1010409
        0x101040a
        0x101040b
        0x101040c
        0x101040d
        0x10104cb
        0x10104cc
        0x101051e
    .end array-data
.end method

.method public static final a(Lh0/i;)Le1/n;
    .locals 3

    iget-object v0, p0, Lh0/i;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/graphics/Shader;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lh0/i;->b:I

    if-eqz v1, :cond_1

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_3

    check-cast v0, Landroid/graphics/Shader;

    if-eqz v0, :cond_2

    new-instance p0, Le1/o;

    invoke-direct {p0, v0}, Le1/o;-><init>(Landroid/graphics/Shader;)V

    goto :goto_2

    :cond_2
    new-instance v0, Le1/n0;

    iget p0, p0, Lh0/i;->b:I

    invoke-static {p0}, Landroidx/compose/ui/graphics/a;->b(I)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Le1/n0;-><init>(J)V

    move-object p0, v0

    goto :goto_2

    :cond_3
    const/4 p0, 0x0

    :goto_2
    return-object p0
.end method
