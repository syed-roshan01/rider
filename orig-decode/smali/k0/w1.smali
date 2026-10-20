.class public final Lk0/w1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:J

.field public final b:Lg1/k;

.field public final c:Lm0/l3;

.field public final d:Lm0/l3;

.field public final e:Lm0/l3;

.field public final f:Lm0/l3;

.field public final n:F

.field public final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLg1/k;Lt/k0;Lt/k0;Lt/k0;Lt/k0;FJ)V
    .locals 3

    iput-wide p1, p0, Lk0/w1;->a:J

    iput-object p3, p0, Lk0/w1;->b:Lg1/k;

    iput-object p4, p0, Lk0/w1;->c:Lm0/l3;

    iput-object p5, p0, Lk0/w1;->d:Lm0/l3;

    iput-object p6, p0, Lk0/w1;->e:Lm0/l3;

    iput-object p7, p0, Lk0/w1;->f:Lm0/l3;

    iput p8, p0, Lk0/w1;->n:F

    iput-wide p9, p0, Lk0/w1;->o:J

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->۟۠ۥۢۥ()I

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
    const-string v0, "j1kyev4EENnLRv8zGGxy"

    invoke-static {v0}, Lr2/ۧۧۢۢ;->ۥۥ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/high16 v3, 0x43b40000    # 360.0f

    const/high16 v13, 0x42000000    # 32.0f

    const/high16 v8, 0x41b80000    # 23.0f

    const/4 v2, 0x0

    move-object v1, p1

    check-cast v1, Lg1/g;

    invoke-static {p0}, Ls8/۟ۥۨۨ;->۟ۦۥۥۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p0}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->۠ۥۨۡ(Ljava/lang/Object;)Lg1/k;

    move-result-object v6

    invoke-static/range {v1 .. v6}, Landroidx/core/content/ۣۣۣ۟;->ۥۣۤۡ(Ljava/lang/Object;FFJLjava/lang/Object;)V

    invoke-static {p0}, Lr2/۠ۨۦۢ;->۟۠ۨ۠(Ljava/lang/Object;)Lm0/l3;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v7

    invoke-static {p0}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->۠۠ۨۦ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v0

    invoke-static {p0}, Landroidx/annotation/۟ۦۤ۟ۤ;->۟ۧۦ۠ۡ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v4

    add-float v5, v0, v8

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v0

    sub-float v0, v5, v0

    sub-float/2addr v0, v8

    invoke-static {v0}, Ll3/ۥۣۤ۟;->۟ۥۦۣ۠(F)F

    move-result v8

    invoke-static {p0}, Landroid/support/v4/app/ۥۣۡ;->ۣ۟ۦۧ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v9

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v10

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣ۟۟ۥ۠(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p0}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->۠ۥۨۡ(Ljava/lang/Object;)Lg1/k;

    move-result-object v6

    invoke-static {v6}, Landroidx/preference/۟ۤۥۦۧ;->ۡۥ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    const/4 v11, 0x0

    invoke-static {v0, v11}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->ۡۡۦۣ(II)Z

    move-result v11

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
    if-eqz v11, :cond_0

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
    move v0, v2

    :goto_2
    sub-float/2addr v0, v13

    sub-float v9, v2, v9

    const/high16 v11, -0x3d4c0000    # -90.0f

    const/high16 v12, 0x43580000    # 216.0f

    mul-float/2addr v7, v12

    rem-float v3, v7, v3

    sub-float v3, v2, v3

    sub-float v3, v11, v3

    sub-float v3, v9, v3

    sub-float v3, v2, v3

    sub-float/2addr v2, v3

    sub-float v2, v10, v2

    add-float/2addr v0, v2

    add-float v2, v0, v13

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v8, v0}, Ly/ۤۨۧ۟;->ۨۧۦ۟(FF)F

    move-result v3

    invoke-static/range {v1 .. v6}, Landroidx/core/content/ۣۣۣ۟;->ۥۣۤۡ(Ljava/lang/Object;FFJLjava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_5
    sget v0, La3/۟ۢۨۢۥ;->ۢۤۧ:I

    xor-int/lit16 v0, v0, 0xec

    int-to-float v0, v0

    invoke-static {}, Lfa/ۣ۟ۥۤ;->ۨۦ۠۟()F

    move-result v11

    div-float v0, v11, v0

    invoke-static {p0}, Lz3/۟ۡ۠ۦۣ;->ۧۧۨۡ(Ljava/lang/Object;)F

    move-result v11

    div-float v0, v11, v0

    const v11, 0x42652ee1

    mul-float/2addr v0, v11

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v0, v11

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch
.end method
