.class public final Lk6/o4;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Lk6/l4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/o4;->short:[S

    return-void

    :array_0
    .array-data 2
        0x5afs
        0x5a2s
        0x5a6s
        0x5abs
        0x5b3s
        0x5afs
        0x598s
        0x5aas
        0x5a8s
        0x5a9s
        0x5aes
        0x5b3s
        0x5a8s
        0x5b5s
        0x677s
        0x67as
        0x67es
        0x673s
        0x66bs
        0x677s
        0x640s
        0x672s
        0x670s
        0x671s
        0x676s
        0x66bs
        0x670s
        0x66ds
        0x625s
        0x66cs
        0x66bs
        0x67es
        0x66ds
        0x66bs
        0x2c3s
        0x2ces
        0x2cas
        0x2c7s
        0x2dfs
        0x2c3s
        0x2f4s
        0x2c6s
        0x2c4s
        0x2c5s
        0x2c2s
        0x2dfs
        0x2c4s
        0x2d9s
        0x291s
        0x2c8s
        0x2c4s
        0x2des
        0x2c5s
        0x2dfs
        0x47as
        0x477s
        0x473s
        0x47es
        0x466s
        0x47as
        0x44ds
        0x47fs
        0x47ds
        0x47cs
        0x47bs
        0x466s
        0x47ds
        0x460s
        0x428s
        0x464s
        0x473s
        0x47es
        0x467s
        0x477s
    .end array-data
.end method

.method public constructor <init>(Lk6/l4;J)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/o4;->e:Lk6/l4;

    invoke-static {}, Lk6/o4;->ۥۤۡۦ()[S

    move-result-object v1

    sget v2, Lt2/۟ۦۣۡۤ;->۟ۡۥۢ۟:I

    xor-int/lit16 v2, v2, -0x111

    const/16 v3, 0x5c7

    invoke-static {v1, v0, v2, v3}, Lf6/ۦۣۦ۟;->۟ۤۥ۟۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfa/ۦۣۡۢ;->۟ۡۧۢ۠(Ljava/lang/Object;)V

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
    const-wide/16 v2, 0x0

    cmp-long v1, p2, v2

    if-lez v1, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v0}, Le2/۟۟ۥۦ;->۠ۥۣۦ(Z)V

    invoke-static {}, Lk6/o4;->ۥۤۡۦ()[S

    move-result-object v0

    const/16 v1, 0xe

    sget v2, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۧۧۦۨ:I

    xor-int/lit16 v2, v2, 0x228

    const/16 v3, 0x61f

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->ۡ۠۟ۦ([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/o4;->a:Ljava/lang/String;

    invoke-static {}, Lk6/o4;->ۥۤۡۦ()[S

    move-result-object v0

    const/16 v1, 0x22

    sget v2, La2/ۢۦۧۦ;->۟ۡۦۨ۠:I

    xor-int/lit16 v2, v2, 0x21c

    const/16 v3, 0x2ab

    invoke-static {v0, v1, v2, v3}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->۠ۡۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/o4;->b:Ljava/lang/String;

    invoke-static {}, Lk6/o4;->ۥۤۡۦ()[S

    move-result-object v0

    const/16 v1, 0x36

    sget v2, Li/ۣۢۦ۠;->۟ۥۣ۟ۨ:I

    xor-int/lit16 v2, v2, 0xbb

    const/16 v3, 0x412

    invoke-static {v0, v1, v2, v3}, Ld7/ۢۧۧۢ;->ۧۡۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk6/o4;->c:Ljava/lang/String;

    iput-wide p2, p0, Lk6/o4;->d:J

    invoke-static {}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۧۧۢۤ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-ltz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v0, "O2"

    invoke-static {v0}, Lt2/۟ۦۢۡۧ;->ۣ۠ۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_8
    return-void

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
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۥۤۡۦ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->ۢ۠ۨۨ()I

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
    sget-object v0, Lk6/o4;->short:[S

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
.method public final a()V
    .locals 4

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۣ۟۟ۡۤ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {v1}, Ld9/ۡۥۣۡ;->ۤۥۢۨ(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-static {v1}, Ln/ۣۣۢۢ;->ۣۣ۟ۦۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {p0}, Lf4/ۡۥۣۢ;->ۢۧ۠ۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۦۣۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    invoke-static {p0}, Lw2/ۧۦۧ;->۟ۦۡۦۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۦۣۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    invoke-static {p0}, Lv8/۟ۧۢ۟ۢ;->ۧ۟ۧۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3}, Lq6/ۡۨۧۨ;->ۦۦۢۡ(Ljava/lang/Object;Ljava/lang/Object;J)Landroid/content/SharedPreferences$Editor;

    invoke-static {v0}, Lk2/۟ۢۦۤۤ;->ۧۧۥ۟(Ljava/lang/Object;)V

    invoke-static {}, Lj6/ۣۦۢ۠;->ۦ۟ۦۤ()I

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
    const-string v0, "zKpbb9XBYnyUjNans"

    invoke-static {v0}, La7/۠ۢۧ;->۟ۥۢۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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
