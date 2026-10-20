.class public final synthetic La5/r;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/EventListener;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lo9/r;

.field public final b:La5/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, La5/r;->short:[S

    return-void

    :array_0
    .array-data 2
        0x993s
        0x9b5s
        0x9a3s
        0x9b4s
        0x9e6s
        0x9a2s
        0x9a9s
        0x9a5s
        0x9b3s
        0x9abs
        0x9a3s
        0x9a8s
        0x9b2s
        0x9e6s
        0x9a8s
        0x9a9s
        0x9b2s
        0x9e6s
        0x9a0s
        0x9a9s
        0x9b3s
        0x9a8s
        0x9a2s
    .end array-data
.end method

.method public synthetic constructor <init>(Lo9/r;La5/z;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/r;->a:Lo9/r;

    iput-object p2, p0, La5/r;->b:La5/z;

    invoke-static {}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->ۤۡۥۤ()I

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
    const-string v0, "sAz5QEyZpDleKC"

    invoke-static {v0}, Ldagger/hilt/android/internal/modules/ۣۨۨ۠;->۟ۦ۟ۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۟ۦۥ۠ۢ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۣۣۤۦ()I

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
    sget-object v0, La5/r;->short:[S

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
.method public final onEvent(Ljava/lang/Object;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 7

    check-cast p1, Lcom/google/firebase/firestore/DocumentSnapshot;

    invoke-static {p0}, Lf4/ۡۤۡ;->۟۟ۨۢ(Ljava/lang/Object;)Lo9/r;

    move-result-object v0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v1, Lq8/h;

    invoke-static {p2}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟۠ۡۧۧ(Ljava/lang/Object;)Lq8/g;

    move-result-object v2

    invoke-direct {v1, v2}, Lq8/h;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lo9/q;

    invoke-static {v0, v1}, Ln7/۟ۡۢۦ;->۟ۤۡ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz p1, :cond_1

    const v1, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v1, 0xbe41

    goto :goto_2

    :sswitch_7
    invoke-static {p1}, Lo2/۟ۤۨۡۥ;->ۥ۠ۦۧ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_3

    :sswitch_9
    if-nez v2, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_a
    const v1, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :sswitch_b
    new-instance v1, Lq8/h;

    new-instance v2, Ljava/lang/Exception;

    invoke-static {}, La5/r;->۟ۦۥ۠ۢ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Lq7/۟ۢۢ۟ۧ;->۟ۦۤۤ۟:I

    xor-int/lit16 v5, v5, -0x12e

    const/16 v6, 0x9c6

    invoke-static {v3, v4, v5, v6}, Lu/ۤ;->۟ۥۤۡۢ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟۠ۡۧۧ(Ljava/lang/Object;)Lq8/g;

    move-result-object v2

    invoke-direct {v1, v2}, Lq8/h;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lo9/q;

    invoke-static {v0, v1}, Ln7/۟ۡۢۦ;->۟ۤۡ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_c
    return-void

    :sswitch_d
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_e
    invoke-static {p0}, Lp8/۟۟ۢ۟ۢ;->ۣۣۤ۟(Ljava/lang/Object;)La5/z;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    new-instance v1, Lq8/h;

    invoke-static {p1}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۣۡ۠ۥ(Ljava/lang/Object;)Lcom/auto/accept/data/model/UserProfile;

    move-result-object v2

    invoke-direct {v1, v2}, Lq8/h;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lo9/q;

    invoke-static {v0, v1}, Ln7/۟ۡۢۦ;->۟ۤۡ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xc202

    :goto_5
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    const v0, 0xc221

    goto :goto_5

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
        0x36 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_c
    .end sparse-switch
.end method
