.class public final Ld5/v0;
.super Ld9/j;

# interfaces
.implements Lc9/g;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final b:Lm0/l3;

.field public final c:Lm0/l3;

.field public final d:Lm0/l3;

.field public final e:Lm0/l3;

.field public final f:Lm0/l3;

.field public final n:Lm0/l3;

.field public final o:Lm0/l3;

.field public final p:Lm0/l3;

.field public final q:Lm0/l3;

.field public final r:Lm9/d0;

.field public final s:Lb0/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/v0;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa5ds
        0xa0ds
        0xa11s
        0xa10s
        0xa0as
        0xa5ds
        0xa31s
        0xa16s
        0xa0bs
        0xa10s
        0xa03s
        0xa16s
        0xa17s
        0xa0ds
        0xa18s
        0xa15s
        0xa29s
        0xa18s
        0xa1es
        0xa1cs
        0xa0bs
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/l3;Lm0/l3;Lm0/l3;Lm0/l3;Lm0/l3;Lm0/l3;Lm0/l3;Lm0/l3;Lm0/l3;Lm9/d0;Lb0/h0;)V
    .locals 2

    iput-object p1, p0, Ld5/v0;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/v0;->b:Lm0/l3;

    iput-object p3, p0, Ld5/v0;->c:Lm0/l3;

    iput-object p4, p0, Ld5/v0;->d:Lm0/l3;

    iput-object p5, p0, Ld5/v0;->e:Lm0/l3;

    iput-object p6, p0, Ld5/v0;->f:Lm0/l3;

    iput-object p7, p0, Ld5/v0;->n:Lm0/l3;

    iput-object p8, p0, Ld5/v0;->o:Lm0/l3;

    iput-object p9, p0, Ld5/v0;->p:Lm0/l3;

    iput-object p10, p0, Ld5/v0;->q:Lm0/l3;

    iput-object p11, p0, Ld5/v0;->r:Lm9/d0;

    iput-object p12, p0, Ld5/v0;->s:Lb0/h0;

    sget v0, Lp8/۟۟ۢ۟ۢ;->ۧۢۡۨ:I

    xor-int/lit16 v0, v0, 0x13a

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

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
    const-string v0, "NwAaIef8rReAdxC7nZ"

    invoke-static {v0}, Ls7/ۧۤۦۤ;->ۦۥۡۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۦۣۤۢ()[S
    .locals 2

    invoke-static {}, Lz3/ۦۤۡۤ;->ۢۢۦۨ()I

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
    sget-object v0, Ld5/v0;->short:[S

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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    check-cast p1, Lb0/y;

    check-cast p2, Ljava/lang/Number;

    invoke-static/range {p2 .. p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v3

    check-cast p3, Lm0/m;

    check-cast p4, Ljava/lang/Number;

    invoke-static/range {p4 .. p4}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    invoke-static {}, Ld5/v0;->۟ۦۣۤۢ()[S

    move-result-object v2

    const/4 v4, 0x0

    sget v5, Lo1/۟ۡۡۦۣ;->۟ۡۡ۟ۡ:I

    xor-int/lit16 v5, v5, -0x236

    const/16 v6, 0xa79

    invoke-static {v2, v4, v5, v6}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->۠ۡۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lt9/ۧۦۥ۟;->ۥۢ۠ۡ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lt9/ۧۦۥ۟;->۟ۡۥۢۡ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v12

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
    if-eqz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    sget v2, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    xor-int/lit16 v5, v2, 0x14a

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->۟۠ۥۣۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v6

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v2, 0x1

    if-eq v3, v2, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const/4 v2, 0x2

    if-eq v3, v2, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const v2, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    const/4 v2, 0x3

    if-eq v3, v2, :cond_3

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    const/4 v2, 0x4

    if-eq v3, v2, :cond_4

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    check-cast p3, Lm0/q;

    const v2, 0x6bd4e0ed

    sget v3, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۥۢ۠ۡ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v2, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v2, 0xc221

    goto :goto_5

    :sswitch_10
    check-cast p3, Lm0/q;

    const v2, -0x6bd4e3ad

    sget v3, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۧۧ۠ۥ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    move-object/from16 v0, p3

    invoke-static {v6, v0, v5}, Lj9/۠۠ۨ;->۟ۧۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v2, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :goto_7
    :sswitch_11
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v2

    return-object v2

    :sswitch_12
    const v2, 0xc29d

    goto :goto_6

    :sswitch_13
    check-cast p3, Lm0/q;

    const v2, 0x6bd4e1a6

    sget v3, Lo4/۟۟ۡۧۤ;->ۡۤۨۧ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    move-object/from16 v0, p3

    invoke-static {v6, v0, v5}, Ly/۟ۤۥۨ;->ۣ۟ۧۦۤ(Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    const v2, 0xc5a4

    goto :goto_8

    :sswitch_15
    check-cast p3, Lm0/q;

    const v2, -0x6bd4e1d3

    sget v3, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۠ۢۢۦ:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {v12}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    sget v3, Lh3/۟ۡۥ۠۠;->ۨۡ۟۟:I

    xor-int/lit16 v3, v3, 0x3f6

    move-object/from16 v0, p3

    invoke-static {v6, v2, v0, v3}, Ld9/ۧۧۨۥ;->ۢۡۧۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v2, 0xc601

    :goto_9
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    const v2, 0xc620

    goto :goto_9

    :sswitch_17
    check-cast p3, Lm0/q;

    const v2, -0x6bd4e0ed

    sget v3, Lea/ۦۦۨۨ;->۟۠ۧ۠۟:I

    xor-int/2addr v2, v3

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-static {v2}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v0, p3

    invoke-static {v6, v2, v0, v5}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟۠ۤۧ(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const/4 v2, 0x0

    move-object/from16 v0, p3

    invoke-static {v0, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const v2, 0xc67d

    :goto_a
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :sswitch_18
    const v2, 0xc69c

    goto :goto_a

    :sswitch_19
    move-object/from16 v14, p3

    check-cast v14, Lm0/q;

    const v2, 0x6bd4e5a3

    sget v3, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۢۢ۟۟:I

    xor-int/2addr v2, v3

    invoke-static {v14, v2}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->۟۠ۥۣۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v2

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-static {v3}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static/range {p0 .. p0}, Lz3/۟ۢۢ۟ۢ;->ۨۥۣ۠(Ljava/lang/Object;)Lm0/l3;

    move-result-object v4

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-static {v4}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v4

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟ۤ۟ۥۧ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v5

    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-static {v5}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static/range {p0 .. p0}, La/ۥۡۢۨ;->ۦۡۧۦ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v6

    invoke-static {v6}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-static {v6}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static/range {p0 .. p0}, Ld9/ۥۡۧۡ;->ۥۤۢ۟(Ljava/lang/Object;)Lm0/l3;

    move-result-object v7

    invoke-static {v7}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-static {v7}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v7

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۠۟ۤۢ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v8

    invoke-static {v8}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-static {v8}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v8

    invoke-static/range {p0 .. p0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->ۣ۟۟۟ۤ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v9

    invoke-static {v9}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static/range {p0 .. p0}, Lf6/ۣۣۣۣ۟;->ۢۦۧۡ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v10

    invoke-static {v10}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-static {v10}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۣۢۤۥ(Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static {v12}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map;

    invoke-static/range {p0 .. p0}, Lm7/ۧۢ۟;->۟ۦ۠ۡۡ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v15

    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟ۢۦۧۦ(Ljava/lang/Object;)Lb0/h0;

    move-result-object v16

    new-instance v13, Lu/r0;

    sget v17, Lv9/۟۟ۤۥ;->۟ۥۢۥۡ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x2de

    move/from16 v17, v0

    move/from16 v0, v17

    move-object/from16 v1, v16

    invoke-direct {v13, v0, v15, v1}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v15, 0x40000371    # 2.00021f

    sget v16, Lm4/۟ۧۤ۠;->۟ۥۡۨۧ:I

    xor-int v15, v15, v16

    const/16 v16, 0x0

    invoke-static/range {v2 .. v16}, Ld2/۟ۦۡ۟ۦ;->۟ۧۡۡۤ(Ljava/lang/Object;ZZZZIILjava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    const/4 v2, 0x0

    invoke-static {v14, v2}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    goto/16 :goto_7

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_19
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_17
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_15
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_13
        0x4c -> :sswitch_b
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

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_11
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_16
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_11
        0xf3 -> :sswitch_18
    .end sparse-switch
.end method
