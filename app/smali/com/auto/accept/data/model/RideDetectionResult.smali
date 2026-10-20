.class public final Lcom/auto/accept/data/model/RideDetectionResult;
.super Ljava/lang/Object;


# static fields
.field public static final $stable:I

.field private static final short:[S


# instance fields
.field private final acceptButtonFound:Z

.field private final fareAmount:I

.field private final fareText:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;

.field private final timestamp:J

.field private final windowType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa0

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/data/model/RideDetectionResult;->short:[S

    return-void

    :array_0
    .array-data 2
        0x887s
        0x896s
        0x894s
        0x89cs
        0x896s
        0x890s
        0x892s
        0x8b9s
        0x896s
        0x89as
        0x892s
        0xb28s
        0xb2fs
        0xb3cs
        0xb2bs
        0xb1as
        0xb2bs
        0xb36s
        0xb3as
        0x7f2s
        0x7ecs
        0x7ebs
        0x7e1s
        0x7eas
        0x7f2s
        0x7d1s
        0x7fcs
        0x7f5s
        0x7e0s
        0x728s
        0x739s
        0x73bs
        0x733s
        0x739s
        0x73fs
        0x73ds
        0x716s
        0x739s
        0x735s
        0x73ds
        0x53fs
        0x538s
        0x52bs
        0x53cs
        0x50ds
        0x53cs
        0x521s
        0x52ds
        0x966s
        0x978s
        0x97fs
        0x975s
        0x97es
        0x966s
        0x945s
        0x968s
        0x961s
        0x974s
        0xb6bs
        0xb50s
        0xb5ds
        0xb5cs
        0xb7ds
        0xb5cs
        0xb4ds
        0xb5cs
        0xb5as
        0xb4ds
        0xb50s
        0xb56s
        0xb57s
        0xb6bs
        0xb5cs
        0xb4as
        0xb4cs
        0xb55s
        0xb4ds
        0xb11s
        0xb49s
        0xb58s
        0xb5as
        0xb52s
        0xb58s
        0xb5es
        0xb5cs
        0xb77s
        0xb58s
        0xb54s
        0xb5cs
        0xb04s
        0xaa3s
        0xaafs
        0xae9s
        0xaees
        0xafds
        0xaeas
        0xaces
        0xae2s
        0xae0s
        0xafas
        0xae1s
        0xafbs
        0xab2s
        0x2f9s
        0x2f5s
        0x2b3s
        0x2b4s
        0x2a7s
        0x2b0s
        0x281s
        0x2b0s
        0x2ads
        0x2a1s
        0x2e8s
        0x33es
        0x332s
        0x373s
        0x371s
        0x371s
        0x377s
        0x362s
        0x366s
        0x350s
        0x367s
        0x366s
        0x366s
        0x37ds
        0x37cs
        0x354s
        0x37ds
        0x367s
        0x37cs
        0x376s
        0x32fs
        0x5dfs
        0x5d3s
        0x584s
        0x59as
        0x59ds
        0x597s
        0x59cs
        0x584s
        0x5a7s
        0x58as
        0x583s
        0x596s
        0x5ces
        0x97es
        0x972s
        0x926s
        0x93bs
        0x93fs
        0x937s
        0x921s
        0x926s
        0x933s
        0x93fs
        0x922s
        0x96fs
        0x666s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;J)V
    .locals 4

    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Le7/ۧ۠ۧ;->۟۟ۥۣۤ:I

    xor-int/lit16 v2, v2, 0x234

    const/16 v3, 0x8f7

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۡۦۥۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v0

    const/16 v1, 0xb

    sget v2, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۣ۟۟۟ۨ:I

    xor-int/lit16 v2, v2, -0x329

    const/16 v3, 0xb4e

    invoke-static {v0, v1, v2, v3}, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->۟ۦۨ۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v0

    const/16 v1, 0x13

    sget v2, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->ۢ۟ۢ۟:I

    xor-int/lit8 v2, v2, 0x60

    const/16 v3, 0x785

    invoke-static {v0, v1, v2, v3}, Lj6/ۣۦۢ۠;->ۣ۟۠ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p5, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/auto/accept/data/model/RideDetectionResult;->packageName:Ljava/lang/String;

    iput p2, p0, Lcom/auto/accept/data/model/RideDetectionResult;->fareAmount:I

    iput-object p3, p0, Lcom/auto/accept/data/model/RideDetectionResult;->fareText:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/auto/accept/data/model/RideDetectionResult;->acceptButtonFound:Z

    iput-object p5, p0, Lcom/auto/accept/data/model/RideDetectionResult;->windowType:Ljava/lang/String;

    iput-wide p6, p0, Lcom/auto/accept/data/model/RideDetectionResult;->timestamp:J

    invoke-static {}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨۨۡ()I

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
    const-string v0, "4s56304gmQesOPY9VgJLSItOy"

    invoke-static {v0}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۣ۟ۡۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;JILd9/f;)V
    .locals 8

    sget v1, Ld9/ۨۧۧۦ;->۟۟ۥۨۢ:I

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
    xor-int/lit16 v0, v1, 0x367

    and-int v0, v0, p8

    if-eqz v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v6

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    move-wide v6, p6

    :sswitch_5
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/auto/accept/data/model/RideDetectionResult;-><init>(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;J)V

    invoke-static {}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۧ۠۠ۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const-string v0, "1ZRdUc2uwtN5sggm8jJXTu73QXF"

    invoke-static {v0}, Ln/ۣۣۢۢ;->۟ۡ۠ۥۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_9
    return-void

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public static synthetic copy$default(Lcom/auto/accept/data/model/RideDetectionResult;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;JILjava/lang/Object;)Lcom/auto/accept/data/model/RideDetectionResult;
    .locals 8

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
    xor-int/lit8 v0, p8, -0x2

    and-int v0, v0, p8

    if-eqz v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    sget v2, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->۟ۡۡۢۢ:I

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    xor-int/lit16 v0, v2, 0x2e9

    and-int v0, v0, p8

    if-eqz v0, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_5
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v2

    :goto_3
    sget v3, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->۟ۢ۠ۨ۠:I

    const/16 v0, 0x748

    :goto_4
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_4

    :sswitch_6
    xor-int/lit8 v0, v3, -0x34

    and-int v0, v0, p8

    if-eqz v0, :cond_2

    const v0, 0xbe60

    goto :goto_4

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_4

    :sswitch_8
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_5
    sget v4, Ld9/ۥۡۧۡ;->۟ۡۨ:I

    const v0, 0xbe7f

    :goto_6
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_6

    :cond_3
    :sswitch_9
    const v0, 0xbebd

    goto :goto_6

    :sswitch_a
    xor-int/lit16 v0, v4, 0x35a

    and-int v0, v0, p8

    if-eqz v0, :cond_3

    const v0, 0xbedc

    goto :goto_6

    :sswitch_b
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v4

    :goto_7
    sget v5, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۧ۠ۡ۟:I

    const v0, 0xbefb

    :goto_8
    const v6, 0xbf0c

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_4

    goto :goto_8

    :cond_4
    :sswitch_c
    const v0, 0xbf39

    goto :goto_8

    :sswitch_d
    xor-int/lit16 v0, v5, -0x340

    and-int v0, v0, p8

    if-eqz v0, :cond_4

    const v0, 0xc1e3

    goto :goto_8

    :sswitch_e
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_9
    sget v6, Lh5/۟ۦۣۣ;->۠ۦۣ۟:I

    const v0, 0xc202

    :goto_a
    const v7, 0xc213

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_5

    goto :goto_a

    :sswitch_f
    xor-int/lit16 v0, v6, -0x15e

    and-int v0, v0, p8

    if-eqz v0, :cond_5

    const v0, 0xc25f

    goto :goto_a

    :cond_5
    :sswitch_10
    const v0, 0xc240

    goto :goto_a

    :sswitch_11
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v6

    :goto_b
    move-object v0, p0

    invoke-static/range {v0 .. v7}, Le1/۟ۡۡۤۡ;->۟۠۟ۥۥ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ZLjava/lang/Object;J)Lcom/auto/accept/data/model/RideDetectionResult;

    move-result-object v0

    return-object v0

    :sswitch_12
    move-wide v6, p6

    goto :goto_b

    :sswitch_13
    move-object v5, p5

    goto :goto_9

    :sswitch_14
    move v4, p4

    goto :goto_7

    :sswitch_15
    move-object v3, p3

    goto :goto_5

    :sswitch_16
    move v2, p2

    goto/16 :goto_3

    :sswitch_17
    move-object v1, p1

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_17
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_16
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
        0x2d -> :sswitch_14
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch
.end method

.method public static ۟ۡۤۧۡ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->ۣۣۧۨ()I

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
    check-cast p0, Lcom/auto/accept/data/model/RideDetectionResult;

    iget-wide v0, p0, Lcom/auto/accept/data/model/RideDetectionResult;->timestamp:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

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

.method public static ۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

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
    check-cast p0, Lcom/auto/accept/data/model/RideDetectionResult;

    iget-object v0, p0, Lcom/auto/accept/data/model/RideDetectionResult;->packageName:Ljava/lang/String;

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

.method public static ۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lm0/۟ۤۡۤۤ;->ۣ۟ۦۢۥ()I

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
    check-cast p0, Lcom/auto/accept/data/model/RideDetectionResult;

    iget-object v0, p0, Lcom/auto/accept/data/model/RideDetectionResult;->fareText:Ljava/lang/String;

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

.method public static ۤۧۡ۟(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

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
    check-cast p0, Lcom/auto/accept/data/model/RideDetectionResult;

    iget v0, p0, Lcom/auto/accept/data/model/RideDetectionResult;->fareAmount:I

    :sswitch_3
    return v0

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

.method public static ۧۦۢۥ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۡۢۤۢ()I

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
    check-cast p0, Lcom/auto/accept/data/model/RideDetectionResult;

    iget-boolean v0, p0, Lcom/auto/accept/data/model/RideDetectionResult;->acceptButtonFound:Z

    :sswitch_3
    return v0

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

.method public static ۨۢۡ۟()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۣۢۥۧ()I

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
    sget-object v0, Lcom/auto/accept/data/model/RideDetectionResult;->short:[S

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

.method public static ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

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
    check-cast p0, Lcom/auto/accept/data/model/RideDetectionResult;

    iget-object v0, p0, Lcom/auto/accept/data/model/RideDetectionResult;->windowType:Ljava/lang/String;

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
.method public final component1()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()I
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component6()J
    .locals 2

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;J)Lcom/auto/accept/data/model/RideDetectionResult;
    .locals 14

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const-string v5, "\u06e4\u06e5\u06e7"

    move-object v10, v3

    move-object v11, v4

    move v12, v6

    move v13, v7

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    move-object/from16 v0, p5

    invoke-static {v0, v11}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "\u06e4\u06e6\u06df"

    move-object v5, v3

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v4, v13, -0x293

    const-string v3, "\u06df\u06e3\u06e3"

    move-object v5, v3

    move v12, v4

    goto :goto_0

    :sswitch_1
    const/16 v3, 0x28

    const/16 v4, 0x559

    invoke-static {v10, v3, v12, v4}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->۟ۦۨ۟ۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u06e4\u06e5\u06e2"

    move-object v11, v3

    move-object v5, v4

    goto :goto_0

    :sswitch_2
    const/16 v3, 0x30

    const/16 v4, 0x911

    invoke-static {v10, v3, v12, v4}, Lcom/google/firebase/dynamicloading/ۣ۟۠ۨۢ;->ۨ۟ۨۡ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u06e0\u06e6\u06e1"

    move-object v11, v3

    move-object v5, v4

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v3

    const-string v4, "\u06e1\u06e5\u06e8"

    move-object v10, v3

    move-object v5, v4

    goto :goto_0

    :sswitch_4
    sget v4, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۢۢ۟۟:I

    const-string v3, "\u06e7\u06e7\u06e7"

    move-object v5, v3

    move v13, v4

    goto :goto_0

    :sswitch_5
    new-instance v2, Lcom/auto/accept/data/model/RideDetectionResult;

    move-object v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-wide/from16 v8, p6

    invoke-direct/range {v2 .. v9}, Lcom/auto/accept/data/model/RideDetectionResult;-><init>(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;J)V

    const-string v3, "\u06e4\u06e7\u06e3"

    move-object v5, v3

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v3

    const-string v4, "\u06e5\u06e8\u06df"

    move-object v10, v3

    move-object v5, v4

    goto :goto_0

    :sswitch_7
    sget v4, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۧۥۡ۠:I

    const-string v3, "\u06e7\u06df\u06e1"

    move-object v5, v3

    move v13, v4

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v4, v13, -0x93

    const-string v3, "\u06df\u06e5\u06e8"

    move-object v5, v3

    move v12, v4

    goto :goto_0

    :sswitch_9
    const/16 v3, 0x1d

    const/16 v4, 0x758

    invoke-static {v10, v3, v12, v4}, Li6/۟۟ۦۨۧ;->ۡ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u06e7\u06e3\u06e3"

    move-object v11, v3

    move-object v5, v4

    goto :goto_0

    :sswitch_a
    move-object/from16 v0, p3

    invoke-static {v0, v11}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "\u06e6\u06e4\u06e6"

    move-object v5, v3

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v3

    const-string v4, "\u06e6\u06e1\u06e4"

    move-object v10, v3

    move-object v5, v4

    goto/16 :goto_0

    :sswitch_c
    invoke-static {p1, v11}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "\u06e0\u06e3\u06df"

    move-object v5, v3

    goto/16 :goto_0

    :sswitch_d
    xor-int/lit16 v4, v13, -0xae

    const-string v3, "\u06e0\u06e1\u06e0"

    move-object v5, v3

    move v12, v4

    goto/16 :goto_0

    :sswitch_e
    sget v4, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥ۟ۧ:I

    const-string v3, "\u06df\u06e4\u06e4"

    move-object v5, v3

    move v13, v4

    goto/16 :goto_0

    :sswitch_f
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa77f -> :sswitch_1
        0x1aa79f -> :sswitch_0
        0x1aa7c2 -> :sswitch_9
        0x1aaaff -> :sswitch_2
        0x1aab3c -> :sswitch_3
        0x1aaf44 -> :sswitch_e
        0x1aba81 -> :sswitch_a
        0x1aba86 -> :sswitch_b
        0x1aba9d -> :sswitch_5
        0x1abac0 -> :sswitch_f
        0x1abe9c -> :sswitch_4
        0x1ac189 -> :sswitch_7
        0x1ac1e8 -> :sswitch_6
        0x1ac509 -> :sswitch_8
        0x1ac587 -> :sswitch_c
        0x1ac607 -> :sswitch_d
    .end sparse-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

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
    if-ne p0, p1, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    instance-of v3, p1, Lcom/auto/accept/data/model/RideDetectionResult;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    move v0, v1

    :goto_2
    :sswitch_6
    return v0

    :sswitch_7
    check-cast p1, Lcom/auto/accept/data/model/RideDetectionResult;

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-nez v3, :cond_2

    const v2, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbe41

    goto :goto_3

    :sswitch_a
    move v0, v1

    goto :goto_2

    :sswitch_b
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p1}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v4

    const v2, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eq v3, v4, :cond_3

    const v2, 0xbedc

    goto :goto_4

    :sswitch_e
    move v0, v1

    goto :goto_2

    :sswitch_f
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_10
    const v2, 0xbf39

    goto :goto_5

    :sswitch_11
    if-nez v3, :cond_4

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_12
    move v0, v1

    goto :goto_2

    :sswitch_13
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {p1}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_14
    if-eq v3, v4, :cond_5

    const v2, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_15
    const v2, 0xc240

    goto :goto_6

    :sswitch_16
    move v0, v1

    goto/16 :goto_2

    :sswitch_17
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_6
    :sswitch_18
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_19
    if-nez v3, :cond_6

    const v2, 0xc2db

    goto :goto_7

    :sswitch_1a
    move v0, v1

    goto/16 :goto_2

    :sswitch_1b
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p1}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v6

    const v2, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_1c
    cmp-long v2, v4, v6

    if-eqz v2, :cond_7

    const v2, 0xc5e2

    goto :goto_8

    :cond_7
    :sswitch_1d
    const v2, 0xc5c3

    goto :goto_8

    :sswitch_1e
    move v0, v1

    goto/16 :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_13
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_14
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
        0x53 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_18
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_1a
        0xf1 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_1c
        0x6af -> :sswitch_1d
        0x6c8 -> :sswitch_6
        0x6e9 -> :sswitch_1e
    .end sparse-switch
.end method

.method public final getAcceptButtonFound()Z
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getFareAmount()I
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final getFareText()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getWindowType()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 10

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-wide/16 v4, 0x0

    const-string v1, "\u06df\u06e5\u06e4"

    move v2, v3

    move v6, v3

    move v7, v3

    move v8, v3

    move v9, v3

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e3\u06df\u06df"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v3

    const-string v1, "\u06df\u06e3\u06e5"

    move v9, v3

    goto :goto_0

    :sswitch_1
    add-int/lit8 v3, v7, 0x1d

    const-string v1, "\u06e8\u06e1\u06e8"

    move v9, v3

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v1, "\u06e1\u06e4\u06e7"

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v2

    const-string v1, "\u06e7\u06e7\u06e4"

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v3, v8, 0x2d7

    const-string v1, "\u06e6\u06e2"

    move v7, v3

    goto :goto_0

    :sswitch_5
    sget v3, Ll6/ۣۧۧۧ;->۟ۦۣۧۡ:I

    const-string v1, "\u06e8\u06df\u06e4"

    move v8, v3

    goto :goto_0

    :sswitch_6
    invoke-static {v0}, Lu/ۤ;->۠ۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    const-string v1, "\u06e5\u06e4\u06e1"

    move v9, v3

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e7\u06e6\u06e6"

    goto :goto_0

    :sswitch_8
    add-int/lit8 v3, v9, -0x1d

    const-string v1, "\u06e5\u06e0"

    move v8, v3

    goto :goto_0

    :sswitch_9
    invoke-static {v9, v8, v7}, Lq5/۟ۥۣۢۨ;->ۣ۟ۤ۟ۦ(III)I

    move-result v3

    const-string v1, "\u06e7\u06e7\u06e3"

    move v6, v3

    goto :goto_0

    :sswitch_a
    add-int v3, v8, v6

    const-string v1, "\u06e0\u06e7\u06e4"

    move v7, v3

    goto :goto_0

    :sswitch_b
    mul-int v3, v9, v7

    const-string v1, "\u06e2\u06e7\u06e1"

    move v8, v3

    goto :goto_0

    :sswitch_c
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e8\u06e1\u06df"

    goto :goto_0

    :sswitch_d
    invoke-static {v0, v8, v7}, Lw2/ۧۦۧ;->۟ۥۨۨۦ(Ljava/lang/Object;II)I

    move-result v3

    const-string v1, "\u06e4\u06e1\u06e5"

    move v6, v3

    goto :goto_0

    :sswitch_e
    invoke-static {v0, v6, v7}, Lw2/ۧۦۧ;->۟ۥۨۨۦ(Ljava/lang/Object;II)I

    move-result v3

    const-string v1, "\u06e8\u06e0\u06e6"

    move v9, v3

    goto :goto_0

    :sswitch_f
    invoke-static {v2, v9, v7}, Lv5/ۧۥۢۡ;->ۣۢۨۤ(ZII)I

    move-result v3

    const-string v1, "\u06e3\u06df\u06e2"

    move v8, v3

    goto :goto_0

    :sswitch_10
    invoke-static {v4, v5}, Lc1/ۣۢۧۨ;->۟ۧ۠ۤ۠(J)I

    move-result v3

    const-string v1, "\u06e4\u06e8\u06e4"

    move v9, v3

    goto/16 :goto_0

    :sswitch_11
    return v9

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9b -> :sswitch_a
        0xdcbc -> :sswitch_b
        0x1aa781 -> :sswitch_9
        0x1aabbd -> :sswitch_1
        0x1aaf24 -> :sswitch_10
        0x1ab33c -> :sswitch_0
        0x1ab603 -> :sswitch_6
        0x1ab606 -> :sswitch_c
        0x1aba08 -> :sswitch_2
        0x1abae0 -> :sswitch_8
        0x1abe22 -> :sswitch_5
        0x1ac5e7 -> :sswitch_e
        0x1ac603 -> :sswitch_7
        0x1ac604 -> :sswitch_f
        0x1ac8cd -> :sswitch_4
        0x1ac8ee -> :sswitch_3
        0x1ac906 -> :sswitch_d
        0x1ac90f -> :sswitch_11
    .end sparse-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    const/4 v11, 0x0

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    const-string v7, "\u06e7\u06e8\u06e5"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, v1

    move v10, v11

    move v12, v11

    move v13, v11

    move v14, v11

    :goto_0
    invoke-static {v7}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e3\u06e4\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit16 v11, v14, -0x20e

    const/16 v1, 0x3a

    const/16 v5, 0xb39

    invoke-static {v6, v1, v11, v5}, Lla/۟ۢۥۧۥ;->۟ۦۤۦۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06df\u06e4"

    move-object v5, v1

    move v13, v11

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v11, v13, -0x38a

    const/16 v1, 0x86

    const/16 v4, 0x5f3

    invoke-static {v6, v1, v11, v4}, Lb1/۟ۥۥ۟ۢ;->ۦۢۨۨ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e2\u06e8\u06e0"

    move-object v4, v1

    move v12, v11

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e8\u06e7\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v10}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟ۥۤۦ(Ljava/lang/Object;Z)Ljava/lang/StringBuilder;

    const-string v1, "\u06e3\u06e8\u06e2"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v1

    sget v11, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۥۤ۠۠:I

    const-string v7, "\u06e5\u06e6"

    move-object v6, v1

    move v13, v11

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v1

    sget v11, Lr6/ۥۡۥۥ;->۟ۥ۟۠ۤ:I

    const-string v7, "\u06e8\u06e6\u06e6"

    move-object v6, v1

    move v14, v11

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v11, v14, 0x305

    const/16 v1, 0x5a

    const/16 v5, 0xa8f

    invoke-static {v6, v1, v11, v5}, Lf0/ۣۦۦ۠;->ۣۣ۟ۡۤ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e3\u06e5"

    move-object v5, v1

    move v13, v11

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v12}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    const-string v1, "\u06e6\u06e7\u06e3"

    move-object v7, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v11, v14, 0x147

    const/16 v1, 0x67

    const/16 v4, 0x2d5

    invoke-static {v6, v1, v11, v4}, Lq0/ۥۣۡۧ;->۟ۤۨۡ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06e5"

    move-object v4, v1

    move v13, v11

    goto :goto_0

    :sswitch_9
    invoke-static {v0, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0, v8, v9}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    const-string v1, "\u06e2\u06e6\u06e4"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {v0, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e6\u06e5"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v1

    sget v11, Lf0/ۣۤ۠۟;->۟ۧۦۥ:I

    const-string v7, "\u06e7\u06e1\u06e3"

    move-object v6, v1

    move v14, v11

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v1

    sget v11, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۤۤۦۥ:I

    const-string v7, "\u06e6\u06e7\u06e1"

    move-object v6, v1

    move v14, v11

    goto/16 :goto_0

    :sswitch_d
    xor-int/lit16 v11, v12, -0x33c

    const/16 v1, 0x72

    const/16 v5, 0x312

    invoke-static {v6, v1, v11, v5}, Lq5/۟ۥۣۢۨ;->ۣ۟۟۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e8"

    move-object v5, v1

    move v14, v11

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit16 v11, v14, -0x15b

    const/16 v1, 0x93

    const/16 v3, 0x952

    invoke-static {v6, v1, v11, v3}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۥۨۡۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e3\u06e0\u06e6"

    move-object v3, v1

    move v13, v11

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v6

    const/16 v1, 0x9f

    const/4 v5, 0x1

    const/16 v7, 0x64f

    invoke-static {v6, v1, v5, v7}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣ۟ۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e6\u06e0\u06e8"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۣۣۨ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۡۤۧۡ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v7, "\u06e1\u06e1\u06e7"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v1

    sget v11, Lx7/۟ۤۡ۟ۦ;->۟ۧۦۦ۠:I

    const-string v7, "\u06e6\u06e7"

    move-object v6, v1

    move v14, v11

    goto/16 :goto_0

    :sswitch_12
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧ۟ۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۤۧۡ۟(Ljava/lang/Object;)I

    move-result v11

    const-string v7, "\u06e4\u06e1\u06e2"

    move-object v4, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\u06e8\u06e0\u06e0"

    move-object v7, v1

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Lcom/auto/accept/data/model/RideDetectionResult;->ۨۢۡ۟()[S

    move-result-object v1

    sget v11, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۧ۠ۡ۟:I

    const-string v7, "\u06e3\u06e4\u06e4"

    move-object v6, v1

    move v12, v11

    goto/16 :goto_0

    :sswitch_15
    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->۟ۧۤ۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/auto/accept/data/model/RideDetectionResult;->ۧۦۢۥ(Ljava/lang/Object;)Z

    move-result v10

    const-string v7, "\u06e5\u06e1\u06e3"

    move-object v3, v1

    goto/16 :goto_0

    :sswitch_16
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdc62 -> :sswitch_2
        0xdca1 -> :sswitch_1
        0xdcc1 -> :sswitch_0
        0xdcc2 -> :sswitch_3
        0x1aa704 -> :sswitch_13
        0x1aa7de -> :sswitch_16
        0x1aaec7 -> :sswitch_11
        0x1ab320 -> :sswitch_f
        0x1ab629 -> :sswitch_9
        0x1ab6a2 -> :sswitch_c
        0x1ab6a3 -> :sswitch_d
        0x1ab71d -> :sswitch_4
        0x1aba05 -> :sswitch_15
        0x1abdc7 -> :sswitch_10
        0x1ac16e -> :sswitch_a
        0x1ac1c8 -> :sswitch_7
        0x1ac240 -> :sswitch_e
        0x1ac242 -> :sswitch_b
        0x1ac549 -> :sswitch_8
        0x1ac624 -> :sswitch_12
        0x1ac8e8 -> :sswitch_5
        0x1ac9a8 -> :sswitch_6
        0x1ac9c4 -> :sswitch_14
    .end sparse-switch
.end method
