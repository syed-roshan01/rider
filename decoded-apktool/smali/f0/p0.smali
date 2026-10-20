.class public final Lf0/p0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x37

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/p0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x5f5s
        0x5f2s
        0x5e7s
        0x5f4s
        0x5f2s
        0x5aes
        0x86ds
        0x864s
        0x82bs
        0x836s
        0x864s
        0x821s
        0x82as
        0x820s
        0x86cs
        0x6e7s
        0x6ees
        0x6a7s
        0x6bds
        0x6ees
        0x6a1s
        0x6bbs
        0x6bas
        0x6ees
        0x6a1s
        0x6a8s
        0x6ees
        0x6bcs
        0x6afs
        0x6a0s
        0x6a9s
        0x6abs
        0x6ees
        0x695s
        0x6fes
        0x6e0s
        0x6e0s
        0x778s
        0x709s
        0x705s
        0x74as
        0x757s
        0x705s
        0x756s
        0x751s
        0x744s
        0x757s
        0x751s
        0x705s
        0x71bs
        0x705s
        0x740s
        0x74bs
        0x741s
        0x704s
    .end array-data
.end method

.method public constructor <init>(Le1/i;II)V
    .locals 2

    iput-object p1, p0, Lf0/p0;->c:Ljava/lang/Object;

    iput p2, p0, Lf0/p0;->a:I

    iput p3, p0, Lf0/p0;->b:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lu0/ۣ۟ۤ۟ۡ;->۟ۡۢۡ()I

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "ZrYVBWM36ICBkoSSDLJ370NL58"

    invoke-static {v0}, Lm1/۟ۧۥ۟ۨ;->ۣ۟ۦ۟۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۡ۟ۢۥ()[S
    .locals 2

    invoke-static {}, Lw/ۥۣۡۡ;->ۣ۟۟ۥ۟()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lf0/p0;->short:[S

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
    .locals 8

    const/4 v7, 0x0

    check-cast p1, La2/m;

    invoke-static {p0}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣۧ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/d0;

    invoke-static {p1}, Lw9/۟۠۠ۢ۟;->۟۟۟ۧ۠(Ljava/lang/Object;)La2/l;

    move-result-object v1

    invoke-static {p0}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۣ۟۟ۧ۠(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p1, v2}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->۟ۥۡۢۧ(Ljava/lang/Object;I)I

    move-result v3

    invoke-static {p0}, Lq6/ۣ۟ۢ۟ۤ;->۟ۧ۠۠ۡ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p1, v2}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->۟ۥۡۢۧ(Ljava/lang/Object;I)I

    move-result v4

    check-cast v1, La2/a;

    invoke-static {v1}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->ۣۣ۟ۤۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v5

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gt v3, v4, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v5}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۣۡۧ۟(Ljava/lang/Object;)I

    move-result v6

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-gt v4, v6, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    invoke-static {v1}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۧ۠۠ۦ(Ljava/lang/Object;)Lb2/v;

    move-result-object v1

    invoke-static {v1}, Lb4/ۦۣۧ۟;->ۣۨ۟ۨ(Ljava/lang/Object;)Landroid/text/Layout;

    move-result-object v5

    invoke-static {v5, v3, v4, v2}, Landroidx/preference/۟ۤۥۦۧ;->۟ۧۡۥۧ(Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-static {v1}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->ۣ۟ۡ۠ۤ(Ljava/lang/Object;)I

    move-result v3

    const v1, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v3, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v2}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۦۥ۠ۥ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xbefb

    :goto_4
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v1, 0xbf39

    goto :goto_4

    :sswitch_d
    if-nez v4, :cond_4

    const v1, 0xc1e3

    goto :goto_4

    :sswitch_e
    int-to-float v1, v3

    invoke-static {v2, v7, v1}, Ldagger/hilt/internal/۟ۤۧۨ۟;->۟ۥۥۤ(Ljava/lang/Object;FF)V

    :sswitch_f
    invoke-static {p1}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->ۣ۟ۧۦ(Ljava/lang/Object;)F

    move-result v1

    invoke-static {v7, v1}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨ۟۟ۨ(FF)J

    move-result-wide v4

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-static {v4, v5}, Le0/ۦۣ۟۠;->۠ۥۡ۟(J)F

    move-result v3

    invoke-static {v4, v5}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۢۧ۠(J)F

    move-result v4

    invoke-static {v1, v3, v4}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->۟ۦۤۨۤ(Ljava/lang/Object;FF)V

    invoke-static {v2, v1}, Lg/۟۠ۡۨۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->۠ۧ۠ۤ()J

    move-result-wide v4

    check-cast v0, Le1/i;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {v4, v5}, Le0/ۦۣ۟۠;->۠ۥۡ۟(J)F

    move-result v1

    invoke-static {v4, v5}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣ۟ۢۧ۠(J)F

    move-result v3

    invoke-static {v0}, Lm7/ۥۨۥ۟;->ۣۧۤۡ(Ljava/lang/Object;)Landroid/graphics/Path;

    move-result-object v0

    invoke-static {v0, v2, v1, v3}, Lw6/۟ۥۧۡۨ;->ۦۧۡۨ(Ljava/lang/Object;Ljava/lang/Object;FF)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/p0;->۟ۡ۟ۢۥ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v6, Lw5/ۣۨۧ۠;->۟۠ۢ۠۟:I

    xor-int/lit16 v6, v6, 0x125

    const/16 v7, 0x586

    invoke-static {v1, v2, v6, v7}, Lr5/۟ۤۨۥۡ;->۟۟ۥۢۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/p0;->۟ۡ۟ۢۥ()[S

    move-result-object v1

    const/4 v2, 0x6

    sget v3, La8/ۡۦۨۡ;->ۧۡۦۡ:I

    xor-int/lit16 v3, v3, 0x378

    const/16 v6, 0x844

    invoke-static {v1, v2, v3, v6}, Lv0/ۣ۟۟ۤۧ;->ۢ۟ۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v4}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/p0;->۟ۡ۟ۢۥ()[S

    move-result-object v1

    const/16 v2, 0xf

    sget v3, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۣ۟ۧ۟ۢ:I

    xor-int/lit16 v3, v3, -0x29c

    const/16 v4, 0x6ce

    invoke-static {v1, v2, v3, v4}, Lv0/ۣ۟۟ۤۧ;->ۢ۟ۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۣۡۧ۟(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lf0/p0;->۟ۡ۟ۢۥ()[S

    move-result-object v1

    const/16 v2, 0x25

    sget v3, Ly/۟ۤۥۨ;->۟ۢۡۧۧ:I

    xor-int/lit16 v3, v3, -0x274

    const/16 v4, 0x725

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->۠ۡۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_10
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_10
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch
.end method
