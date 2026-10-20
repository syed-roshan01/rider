.class public final Lk0/v;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# static fields
.field private static final short:[S


# instance fields
.field public final a:F

.field public final b:Ly/g;

.field public final c:Ly/i;

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x54

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk0/v;->short:[S

    return-void

    :array_0
    .array-data 2
        0x8c5s
        0x8e9s
        0x8eas
        0x8eas
        0x8e3s
        0x8e5s
        0x8f2s
        0x8efs
        0x8e9s
        0x8e8s
        0x8a6s
        0x8e5s
        0x8e9s
        0x8e8s
        0x8f2s
        0x8e7s
        0x8efs
        0x8e8s
        0x8f5s
        0x8a6s
        0x8e8s
        0x8e9s
        0x8a6s
        0x8e3s
        0x8eas
        0x8e3s
        0x8ebs
        0x8e3s
        0x8e8s
        0x8f2s
        0x8a6s
        0x8ebs
        0x8e7s
        0x8f2s
        0x8e5s
        0x8ees
        0x8efs
        0x8e8s
        0x8e1s
        0x8a6s
        0x8f2s
        0x8ees
        0x8e3s
        0x8a6s
        0x8f6s
        0x8f4s
        0x8e3s
        0x8e2s
        0x8efs
        0x8e5s
        0x8e7s
        0x8f2s
        0x8e3s
        0x8a8s
        0xab5s
        0xabas
        0xaads
        0xab2s
        0xabcs
        0xabas
        0xaafs
        0xab2s
        0xab4s
        0xab5s
        0xa92s
        0xab8s
        0xab4s
        0xab5s
        0x961s
        0x963s
        0x974s
        0x969s
        0x96fs
        0x96es
        0x949s
        0x963s
        0x96fs
        0x96es
        0x973s
        0xad4s
        0xac9s
        0xad4s
        0xaccs
        0xac5s
    .end array-data
.end method

.method public constructor <init>(FLy/g;Ly/i;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk0/v;->a:F

    iput-object p2, p0, Lk0/v;->b:Ly/g;

    iput-object p3, p0, Lk0/v;->c:Ly/i;

    iput p4, p0, Lk0/v;->d:I

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۡۦۥ۟()I

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
    const-string v0, "VhGniMdLcZ"

    invoke-static {v0}, Lm5/۟ۥۣۧۥ;->ۥۤۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۟۠۠ۡۨ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->۟ۤۤۤ۟()I

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
    sget-object v0, Lk0/v;->short:[S

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
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 17

    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    const/4 v11, 0x0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-static {}, Lk0/v;->۟۠۠ۡۨ()[S

    move-result-object v2

    const/4 v5, 0x0

    sget v6, Lj4/ۣۧۤ;->ۦۡۦۡ:I

    xor-int/lit16 v6, v6, -0x322

    const/16 v7, 0x886

    invoke-static {v2, v5, v6, v7}, Lo4/۟۟ۡۧۤ;->۟۟ۡۦۡ([SIII)Ljava/lang/String;

    move-result-object v12

    const/16 v2, 0x650

    :goto_1
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_1

    :sswitch_1
    if-ge v3, v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_1

    :sswitch_2
    move-object/from16 v0, p2

    invoke-static {v0, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lr1/i0;

    invoke-static {v9}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/v;->۟۠۠ۡۨ()[S

    move-result-object v5

    const/16 v6, 0x36

    sget v7, Lg/۟ۦۥۥۤ;->۟ۡۤ۠ۥ:I

    xor-int/lit16 v7, v7, -0x194

    const/16 v8, 0xadb

    invoke-static {v5, v6, v7, v8}, Lm9/۟ۤۢۦ۠;->ۥۡۥۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    if-eqz v5, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_5
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget v2, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    xor-int/lit16 v8, v2, 0xea

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v8}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤ۟(JIIIII)J

    move-result-wide v2

    invoke-static {v9, v2, v3}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v15

    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    const/4 v2, 0x0

    move v3, v2

    :goto_3
    const/16 v2, 0x748

    :goto_4
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_4

    :sswitch_6
    if-ge v3, v4, :cond_2

    const v2, 0xbe60

    goto :goto_4

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_4

    :sswitch_8
    move-object/from16 v0, p2

    invoke-static {v0, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lr1/i0;

    invoke-static {v9}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/v;->۟۠۠ۡۨ()[S

    move-result-object v5

    const/16 v6, 0x44

    sget v7, Lz/ۨۤۥۨ;->ۡۡۧۤ:I

    xor-int/lit16 v7, v7, -0x224

    const/16 v8, 0x900

    invoke-static {v5, v6, v7, v8}, Lo1/۟ۡۡۦۣ;->ۣۡۧ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xbe7f

    :goto_5
    const v6, 0xbe90

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_3

    goto :goto_5

    :cond_3
    :sswitch_9
    const v2, 0xbebd

    goto :goto_5

    :sswitch_a
    if-eqz v5, :cond_3

    const v2, 0xbedc

    goto :goto_5

    :sswitch_b
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget v2, Lb7/۟۟ۤۤۤ;->۟ۧۡۦۦ:I

    xor-int/lit16 v8, v2, -0x9c

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v8}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤ۟(JIIIII)J

    move-result-wide v2

    invoke-static {v9, v2, v3}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v10

    invoke-static/range {p3 .. p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v3

    const v2, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_6

    :cond_4
    :sswitch_c
    const v2, 0xbf39

    goto :goto_6

    :sswitch_d
    const v2, 0x7fffffff

    if-ne v3, v2, :cond_4

    const v2, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static/range {p3 .. p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v5

    :sswitch_f
    const v2, 0xc202

    :goto_7
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_7

    :sswitch_10
    const v2, 0xc221

    goto :goto_7

    :sswitch_11
    invoke-static/range {p3 .. p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v2

    add-int/lit8 v2, v2, -0x9

    invoke-static {v15}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x9

    add-int/lit8 v2, v2, 0x11

    invoke-static {v10}, Lcom/google/android/datatransport/cct/۟۟ۧۥۡ;->۟ۢ۟ۡۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v5, v2, -0x11

    const v2, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_12
    const v2, 0xc2bc

    goto :goto_8

    :sswitch_13
    if-gez v5, :cond_5

    const v2, 0xc2db

    goto :goto_8

    :sswitch_14
    const/4 v5, 0x0

    const v2, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    const v2, 0xc5a4

    goto :goto_9

    :sswitch_16
    invoke-static/range {p2 .. p2}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v4

    const/4 v2, 0x0

    move v3, v2

    :goto_a
    const v2, 0xc601

    :goto_b
    const v6, 0xc612

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_8

    goto :goto_b

    :sswitch_17
    if-ge v3, v4, :cond_6

    const v2, 0xc65e

    goto :goto_b

    :cond_6
    :sswitch_18
    const v2, 0xc63f

    goto :goto_b

    :sswitch_19
    move-object/from16 v0, p2

    invoke-static {v0, v3}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lr1/i0;

    invoke-static {v9}, Lo2/۟ۤۨۡۥ;->ۨۦ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lk0/v;->۟۠۠ۡۨ()[S

    move-result-object v6

    const/16 v7, 0x4f

    sget v8, Lj9/۠۠ۨ;->۟ۢۦۤۡ:I

    xor-int/lit16 v8, v8, 0x342

    const/16 v13, 0xaa0

    invoke-static {v6, v7, v8, v13}, Lj3/۟ۧۧۦۤ;->ۤۢۢۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xc67d

    :goto_c
    const v7, 0xc68e

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_9

    goto :goto_c

    :cond_7
    :sswitch_1a
    const v2, 0xc6bb

    goto :goto_c

    :sswitch_1b
    if-eqz v6, :cond_7

    const v2, 0xc965

    goto :goto_c

    :sswitch_1c
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget v2, Lcom/google/android/gms/common/ۦۢۨ;->ۦۢۥۧ:I

    xor-int/lit16 v8, v2, 0x250

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v8}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣ۟۟ۤ۟(JIIIII)J

    move-result-wide v2

    invoke-static {v9, v2, v3}, Lw/ۥۣۡۡ;->ۡۤۧ۠(Ljava/lang/Object;J)Lr1/x0;

    move-result-object v6

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->۟ۢۨ۠ۡ()Lr1/o;

    move-result-object v3

    invoke-static {v6, v3}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    const v2, 0xc984

    :goto_d
    const v5, 0xc995

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_a

    goto :goto_d

    :sswitch_1d
    const/high16 v2, -0x80000000

    if-eq v4, v2, :cond_8

    const v2, 0xc9e1

    goto :goto_d

    :cond_8
    :sswitch_1e
    const v2, 0xc9c2

    goto :goto_d

    :sswitch_1f
    invoke-static {v6, v3}, Lcom/google/firebase/۟ۥۧۡۨ;->۠ۨۡۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v14

    const v2, 0xca00

    :goto_e
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_e

    :goto_f
    :pswitch_1
    invoke-static/range {p0 .. p0}, Lga/۟ۢۧ۟ۦ;->۟ۦۤۦۨ(Ljava/lang/Object;)F

    move-result v3

    invoke-static {v3}, Lh7/ۥۥۢ۟;->ۥۣۨۦ(F)Z

    move-result v4

    const v2, 0xca7c

    :goto_10
    const v5, 0xca8d

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_b

    goto :goto_10

    :sswitch_20
    if-eqz v4, :cond_9

    const v2, 0xcd64

    goto :goto_10

    :pswitch_2
    const v2, 0xca1f

    goto :goto_e

    :sswitch_21
    const/4 v14, 0x0

    goto :goto_f

    :cond_9
    :sswitch_22
    const v2, 0xcd45

    goto :goto_10

    :sswitch_23
    const v2, 0xcd83

    :goto_11
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_11

    :sswitch_24
    const v2, 0xcda2

    goto :goto_11

    :sswitch_25
    move v5, v11

    :goto_12
    invoke-static/range {p3 .. p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v2

    new-instance v3, Lk0/u;

    invoke-static/range {p0 .. p0}, Lx0/ۣ۠۟۠;->۟۠ۥۢ(Ljava/lang/Object;)Ly/g;

    move-result-object v7

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟۠ۡۥۡ(Ljava/lang/Object;)Ly/i;

    move-result-object v12

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->ۦۢۧۥ(Ljava/lang/Object;)I

    move-result v13

    move-object v4, v15

    move-wide/from16 v8, p3

    move-object/from16 v11, p1

    invoke-direct/range {v3 .. v14}, Lk0/u;-><init>(Lr1/x0;ILr1/x0;Ly/g;JLr1/x0;Lr1/l0;Ly/i;II)V

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v0, v2, v5, v4, v3}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v2

    return-object v2

    :sswitch_26
    invoke-static {v3}, Le1/۟ۡۡۤۡ;->۟ۤۦۤۦ(F)I

    move-result v5

    goto :goto_12

    :sswitch_27
    sget v2, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۡ۠۟ۦ:I

    xor-int/lit16 v2, v2, -0xad

    add-int/2addr v2, v3

    const v3, 0xcdff

    :goto_13
    const v6, 0xce10

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_d

    goto :goto_13

    :sswitch_28
    move v3, v2

    goto/16 :goto_a

    :sswitch_29
    const v3, 0xce1e

    goto :goto_13

    :sswitch_2a
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_2b
    sget v2, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    xor-int/lit16 v2, v2, 0x2c9

    add-int/2addr v2, v3

    const v3, 0xd106

    :goto_14
    const v5, 0xd117

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_e

    goto :goto_14

    :sswitch_2c
    const v3, 0xd125

    goto :goto_14

    :sswitch_2d
    move v3, v2

    goto/16 :goto_3

    :sswitch_2e
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_2f
    sget v2, Lr2/ۧۧۢۢ;->ۥۦۦ:I

    xor-int/lit16 v2, v2, 0x2d9

    add-int/2addr v2, v3

    const v3, 0xd182

    :goto_15
    const v5, 0xd193

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_f

    goto :goto_15

    :sswitch_30
    const v3, 0xd1a1

    goto :goto_15

    :sswitch_31
    move v3, v2

    goto/16 :goto_0

    :sswitch_32
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_32
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_2f
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_2e
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_2b
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_f
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_f
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_2a
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_27
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_21
        0x74 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_22
        0x7c8 -> :sswitch_26
        0x7e9 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0x17 -> :sswitch_24
        0x36 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xe -> :sswitch_28
        0x3ef -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_2d
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
    .end sparse-switch
.end method
