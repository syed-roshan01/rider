.class public Lk/f;
.super Ljava/lang/Object;

# interfaces
.implements Ll/p1;
.implements Lk/r;
.implements Lk/j;
.implements Ll/h0;
.implements Ly3/d;
.implements Ldagger/hilt/android/internal/managers/ComponentSupplier;
.implements Lcom/google/android/gms/common/internal/d;
.implements Lcom/google/android/gms/common/api/internal/q;
.implements Lcom/google/android/gms/common/internal/b;
.implements Lcom/google/android/gms/common/internal/c;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x15

    iput v0, p0, Lk/f;->a:I

    invoke-direct {p0, v0}, Lk/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lk/f;->a:I

    const/4 v0, 0x7

    if-eq p1, v0, :cond_8

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eq p1, v0, :cond_7

    const/16 v0, 0xa

    if-eq p1, v0, :cond_6

    const/16 v0, 0xc

    if-eq p1, v0, :cond_3

    const/16 v0, 0x15

    if-eq p1, v0, :cond_2

    const/16 v0, 0x17

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1c

    if-eq p1, v0, :cond_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Le1/d;

    invoke-direct {p1}, Le1/d;-><init>()V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void

    .line 11
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance p1, Ljava/util/EnumMap;

    const-class v0, Lk6/r5;

    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void

    .line 13
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void

    .line 14
    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 15
    :cond_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_4

    .line 16
    new-instance p1, Lb3/k1;

    invoke-direct {p1}, Lb3/k1;-><init>()V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_4
    const/16 v0, 0x1d

    if-lt p1, v0, :cond_5

    .line 17
    new-instance p1, Lb3/j1;

    invoke-direct {p1}, Lb3/j1;-><init>()V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    goto :goto_0

    .line 18
    :cond_5
    new-instance p1, Lb3/i1;

    invoke-direct {p1}, Lb3/i1;-><init>()V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    :goto_0
    return-void

    .line 19
    :cond_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void

    .line 21
    :cond_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance p1, Lq/l;

    invoke-direct {p1, v1}, Lq/l;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void

    .line 23
    :cond_8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x20

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    iput p2, p0, Lk/f;->a:I

    const/16 v0, 0x14

    if-eq p2, v0, :cond_1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    .line 26
    new-instance p2, Lb3/x;

    .line 27
    invoke-direct {p2, p1}, Lb3/v;-><init>(Landroid/view/View;)V

    iput-object p1, p2, Lb3/x;->b:Landroid/view/View;

    iput-object p2, p0, Lk/f;->b:Ljava/lang/Object;

    goto :goto_0

    .line 28
    :cond_0
    new-instance p2, Lb3/v;

    invoke-direct {p2, p1}, Lb3/v;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lk/f;->b:Ljava/lang/Object;

    :goto_0
    return-void

    .line 29
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object p1

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    iput v0, p0, Lk/f;->a:I

    if-eqz p1, :cond_0

    .line 32
    new-instance v0, Lk3/h;

    invoke-direct {v0, p1}, Lk3/h;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "textView cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lk/f;->a:I

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    iput v0, p0, Lk/f;->a:I

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    .line 35
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumMap;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1c

    iput v0, p0, Lk/f;->a:I

    .line 7
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lk6/r5;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lk6/s4;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1d

    iput v0, p0, Lk/f;->a:I

    .line 5
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/a0;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    iput v0, p0, Lk/f;->a:I

    iput-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public static L(Ljava/lang/String;)Lk/f;
    .locals 13

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lk6/r5;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {}, Lk6/r5;->values()[Lk6/r5;

    move-result-object v2

    array-length v2, v2

    if-lt v1, v2, :cond_4

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x31

    if-eq v2, v3, :cond_0

    goto :goto_3

    :cond_0
    invoke-static {}, Lk6/r5;->values()[Lk6/r5;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x1

    move v5, v1

    :goto_0
    if-ge v5, v3, :cond_3

    aget-object v6, v2, v5

    add-int/lit8 v7, v4, 0x1

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {}, Lk6/i;->values()[Lk6/i;

    move-result-object v8

    array-length v9, v8

    move v10, v1

    :goto_1
    if-ge v10, v9, :cond_2

    aget-object v11, v8, v10

    iget-char v12, v11, Lk6/i;->a:C

    if-ne v12, v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    sget-object v11, Lk6/i;->b:Lk6/i;

    :goto_2
    invoke-virtual {v0, v6, v11}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    move v4, v7

    goto :goto_0

    :cond_3
    new-instance p0, Lk/f;

    invoke-direct {p0, v0}, Lk/f;-><init>(Ljava/util/EnumMap;)V

    return-object p0

    :cond_4
    :goto_3
    new-instance p0, Lk/f;

    const/16 v0, 0x1c

    invoke-direct {p0, v0}, Lk/f;-><init>(I)V

    return-object p0
.end method

.method public static w([Ljava/lang/Object;ILx9/v;)Ljava/lang/Object;
    .locals 10

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/16 v0, 0x190

    goto :goto_0

    :cond_0
    const/16 v0, 0x2bc

    :goto_0
    and-int/lit8 p1, p1, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    array-length v3, p0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    move v6, v2

    :goto_2
    if-ge v6, v3, :cond_5

    aget-object v7, p0, v6

    iget v8, p2, Lx9/v;->a:I

    packed-switch v8, :pswitch_data_0

    move-object v9, v7

    check-cast v9, Lt2/g;

    iget v9, v9, Lt2/g;->b:I

    goto :goto_3

    :pswitch_0
    move-object v9, v7

    check-cast v9, Ly2/h;

    iget v9, v9, Ly2/h;->c:I

    :goto_3
    sub-int/2addr v9, v0

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    packed-switch v8, :pswitch_data_1

    move-object v8, v7

    check-cast v8, Lt2/g;

    iget-boolean v8, v8, Lt2/g;->c:Z

    goto :goto_4

    :pswitch_1
    move-object v8, v7

    check-cast v8, Ly2/h;

    iget-boolean v8, v8, Ly2/h;->d:Z

    :goto_4
    if-ne v8, p1, :cond_2

    move v8, v2

    goto :goto_5

    :cond_2
    move v8, v1

    :goto_5
    add-int/2addr v9, v8

    if-eqz v4, :cond_3

    if-le v5, v9, :cond_4

    :cond_3
    move-object v4, v7

    move v5, v9

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final A(F)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/t;

    invoke-direct {v1, p1}, Li1/t;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final B(FF)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/m;

    invoke-direct {v1, p1, p2}, Li1/m;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final C(FF)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/u;

    invoke-direct {v1, p1, p2}, Li1/u;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final D(FF)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/n;

    invoke-direct {v1, p1, p2}, Li1/n;-><init>(FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final E(Lo1/w;Lo1/b0;)Lo1/f;
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Lq/l;

    iget-object v3, v1, Lo1/w;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v2, v4}, Lq/l;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo1/x;

    iget-object v8, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v8, Lq/l;

    iget-wide v9, v7, Lo1/x;->a:J

    invoke-virtual {v8, v9, v10}, Lq/l;->c(J)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo1/v;

    if-nez v8, :cond_0

    iget-wide v8, v7, Lo1/x;->b:J

    iget-wide v10, v7, Lo1/x;->d:J

    move-wide/from16 v23, v8

    move-wide/from16 v25, v10

    const/16 v27, 0x0

    goto :goto_1

    :cond_0
    move-object/from16 v9, p2

    check-cast v9, Lu1/w;

    iget-wide v10, v8, Lo1/v;->b:J

    invoke-virtual {v9, v10, v11}, Lu1/w;->A(J)J

    move-result-wide v10

    iget-wide v12, v8, Lo1/v;->a:J

    iget-boolean v8, v8, Lo1/v;->c:Z

    move/from16 v27, v8

    move-wide/from16 v25, v10

    move-wide/from16 v23, v12

    :goto_1
    iget-wide v8, v7, Lo1/x;->a:J

    new-instance v10, Lo1/u;

    iget-wide v11, v7, Lo1/x;->b:J

    iget-wide v13, v7, Lo1/x;->d:J

    iget-boolean v15, v7, Lo1/x;->e:Z

    iget v5, v7, Lo1/x;->f:F

    move-object/from16 v34, v3

    iget v3, v7, Lo1/x;->g:I

    move/from16 v35, v4

    iget-object v4, v7, Lo1/x;->i:Ljava/util/List;

    iget-wide v0, v7, Lo1/x;->j:J

    move-wide/from16 v30, v0

    iget-wide v0, v7, Lo1/x;->k:J

    move-wide/from16 v19, v13

    move-object v14, v10

    move v13, v15

    move-wide v15, v8

    move-wide/from16 v17, v11

    move/from16 v21, v13

    move/from16 v22, v5

    move/from16 v28, v3

    move-object/from16 v29, v4

    move-wide/from16 v32, v0

    invoke-direct/range {v14 .. v33}, Lo1/u;-><init>(JJJZFJJZILjava/util/List;JJ)V

    invoke-virtual {v2, v10, v8, v9}, Lq/l;->f(Ljava/lang/Object;J)V

    iget-boolean v0, v7, Lo1/x;->e:Z

    iget-wide v3, v7, Lo1/x;->a:J

    if-eqz v0, :cond_1

    move-object/from16 v1, p0

    iget-object v5, v1, Lk/f;->b:Ljava/lang/Object;

    check-cast v5, Lq/l;

    new-instance v8, Lo1/v;

    iget-wide v9, v7, Lo1/x;->b:J

    iget-wide v11, v7, Lo1/x;->c:J

    move-object/from16 v36, v8

    move-wide/from16 v37, v9

    move-wide/from16 v39, v11

    move/from16 v41, v0

    invoke-direct/range {v36 .. v41}, Lo1/v;-><init>(JJZ)V

    invoke-virtual {v5, v8, v3, v4}, Lq/l;->f(Ljava/lang/Object;J)V

    goto :goto_2

    :cond_1
    move-object/from16 v1, p0

    iget-object v0, v1, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lq/l;

    iget-object v5, v0, Lq/l;->b:[J

    iget v7, v0, Lq/l;->d:I

    invoke-static {v5, v7, v3, v4}, Lr/a;->b([JIJ)I

    move-result v3

    if-ltz v3, :cond_2

    iget-object v4, v0, Lq/l;->c:[Ljava/lang/Object;

    aget-object v5, v4, v3

    sget-object v7, Lq/m;->a:Ljava/lang/Object;

    if-eq v5, v7, :cond_2

    aput-object v7, v4, v3

    const/4 v3, 0x1

    iput-boolean v3, v0, Lq/l;->a:Z

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    move-object v0, v1

    move-object/from16 v3, v34

    move/from16 v4, v35

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_3
    move-object v1, v0

    new-instance v0, Lo1/f;

    move-object/from16 v3, p1

    invoke-direct {v0, v2, v3}, Lo1/f;-><init>(Lq/l;Lo1/w;)V

    return-object v0
.end method

.method public final F()J
    .locals 4

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final G(FFFF)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/p;

    invoke-direct {v1, p1, p2, p3, p4}, Li1/p;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final H(FFFF)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/x;

    invoke-direct {v1, p1, p2, p3, p4}, Li1/x;-><init>(FFFF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final I(I)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/nio/ByteBuffer;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public final J(F)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/a0;

    invoke-direct {v1, p1}, Li1/a0;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final K(F)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/z;

    invoke-direct {v1, p1}, Li1/z;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final M(Lk6/r5;I)V
    .locals 2

    sget-object v0, Lk6/i;->b:Lk6/i;

    const/16 v1, -0x14

    if-eq p2, v1, :cond_2

    const/16 v1, -0xa

    if-eq p2, v1, :cond_1

    if-eqz p2, :cond_2

    const/16 v1, 0x1e

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lk6/i;->f:Lk6/i;

    goto :goto_0

    :cond_1
    sget-object v0, Lk6/i;->e:Lk6/i;

    goto :goto_0

    :cond_2
    sget-object v0, Lk6/i;->n:Lk6/i;

    :goto_0
    iget-object p2, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/EnumMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final N(Lk6/r5;Lk6/i;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/EnumMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/e;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/e;->a(I)V

    return-void
.end method

.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/internal/t;

    check-cast p1, Lb6/c;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lb6/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/base/zaa;->zaa()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/base/zac;->zac(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/base/zaa;->zad(ILandroid/os/Parcel;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lz5/b;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/n;

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/internal/n;->b(Lz5/b;)V

    return-void
.end method

.method public final c(Lk/l;Z)V
    .locals 2

    instance-of v0, p1, Lk/w;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lk/l;->j()Lk/l;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lk/l;->c(Z)V

    :cond_0
    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/k;

    iget-object v0, v0, Ll/k;->e:Lk/r;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lk/r;->c(Lk/l;Z)V

    :cond_1
    return-void
.end method

.method public final d(Lk/l;Lk/m;)V
    .locals 8

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iget-object v0, v0, Lk/h;->n:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iget-object v0, v0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-ge v2, v0, :cond_1

    iget-object v4, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v4, Lk/h;

    iget-object v4, v4, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk/g;

    iget-object v4, v4, Lk/g;->b:Lk/l;

    if-ne p1, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_1
    if-ne v2, v3, :cond_2

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iget-object v0, v0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lk/h;

    iget-object v0, v0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lk/g;

    :cond_3
    move-object v4, v1

    new-instance v0, Lk/e;

    const/4 v7, 0x0

    move-object v2, v0

    move-object v3, p0

    move-object v5, p2

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lk/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0xc8

    add-long/2addr v1, v3

    iget-object p2, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast p2, Lk/h;

    iget-object p2, p2, Lk/h;->n:Landroid/os/Handler;

    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public e(I)V
    .locals 0

    return-void
.end method

.method public final f(Lk/l;Landroid/view/MenuItem;)V
    .locals 0

    iget-object p2, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast p2, Lk/h;

    iget-object p2, p2, Lk/h;->n:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->G:Ll/n;

    if-eqz v0, :cond_0

    check-cast v0, Ll/b3;

    iget-object v0, v0, Ll/b3;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->N:Lb3/m;

    invoke-virtual {v0, p1}, Lb3/m;->a(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lk/f;

    invoke-direct {v0}, Lk/f;-><init>()V

    new-instance v1, Ldagger/hilt/android/internal/modules/ApplicationContextModule;

    iget-object v2, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Ly4/r;

    invoke-direct {v1, v2}, Ldagger/hilt/android/internal/modules/ApplicationContextModule;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lk/f;->b:Ljava/lang/Object;

    new-instance v0, Ly4/n;

    invoke-direct {v0, v1}, Ly4/n;-><init>(Ldagger/hilt/android/internal/modules/ApplicationContextModule;)V

    return-object v0
.end method

.method public final h(Lk/l;)Z
    .locals 3

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll/k;

    iget-object v1, v1, Ll/k;->c:Lk/l;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    check-cast v0, Ll/k;

    move-object v1, p1

    check-cast v1, Lk/w;

    iget-object v1, v1, Lk/w;->w:Lk/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ll/k;

    iget-object v0, v0, Ll/k;->e:Lk/r;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lk/r;->h(Lk/l;)Z

    move-result v2

    :cond_1
    return v2
.end method

.method public final i()V
    .locals 2

    const-string v0, "ProfileInstaller"

    const-string v1, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final j(Lz5/b;)V
    .locals 2

    iget v0, p1, Lz5/b;->b:I

    if-nez v0, :cond_0

    iget-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/internal/f;

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getScopes()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/common/internal/f;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/internal/f;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->zzc(Lcom/google/android/gms/common/internal/f;)Lcom/google/android/gms/common/internal/c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/internal/f;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/f;->zzc(Lcom/google/android/gms/common/internal/f;)Lcom/google/android/gms/common/internal/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/c;->b(Lz5/b;)V

    :cond_1
    return-void
.end method

.method public final k(ILjava/lang/Object;)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const-string v0, ""

    goto :goto_0

    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    goto :goto_0

    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    goto :goto_0

    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    goto :goto_0

    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    goto :goto_0

    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    goto :goto_0

    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    goto :goto_0

    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    goto :goto_0

    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    goto :goto_0

    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    goto :goto_0

    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    :goto_0
    const/4 v1, 0x6

    const-string v2, "ProfileInstaller"

    if-eq p1, v1, :cond_0

    const/4 v1, 0x7

    if-eq p1, v1, :cond_0

    const/16 v1, 0x8

    if-eq p1, v1, :cond_0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    iget-object p2, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public l(I)V
    .locals 0

    return-void
.end method

.method public final m(Lk/l;)V
    .locals 1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->B:Lk/j;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lk/j;->m(Lk/l;)V

    :cond_0
    return-void
.end method

.method public final n(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/common/api/internal/e;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/internal/e;->j()V

    return-void
.end method

.method public final o(FFZFF)V
    .locals 10

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/ArrayList;

    new-instance v9, Li1/r;

    move-object v0, v9

    move v1, p1

    move v2, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Li1/r;-><init>(FFFZZFF)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    sget-object v1, Li1/j;->c:Li1/j;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public q(Landroid/content/Context;Lt2/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 9

    new-instance v0, Lx9/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    iget-object v2, p2, Lt2/f;->a:[Lt2/g;

    invoke-static {v2, p4, v0}, Lk/f;->w([Ljava/lang/Object;ILx9/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt2/g;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget v8, v0, Lt2/g;->f:I

    iget-object v0, v0, Lt2/g;->a:Ljava/lang/String;

    sget-object v2, Lu2/f;->a:Lk/f;

    move-object v3, p1

    move-object v4, p3

    move v5, v8

    move-object v6, v0

    move v7, p4

    invoke-virtual/range {v2 .. v7}, Lk/f;->t(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v2, 0x0

    invoke-static {p3, v8, v0, v2, p4}, Lu2/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Lu2/f;->b:Lq/n;

    invoke-virtual {p4, p3, p1}, Lq/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string p3, "Could not retrieve font from family."

    const-string p4, "TypefaceCompatBaseImpl"

    const-wide/16 v2, 0x0

    if-nez p1, :cond_2

    :goto_0
    move-wide p3, v2

    goto :goto_3

    :cond_2
    :try_start_0
    const-class v0, Landroid/graphics/Typeface;

    const-string v4, "native_instance"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide p3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :goto_1
    invoke-static {p4, p3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :goto_2
    invoke-static {p4, p3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :goto_3
    cmp-long v0, p3, v2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object p1
.end method

.method public r(Landroid/content/Context;[Ly2/h;I)Landroid/graphics/Typeface;
    .locals 3

    array-length v0, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0, p3, p2}, Lk/f;->x(I[Ly2/h;)Ly2/h;

    move-result-object p2

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    iget-object p2, p2, Ly2/h;->a:Landroid/net/Uri;

    invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0, p1, p2}, Lk/f;->s(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p2}, Li1/b;->g(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    move-object v2, p2

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-object p2, v2

    goto :goto_1

    :goto_0
    invoke-static {v2}, Li1/b;->g(Ljava/io/Closeable;)V

    throw p1

    :catch_1
    :goto_1
    invoke-static {p2}, Li1/b;->g(Ljava/io/Closeable;)V

    return-object v2
.end method

.method public s(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .locals 1

    invoke-static {p1}, Li1/b;->s(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Li1/b;->k(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0
.end method

.method public t(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    invoke-static {p1}, Li1/b;->s(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 p4, 0x0

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, Li1/b;->j(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lk/f;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "1"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lk6/r5;->values()[Lk6/r5;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-object v5, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/EnumMap;

    invoke-virtual {v5, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk6/i;

    if-nez v4, :cond_0

    sget-object v4, Lk6/i;->b:Lk6/i;

    :cond_0
    iget-char v4, v4, Lk6/i;->a:C

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public final u(FFFFFF)V
    .locals 9

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v8, Li1/k;

    move-object v1, v8

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Li1/k;-><init>(FFFFFF)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final v(FFFFFF)V
    .locals 9

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v8, Li1/s;

    move-object v1, v8

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Li1/s;-><init>(FFFFFF)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public x(I[Ly2/h;)Ly2/h;
    .locals 2

    new-instance v0, Lx9/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx9/v;-><init>(I)V

    invoke-static {p2, p1, v0}, Lk/f;->w([Ljava/lang/Object;ILx9/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/h;

    return-object p1
.end method

.method public final y()Le1/d;
    .locals 1

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Le1/d;

    return-object v0
.end method

.method public final z(F)V
    .locals 2

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Li1/l;

    invoke-direct {v1, p1}, Li1/l;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
