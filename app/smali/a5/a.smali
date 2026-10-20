.class public final La5/a;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public final a:La4/q;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xba

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, La5/a;->short:[S

    return-void

    :array_0
    .array-data 2
        0x8d5s
        0x8c9s
        0x8c9s
        0x8cds
        0x8ces
        0x887s
        0x892s
        0x892s
        0x8cfs
        0x8d4s
        0x8d9s
        0x8d8s
        0x8dcs
        0x8des
        0x8des
        0x8d8s
        0x8cds
        0x8c9s
        0x8d8s
        0x8cfs
        0x893s
        0x8d4s
        0x8d3s
        0x892s
        0x8dcs
        0x8cds
        0x8d4s
        0x892s
        0x8des
        0x8d2s
        0x8c8s
        0x8cds
        0x8d2s
        0x8d3s
        0x8e2s
        0x8cfs
        0x8d8s
        0x8d9s
        0x8d8s
        0x8d8s
        0x8d0s
        0x893s
        0x8cds
        0x8d5s
        0x8cds
        0x651s
        0x65ds
        0x656s
        0x657s
        0x341s
        0x35as
        0x360s
        0x345s
        0x345s
        0x350s
        0x347s
        0x376s
        0x354s
        0x346s
        0x350s
        0x31ds
        0x31bs
        0x31bs
        0x31bs
        0x31cs
        0x74bs
        0x750s
        0x749s
        0x749s
        0x705s
        0x746s
        0x744s
        0x74bs
        0x74bs
        0x74as
        0x751s
        0x705s
        0x747s
        0x740s
        0x705s
        0x746s
        0x744s
        0x756s
        0x751s
        0x705s
        0x751s
        0x74as
        0x705s
        0x74bs
        0x74as
        0x74bs
        0x708s
        0x74bs
        0x750s
        0x749s
        0x749s
        0x705s
        0x751s
        0x75cs
        0x755s
        0x740s
        0x705s
        0x74fs
        0x744s
        0x753s
        0x744s
        0x70bs
        0x74bs
        0x740s
        0x751s
        0x70bs
        0x76ds
        0x751s
        0x751s
        0x755s
        0x770s
        0x777s
        0x769s
        0x766s
        0x74as
        0x74bs
        0x74bs
        0x740s
        0x746s
        0x751s
        0x74cs
        0x74as
        0x74bs
        0x6c9s
        0x6d6s
        0x6cas
        0x6cds
        0x80fs
        0x823s
        0x822s
        0x838s
        0x829s
        0x822s
        0x838s
        0x861s
        0x818s
        0x835s
        0x83cs
        0x829s
        0xc45s
        0xc54s
        0xc54s
        0xc48s
        0xc4ds
        0xc47s
        0xc45s
        0xc50s
        0xc4ds
        0xc4bs
        0xc4as
        0xc0bs
        0xc4es
        0xc57s
        0xc4bs
        0xc4as
        0x372s
        0x369s
        0x355s
        0x372s
        0x374s
        0x36fs
        0x368s
        0x361s
        0x32es
        0x328s
        0x328s
        0x328s
        0x32fs
        0xb6ds
        0xb6fs
        0xb7es
        0xb48s
        0xb73s
        0xb7es
        0xb6fs
        0xb79s
        0xb22s
        0xb24s
        0xb24s
        0xb24s
        0xb23s
    .end array-data
.end method

.method public constructor <init>(La4/q;Ljava/lang/String;Lu8/e;)V
    .locals 2

    iput-object p1, p0, La5/a;->a:La4/q;

    iput-object p2, p0, La5/a;->b:Ljava/lang/String;

    sget v0, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۤۧ۟ۧ:I

    xor-int/lit8 v0, v0, 0x47

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Le0/ۦۣ۟۠;->۟ۧۦۡۤ()I

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
    const-string v0, "IWKnGN3zk5pDFzWkxhITYdQ1cwE"

    invoke-static {v0}, Lk2/۟ۢۦۤۤ;->ۨۧ۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۧ۠ۧۡ()[S
    .locals 2

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

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
    sget-object v0, La5/a;->short:[S

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
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e0\u06e6"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object p0

    :sswitch_0
    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣ۟ۧۢۥ(Ljava/lang/Object;)La4/q;

    move-result-object v1

    const-string v3, "\u06e1\u06e2\u06e4"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ll8/ۢۦۥۢ;->۟۟۠۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e4\u06e8\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    new-instance p0, La5/a;

    invoke-direct {p0, v2, v0, p2}, La5/a;-><init>(La4/q;Ljava/lang/String;Lu8/e;)V

    const-string v1, "\u06e5\u06e1\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0x1aaee3 -> :sswitch_1
        0x1abae1 -> :sswitch_2
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e4\u06e8\u06e6"

    move-object v3, v0

    move-object v4, v0

    move-object v2, p1

    move-object v1, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, La5/a;

    const-string v6, "\u06e6\u06e0\u06e6"

    move-object p0, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e0\u06e0\u06e4"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e3\u06e8\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5, v3}, Lx2/۟ۢۥ;->ۣۨۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e8\u06e3\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e0\u06e8"

    move-object v3, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v4}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۢۦۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e5\u06e0\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_5
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc08 -> :sswitch_2
        0x1aaae4 -> :sswitch_4
        0x1ab723 -> :sswitch_3
        0x1abae2 -> :sswitch_1
        0x1abda6 -> :sswitch_5
        0x1ac16c -> :sswitch_0
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-static {p0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣ۟ۧۢۥ(Ljava/lang/Object;)La4/q;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۢۧۧۡ:I

    xor-int/lit16 v3, v3, -0x32e

    const/16 v4, 0x8bd

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p0}, Ll8/ۢۦۥۢ;->۟۟۠۟۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v3

    const/16 v4, 0x2d

    sget v5, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۦۡ۠ۥ:I

    xor-int/lit16 v5, v5, 0x213

    const/16 v6, 0x632

    invoke-static {v3, v4, v5, v6}, Ll8/ۣ۟ۧۢ۠;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v4

    invoke-static {v2, v4}, Ld9/ۧۧۨۥ;->ۣ۟ۡۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v4

    const/16 v5, 0x31

    sget v6, Ld/۟ۤ۠ۡۨ;->ۥۣۢۡ:I

    xor-int/lit16 v6, v6, 0x179

    const/16 v7, 0x335

    invoke-static {v4, v5, v6, v7}, Lc4/۟ۢۨۥۡ;->ۣ۟ۨۦۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۡۨ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۨۤۥۤ(Ljava/lang/Object;)Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v2

    const/16 v3, 0x41

    sget v4, Lh7/۟۟ۧۨ۟;->۟ۤۢۡۡ:I

    xor-int/lit16 v4, v4, -0x84

    const/16 v5, 0x725

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->۟ۡ۟ۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lh3/۟ۡۥ۠۠;->۟۠۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v2

    const/16 v3, 0x80

    sget v4, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    xor-int/lit16 v4, v4, 0x146

    const/16 v5, 0x699

    invoke-static {v2, v3, v4, v5}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣۣۦۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ldagger/hilt/android/internal/modules/ۣۨۨ۠;->۟ۢۦۣۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v2, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->ۡ۠۟ۦ:I

    xor-int/lit16 v2, v2, -0x27be

    invoke-static {v0, v2}, Lk2/۟ۢۦۤۤ;->۠ۧ۟ۧ(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Lc3/۟ۡۧۢۥ;->۟ۡ۟ۧۡ(Ljava/lang/Object;I)V

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v2

    const/16 v3, 0x84

    sget v4, Ll6/ۥۦۣ۟;->ۣۡۧۧ:I

    xor-int/lit16 v4, v4, 0x193

    const/16 v5, 0x84c

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->۠ۧۤۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v3

    const/16 v4, 0x90

    sget v5, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۧۦۣۢ:I

    xor-int/lit16 v5, v5, 0x12e

    const/16 v6, 0xc24

    invoke-static {v3, v4, v5, v6}, Lx7/۟۟ۦۨۡ;->۠ۥ۠([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lt2/۟ۧۢ۟ۢ;->۟۟ۥ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lia/۟۠ۡۦ۟;->ۦۥ۠ۢ(Ljava/lang/Object;Z)V

    invoke-static {v0}, Lh3/ۣ۠ۡۨ;->۟۠۟ۦۧ(Ljava/lang/Object;)Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    :try_start_1
    invoke-static {v1}, Lg3/۟ۥۣۣۥ;->ۣۥۣ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v3

    const/16 v4, 0xa0

    sget v5, Landroid/support/v4/app/۟۟۠ۡۥ;->۟ۢۤۢ۠:I

    xor-int/lit16 v5, v5, 0x3cf

    const/16 v6, 0x306

    invoke-static {v3, v4, v5, v6}, Lw5/ۣۨۧ۠;->۟ۤ۟ۥۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lv9/۠ۡۨۨ;->۟ۧۥۨ۠()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۤۧۢ۟(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v1

    invoke-static {}, La5/a;->ۧ۠ۧۡ()[S

    move-result-object v3

    const/16 v4, 0xad

    sget v5, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۣ۟ۤۡۧ:I

    xor-int/lit16 v5, v5, -0xa6

    const/16 v6, 0xb0a

    invoke-static {v3, v4, v5, v6}, Lr2/ۡۧۥۧ;->ۥ۠۠۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1}, Lz8/۟ۧۡۥۥ;->۟ۡۥۣ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v2, v1}, Lu/ۤ;->۟ۢ۠ۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lo4/۟۟ۡۧۤ;->ۦۦۦۣ(Ljava/lang/Object;)I

    invoke-static {v0}, Li6/ۡۤۦ;->ۨۤۡۧ(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {v2, v0}, Lu/ۤ;->۟ۢ۠ۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_2
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method
