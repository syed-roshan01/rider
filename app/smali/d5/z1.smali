.class public final Ld5/z1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Lm0/g1;

.field public final e:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/z1;->short:[S

    return-void

    :array_0
    .array-data 2
        0x979s
        0x96as
        0x965s
        0x96fs
        0x964s
        0x966s
        0x942s
        0x941s
        0x940s
        0x947s
        0x946s
        0x945s
        0x944s
        0x94bs
        0x94as
        0x949s
        0x948s
        0x94fs
        0x94es
        0x94ds
        0x94cs
        0x953s
        0x952s
        0x951s
        0x950s
        0x957s
        0x956s
        0x955s
        0x954s
        0x95bs
        0x95as
        0x959s
        0x962s
        0x961s
        0x960s
        0x967s
        0x966s
        0x965s
        0x964s
        0x96bs
        0x96as
        0x969s
        0x968s
        0x96fs
        0x96es
        0x96ds
        0x96cs
        0x973s
        0x972s
        0x971s
        0x970s
        0x977s
        0x976s
        0x975s
        0x974s
        0x97bs
        0x97as
        0x979s
        0x933s
        0x932s
        0x931s
        0x930s
        0x937s
        0x936s
        0x935s
        0x934s
        0x93bs
        0x93as
        0x898s
        0x884s
        0x889s
        0x886s
        0x8bcs
        0x891s
        0x898s
        0x88ds
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ILm0/g1;Lm0/g1;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Ld5/z1;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/z1;->b:Ljava/lang/String;

    iput p3, p0, Ld5/z1;->c:I

    iput-object p4, p0, Ld5/z1;->d:Lm0/g1;

    iput-object p5, p0, Ld5/z1;->e:Lm0/g1;

    sget v0, Lu3/ۣۡۡۢ;->ۨۧۤۢ:I

    xor-int/lit16 v0, v0, 0x1bc

    invoke-direct {p0, v0, p6}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lt0/ۣ۟۠ۡۢ;->۟ۤۤۦۦ()I

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
    const-string v0, "sooz1tpUL0liOOA8hV9KJxF6D2"

    invoke-static {v0}, Lx7/۟۟ۦۨۡ;->ۣ۠ۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۠ۦۤ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۡۦۤ()I

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Ld5/z1;->short:[S

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    const/4 v0, 0x0

    const/4 v3, 0x0

    const-string v6, "\u06e4\u06e0\u06e4"

    move-object v1, v0

    move-object v4, v0

    move-object v5, v0

    move-object v2, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۣ۟ۢۦ۠(Ljava/lang/Object;)I

    move-result v3

    const-string v0, "\u06e7\u06df\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    const-string v0, "\u06e3\u06df\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lt2/۟ۦۢۡۧ;->ۣۢۧ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v4

    const-string v0, "\u06e1\u06e3\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۡ۠ۥۦ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v5

    const-string v0, "\u06e0\u06df\u06e4"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣ۟۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "\u06e7\u06df\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Ld5/z1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ld5/z1;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ILm0/g1;Lm0/g1;Lu8/e;)V

    const-string v6, "\u06e8\u06e1\u06e6"

    move-object p0, v0

    goto :goto_0

    :sswitch_5
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aaac5 -> :sswitch_4
        0x1aaefe -> :sswitch_2
        0x1ab604 -> :sswitch_3
        0x1ab9e8 -> :sswitch_0
        0x1ac50e -> :sswitch_1
        0x1ac90d -> :sswitch_5
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06df\u06e7\u06e3"

    move-object v1, p1

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06df\u06e0\u06e4"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e5\u06e7\u06e0"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06df\u06e1\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v2

    check-cast v0, Ld5/z1;

    const-string v6, "\u06e3\u06e3"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v4, v3}, Le2/ۨۥۦۡ;->۟۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e3\u06e6\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v5}, Ls7/ۧۤۦۤ;->ۧۢۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e4\u06e2\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa723 -> :sswitch_4
        0x1aa743 -> :sswitch_3
        0x1aa7fb -> :sswitch_0
        0x1ab6e2 -> :sswitch_2
        0x1aba22 -> :sswitch_5
        0x1abe7e -> :sswitch_1
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    new-instance v1, Li9/g;

    const/4 v0, 0x1

    sget v2, Le2/ۨۥ۠ۨ;->ۣ۟۟ۢۨ:I

    xor-int/lit16 v2, v2, 0xb1

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Li9/g;-><init>(III)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۧ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v1}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۣۡۤ۟(Ljava/lang/Object;)Li9/f;

    move-result-object v2

    :sswitch_0
    invoke-static {v2}, Ld2/۟ۦۡ۟ۦ;->۟ۡۢۡ۟(Ljava/lang/Object;)Z

    move-result v3

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz v3, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v2}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->۟ۡ۟ۦۦ(Ljava/lang/Object;)I

    invoke-static {}, Lx8/ۢۨۥۨ;->ۣ۟ۢ۟۟()Lg9/c;

    move-result-object v1

    invoke-static {}, Ld5/z1;->ۣ۟۠ۦۤ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Lb/۠ۨۦۥ;->۟ۥۤۧۥ:I

    xor-int/lit16 v5, v5, 0x129

    const/16 v6, 0x90b

    invoke-static {v3, v4, v5, v6}, Landroidx/preference/۟ۤۥۦۧ;->۟ۥۥۦۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v3, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟۠ۦۣۢ:I

    xor-int/lit16 v3, v3, 0x147

    invoke-static {v1, v3}, Lm4/۟ۧۤ۠;->ۢۦۥۥ(Ljava/lang/Object;I)I

    move-result v1

    invoke-static {}, Ld5/z1;->ۣ۟۠ۦۤ()[S

    move-result-object v3

    const/4 v4, 0x6

    sget v5, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟ۦۧۦ۟:I

    xor-int/lit16 v5, v5, 0x2d8

    const/16 v6, 0x903

    invoke-static {v3, v4, v5, v6}, Lx0/ۣ۠۟۠;->ۧۤۢۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Ld9/ۨۧۧۦ;->ۣ۟۟۠ۤ(Ljava/lang/Object;I)C

    move-result v1

    invoke-static {v1}, Lo8/۟ۢۧۢۤ;->ۣۧۡۡ(C)Ljava/lang/Character;

    move-result-object v1

    invoke-static {v0, v1}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget v5, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۦۨۧ۟:I

    xor-int/lit8 v5, v5, -0x64

    invoke-static/range {v0 .. v5}, Lw9/۟۠۠ۢ۟;->ۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lt2/۟ۦۢۡۧ;->ۣۢۧ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0, v3}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۣ۟ۢۦ۠(Ljava/lang/Object;)I

    move-result v5

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Ld5/z1;->ۣ۟۠ۦۤ()[S

    move-result-object v0

    const/16 v2, 0x44

    sget v4, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۨۢۦ:I

    xor-int/lit16 v4, v4, 0x2f8

    const/16 v6, 0x8e8

    invoke-static {v0, v2, v4, v6}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۦ۟ۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣ۟۠ۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v0

    invoke-static {v0}, Lh1/۟۟ۨۦۦ;->ۥۨۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v2, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/gms/common/ۦۢۨ;->ۡ۠ۥۦ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۣ۟ۢۦ۠(Ljava/lang/Object;)I

    move-result v9

    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v11, 0x0

    new-instance v5, Lf5/b0;

    const/4 v10, 0x0

    move-object v6, v1

    move-object v7, v3

    move-object v8, v4

    invoke-direct/range {v5 .. v10}, Lf5/b0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;ILu8/e;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v11, v5, v3}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    move-result-object v0

    invoke-static {v1}, Landroidx/annotation/۟ۦۤ۟ۤ;->۟ۥۦۧۤ(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2, v0}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۟ۦۢۡ()Lf5/a0;

    move-result-object v0

    invoke-static {v2, v0}, Lt8/ۦۣ۠;->۟ۦ۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ln8/ۢۡۨۨ;->ۣۢ۠ۢ(Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_b
    invoke-static {v1}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۥۦۨ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۟ۡۡۨۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/auto/accept/data/model/CouponData;

    invoke-static {v1, v4}, Lz/ۨۤۥۨ;->ۣۧۧۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    const v0, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_c
    const v0, 0xbf39

    goto :goto_5

    :sswitch_d
    if-eqz v6, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_e
    add-int/lit8 v0, v7, 0xf

    sub-int/2addr v0, v5

    add-int/lit8 v7, v0, -0xf

    const v0, 0xc202

    :goto_6
    const v8, 0xc213

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v0, 0xc221

    goto :goto_6

    :sswitch_10
    const/4 v7, 0x0

    :sswitch_11
    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    new-instance v0, Lf5/l;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lf5/l;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/auto/accept/data/model/CouponData;ILu8/e;)V

    const/4 v2, 0x3

    invoke-static {v9, v10, v11, v0, v2}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
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

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch
.end method
