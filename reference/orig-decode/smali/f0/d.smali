.class public final Lf0/d;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/d;->short:[S

    return-void

    :array_0
    .array-data 2
        0x680s
        0x69ds
        0x209s
        0x252s
        0x250s
        0x241s
        0x218s
        0x243s
        0x254s
        0x259s
        0x240s
        0x250s
        0x20bs
        0x21ds
        0x21bs
        0x21bs
        0x21bs
        0x21cs
    .end array-data
.end method

.method public synthetic constructor <init>(JI)V
    .locals 3

    iput p3, p0, Lf0/d;->a:I

    iput-wide p1, p0, Lf0/d;->b:J

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣ۟ۤۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "FBBq0tf68VqNL06exHsIIjSxh8u"

    invoke-static {v0}, Lw/ۥۣۡۡ;->ۣۣ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۡ۟۠()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟ۤ۠۠ۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf0/d;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const-wide/16 v12, 0x3

    const/4 v5, 0x1

    const/4 v1, 0x0

    invoke-static {p0}, Ln/۟۠ۥۥۨ;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lx4/ۣۡۢ۠;->۟ۥۤۨ(Ljava/lang/Object;)J

    move-result-wide v2

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {}, Lf0/d;->۟ۤۡ۟۠()[S

    move-result-object v0

    sget v4, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۧ۠ۡ۟:I

    xor-int/lit16 v4, v4, -0x32e

    const/16 v6, 0x6e9

    invoke-static {v0, v1, v4, v6}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣۡۧ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->۟ۥ۠ۤۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lf0/d;->۟ۤۡ۟۠()[S

    move-result-object v4

    const/4 v6, 0x2

    sget v7, Lz8/۟ۧۡۥۥ;->ۦ۠ۤ۟:I

    xor-int/lit16 v7, v7, -0x351

    const/16 v8, 0x235

    invoke-static {v4, v6, v7, v8}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۢۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣۢۤۥ(Ljava/lang/Object;)J

    move-result-wide v6

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    add-long v8, v2, v12

    sub-long/2addr v8, v6

    sub-long/2addr v8, v12

    const-wide/16 v10, 0x12c

    cmp-long v0, v8, v10

    if-lez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    move v5, v1

    :sswitch_5
    invoke-static {v5}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_2
    return-object v0

    :pswitch_0
    check-cast p1, Ly1/v;

    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->۟۟ۦ۟ۥ()Ly1/u;

    move-result-object v6

    new-instance v0, Lh0/c0;

    invoke-static {}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->۟۟ۡۢ۟()Lf0/n0;

    move-result-object v1

    invoke-static {p0}, Lx4/ۣۡۢ۠;->۟ۥۤۨ(Ljava/lang/Object;)J

    move-result-wide v2

    sget v4, Ls0/ۧۧۨۥ;->ۣ۠ۢۧ:I

    xor-int/lit16 v4, v4, 0x3b7

    invoke-direct/range {v0 .. v5}, Lh0/c0;-><init>(Lf0/n0;JIZ)V

    check-cast p1, Ly1/j;

    invoke-static {p1, v6, v0}, Lz8/ۣۤۡۧ;->۟ۤۤ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    goto :goto_2

    :pswitch_1
    check-cast p1, Lb1/d;

    invoke-static {p1}, Ld9/ۨۧۧۦ;->ۣۨۡ۠(Ljava/lang/Object;)Lb1/a;

    move-result-object v0

    invoke-static {v0}, Lu1/ۢۥ۠ۤ;->ۣۣ۟ۢۨ(Ljava/lang/Object;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll6/ۥۦۣ۟;->ۣۣۧ۠(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v4, v0, v1

    invoke-static {p1, v4}, Le2/ۨۥۦۡ;->ۣ۟ۤۢۧ(Ljava/lang/Object;F)Le1/y;

    move-result-object v5

    invoke-static {}, Ln9/ۤۧۧۤ;->۟ۡۤۢۦ()I

    move-result v1

    sget v0, Lw0/۟ۤۧۥۥ;->ۥۢۦۣ:I

    xor-int/lit16 v6, v0, 0x131

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    const/16 v0, 0x1d

    if-lt v1, v0, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->ۣ۟۟ۧۥ()Le1/m;

    move-result-object v0

    invoke-static {v0, v2, v3, v6}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۣ۠ۧۢ(Ljava/lang/Object;JI)Landroid/graphics/BlendModeColorFilter;

    move-result-object v0

    const v1, 0xbe7f

    :goto_4
    const v7, 0xbe90

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    new-instance v1, Lu/o;

    new-instance v7, Le1/l;

    invoke-direct {v7, v2, v3, v6, v0}, Le1/l;-><init>(JILandroid/graphics/ColorFilter;)V

    invoke-direct {v1, v4, v5, v7}, Lu/o;-><init>(FLe1/y;Le1/l;)V

    invoke-static {p1, v1}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۣ۟ۨ۟(Ljava/lang/Object;Ljava/lang/Object;)Lb1/g;

    move-result-object v0

    goto :goto_2

    :sswitch_a
    const v1, 0xbe9e

    goto :goto_4

    :sswitch_b
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v2, v3}, Lh/ۥۦۡۧ;->ۥۣۣۤ(J)I

    move-result v1

    invoke-static {v6}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->۟ۦ۠ۢۨ(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object v7

    invoke-direct {v0, v1, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch
.end method
