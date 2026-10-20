.class public final Ld5/h0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:Ld5/h0;

.field public static final c:Ld5/h0;

.field private static final short:[S


# instance fields
.field public final a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    const/16 v0, 0x36

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/h0;->short:[S

    new-instance v0, Ld5/h0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld5/h0;-><init>(I)V

    sput-object v0, Ld5/h0;->b:Ld5/h0;

    new-instance v0, Ld5/h0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld5/h0;-><init>(I)V

    sput-object v0, Ld5/h0;->c:Ld5/h0;

    return-void

    :array_0
    .array-data 2
        0x482s
        0x4a5s
        0x4ads
        0x4a8s
        0x4a1s
        0x4a0s
        0x4e4s
        0x4b0s
        0x4abs
        0x4e4s
        0x4b6s
        0x4a1s
        0x4b5s
        0x4b1s
        0x4a1s
        0x4b7s
        0x4b0s
        0x4e4s
        0x497s
        0x4acs
        0x4ads
        0x4bes
        0x4b1s
        0x4afs
        0x4b1s
        0x4e4s
        0x4b4s
        0x4a1s
        0x4b6s
        0x4a9s
        0x4ads
        0x4b7s
        0x4b7s
        0x4ads
        0x4abs
        0x4aas
        0x4fes
        0x4e4s
        0x48as
        0x4b1s
        0x4bcs
        0x4b5s
        0x4b5s
        0x48ds
        0x4b8s
        0x4a9s
        0x49cs
        0x4a1s
        0x4bcs
        0x4bas
        0x4acs
        0x4ads
        0x4b6s
        0x4abs
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 3

    iput p1, p0, Ld5/h0;->a:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lv0/۟ۦۣ۟ۤ;->۟ۡۡۧۤ()I

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
    const-string v0, "avWz1s4rUQT"

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/ۣۡۧۥ;->ۣ۟ۡۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۟ۦۣۡۢ()[S
    .locals 2

    invoke-static {}, Lp5/۟ۡۧۡۨ;->۟۟۠ۢ۟()I

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
    sget-object v0, Ld5/h0;->short:[S

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
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۣ۟ۨۡۡ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    invoke-static {p0}, Ls/ۣۡۡۧ;->۟ۦۥۡۡ(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {p0}, Ls/ۣۡۡۧ;->۟ۦۥۡۡ(Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 6

    invoke-static {p0}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۣ۟ۨۡۡ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lr7/۟۟ۡ۟ۢ;->۟ۤۨۡۨ()I

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
    const-string v0, "hexVi7SaeJMuTYDvL5fQ4AvZBB8"

    invoke-static {v0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۣۡ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    sget v0, Lf/ۣ۟ۤۤ;->ۣۤۧۢ:I

    xor-int/lit16 v0, v0, -0x26ec

    :try_start_0
    invoke-static {v0}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟۟ۤ۠ۧ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ld5/h0;->۟ۦۣۡۢ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lh4/۟ۧۢۡۦ;->۟ۨۢۥ:I

    xor-int/lit16 v3, v3, -0x152

    const/16 v4, 0x4c4

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->۟ۧۤۢ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ld5/h0;->۟ۦۣۡۢ()[S

    move-result-object v2

    const/16 v3, 0x26

    sget v4, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣۣۤۤ:I

    xor-int/lit16 v4, v4, -0x1b5

    const/16 v5, 0x4d9

    invoke-static {v2, v3, v4, v5}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۧ۟ۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_3
    .end sparse-switch
.end method
